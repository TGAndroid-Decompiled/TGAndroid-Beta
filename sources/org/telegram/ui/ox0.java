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
public abstract class ox0 extends FrameLayout implements org.telegram.messenger.ls {
    public final ei.a f48545a;
    public final org.telegram.ui.Components.v61 f48546b;
    public final di.n6 f48547c;
    public final nx0 d;
    public int f48548e;
    public boolean f48549f;
    public ValueAnimator h;
    public float f48550n;
    public boolean f48551r;
    public final Rect f48552s;
    public final tu0 f48553w;

    public ox0(Context context, di.n6 n6Var, final org.telegram.ui.Components.yp0 yp0Var) {
        super(context);
        this.f48552s = new Rect();
        this.f48547c = n6Var;
        Objects.requireNonNull(n6Var);
        this.f48553w = new tu0(n6Var, 8);
        final org.telegram.ui.Components.zp0 zp0Var = (org.telegram.ui.Components.zp0) this;
        ei.a aVar = new ei.a(zp0Var, context, yp0Var, 1);
        this.f48545a = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        nx0 nx0Var = new nx0(zp0Var);
        this.d = nx0Var;
        nx0Var.f48246a = n6Var.a();
        aVar.setAdapter(nx0Var);
        aVar.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.v61 n10 = aVar.n(10, true);
        this.f48546b = n10;
        n10.g(org.telegram.ui.ActionBar.l6.f28193ui, org.telegram.ui.ActionBar.l6.G6, org.telegram.ui.ActionBar.l6.f28154si, org.telegram.ui.ActionBar.l6.f28211vi, org.telegram.ui.ActionBar.l6.f28145s8);
        n10.f38983r = 12;
        n10.setPreTabClick(new org.telegram.messenger.w10() {
            @Override
            public final Object d(Number number, Object obj) {
                di.z6 storiesController;
                int i7 = r3;
                final org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                org.telegram.ui.Components.zp0 zp0Var2 = zp0Var;
                Integer num = (Integer) number;
                switch (i7) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (zp0Var2.f48549f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.v4.P(yp0Var2.f40790a, yp0Var2.f40791b, yp0Var2.f40792c, new org.telegram.ui.Components.bx(yp0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zp0Var2.f48549f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.zs0 zs0Var = yp0Var2.d;
                            org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
                            storiesController = zs0Var.getStoriesController();
                            if (storiesController.i(zs0Var.l1)) {
                                org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(f2Var, view);
                                H.W(new org.telegram.ui.Components.xp0(yp0Var2));
                                H.c(2131231763, org.telegram.messenger.id.M0(2131744798, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zs0 zs0Var2 = yp0Var2.d;
                                                zs0Var2.a1(zs0Var2.f41127x1, zs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zs0 zs0Var3 = yp0Var2.d;
                                                zs0Var3.c1(zs0Var3.f41127x1, zs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                zs0 zs0Var4 = yp0Var2.d;
                                                zs0Var4.b1(zs0Var4.f41127x1, zs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                zs0Var.B(new org.telegram.ui.Components.n(H), f2Var, zs0Var.l1, intValue);
                                H.c(2131232116, org.telegram.messenger.id.M0(2131744793, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zs0 zs0Var2 = yp0Var2.d;
                                                zs0Var2.a1(zs0Var2.f41127x1, zs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zs0 zs0Var3 = yp0Var2.d;
                                                zs0Var3.c1(zs0Var3.f41127x1, zs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                zs0 zs0Var4 = yp0Var2.d;
                                                zs0Var4.b1(zs0Var4.f41127x1, zs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232773, org.telegram.messenger.id.M0(2131744790, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zs0 zs0Var2 = yp0Var2.d;
                                                zs0Var2.a1(zs0Var2.f41127x1, zs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zs0 zs0Var3 = yp0Var2.d;
                                                zs0Var3.c1(zs0Var3.f41127x1, zs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                zs0 zs0Var4 = yp0Var2.d;
                                                zs0Var4.b1(zs0Var4.f41127x1, zs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232108, org.telegram.messenger.id.M0(2131744796, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zs0 zs0Var2 = yp0Var2.d;
                                                zs0Var2.a1(zs0Var2.f41127x1, zs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zs0 zs0Var3 = yp0Var2.d;
                                                zs0Var3.c1(zs0Var3.f41127x1, zs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                zs0 zs0Var4 = yp0Var2.d;
                                                zs0Var4.b1(zs0Var4.f41127x1, zs0Var4.l1, intValue);
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
                final org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                org.telegram.ui.Components.zp0 zp0Var2 = zp0Var;
                Integer num = (Integer) number;
                switch (i7) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (zp0Var2.f48549f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.v4.P(yp0Var2.f40790a, yp0Var2.f40791b, yp0Var2.f40792c, new org.telegram.ui.Components.bx(yp0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zp0Var2.f48549f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.zs0 zs0Var = yp0Var2.d;
                            org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
                            storiesController = zs0Var.getStoriesController();
                            if (storiesController.i(zs0Var.l1)) {
                                org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(f2Var, view);
                                H.W(new org.telegram.ui.Components.xp0(yp0Var2));
                                H.c(2131231763, org.telegram.messenger.id.M0(2131744798, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zs0 zs0Var2 = yp0Var2.d;
                                                zs0Var2.a1(zs0Var2.f41127x1, zs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zs0 zs0Var3 = yp0Var2.d;
                                                zs0Var3.c1(zs0Var3.f41127x1, zs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                zs0 zs0Var4 = yp0Var2.d;
                                                zs0Var4.b1(zs0Var4.f41127x1, zs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                zs0Var.B(new org.telegram.ui.Components.n(H), f2Var, zs0Var.l1, intValue);
                                H.c(2131232116, org.telegram.messenger.id.M0(2131744793, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zs0 zs0Var2 = yp0Var2.d;
                                                zs0Var2.a1(zs0Var2.f41127x1, zs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zs0 zs0Var3 = yp0Var2.d;
                                                zs0Var3.c1(zs0Var3.f41127x1, zs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                zs0 zs0Var4 = yp0Var2.d;
                                                zs0Var4.b1(zs0Var4.f41127x1, zs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232773, org.telegram.messenger.id.M0(2131744790, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zs0 zs0Var2 = yp0Var2.d;
                                                zs0Var2.a1(zs0Var2.f41127x1, zs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zs0 zs0Var3 = yp0Var2.d;
                                                zs0Var3.c1(zs0Var3.f41127x1, zs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                zs0 zs0Var4 = yp0Var2.d;
                                                zs0Var4.b1(zs0Var4.f41127x1, zs0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232108, org.telegram.messenger.id.M0(2131744796, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zs0 zs0Var2 = yp0Var2.d;
                                                zs0Var2.a1(zs0Var2.f41127x1, zs0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zs0 zs0Var3 = yp0Var2.d;
                                                zs0Var3.c1(zs0Var3.f41127x1, zs0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                zs0 zs0Var4 = yp0Var2.d;
                                                zs0Var4.b1(zs0Var4.f41127x1, zs0Var4.l1, intValue);
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
        org.telegram.ui.Components.v61 v61Var = this.f48546b;
        if (v61Var != null) {
            i7 = v61Var.getCurrentTabId();
        } else {
            i7 = 0;
        }
        di.n6 n6Var = this.f48547c;
        boolean a10 = n6Var.a();
        nx0 nx0Var = this.d;
        nx0Var.f48246a = a10;
        this.f48545a.o(true);
        c(!n6Var.h.isEmpty(), true, false);
        int i10 = this.f48548e;
        if (i10 > 0) {
            if (nx0Var.i(i10) != -1) {
                org.telegram.messenger.g0.i3(new mx0(this, this.f48548e, 1), 500L);
                this.f48548e = 0;
            }
        } else if (v61Var != null && i7 > 0 && n6Var.b(i7) == null) {
            v61Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z9, boolean z10, boolean z11) {
        if (this.f48551r == z9 && !z11) {
            return;
        }
        this.f48551r = z9;
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
            this.f48550n = f10;
            b();
            return;
        }
        float f11 = this.f48550n;
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
        if (i7 == org.telegram.messenger.qs.j3 && ((Long) objArr[0]).longValue() == this.f48547c.f9396b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f48551r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f48546b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f48550n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f48550n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        di.n6 n6Var = this.f48547c;
        org.telegram.messenger.qs.f(n6Var.f9395a).c(this, org.telegram.messenger.qs.j3);
        if (this.f48551r != n6Var.h.isEmpty() && this.d.f48246a == n6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f48547c.f9395a).n(this, org.telegram.messenger.qs.j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        Rect rect = this.f48552s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i7) {
        if (this.d.i(i7) != -1) {
            org.telegram.messenger.g0.i3(new mx0(this, i7, 0), 500L);
        } else {
            this.f48548e = i7;
        }
    }

    public void setReorderingAlbums(boolean z9) {
        float f10;
        float f11;
        if (this.f48549f != z9) {
            this.f48549f = z9;
            org.telegram.ui.Components.v61 v61Var = this.f48546b;
            v61Var.setReordering(z9);
            boolean z10 = this.f48549f;
            org.telegram.ui.Components.zp0 zp0Var = (org.telegram.ui.Components.zp0) this;
            org.telegram.ui.Components.zs0 zs0Var = zp0Var.f41040x;
            TextView textView = zs0Var.f41114s0;
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
            scaleX.scaleY(f12).withEndAction(new org.telegram.ui.Components.up0(1, zp0Var, z10)).start();
            zs0Var.I1(true);
            zs0Var.W0();
            if (z9) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.h3(new l90(profileActivity, 28));
                }
            }
            if (!z9) {
                org.telegram.messenger.g0.r(this.f48553w);
                di.n6 n6Var = this.f48547c;
                n6Var.e();
                n6Var.f(false);
                int currentPosition = v61Var.getCurrentPosition();
                nx0 nx0Var = this.d;
                int f13 = nx0Var.f(currentPosition);
                this.f48545a.o(true);
                int i7 = nx0Var.i(f13);
                v61Var.e(0.0f, i7, i7);
            }
        }
    }
}
