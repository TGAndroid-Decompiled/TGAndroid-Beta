package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
public abstract class kx0 extends FrameLayout implements org.telegram.messenger.ls {
    public final ei.a f47336a;
    public final org.telegram.ui.Components.t61 f47337b;
    public final di.m6 f47338c;
    public final jx0 d;
    public int f47339e;
    public boolean f47340f;
    public ValueAnimator h;
    public float f47341n;
    public boolean f47342r;
    public final Rect f47343s;
    public final ru0 f47344w;

    public kx0(Context context, di.m6 m6Var, final org.telegram.ui.Components.xp0 xp0Var) {
        super(context);
        this.f47343s = new Rect();
        this.f47338c = m6Var;
        Objects.requireNonNull(m6Var);
        this.f47344w = new ru0(m6Var, 8);
        final org.telegram.ui.Components.yp0 yp0Var = (org.telegram.ui.Components.yp0) this;
        ei.a aVar = new ei.a(yp0Var, context, xp0Var, 1);
        this.f47336a = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        jx0 jx0Var = new jx0(yp0Var);
        this.d = jx0Var;
        jx0Var.f47051a = m6Var.a();
        aVar.setAdapter(jx0Var);
        aVar.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.t61 n10 = aVar.n(10, true);
        this.f47337b = n10;
        n10.g(org.telegram.ui.ActionBar.k6.f28176ui, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f28137si, org.telegram.ui.ActionBar.k6.f28194vi, org.telegram.ui.ActionBar.k6.f28128s8);
        n10.f38264r = 12;
        n10.setPreTabClick(new org.telegram.messenger.w10() {
            @Override
            public final Object d(Number number, Object obj) {
                di.y6 storiesController;
                int i7 = r3;
                final org.telegram.ui.Components.xp0 xp0Var2 = xp0Var;
                org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                Integer num = (Integer) number;
                switch (i7) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (yp0Var2.f47340f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.v4.P(xp0Var2.f40326a, xp0Var2.f40327b, xp0Var2.f40328c, new org.telegram.ui.Components.ax(xp0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !yp0Var2.f47340f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.xs0 xs0Var = xp0Var2.d;
                            org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40424x1;
                            storiesController = xs0Var.getStoriesController();
                            if (storiesController.i(xs0Var.l1)) {
                                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(f2Var, view);
                                H.W(new org.telegram.ui.Components.wp0(xp0Var2));
                                H.c(2131231763, org.telegram.messenger.hd.M0(2131744799, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.f40424x1, xs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.f40424x1, xs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.f40424x1, xs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                xs0Var.B(new org.telegram.ui.Components.n(H), f2Var, xs0Var.l1, intValue);
                                H.c(2131232116, org.telegram.messenger.hd.M0(2131744794, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.f40424x1, xs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.f40424x1, xs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.f40424x1, xs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232773, org.telegram.messenger.hd.M0(2131744791, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.f40424x1, xs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.f40424x1, xs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.f40424x1, xs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232108, org.telegram.messenger.hd.M0(2131744797, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.f40424x1, xs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.f40424x1, xs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.f40424x1, xs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, true);
                                H.Z();
                            }
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                }
            }
        });
        n10.setOnTabLongClick(new org.telegram.messenger.w10() {
            @Override
            public final Object d(Number number, Object obj) {
                di.y6 storiesController;
                int i7 = r3;
                final org.telegram.ui.Components.xp0 xp0Var2 = xp0Var;
                org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                Integer num = (Integer) number;
                switch (i7) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (yp0Var2.f47340f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.v4.P(xp0Var2.f40326a, xp0Var2.f40327b, xp0Var2.f40328c, new org.telegram.ui.Components.ax(xp0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !yp0Var2.f47340f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.xs0 xs0Var = xp0Var2.d;
                            org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40424x1;
                            storiesController = xs0Var.getStoriesController();
                            if (storiesController.i(xs0Var.l1)) {
                                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(f2Var, view);
                                H.W(new org.telegram.ui.Components.wp0(xp0Var2));
                                H.c(2131231763, org.telegram.messenger.hd.M0(2131744799, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.f40424x1, xs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.f40424x1, xs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.f40424x1, xs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                xs0Var.B(new org.telegram.ui.Components.n(H), f2Var, xs0Var.l1, intValue);
                                H.c(2131232116, org.telegram.messenger.hd.M0(2131744794, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.f40424x1, xs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.f40424x1, xs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.f40424x1, xs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232773, org.telegram.messenger.hd.M0(2131744791, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.f40424x1, xs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.f40424x1, xs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.f40424x1, xs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232108, org.telegram.messenger.hd.M0(2131744797, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xs0 xs0Var2 = xp0Var2.d;
                                                xs0Var2.Y0(xs0Var2.f40424x1, xs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                xs0 xs0Var3 = xp0Var2.d;
                                                xs0Var3.a1(xs0Var3.f40424x1, xs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                xs0 xs0Var4 = xp0Var2.d;
                                                xs0Var4.Z0(xs0Var4.f40424x1, xs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, true);
                                H.Z();
                            }
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                }
            }
        });
        addView(n10, c8.ha.e(-1, 42, 48));
        c(!m6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i7;
        org.telegram.ui.Components.t61 t61Var = this.f47337b;
        if (t61Var != null) {
            i7 = t61Var.getCurrentTabId();
        } else {
            i7 = 0;
        }
        di.m6 m6Var = this.f47338c;
        boolean a10 = m6Var.a();
        jx0 jx0Var = this.d;
        jx0Var.f47051a = a10;
        this.f47336a.o(true);
        c(!m6Var.h.isEmpty(), true, false);
        int i10 = this.f47339e;
        if (i10 > 0) {
            if (jx0Var.i(i10) != -1) {
                org.telegram.messenger.g0.i3(new ix0(this, this.f47339e, 1), 500L);
                this.f47339e = 0;
            }
        } else if (t61Var != null && i7 > 0 && m6Var.b(i7) == null) {
            t61Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z9, boolean z10, boolean z11) {
        if (this.f47342r == z9 && !z11) {
            return;
        }
        this.f47342r = z9;
        setEnabled(z9);
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
        float f10 = 0.0f;
        if (!z10) {
            if (z9) {
                f10 = 1.0f;
            }
            this.f47341n = f10;
            b();
            return;
        }
        float f11 = this.f47341n;
        if (z9) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(org.telegram.ui.Components.xq.h);
        this.h.addUpdateListener(new a3(this, 28));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.j3 && ((Long) objArr[0]).longValue() == this.f47338c.f9355b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f47342r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f47337b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f47341n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f47341n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        di.m6 m6Var = this.f47338c;
        org.telegram.messenger.qs.f(m6Var.f9354a).c(this, org.telegram.messenger.qs.j3);
        if (this.f47342r != m6Var.h.isEmpty() && this.d.f47051a == m6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f47338c.f9354a).n(this, org.telegram.messenger.qs.j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        Rect rect = this.f47343s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i7) {
        if (this.d.i(i7) != -1) {
            org.telegram.messenger.g0.i3(new ix0(this, i7, 0), 500L);
        } else {
            this.f47339e = i7;
        }
    }

    public void setReorderingAlbums(boolean z9) {
        float f10;
        float f11;
        if (this.f47340f != z9) {
            this.f47340f = z9;
            org.telegram.ui.Components.t61 t61Var = this.f47337b;
            t61Var.setReordering(z9);
            boolean z10 = this.f47340f;
            org.telegram.ui.Components.yp0 yp0Var = (org.telegram.ui.Components.yp0) this;
            org.telegram.ui.Components.xs0 xs0Var = yp0Var.f40693x;
            TextView textView = xs0Var.f40411s0;
            textView.setVisibility(0);
            ViewPropertyAnimator animate = textView.animate();
            float f12 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z10) {
                f12 = 0.4f;
            }
            scaleX.scaleY(f12).withEndAction(new org.telegram.ui.Components.tp0(1, yp0Var, z10)).start();
            xs0Var.G1(true);
            if (z9) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.U4(false);
                    org.telegram.messenger.g0.h3(new j90(profileActivity, 28));
                }
            }
            if (!z9) {
                org.telegram.messenger.g0.r(this.f47344w);
                di.m6 m6Var = this.f47338c;
                m6Var.e();
                m6Var.f(false);
                int currentPosition = t61Var.getCurrentPosition();
                jx0 jx0Var = this.d;
                int f13 = jx0Var.f(currentPosition);
                this.f47336a.o(true);
                int i7 = jx0Var.i(f13);
                t61Var.e(0.0f, i7, i7);
            }
        }
    }
}
