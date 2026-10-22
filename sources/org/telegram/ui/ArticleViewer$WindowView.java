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
    public final l4 H;
    public final Paint f21931a;
    public int f21932b;
    public boolean f21933c;
    public boolean d;
    public boolean e;
    public boolean f21934f;
    public int h;
    public int f21935n;
    public int f21936r;
    public VelocityTracker f21937s;
    public float v;
    public float f21938w;
    public int f21939x;
    public int f21940y;

    public ArticleViewer$WindowView(l4 l4Var, Activity activity) {
        super(activity);
        this.H = l4Var;
        this.f21931a = new Paint();
        this.f21938w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        o3 o3Var;
        l4 l4Var = this.H;
        x3 x3Var = l4Var.K;
        if (l4Var.f38783v0 == null && !l4Var.T0 && l4Var.P.getVisibility() != 0 && !l4Var.O0.x()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f21933c) {
                this.f21932b = motionEvent.getPointerId(0);
                this.f21933c = true;
                this.f21935n = (int) motionEvent.getX();
                this.f21936r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f21937s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f21932b) {
                if (this.f21937s == null) {
                    this.f21937s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f21935n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f21936r);
                this.f21937s.addMovement(motionEvent);
                o3 o3Var2 = l4Var.f38782u0[0];
                if (o3Var2 != null && o3Var2.f() && (!l4Var.f38782u0[0].e.b(true) || l4Var.f38782u0[0].e.f11184c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.G = z11;
                if ((x3Var == null || !x3Var.H) && this.f21933c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    l4Var.d = null;
                    l4Var.f35528f = null;
                    if (this.e && (o3Var = l4Var.f38782u0[0]) != null) {
                        o3Var.setTranslationX(max);
                    } else if (x3Var != null) {
                        x3Var.I = max / getWidth();
                        x3Var.f43014c.invalidate();
                        x3Var.i();
                        x3Var.h();
                    } else {
                        m0 m0Var = l4Var.f38769g0;
                        float f7 = max;
                        m0Var.setTranslationX(f7);
                        setInnerTranslationX(f7);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f21932b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f21937s == null) {
                    this.f21937s = VelocityTracker.obtain();
                }
                this.f21937s.computeCurrentVelocity(1000);
                float xVelocity = this.f21937s.getXVelocity();
                float yVelocity = this.f21937s.getYVelocity();
                if ((x3Var == null || !x3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.e;
                    if (z12) {
                        view = l4Var.f38782u0[0];
                    } else {
                        view = l4Var.f38769g0;
                    }
                    if (!z12 && x3Var != null) {
                        x10 = x3Var.I * x3Var.f43014c.getWidth();
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
                            animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f38782u0[0], property, view.getMeasuredWidth()));
                        } else if (x3Var != null) {
                            animatorSet.playTogether(x3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f38769g0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, l4.f38740d1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f38782u0[0], property, 0.0f));
                    } else if (x3Var != null) {
                        animatorSet.playTogether(x3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.f38769g0, property, 0.0f), ObjectAnimator.ofFloat(this, l4.f38740d1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.bs.h);
                    animatorSet.addListener(new k4(this, z10));
                    animatorSet.start();
                    l4Var.T0 = true;
                } else {
                    this.f21933c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker2 = this.f21937s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f21937s = null;
                }
            } else if (motionEvent == null) {
                this.f21933c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker3 = this.f21937s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f21937s = null;
                }
                org.telegram.ui.Cells.n9 n9Var = l4Var.O0;
                if (n9Var != null && !n9Var.x()) {
                    l4Var.O0.f(false);
                }
            }
            if (this.d && this.G) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        n0 n0Var;
        int color;
        this.f21933c = false;
        this.d = true;
        this.f21935n = (int) motionEvent.getX();
        l4 l4Var = this.H;
        ArrayList arrayList = l4Var.f38766d0;
        if (arrayList.size() > 1 && ((n0Var = l4Var.f38770h0) == null || (!n0Var.T && !n0Var.W))) {
            this.e = true;
            this.h = l4Var.I0;
            l4Var.f38782u0[1].setVisibility(0);
            l4Var.f38782u0[1].setAlpha(1.0f);
            l4Var.f38782u0[1].setTranslationX(0.0f);
            o3 o3Var = l4Var.f38782u0[0];
            if (l4Var.K == null) {
                color = 0;
            } else {
                color = l4Var.f38774l0.getColor();
            }
            o3Var.setBackgroundColor(color);
            l4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (l4Var.f38769g0.indexOfChild(l4Var.f38782u0[0]) < l4Var.f38769g0.indexOfChild(l4Var.f38782u0[1])) {
                int indexOfChild = l4Var.f38769g0.indexOfChild(l4Var.f38782u0[0]);
                l4Var.f38769g0.removeView(l4Var.f38782u0[1]);
                l4Var.f38769g0.addView(l4Var.f38782u0[1], indexOfChild);
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
        l4 l4Var = this.H;
        if (l4Var.K != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = l4Var.T;
        l4Var.T = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = l4Var.f38768f0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = l4Var.L) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z10 = false;
            if (boundingRects.get(0).height() != 0) {
                z10 = true;
            }
            l4Var.U = z10;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        l4 l4Var = this.H;
        if (l4Var.T == null && this.f21940y != 0 && this.F != 0) {
            Paint paint = this.f21931a;
            paint.setAlpha((int) (l4Var.f38768f0.getAlpha() * 255.0f));
            int i11 = this.f21939x;
            if (i11 == 0 && (i10 = this.E) == 0) {
                canvas.drawRect(i11, i10, i11 + this.f21940y, i10 + this.F, paint);
            } else {
                canvas.drawRect(i11 - getTranslationX(), this.E, (this.f21939x + this.f21940y) - getTranslationX(), this.E + this.F, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            l4 l4Var = this.H;
            if (l4Var.f38770h0.V.isFocused()) {
                l4Var.f38770h0.V.clearFocus();
                AndroidUtilities.hideKeyboard(l4Var.f38770h0.V);
                return true;
            } else if (l4Var.f38770h0.f42791b0.isFocused()) {
                l4Var.f38770h0.f42791b0.clearFocus();
                AndroidUtilities.hideKeyboard(l4Var.f38770h0.f42791b0);
                return true;
            } else if (l4Var.f38776o0) {
                AndroidUtilities.hideKeyboard(this);
                return true;
            } else {
                o3 o3Var = l4Var.f38782u0[0];
                if (o3Var != null && o3Var.f() && l4Var.f38782u0[0].getWebView() != null && l4Var.f38782u0[0].getWebView().canGoBack()) {
                    l4Var.f38782u0[0].getWebView().goBack();
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
        o3 o3Var;
        ArrayList arrayList;
        l4 l4Var = this.H;
        if (l4Var.Q0.f42391n) {
            motionEvent.offsetLocation(-l4Var.f38769g0.getX(), -l4Var.f38769g0.getY());
            return l4Var.Q0.g(motionEvent);
        }
        org.telegram.ui.Cells.z9 n10 = l4Var.O0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-l4Var.f38769g0.getX(), -l4Var.f38769g0.getY());
        if (!l4Var.O0.x() || !l4Var.O0.n(getContext()).onTouchEvent(obtain)) {
            if (n10.b(motionEvent)) {
                o3[] o3VarArr = l4Var.f38782u0;
                if (o3VarArr != null && (o3Var = o3VarArr[0]) != null && o3Var.f() && (arrayList = l4Var.f38766d0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && l4Var.O0.x() && (motionEvent.getY() < l4Var.f38769g0.getTop() || motionEvent.getY() > l4Var.f38769g0.getBottom())) {
                if (l4Var.O0.n(getContext()).onTouchEvent(obtain)) {
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
            l4 l4Var = this.H;
            if (view == l4Var.f38769g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                l4Var.f38775n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), l4Var.f38775n0);
                float max = Math.max(0.0f, Math.min(f7 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = l4Var.m0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                l4Var.m0.setAlpha((int) (max * 255.0f));
                l4Var.m0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f21938w;
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
        l4 l4Var = this.H;
        l4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = l4Var.f35532w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            l4Var.f35532w = null;
        }
        l4Var.f35533x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f7;
        int systemWindowInsetRight;
        l4 l4Var = this.H;
        Paint paint = l4Var.f38785x0;
        if (l4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight2, l4Var.f38774l0);
            WindowInsets windowInsets = l4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (l4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f7 = f10;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f7, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, l4Var.f38786y0);
                    }
                }
                f7 = f10;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, l4Var.f38786y0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = l4.f38738b1;
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
        l4 l4Var = this.H;
        int i16 = 0;
        if (l4Var.N0 != i15) {
            int i17 = 0;
            while (true) {
                o3[] o3VarArr = l4Var.f38782u0;
                if (i17 >= o3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : o3VarArr[i17].f39757c.f38166n.entrySet()) {
                    entry.setValue(-1);
                }
                i17++;
            }
            l4Var.N0 = i15;
        }
        WindowInsets windowInsets = l4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f21939x = i15 - this.f21940y;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f21939x = 0;
                this.E = 0;
            } else {
                this.f21939x = 0;
                this.E = (i13 - i11) - this.F;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        m0 m0Var = l4Var.f38769g0;
        m0Var.layout(i16, i14, m0Var.getMeasuredWidth() + i16, l4Var.f38769g0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = l4Var.P;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, l4Var.P.getMeasuredHeight() + i14);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        l4 l4Var = this.H;
        if (l4Var.T != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = l4Var.T;
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
                this.f21940y = windowInsets.getSystemWindowInsetRight();
                this.F = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f21940y = windowInsets.getSystemWindowInsetLeft();
                this.F = systemWindowInsetBottom;
            } else {
                this.f21940y = size;
                this.F = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (l4Var.K == null) {
            if (size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            l4Var.f38776o0 = z10;
        }
        l4Var.f38769g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        l4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = l4.f38738b1;
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
        l4 l4Var = this.H;
        int i10 = (int) (255.0f * f7);
        l4Var.f38774l0.setAlpha(i10);
        l4Var.f38785x0.setAlpha(i10);
        this.f21938w = f7;
        na0 na0Var = l4Var.U0;
        if (na0Var != null) {
            if (l4Var.V && f7 == 1.0f && this.v == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            na0Var.a(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f7) {
        boolean z10;
        this.v = f7;
        l4 l4Var = this.H;
        na0 na0Var = l4Var.U0;
        if (na0Var != null) {
            if (l4Var.V && this.f21938w == 1.0f && f7 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            na0Var.a(z10);
        }
        invalidate();
    }
}
