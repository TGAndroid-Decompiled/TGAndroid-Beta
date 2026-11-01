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
public class ArticleViewer$WindowView extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final h4 H;
    public final Paint f21631a;
    public int f21632b;
    public boolean f21633c;
    public boolean d;
    public boolean e;
    public boolean f21634f;
    public int h;
    public int f21635n;
    public int f21636r;
    public VelocityTracker f21637s;
    public float f21638w;
    public float f21639x;
    public int f21640y;

    public ArticleViewer$WindowView(h4 h4Var, Activity activity) {
        super(activity);
        this.H = h4Var;
        this.f21631a = new Paint();
        this.f21639x = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view;
        float x10;
        boolean z10;
        boolean z11;
        l3 l3Var;
        h4 h4Var = this.H;
        u3 u3Var = h4Var.K;
        if (h4Var.f37692v0 == null && !h4Var.U0 && h4Var.P.getVisibility() != 0 && !h4Var.P0.x()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.f21633c) {
                this.f21632b = motionEvent.getPointerId(0);
                this.f21633c = true;
                this.f21635n = (int) motionEvent.getX();
                this.f21636r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.f21637s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f21632b) {
                if (this.f21637s == null) {
                    this.f21637s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.f21635n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.f21636r);
                this.f21637s.addMovement(motionEvent);
                l3 l3Var2 = h4Var.f37691u0[0];
                if (l3Var2 != null && l3Var2.f() && (!h4Var.f37691u0[0].e.b(true) || h4Var.f37691u0[0].e.f53822c)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.G = z11;
                if ((u3Var == null || !u3Var.H) && this.f21633c && !this.d && max >= org.telegram.messenger.i0.a1(true, 0.4f) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    h4Var.d = null;
                    h4Var.f39098f = null;
                    if (this.e && (l3Var = h4Var.f37691u0[0]) != null) {
                        l3Var.setTranslationX(max);
                    } else if (u3Var != null) {
                        u3Var.I = max / getWidth();
                        u3Var.f41775c.invalidate();
                        u3Var.u();
                        u3Var.r();
                    } else {
                        l0 l0Var = h4Var.f37678g0;
                        float f7 = max;
                        l0Var.setTranslationX(f7);
                        setInnerTranslationX(f7);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f21632b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.f21637s == null) {
                    this.f21637s = VelocityTracker.obtain();
                }
                this.f21637s.computeCurrentVelocity(1000);
                float xVelocity = this.f21637s.getXVelocity();
                float yVelocity = this.f21637s.getYVelocity();
                if ((u3Var == null || !u3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z12 = this.e;
                    if (z12) {
                        view = h4Var.f37691u0[0];
                    } else {
                        view = h4Var.f37678g0;
                    }
                    if (!z12 && u3Var != null) {
                        x10 = u3Var.I * u3Var.f41775c.getWidth();
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
                            animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.f37691u0[0], property, view.getMeasuredWidth()));
                        } else if (u3Var != null) {
                            animatorSet.playTogether(u3Var.l(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.f37678g0, property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, h4.f37649e1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.f37691u0[0], property, 0.0f));
                    } else if (u3Var != null) {
                        animatorSet.playTogether(u3Var.l(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.f37678g0, property, 0.0f), ObjectAnimator.ofFloat(this, h4.f37649e1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), 250));
                    animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
                    animatorSet.addListener(new g4(this, z10));
                    animatorSet.start();
                    h4Var.U0 = true;
                } else {
                    this.f21633c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker2 = this.f21637s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f21637s = null;
                }
            } else if (motionEvent == null) {
                this.f21633c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker3 = this.f21637s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f21637s = null;
                }
                org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
                if (k9Var != null && !k9Var.x()) {
                    h4Var.P0.f(false);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Dl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21059k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Id));
    }

    public final void b(MotionEvent motionEvent) {
        m0 m0Var;
        int color;
        this.f21633c = false;
        this.d = true;
        this.f21635n = (int) motionEvent.getX();
        h4 h4Var = this.H;
        ArrayList arrayList = h4Var.f37675d0;
        if (arrayList.size() > 1 && ((m0Var = h4Var.f37679h0) == null || (!m0Var.T && !m0Var.W))) {
            this.e = true;
            this.h = h4Var.J0;
            h4Var.f37691u0[1].setVisibility(0);
            h4Var.f37691u0[1].setAlpha(1.0f);
            h4Var.f37691u0[1].setTranslationX(0.0f);
            l3 l3Var = h4Var.f37691u0[0];
            if (h4Var.K == null) {
                color = 0;
            } else {
                color = h4Var.f37683l0.getColor();
            }
            l3Var.setBackgroundColor(color);
            h4Var.c0(-1, arrayList.get(arrayList.size() - 2), true);
            if (h4Var.f37678g0.indexOfChild(h4Var.f37691u0[0]) < h4Var.f37678g0.indexOfChild(h4Var.f37691u0[1])) {
                int indexOfChild = h4Var.f37678g0.indexOfChild(h4Var.f37691u0[0]);
                h4Var.f37678g0.removeView(h4Var.f37691u0[1]);
                h4Var.f37678g0.addView(h4Var.f37691u0[1], indexOfChild);
            }
        } else {
            this.e = false;
        }
        h4Var.i();
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
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = h4Var.f37677f0) != null) {
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
        if (h4Var.T == null && this.D != 0 && this.F != 0) {
            Paint paint = this.f21631a;
            paint.setAlpha((int) (h4Var.f37677f0.getAlpha() * 255.0f));
            int i11 = this.f21640y;
            if (i11 == 0 && (i10 = this.E) == 0) {
                canvas.drawRect(i11, i10, i11 + this.D, i10 + this.F, paint);
            } else {
                canvas.drawRect(i11 - getTranslationX(), this.E, (this.f21640y + this.D) - getTranslationX(), this.E + this.F, paint);
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            h4 h4Var = this.H;
            if (h4Var.f37679h0.V.isFocused()) {
                h4Var.f37679h0.V.clearFocus();
                org.telegram.messenger.i0.v1(h4Var.f37679h0.V);
                return true;
            } else if (h4Var.f37679h0.f42897b0.isFocused()) {
                h4Var.f37679h0.f42897b0.clearFocus();
                org.telegram.messenger.i0.v1(h4Var.f37679h0.f42897b0);
                return true;
            } else if (h4Var.f37685o0) {
                org.telegram.messenger.i0.v1(this);
                return true;
            } else {
                l3 l3Var = h4Var.f37691u0[0];
                if (l3Var != null && l3Var.f() && h4Var.f37691u0[0].getWebView() != null && h4Var.f37691u0[0].getWebView().canGoBack()) {
                    h4Var.f37691u0[0].getWebView().goBack();
                    return true;
                }
                h4Var.m(true, false);
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
        if (h4Var.R0.f40600n) {
            motionEvent.offsetLocation(-h4Var.f37678g0.getX(), -h4Var.f37678g0.getY());
            return h4Var.R0.g(motionEvent);
        }
        org.telegram.ui.Cells.v9 n10 = h4Var.P0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-h4Var.f37678g0.getX(), -h4Var.f37678g0.getY());
        if (!h4Var.P0.x() || !h4Var.P0.n(getContext()).onTouchEvent(obtain)) {
            if (n10.b(motionEvent)) {
                l3[] l3VarArr = h4Var.f37691u0;
                if (l3VarArr != null && (l3Var = l3VarArr[0]) != null && l3Var.f() && (arrayList = h4Var.f37675d0) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && h4Var.P0.x() && (motionEvent.getY() < h4Var.f37678g0.getTop() || motionEvent.getY() > h4Var.f37678g0.getBottom())) {
                if (h4Var.P0.n(getContext()).onTouchEvent(obtain)) {
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
        int i10 = (int) this.f21638w;
        int save = canvas.save();
        canvas.clipRect(i10, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (i10 != 0) {
            h4 h4Var = this.H;
            if (view == h4Var.f37678g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                h4Var.f37684n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), h4Var.f37684n0);
                float max = Math.max(0.0f, Math.min(f7 / org.telegram.messenger.i0.L(20.0f), 1.0f));
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
        return this.f21639x;
    }

    public float getInnerTranslationX() {
        return this.f21638w;
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
        VideoPlayerHolderBase videoPlayerHolderBase = h4Var.f39103x;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            h4Var.f39103x = null;
        }
        h4Var.f39104y = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        float f7;
        int systemWindowInsetRight;
        h4 h4Var = this.H;
        Paint paint = h4Var.f37694x0;
        if (h4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.f21638w, 0.0f, f10, measuredHeight2, h4Var.f37683l0);
            WindowInsets windowInsets = h4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.f21638w, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (h4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f7 = f10;
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f7, measuredHeight2, paint);
                        canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, h4Var.f37695y0);
                    }
                }
                f7 = f10;
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f7, measuredHeight2, h4Var.f37695y0);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = h4.f37647c1;
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
        if (h4Var.O0 != i15) {
            int i17 = 0;
            while (true) {
                l3[] l3VarArr = h4Var.f37691u0;
                if (i17 >= l3VarArr.length) {
                    break;
                }
                for (Map.Entry entry : l3VarArr[i17].f39062c.f36984n.entrySet()) {
                    entry.setValue(-1);
                }
                i17++;
            }
            h4Var.O0 = i15;
        }
        WindowInsets windowInsets = h4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.f21640y = i15 - this.D;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.f21640y = 0;
                this.E = 0;
            } else {
                this.f21640y = 0;
                this.E = (i13 - i11) - this.F;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        l0 l0Var = h4Var.f37678g0;
        l0Var.layout(i16, i14, l0Var.getMeasuredWidth() + i16, h4Var.f37678g0.getMeasuredHeight() + i14);
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
            if (org.telegram.messenger.i0.f16179y) {
                int i12 = org.telegram.messenger.i0.f16172q.y;
                if (size2 > i12) {
                    size2 = i12;
                }
                size2 += org.telegram.messenger.i0.f16166m;
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
        if (h4Var.K == null) {
            if (size2 < org.telegram.messenger.i0.f16172q.y - org.telegram.messenger.i0.L(100.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            h4Var.f37685o0 = z10;
        }
        h4Var.f37678g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        h4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = h4.f37647c1;
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
        h4Var.f37683l0.setAlpha(i10);
        h4Var.f37694x0.setAlpha(i10);
        this.f21639x = f7;
        z90 z90Var = h4Var.V0;
        if (z90Var != null) {
            if (h4Var.V && f7 == 1.0f && this.f21638w == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            z90Var.c(z10);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f7) {
        boolean z10;
        this.f21638w = f7;
        h4 h4Var = this.H;
        z90 z90Var = h4Var.V0;
        if (z90Var != null) {
            if (h4Var.V && this.f21639x == 1.0f && f7 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            z90Var.c(z10);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        g3 g3Var;
        org.telegram.ui.ActionBar.d3 d3Var;
        org.telegram.ui.ActionBar.c3 c3Var;
        Paint paint;
        int x02;
        int i10;
        int i11;
        l3 l3Var;
        l3 l3Var2;
        int i12;
        b3 b3Var;
        boolean z10;
        h4 h4Var = this.H;
        u3 u3Var = h4Var.K;
        try {
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
            if (h4Var.f37691u0 != null) {
                int i13 = 0;
                while (true) {
                    l3[] l3VarArr = h4Var.f37691u0;
                    if (i13 >= l3VarArr.length) {
                        break;
                    }
                    l3 l3Var3 = l3VarArr[i13];
                    if (l3Var3 != null && (i12 = l3Var3.D) != x03) {
                        if (l3Var3.f39068x == i12) {
                            l3Var3.f39068x = x03;
                        }
                        if (l3Var3.f39069y == i12) {
                            l3Var3.f39069y = x03;
                        }
                        l3Var3.D = x03;
                        if (l3Var3.f39064n && (b3Var = l3Var3.f39065r) != null) {
                            if (org.telegram.messenger.i0.B(x03) <= 0.721f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b3Var.b(z10, false);
                        }
                    }
                    i13++;
                }
            }
            m0 m0Var = h4Var.f37679h0;
            if (m0Var != null) {
                l3[] l3VarArr2 = h4Var.f37691u0;
                if (l3VarArr2 != null && (l3Var2 = l3VarArr2[0]) != null && org.telegram.messenger.uz.f18558v0) {
                    i10 = l3Var2.getBackgroundColor();
                } else {
                    i10 = x03;
                }
                m0Var.setMenuColors(i10);
                m0 m0Var2 = h4Var.f37679h0;
                l3[] l3VarArr3 = h4Var.f37691u0;
                if (l3VarArr3 != null && (l3Var = l3VarArr3[0]) != null && org.telegram.messenger.uz.f18558v0) {
                    i11 = l3Var.getActionBarColor();
                } else {
                    i11 = x03;
                }
                m0Var2.d(i11, false);
            }
            Paint paint2 = h4Var.f37683l0;
            if (paint2 != null) {
                paint2.setColor(x03);
            }
            if (h4Var.f37696z0 && (paint = h4Var.f37695y0) != null) {
                if (u3Var == null) {
                    x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, true);
                } else {
                    x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, false);
                }
                paint.setColor(x02);
            }
            if (u3Var != null && (d3Var = u3Var.e) != null && (c3Var = d3Var.f20251b) != null) {
                org.telegram.messenger.i0.q3(c3Var, u3Var.f());
            }
            if (h4Var.f37683l0 != null && h4.f37661r1 != null) {
                h4.e0(h4Var);
            }
            if (h4Var.f37691u0 != null) {
                int i14 = 0;
                while (true) {
                    l3[] l3VarArr4 = h4Var.f37691u0;
                    if (i14 >= l3VarArr4.length) {
                        break;
                    }
                    l3 l3Var4 = l3VarArr4[i14];
                    if (l3Var4 != null && (g3Var = l3Var4.f39061b) != null) {
                        for (int i15 = 0; i15 < g3Var.getChildCount(); i15++) {
                            View childAt = g3Var.getChildAt(i15);
                            if ((childAt instanceof s2) && ((s2) childAt).e != null) {
                                ((s2) childAt).e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i14++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = h4Var.f37677f0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
