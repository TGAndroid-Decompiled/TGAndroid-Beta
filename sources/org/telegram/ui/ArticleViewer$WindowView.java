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
    public int E;
    public int F;
    public boolean G;
    public final k4 H;
    public final Paint f20565a;
    public int f20566b;
    public boolean f20567c;
    public boolean d;
    public boolean e;
    public boolean f20568f;
    public int h;
    public int f20569n;
    public int f20570r;
    public VelocityTracker f20571s;
    public float v;
    public float f20572w;
    public int f20573x;
    public int f20574y;

    public ArticleViewer$WindowView(k4 k4Var, Activity activity) {
        super(activity);
        this.H = k4Var;
        this.f20565a = new Paint();
        this.f20572w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        o3 o3Var;
        k4 k4Var = this.H;
        x3 x3Var = k4Var.K;
        if (k4Var.f37279v0 == null && !k4Var.T0 && k4Var.P.getVisibility() != 0 && !k4Var.O0.x()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f20567c) {
                this.f20566b = motionEvent.getPointerId(0);
                this.f20567c = true;
                this.f20569n = (int) motionEvent.getX();
                this.f20570r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f20571s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f20566b) {
                if (this.f20571s == null) {
                    this.f20571s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f20569n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f20570r);
                this.f20571s.addMovement(motionEvent);
                o3 o3Var2 = k4Var.f37278u0[0];
                if (o3Var2 != null && o3Var2.f() && (!k4Var.f37278u0[0].e.b(true) || k4Var.f37278u0[0].e.f9477c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.G = z11;
                if ((x3Var == null || !x3Var.H) && this.f20567c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    k4Var.d = null;
                    k4Var.f42177f = null;
                    if (this.e && (o3Var = k4Var.f37278u0[0]) != null) {
                        o3Var.setTranslationX(max);
                    } else if (x3Var != null) {
                        x3Var.I = max / getWidth();
                        x3Var.f41414c.invalidate();
                        x3Var.i();
                        x3Var.h();
                    } else {
                        l0 l0Var = k4Var.f37265g0;
                        float f7 = max;
                        l0Var.setTranslationX(f7);
                        setInnerTranslationX(f7);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f20566b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f20571s == null) {
                    this.f20571s = VelocityTracker.obtain();
                }
                this.f20571s.computeCurrentVelocity(1000);
                float xVelocity = this.f20571s.getXVelocity();
                float yVelocity = this.f20571s.getYVelocity();
                if ((x3Var == null || !x3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.e;
                    if (z12) {
                        view = k4Var.f37278u0[0];
                    } else {
                        view = k4Var.f37265g0;
                    }
                    if (!z12 && x3Var != null) {
                        x10 = x3Var.I * x3Var.f41414c.getWidth();
                    } else {
                        x10 = view.getX();
                    }
                    if ((x10 < view.getMeasuredWidth() * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.G) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z10) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(k4Var.f37278u0[0], property, view.getMeasuredWidth()));
                        } else if (x3Var != null) {
                            animatorSet.playTogether(x3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(k4Var.f37265g0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, k4.f37236d1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(k4Var.f37278u0[0], property, 0.0f));
                    } else if (x3Var != null) {
                        animatorSet.playTogether(x3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(k4Var.f37265g0, property, 0.0f), ObjectAnimator.ofFloat(this, k4.f37236d1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.es.h);
                    animatorSet.addListener(new j4(this, z10));
                    animatorSet.start();
                    k4Var.T0 = true;
                } else {
                    this.f20567c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker2 = this.f20571s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f20571s = null;
                }
            } else if (motionEvent == null) {
                this.f20567c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker3 = this.f20571s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f20571s = null;
                }
                org.telegram.ui.Cells.o9 o9Var = k4Var.O0;
                if (o9Var != null && !o9Var.x()) {
                    k4Var.O0.f(false);
                }
            }
            if (this.d && this.G) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        m0 m0Var;
        int color;
        this.f20567c = false;
        this.d = true;
        this.f20569n = (int) motionEvent.getX();
        k4 k4Var = this.H;
        ArrayList arrayList = k4Var.f37262d0;
        if (arrayList.size() > 1 && ((m0Var = k4Var.f37266h0) == null || (!m0Var.T && !m0Var.W))) {
            this.e = true;
            this.h = k4Var.I0;
            k4Var.f37278u0[1].setVisibility(0);
            k4Var.f37278u0[1].setAlpha(1.0f);
            k4Var.f37278u0[1].setTranslationX(0.0f);
            o3 o3Var = k4Var.f37278u0[0];
            if (k4Var.K == null) {
                color = 0;
            } else {
                color = k4Var.f37270l0.getColor();
            }
            o3Var.setBackgroundColor(color);
            k4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (k4Var.f37265g0.indexOfChild(k4Var.f37278u0[0]) < k4Var.f37265g0.indexOfChild(k4Var.f37278u0[1])) {
                int indexOfChild = k4Var.f37265g0.indexOfChild(k4Var.f37278u0[0]);
                k4Var.f37265g0.removeView(k4Var.f37278u0[1]);
                k4Var.f37265g0.addView(k4Var.f37278u0[1], indexOfChild);
            }
        } else {
            this.e = false;
        }
        k4Var.k();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        k4 k4Var = this.H;
        if (k4Var.K != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = k4Var.T;
        k4Var.T = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = k4Var.f37264f0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = k4Var.L) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z10 = false;
            if (boundingRects.get(0).height() != 0) {
                z10 = true;
            }
            k4Var.U = z10;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        k4 k4Var = this.H;
        if (k4Var.T == null && this.f20574y != 0 && this.F != 0) {
            Paint paint = this.f20565a;
            paint.setAlpha((int) (k4Var.f37264f0.getAlpha() * 255.0f));
            int i11 = this.f20573x;
            if (i11 == 0 && (i10 = this.E) == 0) {
                canvas.drawRect(i11, i10, i11 + this.f20574y, i10 + this.F, paint);
            } else {
                canvas.drawRect(i11 - getTranslationX(), this.E, (this.f20573x + this.f20574y) - getTranslationX(), this.E + this.F, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            k4 k4Var = this.H;
            if (k4Var.f37266h0.V.isFocused()) {
                k4Var.f37266h0.V.clearFocus();
                AndroidUtilities.hideKeyboard(k4Var.f37266h0.V);
                return true;
            } else if (k4Var.f37266h0.f41204b0.isFocused()) {
                k4Var.f37266h0.f41204b0.clearFocus();
                AndroidUtilities.hideKeyboard(k4Var.f37266h0.f41204b0);
                return true;
            } else if (k4Var.f37272o0) {
                AndroidUtilities.hideKeyboard(this);
                return true;
            } else {
                o3 o3Var = k4Var.f37278u0[0];
                if (o3Var != null && o3Var.f() && k4Var.f37278u0[0].getWebView() != null && k4Var.f37278u0[0].getWebView().canGoBack()) {
                    k4Var.f37278u0[0].getWebView().goBack();
                    return true;
                }
                k4Var.o(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o3 o3Var;
        ArrayList arrayList;
        k4 k4Var = this.H;
        if (k4Var.Q0.f40779n) {
            motionEvent.offsetLocation(-k4Var.f37265g0.getX(), -k4Var.f37265g0.getY());
            return k4Var.Q0.g(motionEvent);
        }
        org.telegram.ui.Cells.aa n10 = k4Var.O0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-k4Var.f37265g0.getX(), -k4Var.f37265g0.getY());
        if (!k4Var.O0.x() || !k4Var.O0.n(getContext()).onTouchEvent(obtain)) {
            if (n10.b(motionEvent)) {
                o3[] o3VarArr = k4Var.f37278u0;
                if (o3VarArr != null && (o3Var = o3VarArr[0]) != null && o3Var.f() && (arrayList = k4Var.f37262d0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && k4Var.O0.x() && (motionEvent.getY() < k4Var.f37265g0.getTop() || motionEvent.getY() > k4Var.f37265g0.getBottom())) {
                if (k4Var.O0.n(getContext()).onTouchEvent(obtain)) {
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
            k4 k4Var = this.H;
            if (view == k4Var.f37265g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                k4Var.f37271n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), k4Var.f37271n0);
                float max = Math.max(0.0f, Math.min(f7 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = k4Var.m0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                k4Var.m0.setAlpha((int) (max * 255.0f));
                k4Var.m0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f20572w;
    }

    public float getInnerTranslationX() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H.W = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k4 k4Var = this.H;
        k4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = k4Var.f42181w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            k4Var.f42181w = null;
        }
        k4Var.f42182x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f7;
        int systemWindowInsetRight;
        k4 k4Var = this.H;
        Paint paint = k4Var.f37281x0;
        if (k4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight2, k4Var.f37270l0);
            WindowInsets windowInsets = k4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (k4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f7 = f10;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f7, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, k4Var.f37282y0);
                    }
                }
                f7 = f10;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, k4Var.f37282y0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = k4.f37234b1;
        this.H.getClass();
        if (!a(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        k4 k4Var = this.H;
        int i16 = 0;
        if (k4Var.N0 != i15) {
            int i17 = 0;
            while (true) {
                o3[] o3VarArr = k4Var.f37278u0;
                if (i17 >= o3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : o3VarArr[i17].f38530c.f36711n.entrySet()) {
                    entry.setValue(-1);
                }
                i17++;
            }
            k4Var.N0 = i15;
        }
        WindowInsets windowInsets = k4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f20573x = i15 - this.f20574y;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f20573x = 0;
                this.E = 0;
            } else {
                this.f20573x = 0;
                this.E = (i13 - i11) - this.F;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        l0 l0Var = k4Var.f37265g0;
        l0Var.layout(i16, i14, l0Var.getMeasuredWidth() + i16, k4Var.f37265g0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = k4Var.P;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, k4Var.P.getMeasuredHeight() + i14);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        k4 k4Var = this.H;
        if (k4Var.T != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = k4Var.T;
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
                this.f20574y = windowInsets.getSystemWindowInsetRight();
                this.F = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f20574y = windowInsets.getSystemWindowInsetLeft();
                this.F = systemWindowInsetBottom;
            } else {
                this.f20574y = size;
                this.F = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (k4Var.K == null) {
            if (size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            k4Var.f37272o0 = z10;
        }
        k4Var.f37265g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        k4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = k4.f37234b1;
        this.H.getClass();
        if (!a(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public void setAlpha(float f7) {
        boolean z10;
        k4 k4Var = this.H;
        int i10 = (int) (255.0f * f7);
        k4Var.f37270l0.setAlpha(i10);
        k4Var.f37281x0.setAlpha(i10);
        this.f20572w = f7;
        mb0 mb0Var = k4Var.U0;
        if (mb0Var != null) {
            if (k4Var.V && f7 == 1.0f && this.v == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            mb0Var.a(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f7) {
        boolean z10;
        this.v = f7;
        k4 k4Var = this.H;
        mb0 mb0Var = k4Var.U0;
        if (mb0Var != null) {
            if (k4Var.V && this.f20572w == 1.0f && f7 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            mb0Var.a(z10);
        }
        invalidate();
    }
}
