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
public abstract class lx0 extends FrameLayout implements org.telegram.messenger.fs {
    public final bi.s5 f49869a;
    public final org.telegram.ui.Components.j71 f49870b;
    public final fi.d6 f49871c;
    public final kx0 d;
    public int f49872e;
    public boolean f49873f;
    public ValueAnimator h;
    public float f49874n;
    public boolean f49875r;
    public final Rect f49876s;
    public final qu0 f49877w;

    public lx0(Context context, fi.d6 d6Var, final org.telegram.ui.Components.hq0 hq0Var) {
        super(context);
        this.f49876s = new Rect();
        this.f49871c = d6Var;
        Objects.requireNonNull(d6Var);
        this.f49877w = new qu0(d6Var, 8);
        final org.telegram.ui.Components.iq0 iq0Var = (org.telegram.ui.Components.iq0) this;
        bi.s5 s5Var = new bi.s5(iq0Var, context, hq0Var, 2);
        this.f49869a = s5Var;
        s5Var.setAllowDisallowInterceptTouch(true);
        kx0 kx0Var = new kx0(iq0Var);
        this.d = kx0Var;
        kx0Var.f49550a = d6Var.a();
        s5Var.setAdapter(kx0Var);
        s5Var.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.j71 k10 = s5Var.k(10, true);
        this.f49870b = k10;
        k10.h(org.telegram.ui.ActionBar.n6.f29835xi, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.f29797vi, org.telegram.ui.ActionBar.n6.f29854yi, org.telegram.ui.ActionBar.n6.f29731s8);
        k10.f36344r = 12;
        k10.setPreTabClick(new org.telegram.messenger.q10() {
            @Override
            public final Object d(Number number, Object obj) {
                fi.p6 storiesController;
                int i7 = r3;
                final org.telegram.ui.Components.hq0 hq0Var2 = hq0Var;
                org.telegram.ui.Components.iq0 iq0Var2 = iq0Var;
                Integer num = (Integer) number;
                switch (i7) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (iq0Var2.f49873f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.b5.P(hq0Var2.f35788a, hq0Var2.f35789b, hq0Var2.f35790c, new org.telegram.ui.Components.hy(hq0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !iq0Var2.f49873f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.it0 it0Var = hq0Var2.d;
                            org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
                            storiesController = it0Var.getStoriesController();
                            if (storiesController.i(it0Var.f36130m1)) {
                                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(g2Var, view);
                                I.X(new bi.u5(hq0Var2));
                                I.c(2131231767, org.telegram.messenger.gd.N0(2131744557, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                                                it0Var2.a1(intValue, it0Var2.f36130m1, g2Var2);
                                                return;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.f36166y1;
                                                it0Var3.c1(intValue, it0Var3.f36130m1, g2Var3);
                                                return;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.f36166y1;
                                                it0Var4.b1(intValue, it0Var4.f36130m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                it0Var.B(new org.telegram.ui.ActionBar.i5(I), g2Var, it0Var.f36130m1, intValue);
                                I.c(2131232121, org.telegram.messenger.gd.N0(2131744552, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                                                it0Var2.a1(intValue, it0Var2.f36130m1, g2Var2);
                                                return;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.f36166y1;
                                                it0Var3.c1(intValue, it0Var3.f36130m1, g2Var3);
                                                return;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.f36166y1;
                                                it0Var4.b1(intValue, it0Var4.f36130m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232778, org.telegram.messenger.gd.N0(2131744549, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                                                it0Var2.a1(intValue, it0Var2.f36130m1, g2Var2);
                                                return;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.f36166y1;
                                                it0Var3.c1(intValue, it0Var3.f36130m1, g2Var3);
                                                return;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.f36166y1;
                                                it0Var4.b1(intValue, it0Var4.f36130m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232113, org.telegram.messenger.gd.N0(2131744555, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                                                it0Var2.a1(intValue, it0Var2.f36130m1, g2Var2);
                                                return;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.f36166y1;
                                                it0Var3.c1(intValue, it0Var3.f36130m1, g2Var3);
                                                return;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.f36166y1;
                                                it0Var4.b1(intValue, it0Var4.f36130m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, true);
                                I.a0();
                            }
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                }
            }
        });
        k10.setOnTabLongClick(new org.telegram.messenger.q10() {
            @Override
            public final Object d(Number number, Object obj) {
                fi.p6 storiesController;
                int i7 = r3;
                final org.telegram.ui.Components.hq0 hq0Var2 = hq0Var;
                org.telegram.ui.Components.iq0 iq0Var2 = iq0Var;
                Integer num = (Integer) number;
                switch (i7) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (iq0Var2.f49873f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.b5.P(hq0Var2.f35788a, hq0Var2.f35789b, hq0Var2.f35790c, new org.telegram.ui.Components.hy(hq0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !iq0Var2.f49873f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.it0 it0Var = hq0Var2.d;
                            org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
                            storiesController = it0Var.getStoriesController();
                            if (storiesController.i(it0Var.f36130m1)) {
                                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(g2Var, view);
                                I.X(new bi.u5(hq0Var2));
                                I.c(2131231767, org.telegram.messenger.gd.N0(2131744557, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                                                it0Var2.a1(intValue, it0Var2.f36130m1, g2Var2);
                                                return;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.f36166y1;
                                                it0Var3.c1(intValue, it0Var3.f36130m1, g2Var3);
                                                return;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.f36166y1;
                                                it0Var4.b1(intValue, it0Var4.f36130m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                it0Var.B(new org.telegram.ui.ActionBar.i5(I), g2Var, it0Var.f36130m1, intValue);
                                I.c(2131232121, org.telegram.messenger.gd.N0(2131744552, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                                                it0Var2.a1(intValue, it0Var2.f36130m1, g2Var2);
                                                return;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.f36166y1;
                                                it0Var3.c1(intValue, it0Var3.f36130m1, g2Var3);
                                                return;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.f36166y1;
                                                it0Var4.b1(intValue, it0Var4.f36130m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232778, org.telegram.messenger.gd.N0(2131744549, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                                                it0Var2.a1(intValue, it0Var2.f36130m1, g2Var2);
                                                return;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.f36166y1;
                                                it0Var3.c1(intValue, it0Var3.f36130m1, g2Var3);
                                                return;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.f36166y1;
                                                it0Var4.b1(intValue, it0Var4.f36130m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232113, org.telegram.messenger.gd.N0(2131744555, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                it0 it0Var2 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var2.f36166y1;
                                                it0Var2.a1(intValue, it0Var2.f36130m1, g2Var2);
                                                return;
                                            case 1:
                                                it0 it0Var3 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var3.f36166y1;
                                                it0Var3.c1(intValue, it0Var3.f36130m1, g2Var3);
                                                return;
                                            case 2:
                                                hq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                it0 it0Var4 = hq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var4.f36166y1;
                                                it0Var4.b1(intValue, it0Var4.f36130m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, true);
                                I.a0();
                            }
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                }
            }
        });
        addView(k10, c8.na.e(-1, 42, 48));
        c(!d6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i7;
        org.telegram.ui.Components.j71 j71Var = this.f49870b;
        if (j71Var != null) {
            i7 = j71Var.getCurrentTabId();
        } else {
            i7 = 0;
        }
        fi.d6 d6Var = this.f49871c;
        boolean a10 = d6Var.a();
        kx0 kx0Var = this.d;
        kx0Var.f49550a = a10;
        this.f49869a.l(true);
        c(!d6Var.h.isEmpty(), true, false);
        int i10 = this.f49872e;
        if (i10 > 0) {
            if (kx0Var.i(i10) != -1) {
                org.telegram.messenger.g0.h3(new jx0(this, this.f49872e, 1), 500L);
                this.f49872e = 0;
            }
        } else if (j71Var != null && i7 > 0 && d6Var.b(i7) == null) {
            j71Var.e(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.f49875r == z10 && !z12) {
            return;
        }
        this.f49875r = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
        float f10 = 0.0f;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f49874n = f10;
            b();
            return;
        }
        float f11 = this.f49874n;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(org.telegram.ui.Components.kr.h);
        this.h.addUpdateListener(new a3(this, 28));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25246l3 && ((Long) objArr[0]).longValue() == this.f49871c.f11857b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f49875r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f49870b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f49874n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f49874n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fi.d6 d6Var = this.f49871c;
        org.telegram.messenger.ks.f(d6Var.f11856a).c(this, org.telegram.messenger.ks.f25246l3);
        if (this.f49875r != d6Var.h.isEmpty() && this.d.f49550a == d6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f49871c.f11856a).n(this, org.telegram.messenger.ks.f25246l3);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        Rect rect = this.f49876s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i7) {
        if (this.d.i(i7) != -1) {
            org.telegram.messenger.g0.h3(new jx0(this, i7, 0), 500L);
        } else {
            this.f49872e = i7;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f10;
        float f11;
        if (this.f49873f != z10) {
            this.f49873f = z10;
            org.telegram.ui.Components.j71 j71Var = this.f49870b;
            j71Var.setReordering(z10);
            boolean z11 = this.f49873f;
            org.telegram.ui.Components.iq0 iq0Var = (org.telegram.ui.Components.iq0) this;
            org.telegram.ui.Components.it0 it0Var = iq0Var.f36077x;
            TextView textView = it0Var.f36152t0;
            textView.setVisibility(0);
            ViewPropertyAnimator animate = textView.animate();
            float f12 = 1.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z11) {
                f12 = 0.4f;
            }
            scaleX.scaleY(f12).withEndAction(new org.telegram.ui.Components.qp0(2, iq0Var, z11)).start();
            it0Var.I1(true);
            it0Var.W0();
            if (z10) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.g3(new m90(profileActivity, 28));
                }
            }
            if (!z10) {
                org.telegram.messenger.g0.r(this.f49877w);
                fi.d6 d6Var = this.f49871c;
                d6Var.e();
                d6Var.f(false);
                int currentPosition = j71Var.getCurrentPosition();
                kx0 kx0Var = this.d;
                int f13 = kx0Var.f(currentPosition);
                this.f49869a.l(true);
                int i7 = kx0Var.i(f13);
                j71Var.f(0.0f, i7, i7);
            }
        }
    }
}
