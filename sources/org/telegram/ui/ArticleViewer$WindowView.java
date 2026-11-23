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
public class ArticleViewer$WindowView extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final g4 I;
    public final Paint f30417a;
    public int f30418b;
    public boolean f30419c;
    public boolean d;
    public boolean f30420e;
    public boolean f30421f;
    public int h;
    public int f30422n;
    public int f30423r;
    public VelocityTracker f30424s;
    public float f30425w;
    public float f30426x;
    public int f30427y;

    public ArticleViewer$WindowView(g4 g4Var, Activity activity) {
        super(activity);
        this.I = g4Var;
        this.f30417a = new Paint();
        this.f30426x = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        k3 k3Var;
        g4 g4Var = this.I;
        t3 t3Var = g4Var.L;
        if (g4Var.f48085w0 == null && !g4Var.V0 && g4Var.Q.getVisibility() != 0 && !g4Var.Q0.x()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f30419c) {
                this.f30418b = motionEvent.getPointerId(0);
                this.f30419c = true;
                this.f30422n = (int) motionEvent.getX();
                this.f30423r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f30424s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f30418b) {
                if (this.f30424s == null) {
                    this.f30424s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f30422n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f30423r);
                this.f30424s.addMovement(motionEvent);
                k3 k3Var2 = g4Var.f48084v0[0];
                if (k3Var2 != null && k3Var2.f() && (!g4Var.f48084v0[0].f49290e.b(true) || g4Var.f48084v0[0].f49290e.f18992c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.H = z11;
                if ((t3Var == null || !t3Var.I) && this.f30419c && !this.d && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs && this.H) {
                    b(motionEvent);
                } else if (this.d) {
                    g4Var.d = null;
                    g4Var.f50842f = null;
                    if (this.f30420e && (k3Var = g4Var.f48084v0[0]) != null) {
                        k3Var.setTranslationX(max);
                    } else if (t3Var != null) {
                        t3Var.J = max / getWidth();
                        t3Var.f52222c.invalidate();
                        t3Var.u();
                        t3Var.r();
                    } else {
                        k0 k0Var = g4Var.f48071h0;
                        float f10 = max;
                        k0Var.setTranslationX(f10);
                        setInnerTranslationX(f10);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f30418b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f30424s == null) {
                    this.f30424s = VelocityTracker.obtain();
                }
                this.f30424s.computeCurrentVelocity(1000);
                float xVelocity = this.f30424s.getXVelocity();
                float yVelocity = this.f30424s.getYVelocity();
                if ((t3Var == null || !t3Var.I) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.f30420e;
                    if (z12) {
                        view = g4Var.f48084v0[0];
                    } else {
                        view = g4Var.f48071h0;
                    }
                    if (!z12 && t3Var != null) {
                        x10 = t3Var.J * t3Var.f52222c.getWidth();
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
                        if (this.f30420e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f48084v0[0], property, view.getMeasuredWidth()));
                        } else if (t3Var != null) {
                            animatorSet.playTogether(t3Var.l(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f48071h0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, g4.f48042f1, view.getMeasuredWidth()));
                        }
                    } else if (this.f30420e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f48084v0[0], property, 0.0f));
                    } else if (t3Var != null) {
                        animatorSet.playTogether(t3Var.l(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.f48071h0, property, 0.0f), ObjectAnimator.ofFloat(this, g4.f48042f1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.kr.h);
                    animatorSet.addListener(new f4(this, z10));
                    animatorSet.start();
                    g4Var.V0 = true;
                } else {
                    this.f30419c = false;
                    this.d = false;
                    this.f30420e = false;
                }
                VelocityTracker velocityTracker2 = this.f30424s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f30424s = null;
                }
            } else if (motionEvent == null) {
                this.f30419c = false;
                this.d = false;
                this.f30420e = false;
                VelocityTracker velocityTracker3 = this.f30424s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f30424s = null;
                }
                org.telegram.ui.Cells.i9 i9Var = g4Var.Q0;
                if (i9Var != null && !i9Var.x()) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Gl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29580k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ld));
    }

    public final void b(MotionEvent motionEvent) {
        l0 l0Var;
        int color;
        this.f30419c = false;
        this.d = true;
        this.f30422n = (int) motionEvent.getX();
        g4 g4Var = this.I;
        ArrayList arrayList = g4Var.f48068e0;
        if (arrayList.size() > 1 && ((l0Var = g4Var.f48072i0) == null || (!l0Var.U && !l0Var.f53410a0))) {
            this.f30420e = true;
            this.h = g4Var.K0;
            g4Var.f48084v0[1].setVisibility(0);
            g4Var.f48084v0[1].setAlpha(1.0f);
            g4Var.f48084v0[1].setTranslationX(0.0f);
            k3 k3Var = g4Var.f48084v0[0];
            if (g4Var.L == null) {
                color = 0;
            } else {
                color = g4Var.m0.getColor();
            }
            k3Var.setBackgroundColor(color);
            g4Var.c0(-1, arrayList.get(arrayList.size() - 2), true);
            if (g4Var.f48071h0.indexOfChild(g4Var.f48084v0[0]) < g4Var.f48071h0.indexOfChild(g4Var.f48084v0[1])) {
                int indexOfChild = g4Var.f48071h0.indexOfChild(g4Var.f48084v0[0]);
                g4Var.f48071h0.removeView(g4Var.f48084v0[1]);
                g4Var.f48071h0.addView(g4Var.f48084v0[1], indexOfChild);
            }
        } else {
            this.f30420e = false;
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
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = g4Var.f48070g0) != null) {
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
            Paint paint = this.f30417a;
            paint.setAlpha((int) (g4Var.f48070g0.getAlpha() * 255.0f));
            int i10 = this.f30427y;
            if (i10 == 0 && (i7 = this.F) == 0) {
                canvas.drawRect(i10, i7, i10 + this.E, i7 + this.G, paint);
            } else {
                canvas.drawRect(i10 - getTranslationX(), this.F, (this.f30427y + this.E) - getTranslationX(), this.F + this.G, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            g4 g4Var = this.I;
            if (g4Var.f48072i0.W.isFocused()) {
                g4Var.f48072i0.W.clearFocus();
                org.telegram.messenger.g0.v1(g4Var.f48072i0.W);
                return true;
            } else if (g4Var.f48072i0.f53414c0.isFocused()) {
                g4Var.f48072i0.f53414c0.clearFocus();
                org.telegram.messenger.g0.v1(g4Var.f48072i0.f53414c0);
                return true;
            } else if (g4Var.f48078p0) {
                org.telegram.messenger.g0.v1(this);
                return true;
            } else {
                k3 k3Var = g4Var.f48084v0[0];
                if (k3Var != null && k3Var.f() && g4Var.f48084v0[0].getWebView() != null && g4Var.f48084v0[0].getWebView().canGoBack()) {
                    g4Var.f48084v0[0].getWebView().goBack();
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
        if (g4Var.S0.f47964n) {
            motionEvent.offsetLocation(-g4Var.f48071h0.getX(), -g4Var.f48071h0.getY());
            return g4Var.S0.g(motionEvent);
        }
        org.telegram.ui.Cells.u9 n10 = g4Var.Q0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-g4Var.f48071h0.getX(), -g4Var.f48071h0.getY());
        if (!g4Var.Q0.x() || !g4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
            if (n10.b(motionEvent)) {
                k3[] k3VarArr = g4Var.f48084v0;
                if (k3VarArr != null && (k3Var = k3VarArr[0]) != null && k3Var.f() && (arrayList = g4Var.f48068e0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && g4Var.Q0.x() && (motionEvent.getY() < g4Var.f48071h0.getTop() || motionEvent.getY() > g4Var.f48071h0.getBottom())) {
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
        int i7 = (int) this.f30425w;
        int save = canvas.save();
        canvas.clipRect(i7, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        if (i7 != 0) {
            g4 g4Var = this.I;
            if (view == g4Var.f48071h0) {
                float f10 = measuredWidth - i7;
                float min = Math.min(0.8f, f10 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                g4Var.f48077o0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i7, getHeight(), g4Var.f48077o0);
                float max = Math.max(0.0f, Math.min(f10 / org.telegram.messenger.g0.L(20.0f), 1.0f));
                Drawable drawable = g4Var.f48076n0;
                drawable.setBounds(i7 - drawable.getIntrinsicWidth(), view.getTop(), i7, view.getBottom());
                g4Var.f48076n0.setAlpha((int) (max * 255.0f));
                g4Var.f48076n0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override
    public float getAlpha() {
        return this.f30426x;
    }

    public float getInnerTranslationX() {
        return this.f30425w;
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
        VideoPlayerHolderBase videoPlayerHolderBase = g4Var.f50847x;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            g4Var.f50847x = null;
        }
        g4Var.f50848y = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f10;
        int systemWindowInsetRight;
        g4 g4Var = this.I;
        Paint paint = g4Var.f48087y0;
        if (g4Var.L == null) {
            int measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.f30425w, 0.0f, f11, measuredHeight2, g4Var.m0);
            WindowInsets windowInsets = g4Var.U;
            if (windowInsets != null) {
                canvas.drawRect(this.f30425w, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (g4Var.V) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f10, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, g4Var.f48088z0);
                    }
                }
                f10 = f11;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f10, measuredHeight2, g4Var.f48088z0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = g4.f48040d1;
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
                k3[] k3VarArr = g4Var.f48084v0;
                if (i16 >= k3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : k3VarArr[i16].f49289c.f47315n.entrySet()) {
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
                this.f30427y = i14 - this.E;
                this.F = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f30427y = 0;
                this.F = 0;
            } else {
                this.f30427y = 0;
                this.F = (i12 - i10) - this.G;
            }
            i13 = windowInsets.getSystemWindowInsetTop();
            i15 = systemWindowInsetLeft;
        } else {
            i13 = 0;
        }
        k0 k0Var = g4Var.f48071h0;
        k0Var.layout(i15, i13, k0Var.getMeasuredWidth() + i15, g4Var.f48071h0.getMeasuredHeight() + i13);
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
            if (org.telegram.messenger.g0.f24233y) {
                int i11 = org.telegram.messenger.g0.f24226q.y;
                if (size2 > i11) {
                    size2 = i11;
                }
                size2 += org.telegram.messenger.g0.f24220m;
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
            if (size2 < org.telegram.messenger.g0.f24226q.y - org.telegram.messenger.g0.L(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.f48078p0 = z10;
        }
        g4Var.f48071h0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        g4Var.Q.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = g4.f48040d1;
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
        g4Var.f48087y0.setAlpha(i7);
        this.f30426x = f10;
        bg.v0 v0Var = g4Var.W0;
        if (v0Var != null) {
            if (g4Var.W && f10 == 1.0f && this.f30425w == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            v0Var.b(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        boolean z10;
        this.f30425w = f10;
        g4 g4Var = this.I;
        bg.v0 v0Var = g4Var.W0;
        if (v0Var != null) {
            if (g4Var.W && this.f30426x == 1.0f && f10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            v0Var.b(z10);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        hi.e0 e0Var;
        org.telegram.ui.ActionBar.a3 a3Var;
        org.telegram.ui.ActionBar.z2 z2Var;
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
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
            if (g4Var.f48084v0 != null) {
                int i12 = 0;
                while (true) {
                    k3[] k3VarArr = g4Var.f48084v0;
                    if (i12 >= k3VarArr.length) {
                        break;
                    }
                    k3 k3Var3 = k3VarArr[i12];
                    if (k3Var3 != null && (i11 = k3Var3.E) != x03) {
                        if (k3Var3.f49296x == i11) {
                            k3Var3.f49296x = x03;
                        }
                        if (k3Var3.f49297y == i11) {
                            k3Var3.f49297y = x03;
                        }
                        k3Var3.E = x03;
                        if (k3Var3.f49292n && (b3Var = k3Var3.f49293r) != null) {
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
            l0 l0Var = g4Var.f48072i0;
            if (l0Var != null) {
                k3[] k3VarArr2 = g4Var.f48084v0;
                if (k3VarArr2 != null && (k3Var2 = k3VarArr2[0]) != null && org.telegram.messenger.bz.f23328v0) {
                    i7 = k3Var2.getBackgroundColor();
                } else {
                    i7 = x03;
                }
                l0Var.setMenuColors(i7);
                l0 l0Var2 = g4Var.f48072i0;
                k3[] k3VarArr3 = g4Var.f48084v0;
                if (k3VarArr3 != null && (k3Var = k3VarArr3[0]) != null && org.telegram.messenger.bz.f23328v0) {
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
            if (g4Var.A0 && (paint = g4Var.f48088z0) != null) {
                if (t3Var == null) {
                    x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, true);
                } else {
                    x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false);
                }
                paint.setColor(x02);
            }
            if (t3Var != null && (a3Var = t3Var.f52223e) != null && (z2Var = a3Var.f28846b) != null) {
                org.telegram.messenger.g0.q3(z2Var, t3Var.f());
            }
            if (g4Var.m0 != null && g4.f48053s1 != null) {
                g4.e0(g4Var);
            }
            if (g4Var.f48084v0 != null) {
                int i13 = 0;
                while (true) {
                    k3[] k3VarArr4 = g4Var.f48084v0;
                    if (i13 >= k3VarArr4.length) {
                        break;
                    }
                    k3 k3Var4 = k3VarArr4[i13];
                    if (k3Var4 != null && (e0Var = k3Var4.f49288b) != null) {
                        for (int i14 = 0; i14 < e0Var.getChildCount(); i14++) {
                            View childAt = e0Var.getChildAt(i14);
                            if ((childAt instanceof s2) && ((s2) childAt).f51939e != null) {
                                ((s2) childAt).f51939e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i13++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = g4Var.f48070g0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
