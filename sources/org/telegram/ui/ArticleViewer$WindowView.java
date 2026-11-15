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
public class ArticleViewer$WindowView extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final g4 I;
    public final Paint f29952a;
    public int f29953b;
    public boolean f29954c;
    public boolean d;
    public boolean f29955e;
    public boolean f29956f;
    public int h;
    public int f29957n;
    public int f29958r;
    public VelocityTracker f29959s;
    public float f29960w;
    public float f29961x;
    public int f29962y;

    public ArticleViewer$WindowView(g4 g4Var, Activity activity) {
        super(activity);
        this.I = g4Var;
        this.f29952a = new Paint();
        this.f29961x = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        k3 k3Var;
        g4 g4Var = this.I;
        t3 t3Var = g4Var.L;
        if (g4Var.f47337w0 == null && !g4Var.V0 && g4Var.Q.getVisibility() != 0 && !g4Var.Q0.x()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f29954c) {
                this.f29953b = motionEvent.getPointerId(0);
                this.f29954c = true;
                this.f29957n = (int) motionEvent.getX();
                this.f29958r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f29959s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f29953b) {
                if (this.f29959s == null) {
                    this.f29959s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f29957n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f29958r);
                this.f29959s.addMovement(motionEvent);
                k3 k3Var2 = g4Var.f47336v0[0];
                if (k3Var2 != null && k3Var2.f() && (!g4Var.f47336v0[0].f48551e.b(true) || g4Var.f47336v0[0].f48551e.f18693c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.H = z11;
                if ((t3Var == null || !t3Var.I) && this.f29954c && !this.d && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs && this.H) {
                    b(motionEvent);
                } else if (this.d) {
                    g4Var.d = null;
                    g4Var.f49452f = null;
                    if (this.f29955e && (k3Var = g4Var.f47336v0[0]) != null) {
                        k3Var.setTranslationX(max);
                    } else if (t3Var != null) {
                        t3Var.J = max / getWidth();
                        t3Var.f51334c.invalidate();
                        t3Var.u();
                        t3Var.r();
                    } else {
                        k0 k0Var = g4Var.f47323h0;
                        float f10 = max;
                        k0Var.setTranslationX(f10);
                        setInnerTranslationX(f10);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f29953b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f29959s == null) {
                    this.f29959s = VelocityTracker.obtain();
                }
                this.f29959s.computeCurrentVelocity(1000);
                float xVelocity = this.f29959s.getXVelocity();
                float yVelocity = this.f29959s.getYVelocity();
                if ((t3Var == null || !t3Var.I) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.f29955e;
                    if (z12) {
                        view = g4Var.f47336v0[0];
                    } else {
                        view = g4Var.f47323h0;
                    }
                    if (!z12 && t3Var != null) {
                        x10 = t3Var.J * t3Var.f51334c.getWidth();
                    } else {
                        x10 = view.getX();
                    }
                    if ((x10 < view.getMeasuredWidth() * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.H) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z10) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.f29955e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f47336v0[0], property, view.getMeasuredWidth()));
                        } else if (t3Var != null) {
                            animatorSet.playTogether(t3Var.l(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f47323h0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, g4.f47294f1, view.getMeasuredWidth()));
                        }
                    } else if (this.f29955e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f47336v0[0], property, 0.0f));
                    } else if (t3Var != null) {
                        animatorSet.playTogether(t3Var.l(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f47323h0, property, 0.0f), ObjectAnimator.ofFloat(this, g4.f47294f1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.er.h);
                    animatorSet.addListener(new f4(this, z10));
                    animatorSet.start();
                    g4Var.V0 = true;
                } else {
                    this.f29954c = false;
                    this.d = false;
                    this.f29955e = false;
                }
                VelocityTracker velocityTracker2 = this.f29959s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f29959s = null;
                }
            } else if (motionEvent == null) {
                this.f29954c = false;
                this.d = false;
                this.f29955e = false;
                VelocityTracker velocityTracker3 = this.f29959s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f29959s = null;
                }
                org.telegram.ui.Cells.h9 h9Var = g4Var.Q0;
                if (h9Var != null && !h9Var.x()) {
                    g4Var.Q0.f(false);
                }
            }
            if (this.d && this.H) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Gl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28978k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ld));
    }

    public final void b(MotionEvent motionEvent) {
        l0 l0Var;
        int color;
        this.f29954c = false;
        this.d = true;
        this.f29957n = (int) motionEvent.getX();
        g4 g4Var = this.I;
        ArrayList arrayList = g4Var.f47320e0;
        if (arrayList.size() > 1 && ((l0Var = g4Var.f47324i0) == null || (!l0Var.U && !l0Var.f52645a0))) {
            this.f29955e = true;
            this.h = g4Var.K0;
            g4Var.f47336v0[1].setVisibility(0);
            g4Var.f47336v0[1].setAlpha(1.0f);
            g4Var.f47336v0[1].setTranslationX(0.0f);
            k3 k3Var = g4Var.f47336v0[0];
            if (g4Var.L == null) {
                color = 0;
            } else {
                color = g4Var.m0.getColor();
            }
            k3Var.setBackgroundColor(color);
            g4Var.c0(-1, arrayList.get(arrayList.size() - 2), true);
            if (g4Var.f47323h0.indexOfChild(g4Var.f47336v0[0]) < g4Var.f47323h0.indexOfChild(g4Var.f47336v0[1])) {
                int indexOfChild = g4Var.f47323h0.indexOfChild(g4Var.f47336v0[0]);
                g4Var.f47323h0.removeView(g4Var.f47336v0[1]);
                g4Var.f47323h0.addView(g4Var.f47336v0[1], indexOfChild);
            }
        } else {
            this.f29955e = false;
        }
        g4Var.i();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        g4 g4Var = this.I;
        if (g4Var.L != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = g4Var.U;
        g4Var.U = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = g4Var.f47322g0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = g4Var.M) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            boolean z10 = false;
            if (boundingRects.get(0).height() != 0) {
                z10 = true;
            }
            g4Var.V = z10;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        g4 g4Var = this.I;
        if (g4Var.U == null && this.E != 0 && this.G != 0) {
            Paint paint = this.f29952a;
            paint.setAlpha((int) (g4Var.f47322g0.getAlpha() * 255.0f));
            int i10 = this.f29962y;
            if (i10 == 0 && (i7 = this.F) == 0) {
                canvas.drawRect(i10, i7, i10 + this.E, i7 + this.G, paint);
            } else {
                canvas.drawRect(i10 - getTranslationX(), this.F, (this.f29962y + this.E) - getTranslationX(), this.F + this.G, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            g4 g4Var = this.I;
            if (g4Var.f47324i0.W.isFocused()) {
                g4Var.f47324i0.W.clearFocus();
                org.telegram.messenger.g0.v1(g4Var.f47324i0.W);
                return true;
            } else if (g4Var.f47324i0.f52649c0.isFocused()) {
                g4Var.f47324i0.f52649c0.clearFocus();
                org.telegram.messenger.g0.v1(g4Var.f47324i0.f52649c0);
                return true;
            } else if (g4Var.f47330p0) {
                org.telegram.messenger.g0.v1(this);
                return true;
            } else {
                k3 k3Var = g4Var.f47336v0[0];
                if (k3Var != null && k3Var.f() && g4Var.f47336v0[0].getWebView() != null && g4Var.f47336v0[0].getWebView().canGoBack()) {
                    g4Var.f47336v0[0].getWebView().goBack();
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
        g4 g4Var = this.I;
        if (g4Var.S0.f46469n) {
            motionEvent.offsetLocation(-g4Var.f47323h0.getX(), -g4Var.f47323h0.getY());
            return g4Var.S0.g(motionEvent);
        }
        org.telegram.ui.Cells.t9 n10 = g4Var.Q0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-g4Var.f47323h0.getX(), -g4Var.f47323h0.getY());
        if (!g4Var.Q0.x() || !g4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
            if (n10.b(motionEvent)) {
                k3[] k3VarArr = g4Var.f47336v0;
                if (k3VarArr != null && (k3Var = k3VarArr[0]) != null && k3Var.f() && (arrayList = g4Var.f47320e0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && g4Var.Q0.x() && (motionEvent.getY() < g4Var.f47323h0.getTop() || motionEvent.getY() > g4Var.f47323h0.getBottom())) {
                if (g4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
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
        int i7 = (int) this.f29960w;
        int save = canvas.save();
        canvas.clipRect(i7, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        if (i7 != 0) {
            g4 g4Var = this.I;
            if (view == g4Var.f47323h0) {
                float f10 = measuredWidth - i7;
                float min = Math.min(0.8f, f10 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                g4Var.f47329o0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i7, getHeight(), g4Var.f47329o0);
                float max = Math.max(0.0f, Math.min(f10 / org.telegram.messenger.g0.L(20.0f), 1.0f));
                Drawable drawable = g4Var.f47328n0;
                drawable.setBounds(i7 - drawable.getIntrinsicWidth(), view.getTop(), i7, view.getBottom());
                g4Var.f47328n0.setAlpha((int) (max * 255.0f));
                g4Var.f47328n0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f29961x;
    }

    public float getInnerTranslationX() {
        return this.f29960w;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.X = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g4 g4Var = this.I;
        g4Var.X = false;
        VideoPlayerHolderBase videoPlayerHolderBase = g4Var.f49457x;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            g4Var.f49457x = null;
        }
        g4Var.f49458y = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f10;
        int systemWindowInsetRight;
        g4 g4Var = this.I;
        Paint paint = g4Var.f47339y0;
        if (g4Var.L == null) {
            int measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.f29960w, 0.0f, f11, measuredHeight2, g4Var.m0);
            WindowInsets windowInsets = g4Var.U;
            if (windowInsets != null) {
                canvas.drawRect(this.f29960w, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (g4Var.V) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f10, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, g4Var.f47340z0);
                    }
                }
                f10 = f11;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, g4Var.f47340z0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = g4.f47292d1;
        this.I.getClass();
        if (!a(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i7;
        g4 g4Var = this.I;
        int i15 = 0;
        if (g4Var.P0 != i14) {
            int i16 = 0;
            while (true) {
                k3[] k3VarArr = g4Var.f47336v0;
                if (i16 >= k3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : k3VarArr[i16].f48550c.f46543n.entrySet()) {
                    entry.setValue(-1);
                }
                i16++;
            }
            g4Var.P0 = i14;
        }
        WindowInsets windowInsets = g4Var.U;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f29962y = i14 - this.E;
                this.F = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f29962y = 0;
                this.F = 0;
            } else {
                this.f29962y = 0;
                this.F = (i12 - i10) - this.G;
            }
            i13 = windowInsets.getSystemWindowInsetTop();
            i15 = systemWindowInsetLeft;
        } else {
            i13 = 0;
        }
        k0 k0Var = g4Var.f47323h0;
        k0Var.layout(i15, i13, k0Var.getMeasuredWidth() + i15, g4Var.f47323h0.getMeasuredHeight() + i13);
        FrameLayout frameLayout = g4Var.Q;
        frameLayout.layout(i15, i13, frameLayout.getMeasuredWidth() + i15, g4Var.Q.getMeasuredHeight() + i13);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        g4 g4Var = this.I;
        if (g4Var.U != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = g4Var.U;
            if (org.telegram.messenger.g0.f23616y) {
                int i11 = org.telegram.messenger.g0.f23609q.y;
                if (size2 > i11) {
                    size2 = i11;
                }
                size2 += org.telegram.messenger.g0.f23603m;
            }
            int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
            size -= windowInsets.getSystemWindowInsetLeft() + windowInsets.getSystemWindowInsetRight();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.E = windowInsets.getSystemWindowInsetRight();
                this.G = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.E = windowInsets.getSystemWindowInsetLeft();
                this.G = systemWindowInsetBottom;
            } else {
                this.E = size;
                this.G = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (g4Var.L == null) {
            if (size2 < org.telegram.messenger.g0.f23609q.y - org.telegram.messenger.g0.L(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.f47330p0 = z10;
        }
        g4Var.f47323h0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        g4Var.Q.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = g4.f47292d1;
        this.I.getClass();
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
    public void setAlpha(float f10) {
        boolean z10;
        g4 g4Var = this.I;
        int i7 = (int) (255.0f * f10);
        g4Var.m0.setAlpha(i7);
        g4Var.f47339y0.setAlpha(i7);
        this.f29961x = f10;
        bg.u0 u0Var = g4Var.W0;
        if (u0Var != null) {
            if (g4Var.W && f10 == 1.0f && this.f29960w == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            u0Var.c(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        boolean z10;
        this.f29960w = f10;
        g4 g4Var = this.I;
        bg.u0 u0Var = g4Var.W0;
        if (u0Var != null) {
            if (g4Var.W && this.f29961x == 1.0f && f10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            u0Var.c(z10);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        hi.v vVar;
        org.telegram.ui.ActionBar.y2 y2Var;
        org.telegram.ui.ActionBar.x2 x2Var;
        Paint paint;
        int x02;
        int i7;
        int i10;
        k3 k3Var;
        k3 k3Var2;
        int i11;
        b3 b3Var;
        boolean z10;
        g4 g4Var = this.I;
        t3 t3Var = g4Var.L;
        try {
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Gl, false);
            if (g4Var.f47336v0 != null) {
                int i12 = 0;
                while (true) {
                    k3[] k3VarArr = g4Var.f47336v0;
                    if (i12 >= k3VarArr.length) {
                        break;
                    }
                    k3 k3Var3 = k3VarArr[i12];
                    if (k3Var3 != null && (i11 = k3Var3.E) != x03) {
                        if (k3Var3.f48557x == i11) {
                            k3Var3.f48557x = x03;
                        }
                        if (k3Var3.f48558y == i11) {
                            k3Var3.f48558y = x03;
                        }
                        k3Var3.E = x03;
                        if (k3Var3.f48553n && (b3Var = k3Var3.f48554r) != null) {
                            if (org.telegram.messenger.g0.B(x03) <= 0.721f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b3Var.b(z10, false);
                        }
                    }
                    i12++;
                }
            }
            l0 l0Var = g4Var.f47324i0;
            if (l0Var != null) {
                k3[] k3VarArr2 = g4Var.f47336v0;
                if (k3VarArr2 != null && (k3Var2 = k3VarArr2[0]) != null && org.telegram.messenger.gz.f23987v0) {
                    i7 = k3Var2.getBackgroundColor();
                } else {
                    i7 = x03;
                }
                l0Var.setMenuColors(i7);
                l0 l0Var2 = g4Var.f47324i0;
                k3[] k3VarArr3 = g4Var.f47336v0;
                if (k3VarArr3 != null && (k3Var = k3VarArr3[0]) != null && org.telegram.messenger.gz.f23987v0) {
                    i10 = k3Var.getActionBarColor();
                } else {
                    i10 = x03;
                }
                l0Var2.d(i10, false);
            }
            Paint paint2 = g4Var.m0;
            if (paint2 != null) {
                paint2.setColor(x03);
            }
            if (g4Var.A0 && (paint = g4Var.f47340z0) != null) {
                if (t3Var == null) {
                    x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, true);
                } else {
                    x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false);
                }
                paint.setColor(x02);
            }
            if (t3Var != null && (y2Var = t3Var.f51335e) != null && (x2Var = y2Var.f29887b) != null) {
                org.telegram.messenger.g0.r3(x2Var, t3Var.f());
            }
            if (g4Var.m0 != null && g4.f47305s1 != null) {
                g4.e0(g4Var);
            }
            if (g4Var.f47336v0 != null) {
                int i13 = 0;
                while (true) {
                    k3[] k3VarArr4 = g4Var.f47336v0;
                    if (i13 >= k3VarArr4.length) {
                        break;
                    }
                    k3 k3Var4 = k3VarArr4[i13];
                    if (k3Var4 != null && (vVar = k3Var4.f48549b) != null) {
                        for (int i14 = 0; i14 < vVar.getChildCount(); i14++) {
                            View childAt = vVar.getChildAt(i14);
                            if ((childAt instanceof s2) && ((s2) childAt).f51075e != null) {
                                ((s2) childAt).f51075e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i13++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = g4Var.f47322g0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
