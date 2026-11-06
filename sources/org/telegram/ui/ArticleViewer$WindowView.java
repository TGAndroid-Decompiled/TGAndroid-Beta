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
import org.telegram.messenger.video.VideoPlayerHolderBase;
public class ArticleViewer$WindowView extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final g4 H;
    public final Paint f28836a;
    public int f28837b;
    public boolean f28838c;
    public boolean d;
    public boolean f28839e;
    public boolean f28840f;
    public int h;
    public int f28841n;
    public int f28842r;
    public VelocityTracker f28843s;
    public float f28844w;
    public float f28845x;
    public int f28846y;

    public ArticleViewer$WindowView(g4 g4Var, Activity activity) {
        super(activity);
        this.H = g4Var;
        this.f28836a = new Paint();
        this.f28845x = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z9;
        boolean z10;
        k3 k3Var;
        g4 g4Var = this.H;
        t3 t3Var = g4Var.K;
        if (g4Var.f45843v0 == null && !g4Var.U0 && g4Var.P.getVisibility() != 0 && !g4Var.P0.x()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f28838c) {
                this.f28837b = motionEvent.getPointerId(0);
                this.f28838c = true;
                this.f28841n = (int) motionEvent.getX();
                this.f28842r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f28843s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f28837b) {
                if (this.f28843s == null) {
                    this.f28843s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f28841n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f28842r);
                this.f28843s.addMovement(motionEvent);
                k3 k3Var2 = g4Var.f45842u0[0];
                if (k3Var2 != null && k3Var2.f() && (!g4Var.f45842u0[0].f47089e.b(true) || g4Var.f45842u0[0].f47089e.f14563c)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.G = z10;
                if ((t3Var == null || !t3Var.H) && this.f28838c && !this.d && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    g4Var.d = null;
                    g4Var.f48270f = null;
                    if (this.f28839e && (k3Var = g4Var.f45842u0[0]) != null) {
                        k3Var.setTranslationX(max);
                    } else if (t3Var != null) {
                        t3Var.I = max / getWidth();
                        t3Var.f49903c.invalidate();
                        t3Var.u();
                        t3Var.r();
                    } else {
                        k0 k0Var = g4Var.f45829g0;
                        float f10 = max;
                        k0Var.setTranslationX(f10);
                        setInnerTranslationX(f10);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f28837b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f28843s == null) {
                    this.f28843s = VelocityTracker.obtain();
                }
                this.f28843s.computeCurrentVelocity(1000);
                float xVelocity = this.f28843s.getXVelocity();
                float yVelocity = this.f28843s.getYVelocity();
                if ((t3Var == null || !t3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z11 = this.f28839e;
                    if (z11) {
                        view = g4Var.f45842u0[0];
                    } else {
                        view = g4Var.f45829g0;
                    }
                    if (!z11 && t3Var != null) {
                        x10 = t3Var.I * t3Var.f49903c.getWidth();
                    } else {
                        x10 = view.getX();
                    }
                    if ((x10 < view.getMeasuredWidth() * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.G) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z9) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.f28839e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f45842u0[0], property, view.getMeasuredWidth()));
                        } else if (t3Var != null) {
                            animatorSet.playTogether(t3Var.l(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f45829g0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, g4.f45801e1, view.getMeasuredWidth()));
                        }
                    } else if (this.f28839e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f45842u0[0], property, 0.0f));
                    } else if (t3Var != null) {
                        animatorSet.playTogether(t3Var.l(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f45829g0, property, 0.0f), ObjectAnimator.ofFloat(this, g4.f45801e1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
                    animatorSet.addListener(new f4(this, z9));
                    animatorSet.start();
                    g4Var.U0 = true;
                } else {
                    this.f28838c = false;
                    this.d = false;
                    this.f28839e = false;
                }
                VelocityTracker velocityTracker2 = this.f28843s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f28843s = null;
                }
            } else if (motionEvent == null) {
                this.f28838c = false;
                this.d = false;
                this.f28839e = false;
                VelocityTracker velocityTracker3 = this.f28843s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f28843s = null;
                }
                org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
                if (i9Var != null && !i9Var.x()) {
                    g4Var.P0.f(false);
                }
            }
            if (this.d && this.G) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27978k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
    }

    public final void b(MotionEvent motionEvent) {
        l0 l0Var;
        int color;
        this.f28838c = false;
        this.d = true;
        this.f28841n = (int) motionEvent.getX();
        g4 g4Var = this.H;
        ArrayList arrayList = g4Var.f45826d0;
        if (arrayList.size() > 1 && ((l0Var = g4Var.f45830h0) == null || (!l0Var.T && !l0Var.W))) {
            this.f28839e = true;
            this.h = g4Var.J0;
            g4Var.f45842u0[1].setVisibility(0);
            g4Var.f45842u0[1].setAlpha(1.0f);
            g4Var.f45842u0[1].setTranslationX(0.0f);
            k3 k3Var = g4Var.f45842u0[0];
            if (g4Var.K == null) {
                color = 0;
            } else {
                color = g4Var.f45834l0.getColor();
            }
            k3Var.setBackgroundColor(color);
            g4Var.c0(-1, arrayList.get(arrayList.size() - 2), true);
            if (g4Var.f45829g0.indexOfChild(g4Var.f45842u0[0]) < g4Var.f45829g0.indexOfChild(g4Var.f45842u0[1])) {
                int indexOfChild = g4Var.f45829g0.indexOfChild(g4Var.f45842u0[0]);
                g4Var.f45829g0.removeView(g4Var.f45842u0[1]);
                g4Var.f45829g0.addView(g4Var.f45842u0[1], indexOfChild);
            }
        } else {
            this.f28839e = false;
        }
        g4Var.i();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        g4 g4Var = this.H;
        if (g4Var.K != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = g4Var.T;
        g4Var.T = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = g4Var.f45828f0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = g4Var.L) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z9 = false;
            if (boundingRects.get(0).height() != 0) {
                z9 = true;
            }
            g4Var.U = z9;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        g4 g4Var = this.H;
        if (g4Var.T == null && this.D != 0 && this.F != 0) {
            Paint paint = this.f28836a;
            paint.setAlpha((int) (g4Var.f45828f0.getAlpha() * 255.0f));
            int i10 = this.f28846y;
            if (i10 == 0 && (i7 = this.E) == 0) {
                canvas.drawRect(i10, i7, i10 + this.D, i7 + this.F, paint);
            } else {
                canvas.drawRect(i10 - getTranslationX(), this.E, (this.f28846y + this.D) - getTranslationX(), this.E + this.F, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            g4 g4Var = this.H;
            if (g4Var.f45830h0.V.isFocused()) {
                g4Var.f45830h0.V.clearFocus();
                org.telegram.messenger.g0.v1(g4Var.f45830h0.V);
                return true;
            } else if (g4Var.f45830h0.f51182b0.isFocused()) {
                g4Var.f45830h0.f51182b0.clearFocus();
                org.telegram.messenger.g0.v1(g4Var.f45830h0.f51182b0);
                return true;
            } else if (g4Var.f45836o0) {
                org.telegram.messenger.g0.v1(this);
                return true;
            } else {
                k3 k3Var = g4Var.f45842u0[0];
                if (k3Var != null && k3Var.f() && g4Var.f45842u0[0].getWebView() != null && g4Var.f45842u0[0].getWebView().canGoBack()) {
                    g4Var.f45842u0[0].getWebView().goBack();
                    return true;
                }
                g4Var.m(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k3 k3Var;
        ArrayList arrayList;
        g4 g4Var = this.H;
        if (g4Var.R0.f45710n) {
            motionEvent.offsetLocation(-g4Var.f45829g0.getX(), -g4Var.f45829g0.getY());
            return g4Var.R0.g(motionEvent);
        }
        org.telegram.ui.Cells.u9 n10 = g4Var.P0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-g4Var.f45829g0.getX(), -g4Var.f45829g0.getY());
        if (!g4Var.P0.x() || !g4Var.P0.n(getContext()).onTouchEvent(obtain)) {
            if (n10.b(motionEvent)) {
                k3[] k3VarArr = g4Var.f45842u0;
                if (k3VarArr != null && (k3Var = k3VarArr[0]) != null && k3Var.f() && (arrayList = g4Var.f45826d0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && g4Var.P0.x() && (motionEvent.getY() < g4Var.f45829g0.getTop() || motionEvent.getY() > g4Var.f45829g0.getBottom())) {
                if (g4Var.P0.n(getContext()).onTouchEvent(obtain)) {
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
        int i7 = (int) this.f28844w;
        int save = canvas.save();
        canvas.clipRect(i7, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        if (i7 != 0) {
            g4 g4Var = this.H;
            if (view == g4Var.f45829g0) {
                float f10 = measuredWidth - i7;
                float min = Math.min(0.8f, f10 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                g4Var.f45835n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i7, getHeight(), g4Var.f45835n0);
                float max = Math.max(0.0f, Math.min(f10 / org.telegram.messenger.g0.L(20.0f), 1.0f));
                Drawable drawable = g4Var.m0;
                drawable.setBounds(i7 - drawable.getIntrinsicWidth(), view.getTop(), i7, view.getBottom());
                g4Var.m0.setAlpha((int) (max * 255.0f));
                g4Var.m0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f28845x;
    }

    public float getInnerTranslationX() {
        return this.f28844w;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H.W = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g4 g4Var = this.H;
        g4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = g4Var.f48275x;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            g4Var.f48275x = null;
        }
        g4Var.f48276y = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f10;
        int systemWindowInsetRight;
        g4 g4Var = this.H;
        Paint paint = g4Var.f45845x0;
        if (g4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.f28844w, 0.0f, f11, measuredHeight2, g4Var.f45834l0);
            WindowInsets windowInsets = g4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.f28844w, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (g4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f10, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, g4Var.f45846y0);
                    }
                }
                f10 = f11;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, g4Var.f45846y0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = g4.f45799c1;
        this.H.getClass();
        if (!a(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i7;
        g4 g4Var = this.H;
        int i15 = 0;
        if (g4Var.O0 != i14) {
            int i16 = 0;
            while (true) {
                k3[] k3VarArr = g4Var.f45842u0;
                if (i16 >= k3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : k3VarArr[i16].f47088c.f45193n.entrySet()) {
                    entry.setValue(-1);
                }
                i16++;
            }
            g4Var.O0 = i14;
        }
        WindowInsets windowInsets = g4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f28846y = i14 - this.D;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f28846y = 0;
                this.E = 0;
            } else {
                this.f28846y = 0;
                this.E = (i12 - i10) - this.F;
            }
            i13 = windowInsets.getSystemWindowInsetTop();
            i15 = systemWindowInsetLeft;
        } else {
            i13 = 0;
        }
        k0 k0Var = g4Var.f45829g0;
        k0Var.layout(i15, i13, k0Var.getMeasuredWidth() + i15, g4Var.f45829g0.getMeasuredHeight() + i13);
        FrameLayout frameLayout = g4Var.P;
        frameLayout.layout(i15, i13, frameLayout.getMeasuredWidth() + i15, g4Var.P.getMeasuredHeight() + i13);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        g4 g4Var = this.H;
        if (g4Var.T != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = g4Var.T;
            if (org.telegram.messenger.g0.f22551y) {
                int i11 = org.telegram.messenger.g0.f22544q.y;
                if (size2 > i11) {
                    size2 = i11;
                }
                size2 += org.telegram.messenger.g0.f22538m;
            }
            int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
            size -= windowInsets.getSystemWindowInsetLeft() + windowInsets.getSystemWindowInsetRight();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.D = windowInsets.getSystemWindowInsetRight();
                this.F = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.D = windowInsets.getSystemWindowInsetLeft();
                this.F = systemWindowInsetBottom;
            } else {
                this.D = size;
                this.F = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (g4Var.K == null) {
            if (size2 < org.telegram.messenger.g0.f22544q.y - org.telegram.messenger.g0.L(100.0f)) {
                z9 = true;
            } else {
                z9 = false;
            }
            g4Var.f45836o0 = z9;
        }
        g4Var.f45829g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        g4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = g4.f45799c1;
        this.H.getClass();
        if (!a(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override
    public void setAlpha(float f10) {
        boolean z9;
        g4 g4Var = this.H;
        int i7 = (int) (255.0f * f10);
        g4Var.f45834l0.setAlpha(i7);
        g4Var.f45845x0.setAlpha(i7);
        this.f28845x = f10;
        bg.v0 v0Var = g4Var.V0;
        if (v0Var != null) {
            if (g4Var.V && f10 == 1.0f && this.f28844w == 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            v0Var.c(z9);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        boolean z9;
        this.f28844w = f10;
        g4 g4Var = this.H;
        bg.v0 v0Var = g4Var.V0;
        if (v0Var != null) {
            if (g4Var.V && this.f28845x == 1.0f && f10 == 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            v0Var.c(z9);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        fi.v vVar;
        org.telegram.ui.ActionBar.z2 z2Var;
        org.telegram.ui.ActionBar.y2 y2Var;
        Paint paint;
        int x02;
        int i7;
        int i10;
        k3 k3Var;
        k3 k3Var2;
        int i11;
        b3 b3Var;
        boolean z9;
        g4 g4Var = this.H;
        t3 t3Var = g4Var.K;
        try {
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            if (g4Var.f45842u0 != null) {
                int i12 = 0;
                while (true) {
                    k3[] k3VarArr = g4Var.f45842u0;
                    if (i12 >= k3VarArr.length) {
                        break;
                    }
                    k3 k3Var3 = k3VarArr[i12];
                    if (k3Var3 != null && (i11 = k3Var3.D) != x03) {
                        if (k3Var3.f47095x == i11) {
                            k3Var3.f47095x = x03;
                        }
                        if (k3Var3.f47096y == i11) {
                            k3Var3.f47096y = x03;
                        }
                        k3Var3.D = x03;
                        if (k3Var3.f47091n && (b3Var = k3Var3.f47092r) != null) {
                            if (org.telegram.messenger.g0.B(x03) <= 0.721f) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            b3Var.b(z9, false);
                        }
                    }
                    i12++;
                }
            }
            l0 l0Var = g4Var.f45830h0;
            if (l0Var != null) {
                k3[] k3VarArr2 = g4Var.f45842u0;
                if (k3VarArr2 != null && (k3Var2 = k3VarArr2[0]) != null && org.telegram.messenger.iz.f23422v0) {
                    i7 = k3Var2.getBackgroundColor();
                } else {
                    i7 = x03;
                }
                l0Var.setMenuColors(i7);
                l0 l0Var2 = g4Var.f45830h0;
                k3[] k3VarArr3 = g4Var.f45842u0;
                if (k3VarArr3 != null && (k3Var = k3VarArr3[0]) != null && org.telegram.messenger.iz.f23422v0) {
                    i10 = k3Var.getActionBarColor();
                } else {
                    i10 = x03;
                }
                l0Var2.d(i10, false);
            }
            Paint paint2 = g4Var.f45834l0;
            if (paint2 != null) {
                paint2.setColor(x03);
            }
            if (g4Var.f45847z0 && (paint = g4Var.f45846y0) != null) {
                if (t3Var == null) {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27793a7, true);
                } else {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27793a7, false);
                }
                paint.setColor(x02);
            }
            if (t3Var != null && (z2Var = t3Var.f49904e) != null && (y2Var = z2Var.f28825b) != null) {
                org.telegram.messenger.g0.r3(y2Var, t3Var.f());
            }
            if (g4Var.f45834l0 != null && g4.f45812r1 != null) {
                g4.e0(g4Var);
            }
            if (g4Var.f45842u0 != null) {
                int i13 = 0;
                while (true) {
                    k3[] k3VarArr4 = g4Var.f45842u0;
                    if (i13 >= k3VarArr4.length) {
                        break;
                    }
                    k3 k3Var4 = k3VarArr4[i13];
                    if (k3Var4 != null && (vVar = k3Var4.f47087b) != null) {
                        for (int i14 = 0; i14 < vVar.getChildCount(); i14++) {
                            View childAt = vVar.getChildAt(i14);
                            if ((childAt instanceof s2) && ((s2) childAt).f49619e != null) {
                                ((s2) childAt).f49619e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i13++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = g4Var.f45828f0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
