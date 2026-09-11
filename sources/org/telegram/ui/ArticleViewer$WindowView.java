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
    public final i4 H;
    public final Paint f21565a;
    public int f21566b;
    public boolean f21567c;
    public boolean d;
    public boolean f21568e;
    public boolean f21569f;
    public int h;
    public int f21570n;
    public int f21571r;
    public VelocityTracker f21572s;
    public float v;
    public float f21573w;
    public int f21574x;
    public int f21575y;

    public ArticleViewer$WindowView(i4 i4Var, Activity activity) {
        super(activity);
        this.H = i4Var;
        this.f21565a = new Paint();
        this.f21573w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        m3 m3Var;
        i4 i4Var = this.H;
        v3 v3Var = i4Var.K;
        if (i4Var.f37233v0 == null && !i4Var.T0 && i4Var.P.getVisibility() != 0 && !i4Var.O0.y()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f21567c) {
                this.f21566b = motionEvent.getPointerId(0);
                this.f21567c = true;
                this.f21570n = (int) motionEvent.getX();
                this.f21571r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f21572s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f21566b) {
                if (this.f21572s == null) {
                    this.f21572s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f21570n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f21571r);
                this.f21572s.addMovement(motionEvent);
                m3 m3Var2 = i4Var.f37232u0[0];
                if (m3Var2 != null && m3Var2.f() && (!i4Var.f37232u0[0].f38553e.b(true) || i4Var.f37232u0[0].f38553e.f9906c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.G = z11;
                if ((v3Var == null || !v3Var.H) && this.f21567c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    i4Var.d = null;
                    i4Var.f41437f = null;
                    if (this.f21568e && (m3Var = i4Var.f37232u0[0]) != null) {
                        m3Var.setTranslationX(max);
                    } else if (v3Var != null) {
                        v3Var.I = max / getWidth();
                        v3Var.f41395c.invalidate();
                        v3Var.i();
                        v3Var.h();
                    } else {
                        j0 j0Var = i4Var.f37219g0;
                        float f7 = max;
                        j0Var.setTranslationX(f7);
                        setInnerTranslationX(f7);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f21566b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f21572s == null) {
                    this.f21572s = VelocityTracker.obtain();
                }
                this.f21572s.computeCurrentVelocity(1000);
                float xVelocity = this.f21572s.getXVelocity();
                float yVelocity = this.f21572s.getYVelocity();
                if ((v3Var == null || !v3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.f21568e;
                    if (z12) {
                        view = i4Var.f37232u0[0];
                    } else {
                        view = i4Var.f37219g0;
                    }
                    if (!z12 && v3Var != null) {
                        x10 = v3Var.I * v3Var.f41395c.getWidth();
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
                        if (this.f21568e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.f37232u0[0], property, view.getMeasuredWidth()));
                        } else if (v3Var != null) {
                            animatorSet.playTogether(v3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.f37219g0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, i4.f37190d1, view.getMeasuredWidth()));
                        }
                    } else if (this.f21568e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.f37232u0[0], property, 0.0f));
                    } else if (v3Var != null) {
                        animatorSet.playTogether(v3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.f37219g0, property, 0.0f), ObjectAnimator.ofFloat(this, i4.f37190d1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.pr.h);
                    animatorSet.addListener(new h4(this, z10));
                    animatorSet.start();
                    i4Var.T0 = true;
                } else {
                    this.f21567c = false;
                    this.d = false;
                    this.f21568e = false;
                }
                VelocityTracker velocityTracker2 = this.f21572s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f21572s = null;
                }
            } else if (motionEvent == null) {
                this.f21567c = false;
                this.d = false;
                this.f21568e = false;
                VelocityTracker velocityTracker3 = this.f21572s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f21572s = null;
                }
                org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
                if (q9Var != null && !q9Var.y()) {
                    i4Var.O0.f(false);
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
        this.f21567c = false;
        this.d = true;
        this.f21570n = (int) motionEvent.getX();
        i4 i4Var = this.H;
        ArrayList arrayList = i4Var.f37216d0;
        if (arrayList.size() > 1 && ((k0Var = i4Var.f37220h0) == null || (!k0Var.T && !k0Var.W))) {
            this.f21568e = true;
            this.h = i4Var.I0;
            i4Var.f37232u0[1].setVisibility(0);
            i4Var.f37232u0[1].setAlpha(1.0f);
            i4Var.f37232u0[1].setTranslationX(0.0f);
            m3 m3Var = i4Var.f37232u0[0];
            if (i4Var.K == null) {
                color = 0;
            } else {
                color = i4Var.f37224l0.getColor();
            }
            m3Var.setBackgroundColor(color);
            i4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (i4Var.f37219g0.indexOfChild(i4Var.f37232u0[0]) < i4Var.f37219g0.indexOfChild(i4Var.f37232u0[1])) {
                int indexOfChild = i4Var.f37219g0.indexOfChild(i4Var.f37232u0[0]);
                i4Var.f37219g0.removeView(i4Var.f37232u0[1]);
                i4Var.f37219g0.addView(i4Var.f37232u0[1], indexOfChild);
            }
        } else {
            this.f21568e = false;
        }
        i4Var.k();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        i4 i4Var = this.H;
        if (i4Var.K != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = i4Var.T;
        i4Var.T = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = i4Var.f37218f0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = i4Var.L) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z10 = false;
            if (boundingRects.get(0).height() != 0) {
                z10 = true;
            }
            i4Var.U = z10;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        i4 i4Var = this.H;
        if (i4Var.T == null && this.f21575y != 0 && this.F != 0) {
            Paint paint = this.f21565a;
            paint.setAlpha((int) (i4Var.f37218f0.getAlpha() * 255.0f));
            int i11 = this.f21574x;
            if (i11 == 0 && (i10 = this.E) == 0) {
                canvas.drawRect(i11, i10, i11 + this.f21575y, i10 + this.F, paint);
            } else {
                canvas.drawRect(i11 - getTranslationX(), this.E, (this.f21574x + this.f21575y) - getTranslationX(), this.E + this.F, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            i4 i4Var = this.H;
            if (i4Var.f37220h0.V.isFocused()) {
                i4Var.f37220h0.V.clearFocus();
                AndroidUtilities.hideKeyboard(i4Var.f37220h0.V);
                return true;
            } else if (i4Var.f37220h0.f42277b0.isFocused()) {
                i4Var.f37220h0.f42277b0.clearFocus();
                AndroidUtilities.hideKeyboard(i4Var.f37220h0.f42277b0);
                return true;
            } else if (i4Var.f37226o0) {
                AndroidUtilities.hideKeyboard(this);
                return true;
            } else {
                m3 m3Var = i4Var.f37232u0[0];
                if (m3Var != null && m3Var.f() && i4Var.f37232u0[0].getWebView() != null && i4Var.f37232u0[0].getWebView().canGoBack()) {
                    i4Var.f37232u0[0].getWebView().goBack();
                    return true;
                }
                i4Var.o(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m3 m3Var;
        ArrayList arrayList;
        i4 i4Var = this.H;
        if (i4Var.Q0.f39337n) {
            motionEvent.offsetLocation(-i4Var.f37219g0.getX(), -i4Var.f37219g0.getY());
            return i4Var.Q0.g(motionEvent);
        }
        org.telegram.ui.Cells.ca o9 = i4Var.O0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-i4Var.f37219g0.getX(), -i4Var.f37219g0.getY());
        if (!i4Var.O0.y() || !i4Var.O0.o(getContext()).onTouchEvent(obtain)) {
            if (o9.b(motionEvent)) {
                m3[] m3VarArr = i4Var.f37232u0;
                if (m3VarArr != null && (m3Var = m3VarArr[0]) != null && m3Var.f() && (arrayList = i4Var.f37216d0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && i4Var.O0.y() && (motionEvent.getY() < i4Var.f37219g0.getTop() || motionEvent.getY() > i4Var.f37219g0.getBottom())) {
                if (i4Var.O0.o(getContext()).onTouchEvent(obtain)) {
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
            i4 i4Var = this.H;
            if (view == i4Var.f37219g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                i4Var.f37225n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), i4Var.f37225n0);
                float max = Math.max(0.0f, Math.min(f7 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = i4Var.m0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                i4Var.m0.setAlpha((int) (max * 255.0f));
                i4Var.m0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f21573w;
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
        i4 i4Var = this.H;
        i4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = i4Var.f41441w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            i4Var.f41441w = null;
        }
        i4Var.f41442x = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f7;
        int systemWindowInsetRight;
        i4 i4Var = this.H;
        Paint paint = i4Var.f37235x0;
        if (i4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight2, i4Var.f37224l0);
            WindowInsets windowInsets = i4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (i4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f7 = f10;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f7, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, i4Var.f37236y0);
                    }
                }
                f7 = f10;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, i4Var.f37236y0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = i4.f37188b1;
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
        i4 i4Var = this.H;
        int i16 = 0;
        if (i4Var.N0 != i15) {
            int i17 = 0;
            while (true) {
                m3[] m3VarArr = i4Var.f37232u0;
                if (i17 >= m3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : m3VarArr[i17].f38552c.f36552n.entrySet()) {
                    entry.setValue(-1);
                }
                i17++;
            }
            i4Var.N0 = i15;
        }
        WindowInsets windowInsets = i4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f21574x = i15 - this.f21575y;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f21574x = 0;
                this.E = 0;
            } else {
                this.f21574x = 0;
                this.E = (i13 - i11) - this.F;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        j0 j0Var = i4Var.f37219g0;
        j0Var.layout(i16, i14, j0Var.getMeasuredWidth() + i16, i4Var.f37219g0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = i4Var.P;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, i4Var.P.getMeasuredHeight() + i14);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        i4 i4Var = this.H;
        if (i4Var.T != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = i4Var.T;
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
                this.f21575y = windowInsets.getSystemWindowInsetRight();
                this.F = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f21575y = windowInsets.getSystemWindowInsetLeft();
                this.F = systemWindowInsetBottom;
            } else {
                this.f21575y = size;
                this.F = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (i4Var.K == null) {
            if (size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            i4Var.f37226o0 = z10;
        }
        i4Var.f37219g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        i4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = i4.f37188b1;
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
        i4 i4Var = this.H;
        int i10 = (int) (255.0f * f7);
        i4Var.f37224l0.setAlpha(i10);
        i4Var.f37235x0.setAlpha(i10);
        this.f21573w = f7;
        kb0 kb0Var = i4Var.U0;
        if (kb0Var != null) {
            if (i4Var.V && f7 == 1.0f && this.v == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            kb0Var.a(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f7) {
        boolean z10;
        this.v = f7;
        i4 i4Var = this.H;
        kb0 kb0Var = i4Var.U0;
        if (kb0Var != null) {
            if (i4Var.V && this.f21573w == 1.0f && f7 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            kb0Var.a(z10);
        }
        invalidate();
    }
}
