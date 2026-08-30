package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public class ArticleViewer$WindowView extends FrameLayout {
    public int B;
    public int C;
    public boolean D;
    public final l4 E;
    public final Paint f20789a;
    public int f20790b;
    public boolean f20791c;
    public boolean d;
    public boolean e;
    public boolean f20792f;
    public int h;
    public int f20793n;
    public int f20794r;
    public VelocityTracker f20795s;
    public float v;
    public float f20796w;
    public int f20797x;
    public int f20798y;

    public ArticleViewer$WindowView(l4 l4Var, Activity activity) {
        super(activity);
        this.E = l4Var;
        this.f20789a = new Paint();
        this.f20796w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z4;
        boolean z10;
        p3 p3Var;
        l4 l4Var = this.E;
        y3 y3Var = l4Var.H;
        if (l4Var.f35946s0 == null && !l4Var.Q0 && l4Var.M.getVisibility() != 0 && !l4Var.L0.y()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f20791c) {
                this.f20790b = motionEvent.getPointerId(0);
                this.f20791c = true;
                this.f20793n = (int) motionEvent.getX();
                this.f20794r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f20795s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f20790b) {
                if (this.f20795s == null) {
                    this.f20795s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f20793n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f20794r);
                this.f20795s.addMovement(motionEvent);
                p3 p3Var2 = l4Var.f35945r0[0];
                if (p3Var2 != null && p3Var2.f() && (!l4Var.f35945r0[0].e.b(true) || l4Var.f35945r0[0].e.f43629c)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.D = z10;
                if ((y3Var == null || !y3Var.E) && this.f20791c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.D) {
                    b(motionEvent);
                } else if (this.d) {
                    l4Var.d = null;
                    l4Var.f36478f = null;
                    if (this.e && (p3Var = l4Var.f35945r0[0]) != null) {
                        p3Var.setTranslationX(max);
                    } else if (y3Var != null) {
                        y3Var.F = max / getWidth();
                        y3Var.f40366c.invalidate();
                        y3Var.i();
                        y3Var.h();
                    } else {
                        l0 l0Var = l4Var.f35932d0;
                        float f10 = max;
                        l0Var.setTranslationX(f10);
                        setInnerTranslationX(f10);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f20790b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f20795s == null) {
                    this.f20795s = VelocityTracker.obtain();
                }
                this.f20795s.computeCurrentVelocity(1000);
                float xVelocity = this.f20795s.getXVelocity();
                float yVelocity = this.f20795s.getYVelocity();
                if ((y3Var == null || !y3Var.E) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z11 = this.e;
                    if (z11) {
                        view = l4Var.f35945r0[0];
                    } else {
                        view = l4Var.f35932d0;
                    }
                    if (!z11 && y3Var != null) {
                        x10 = y3Var.F * y3Var.f40366c.getWidth();
                    } else {
                        x10 = view.getX();
                    }
                    if ((x10 < view.getMeasuredWidth() * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.D) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z4) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f35945r0[0], property, view.getMeasuredWidth()));
                        } else if (y3Var != null) {
                            animatorSet.playTogether(y3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f35932d0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, l4.f35905a1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f35945r0[0], property, 0.0f));
                    } else if (y3Var != null) {
                        animatorSet.playTogether(y3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f35932d0, property, 0.0f), ObjectAnimator.ofFloat(this, l4.f35905a1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.nr.h);
                    animatorSet.addListener(new k4(this, z4));
                    animatorSet.start();
                    l4Var.Q0 = true;
                } else {
                    this.f20791c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker2 = this.f20795s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f20795s = null;
                }
            } else if (motionEvent == null) {
                this.f20791c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker3 = this.f20795s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f20795s = null;
                }
                org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
                if (m9Var != null && !m9Var.y()) {
                    l4Var.L0.f(false);
                }
            }
            if (this.d && this.D) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        m0 m0Var;
        int color;
        this.f20791c = false;
        this.d = true;
        this.f20793n = (int) motionEvent.getX();
        l4 l4Var = this.E;
        ArrayList arrayList = l4Var.f35929a0;
        if (arrayList.size() > 1 && ((m0Var = l4Var.f35933e0) == null || (!m0Var.Q && !m0Var.T))) {
            this.e = true;
            this.h = l4Var.F0;
            l4Var.f35945r0[1].setVisibility(0);
            l4Var.f35945r0[1].setAlpha(1.0f);
            l4Var.f35945r0[1].setTranslationX(0.0f);
            p3 p3Var = l4Var.f35945r0[0];
            if (l4Var.H == null) {
                color = 0;
            } else {
                color = l4Var.f35937i0.getColor();
            }
            p3Var.setBackgroundColor(color);
            l4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (l4Var.f35932d0.indexOfChild(l4Var.f35945r0[0]) < l4Var.f35932d0.indexOfChild(l4Var.f35945r0[1])) {
                int indexOfChild = l4Var.f35932d0.indexOfChild(l4Var.f35945r0[0]);
                l4Var.f35932d0.removeView(l4Var.f35945r0[1]);
                l4Var.f35932d0.addView(l4Var.f35945r0[1], indexOfChild);
            }
        } else {
            this.e = false;
        }
        l4Var.k();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        l4 l4Var = this.E;
        if (l4Var.H != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = l4Var.Q;
        l4Var.Q = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = l4Var.f35931c0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = l4Var.I) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z4 = false;
            if (boundingRects.get(0).height() != 0) {
                z4 = true;
            }
            l4Var.R = z4;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        l4 l4Var = this.E;
        if (l4Var.Q == null && this.f20798y != 0 && this.C != 0) {
            Paint paint = this.f20789a;
            paint.setAlpha((int) (l4Var.f35931c0.getAlpha() * 255.0f));
            int i11 = this.f20797x;
            if (i11 == 0 && (i10 = this.B) == 0) {
                canvas.drawRect(i11, i10, i11 + this.f20798y, i10 + this.C, paint);
            } else {
                canvas.drawRect(i11 - getTranslationX(), this.B, (this.f20797x + this.f20798y) - getTranslationX(), this.B + this.C, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            l4 l4Var = this.E;
            if (l4Var.f35933e0.S.isFocused()) {
                l4Var.f35933e0.S.clearFocus();
                AndroidUtilities.hideKeyboard(l4Var.f35933e0.S);
                return true;
            } else if (l4Var.f35933e0.V.isFocused()) {
                l4Var.f35933e0.V.clearFocus();
                AndroidUtilities.hideKeyboard(l4Var.f35933e0.V);
                return true;
            } else if (l4Var.f35940l0) {
                AndroidUtilities.hideKeyboard(this);
                return true;
            } else {
                p3 p3Var = l4Var.f35945r0[0];
                if (p3Var != null && p3Var.f() && l4Var.f35945r0[0].getWebView() != null && l4Var.f35945r0[0].getWebView().canGoBack()) {
                    l4Var.f35945r0[0].getWebView().goBack();
                    return true;
                }
                l4Var.o(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p3 p3Var;
        ArrayList arrayList;
        l4 l4Var = this.E;
        if (l4Var.N0.f39259n) {
            motionEvent.offsetLocation(-l4Var.f35932d0.getX(), -l4Var.f35932d0.getY());
            return l4Var.N0.g(motionEvent);
        }
        org.telegram.ui.Cells.y9 o10 = l4Var.L0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-l4Var.f35932d0.getX(), -l4Var.f35932d0.getY());
        if (!l4Var.L0.y() || !l4Var.L0.o(getContext()).onTouchEvent(obtain)) {
            if (o10.b(motionEvent)) {
                p3[] p3VarArr = l4Var.f35945r0;
                if (p3VarArr != null && (p3Var = p3VarArr[0]) != null && p3Var.f() && (arrayList = l4Var.f35929a0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && l4Var.L0.y() && (motionEvent.getY() < l4Var.f35932d0.getTop() || motionEvent.getY() > l4Var.f35932d0.getBottom())) {
                if (l4Var.L0.o(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            } else {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int measuredWidth = getMeasuredWidth();
        int i10 = (int) this.v;
        int save = canvas.save();
        canvas.clipRect(i10, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (i10 != 0) {
            l4 l4Var = this.E;
            if (view == l4Var.f35932d0) {
                float f10 = measuredWidth - i10;
                float min = Math.min(0.8f, f10 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                l4Var.f35939k0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), l4Var.f35939k0);
                float max = Math.max(0.0f, Math.min(f10 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = l4Var.f35938j0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                l4Var.f35938j0.setAlpha((int) (max * 255.0f));
                l4Var.f35938j0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f20796w;
    }

    public float getInnerTranslationX() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.T = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l4 l4Var = this.E;
        l4Var.T = false;
        VideoPlayerHolderBase videoPlayerHolderBase = l4Var.f36482w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            l4Var.f36482w = null;
        }
        l4Var.f36483x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f10;
        int systemWindowInsetRight;
        l4 l4Var = this.E;
        Paint paint = l4Var.f35948u0;
        if (l4Var.H == null) {
            int measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f11, measuredHeight2, l4Var.f35937i0);
            WindowInsets windowInsets = l4Var.Q;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (l4Var.R) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f10, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, l4Var.f35949v0);
                    }
                }
                f10 = f11;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, l4Var.f35949v0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = l4.Y0;
        this.E.getClass();
        if (!a(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        l4 l4Var = this.E;
        int i16 = 0;
        if (l4Var.K0 != i15) {
            int i17 = 0;
            while (true) {
                p3[] p3VarArr = l4Var.f35945r0;
                if (i17 >= p3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : p3VarArr[i17].f37160c.f35225n.entrySet()) {
                    entry.setValue(-1);
                }
                i17++;
            }
            l4Var.K0 = i15;
        }
        WindowInsets windowInsets = l4Var.Q;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f20797x = i15 - this.f20798y;
                this.B = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f20797x = 0;
                this.B = 0;
            } else {
                this.f20797x = 0;
                this.B = (i13 - i11) - this.C;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        l0 l0Var = l4Var.f35932d0;
        l0Var.layout(i16, i14, l0Var.getMeasuredWidth() + i16, l4Var.f35932d0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = l4Var.M;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, l4Var.M.getMeasuredHeight() + i14);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        l4 l4Var = this.E;
        if (l4Var.Q != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = l4Var.Q;
            if (AndroidUtilities.incorrectDisplaySizeFix) {
                int i12 = AndroidUtilities.displaySize.y;
                if (size2 > i12) {
                    size2 = i12;
                }
                size2 += AndroidUtilities.statusBarHeight;
            }
            int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
            size -= windowInsets.getSystemWindowInsetLeft() + windowInsets.getSystemWindowInsetRight();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f20798y = windowInsets.getSystemWindowInsetRight();
                this.C = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f20798y = windowInsets.getSystemWindowInsetLeft();
                this.C = systemWindowInsetBottom;
            } else {
                this.f20798y = size;
                this.C = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (l4Var.H == null) {
            if (size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f)) {
                z4 = true;
            } else {
                z4 = false;
            }
            l4Var.f35940l0 = z4;
        }
        l4Var.f35932d0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        l4Var.M.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = l4.Y0;
        this.E.getClass();
        if (!a(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override
    public void setAlpha(float f10) {
        boolean z4;
        l4 l4Var = this.E;
        int i10 = (int) (255.0f * f10);
        l4Var.f35937i0.setAlpha(i10);
        l4Var.f35948u0.setAlpha(i10);
        this.f20796w = f10;
        lf.s0 s0Var = l4Var.R0;
        if (s0Var != null) {
            if (l4Var.S && f10 == 1.0f && this.v == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            s0Var.a(z4);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        boolean z4;
        this.v = f10;
        l4 l4Var = this.E;
        lf.s0 s0Var = l4Var.R0;
        if (s0Var != null) {
            if (l4Var.S && this.f20796w == 1.0f && f10 == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            s0Var.a(z4);
        }
        invalidate();
    }
}
