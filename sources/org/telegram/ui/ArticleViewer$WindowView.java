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
    public final h4 H;
    public final Paint f19972a;
    public int f19973b;
    public boolean f19974c;
    public boolean d;
    public boolean e;
    public boolean f19975f;
    public int h;
    public int f19976n;
    public int f19977r;
    public VelocityTracker f19978s;
    public float v;
    public float f19979w;
    public int f19980x;
    public int f19981y;

    public ArticleViewer$WindowView(h4 h4Var, Activity activity) {
        super(activity);
        this.H = h4Var;
        this.f19972a = new Paint();
        this.f19979w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        l3 l3Var;
        h4 h4Var = this.H;
        u3 u3Var = h4Var.K;
        if (h4Var.f34115v0 == null && !h4Var.T0 && h4Var.P.getVisibility() != 0 && !h4Var.O0.y()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f19974c) {
                this.f19973b = motionEvent.getPointerId(0);
                this.f19974c = true;
                this.f19976n = (int) motionEvent.getX();
                this.f19977r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f19978s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f19973b) {
                if (this.f19978s == null) {
                    this.f19978s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f19976n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f19977r);
                this.f19978s.addMovement(motionEvent);
                l3 l3Var2 = h4Var.f34114u0[0];
                if (l3Var2 != null && l3Var2.f() && (!h4Var.f34114u0[0].e.b(true) || h4Var.f34114u0[0].e.f8550c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.G = z11;
                if ((u3Var == null || !u3Var.H) && this.f19974c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    h4Var.d = null;
                    h4Var.f37982f = null;
                    if (this.e && (l3Var = h4Var.f34114u0[0]) != null) {
                        l3Var.setTranslationX(max);
                    } else if (u3Var != null) {
                        u3Var.I = max / getWidth();
                        u3Var.f37938c.invalidate();
                        u3Var.i();
                        u3Var.h();
                    } else {
                        j0 j0Var = h4Var.f34101g0;
                        float f7 = max;
                        j0Var.setTranslationX(f7);
                        setInnerTranslationX(f7);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f19973b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f19978s == null) {
                    this.f19978s = VelocityTracker.obtain();
                }
                this.f19978s.computeCurrentVelocity(1000);
                float xVelocity = this.f19978s.getXVelocity();
                float yVelocity = this.f19978s.getYVelocity();
                if ((u3Var == null || !u3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.e;
                    if (z12) {
                        view = h4Var.f34114u0[0];
                    } else {
                        view = h4Var.f34101g0;
                    }
                    if (!z12 && u3Var != null) {
                        x10 = u3Var.I * u3Var.f37938c.getWidth();
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
                            animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.f34114u0[0], property, view.getMeasuredWidth()));
                        } else if (u3Var != null) {
                            animatorSet.playTogether(u3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.f34101g0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, h4.f34072d1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.f34114u0[0], property, 0.0f));
                    } else if (u3Var != null) {
                        animatorSet.playTogether(u3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.f34101g0, property, 0.0f), ObjectAnimator.ofFloat(this, h4.f34072d1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.qr.h);
                    animatorSet.addListener(new g4(this, z10));
                    animatorSet.start();
                    h4Var.T0 = true;
                } else {
                    this.f19974c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker2 = this.f19978s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f19978s = null;
                }
            } else if (motionEvent == null) {
                this.f19974c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker3 = this.f19978s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f19978s = null;
                }
                org.telegram.ui.Cells.r9 r9Var = h4Var.O0;
                if (r9Var != null && !r9Var.y()) {
                    h4Var.O0.f(false);
                }
            }
            if (this.d && this.G) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        k0 k0Var;
        int color;
        this.f19974c = false;
        this.d = true;
        this.f19976n = (int) motionEvent.getX();
        h4 h4Var = this.H;
        ArrayList arrayList = h4Var.f34098d0;
        if (arrayList.size() > 1 && ((k0Var = h4Var.f34102h0) == null || (!k0Var.T && !k0Var.W))) {
            this.e = true;
            this.h = h4Var.I0;
            h4Var.f34114u0[1].setVisibility(0);
            h4Var.f34114u0[1].setAlpha(1.0f);
            h4Var.f34114u0[1].setTranslationX(0.0f);
            l3 l3Var = h4Var.f34114u0[0];
            if (h4Var.K == null) {
                color = 0;
            } else {
                color = h4Var.f34106l0.getColor();
            }
            l3Var.setBackgroundColor(color);
            h4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (h4Var.f34101g0.indexOfChild(h4Var.f34114u0[0]) < h4Var.f34101g0.indexOfChild(h4Var.f34114u0[1])) {
                int indexOfChild = h4Var.f34101g0.indexOfChild(h4Var.f34114u0[0]);
                h4Var.f34101g0.removeView(h4Var.f34114u0[1]);
                h4Var.f34101g0.addView(h4Var.f34114u0[1], indexOfChild);
            }
        } else {
            this.e = false;
        }
        h4Var.k();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        h4 h4Var = this.H;
        if (h4Var.K != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = h4Var.T;
        h4Var.T = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = h4Var.f34100f0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = h4Var.L) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z10 = false;
            if (boundingRects.get(0).height() != 0) {
                z10 = true;
            }
            h4Var.U = z10;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        h4 h4Var = this.H;
        if (h4Var.T == null && this.f19981y != 0 && this.F != 0) {
            Paint paint = this.f19972a;
            paint.setAlpha((int) (h4Var.f34100f0.getAlpha() * 255.0f));
            int i11 = this.f19980x;
            if (i11 == 0 && (i10 = this.E) == 0) {
                canvas.drawRect(i11, i10, i11 + this.f19981y, i10 + this.F, paint);
            } else {
                canvas.drawRect(i11 - getTranslationX(), this.E, (this.f19980x + this.f19981y) - getTranslationX(), this.E + this.F, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            h4 h4Var = this.H;
            if (h4Var.f34102h0.V.isFocused()) {
                h4Var.f34102h0.V.clearFocus();
                AndroidUtilities.hideKeyboard(h4Var.f34102h0.V);
                return true;
            } else if (h4Var.f34102h0.f39077b0.isFocused()) {
                h4Var.f34102h0.f39077b0.clearFocus();
                AndroidUtilities.hideKeyboard(h4Var.f34102h0.f39077b0);
                return true;
            } else if (h4Var.f34108o0) {
                AndroidUtilities.hideKeyboard(this);
                return true;
            } else {
                l3 l3Var = h4Var.f34114u0[0];
                if (l3Var != null && l3Var.f() && h4Var.f34114u0[0].getWebView() != null && h4Var.f34114u0[0].getWebView().canGoBack()) {
                    h4Var.f34114u0[0].getWebView().goBack();
                    return true;
                }
                h4Var.o(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l3 l3Var;
        ArrayList arrayList;
        h4 h4Var = this.H;
        if (h4Var.Q0.f36702n) {
            motionEvent.offsetLocation(-h4Var.f34101g0.getX(), -h4Var.f34101g0.getY());
            return h4Var.Q0.g(motionEvent);
        }
        org.telegram.ui.Cells.da o9 = h4Var.O0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-h4Var.f34101g0.getX(), -h4Var.f34101g0.getY());
        if (!h4Var.O0.y() || !h4Var.O0.o(getContext()).onTouchEvent(obtain)) {
            if (o9.b(motionEvent)) {
                l3[] l3VarArr = h4Var.f34114u0;
                if (l3VarArr != null && (l3Var = l3VarArr[0]) != null && l3Var.f() && (arrayList = h4Var.f34098d0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && h4Var.O0.y() && (motionEvent.getY() < h4Var.f34101g0.getTop() || motionEvent.getY() > h4Var.f34101g0.getBottom())) {
                if (h4Var.O0.o(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            } else {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int measuredWidth = getMeasuredWidth();
        int i10 = (int) this.v;
        int save = canvas.save();
        canvas.clipRect(i10, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        if (i10 != 0) {
            h4 h4Var = this.H;
            if (view == h4Var.f34101g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                h4Var.f34107n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), h4Var.f34107n0);
                float max = Math.max(0.0f, Math.min(f7 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = h4Var.m0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                h4Var.m0.setAlpha((int) (max * 255.0f));
                h4Var.m0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f19979w;
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
        h4 h4Var = this.H;
        h4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = h4Var.f37986w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            h4Var.f37986w = null;
        }
        h4Var.f37987x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f7;
        int systemWindowInsetRight;
        h4 h4Var = this.H;
        Paint paint = h4Var.f34117x0;
        if (h4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight2, h4Var.f34106l0);
            WindowInsets windowInsets = h4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (h4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f7 = f10;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f7, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, h4Var.f34118y0);
                    }
                }
                f7 = f10;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, h4Var.f34118y0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = h4.f34070b1;
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
        h4 h4Var = this.H;
        int i16 = 0;
        if (h4Var.N0 != i15) {
            int i17 = 0;
            while (true) {
                l3[] l3VarArr = h4Var.f34114u0;
                if (i17 >= l3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : l3VarArr[i17].f35288c.f33479n.entrySet()) {
                    entry.setValue(-1);
                }
                i17++;
            }
            h4Var.N0 = i15;
        }
        WindowInsets windowInsets = h4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f19980x = i15 - this.f19981y;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f19980x = 0;
                this.E = 0;
            } else {
                this.f19980x = 0;
                this.E = (i13 - i11) - this.F;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        j0 j0Var = h4Var.f34101g0;
        j0Var.layout(i16, i14, j0Var.getMeasuredWidth() + i16, h4Var.f34101g0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = h4Var.P;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, h4Var.P.getMeasuredHeight() + i14);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        h4 h4Var = this.H;
        if (h4Var.T != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = h4Var.T;
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
                this.f19981y = windowInsets.getSystemWindowInsetRight();
                this.F = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f19981y = windowInsets.getSystemWindowInsetLeft();
                this.F = systemWindowInsetBottom;
            } else {
                this.f19981y = size;
                this.F = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (h4Var.K == null) {
            if (size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            h4Var.f34108o0 = z10;
        }
        h4Var.f34101g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        h4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = h4.f34070b1;
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
        h4 h4Var = this.H;
        int i10 = (int) (255.0f * f7);
        h4Var.f34106l0.setAlpha(i10);
        h4Var.f34117x0.setAlpha(i10);
        this.f19979w = f7;
        mb0 mb0Var = h4Var.U0;
        if (mb0Var != null) {
            if (h4Var.V && f7 == 1.0f && this.v == 0.0f) {
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
        h4 h4Var = this.H;
        mb0 mb0Var = h4Var.U0;
        if (mb0Var != null) {
            if (h4Var.V && this.f19979w == 1.0f && f7 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            mb0Var.a(z10);
        }
        invalidate();
    }
}
