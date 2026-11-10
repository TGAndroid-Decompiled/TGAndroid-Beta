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
public abstract class px0 extends FrameLayout implements org.telegram.messenger.ls {
    public final ei.a f48861a;
    public final org.telegram.ui.Components.u61 f48862b;
    public final di.n6 f48863c;
    public final ox0 d;
    public int f48864e;
    public boolean f48865f;
    public ValueAnimator h;
    public float f48866n;
    public boolean f48867r;
    public final Rect f48868s;
    public final uu0 f48869w;

    public px0(Context context, di.n6 n6Var, final org.telegram.ui.Components.xp0 xp0Var) {
        super(context);
        this.f48868s = new Rect();
        this.f48863c = n6Var;
        Objects.requireNonNull(n6Var);
        this.f48869w = new uu0(n6Var, 8);
        final org.telegram.ui.Components.yp0 yp0Var = (org.telegram.ui.Components.yp0) this;
        ei.a aVar = new ei.a(yp0Var, context, xp0Var, 1);
        this.f48861a = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        ox0 ox0Var = new ox0(yp0Var);
        this.d = ox0Var;
        ox0Var.f48590a = n6Var.a();
        aVar.setAdapter(ox0Var);
        aVar.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.u61 n10 = aVar.n(10, true);
        this.f48862b = n10;
        n10.g(org.telegram.ui.ActionBar.m6.f28218ui, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.f28179si, org.telegram.ui.ActionBar.m6.f28236vi, org.telegram.ui.ActionBar.m6.f28170s8);
        n10.f38578r = 12;
        n10.setPreTabClick(new org.telegram.messenger.w10() {
            @Override
            public final Object d(Number number, Object obj) {
                di.z6 storiesController;
                int i7 = r3;
                final org.telegram.ui.Components.xp0 xp0Var2 = xp0Var;
                org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                Integer num = (Integer) number;
                switch (i7) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (yp0Var2.f48865f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.u4.P(xp0Var2.f40385a, xp0Var2.f40386b, xp0Var2.f40387c, new org.telegram.ui.Components.ax(xp0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !yp0Var2.f48865f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.ys0 ys0Var = xp0Var2.d;
                            org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
                            storiesController = ys0Var.getStoriesController();
                            if (storiesController.i(ys0Var.l1)) {
                                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(f2Var, view);
                                H.W(new org.telegram.ui.Components.wp0(xp0Var2));
                                H.c(2131231763, org.telegram.messenger.id.M0(2131744798, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = xp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f40719x1, ys0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = xp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f40719x1, ys0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = xp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f40719x1, ys0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                ys0Var.B(new org.telegram.ui.Components.m(H), f2Var, ys0Var.l1, intValue);
                                H.c(2131232116, org.telegram.messenger.id.M0(2131744793, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = xp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f40719x1, ys0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = xp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f40719x1, ys0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = xp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f40719x1, ys0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232773, org.telegram.messenger.id.M0(2131744790, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = xp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f40719x1, ys0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = xp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f40719x1, ys0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = xp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f40719x1, ys0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232108, org.telegram.messenger.id.M0(2131744796, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = xp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f40719x1, ys0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = xp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f40719x1, ys0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = xp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f40719x1, ys0Var4.l1, intValue);
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
                di.z6 storiesController;
                int i7 = r3;
                final org.telegram.ui.Components.xp0 xp0Var2 = xp0Var;
                org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                Integer num = (Integer) number;
                switch (i7) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (yp0Var2.f48865f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.u4.P(xp0Var2.f40385a, xp0Var2.f40386b, xp0Var2.f40387c, new org.telegram.ui.Components.ax(xp0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !yp0Var2.f48865f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.ys0 ys0Var = xp0Var2.d;
                            org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
                            storiesController = ys0Var.getStoriesController();
                            if (storiesController.i(ys0Var.l1)) {
                                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(f2Var, view);
                                H.W(new org.telegram.ui.Components.wp0(xp0Var2));
                                H.c(2131231763, org.telegram.messenger.id.M0(2131744798, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = xp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f40719x1, ys0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = xp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f40719x1, ys0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = xp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f40719x1, ys0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                ys0Var.B(new org.telegram.ui.Components.m(H), f2Var, ys0Var.l1, intValue);
                                H.c(2131232116, org.telegram.messenger.id.M0(2131744793, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = xp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f40719x1, ys0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = xp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f40719x1, ys0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = xp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f40719x1, ys0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232773, org.telegram.messenger.id.M0(2131744790, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = xp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f40719x1, ys0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = xp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f40719x1, ys0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = xp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f40719x1, ys0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232108, org.telegram.messenger.id.M0(2131744796, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = xp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f40719x1, ys0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = xp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f40719x1, ys0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = xp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f40719x1, ys0Var4.l1, intValue);
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
        c(!n6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i7;
        org.telegram.ui.Components.u61 u61Var = this.f48862b;
        if (u61Var != null) {
            i7 = u61Var.getCurrentTabId();
        } else {
            i7 = 0;
        }
        di.n6 n6Var = this.f48863c;
        boolean a10 = n6Var.a();
        ox0 ox0Var = this.d;
        ox0Var.f48590a = a10;
        this.f48861a.o(true);
        c(!n6Var.h.isEmpty(), true, false);
        int i10 = this.f48864e;
        if (i10 > 0) {
            if (ox0Var.i(i10) != -1) {
                org.telegram.messenger.g0.i3(new nx0(this, this.f48864e, 1), 500L);
                this.f48864e = 0;
            }
        } else if (u61Var != null && i7 > 0 && n6Var.b(i7) == null) {
            u61Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z9, boolean z10, boolean z11) {
        if (this.f48867r == z9 && !z11) {
            return;
        }
        this.f48867r = z9;
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
            this.f48866n = f10;
            b();
            return;
        }
        float f11 = this.f48866n;
        if (z9) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(org.telegram.ui.Components.wq.h);
        this.h.addUpdateListener(new a3(this, 28));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.j3 && ((Long) objArr[0]).longValue() == this.f48863c.f9401b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f48867r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f48862b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f48866n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f48866n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        di.n6 n6Var = this.f48863c;
        org.telegram.messenger.qs.f(n6Var.f9400a).c(this, org.telegram.messenger.qs.j3);
        if (this.f48867r != n6Var.h.isEmpty() && this.d.f48590a == n6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f48863c.f9400a).n(this, org.telegram.messenger.qs.j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        Rect rect = this.f48868s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i7) {
        if (this.d.i(i7) != -1) {
            org.telegram.messenger.g0.i3(new nx0(this, i7, 0), 500L);
        } else {
            this.f48864e = i7;
        }
    }

    public void setReorderingAlbums(boolean z9) {
        float f10;
        float f11;
        if (this.f48865f != z9) {
            this.f48865f = z9;
            org.telegram.ui.Components.u61 u61Var = this.f48862b;
            u61Var.setReordering(z9);
            boolean z10 = this.f48865f;
            org.telegram.ui.Components.yp0 yp0Var = (org.telegram.ui.Components.yp0) this;
            org.telegram.ui.Components.ys0 ys0Var = yp0Var.f40632x;
            TextView textView = ys0Var.f40706s0;
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
            ys0Var.I1(true);
            ys0Var.W0();
            if (z9) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.h3(new m90(profileActivity, 28));
                }
            }
            if (!z9) {
                org.telegram.messenger.g0.r(this.f48869w);
                di.n6 n6Var = this.f48863c;
                n6Var.e();
                n6Var.f(false);
                int currentPosition = u61Var.getCurrentPosition();
                ox0 ox0Var = this.d;
                int f13 = ox0Var.f(currentPosition);
                this.f48861a.o(true);
                int i7 = ox0Var.i(f13);
                u61Var.e(0.0f, i7, i7);
            }
        }
    }
}
