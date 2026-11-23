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
public abstract class nx0 extends FrameLayout implements org.telegram.messenger.gs {
    public final bi.s5 f50350a;
    public final org.telegram.ui.Components.i71 f50351b;
    public final fi.d6 f50352c;
    public final mx0 d;
    public int f50353e;
    public boolean f50354f;
    public ValueAnimator h;
    public float f50355n;
    public boolean f50356r;
    public final Rect f50357s;
    public final su0 f50358w;

    public nx0(Context context, fi.d6 d6Var, final org.telegram.ui.Components.iq0 iq0Var) {
        super(context);
        this.f50357s = new Rect();
        this.f50352c = d6Var;
        Objects.requireNonNull(d6Var);
        this.f50358w = new su0(d6Var, 8);
        final org.telegram.ui.Components.jq0 jq0Var = (org.telegram.ui.Components.jq0) this;
        bi.s5 s5Var = new bi.s5(jq0Var, context, iq0Var, 2);
        this.f50350a = s5Var;
        s5Var.setAllowDisallowInterceptTouch(true);
        mx0 mx0Var = new mx0(jq0Var);
        this.d = mx0Var;
        mx0Var.f50001a = d6Var.a();
        s5Var.setAdapter(mx0Var);
        s5Var.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.i71 i7 = s5Var.i(10, true);
        this.f50351b = i7;
        i7.h(org.telegram.ui.ActionBar.m6.f29731xi, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.f29693vi, org.telegram.ui.ActionBar.m6.f29750yi, org.telegram.ui.ActionBar.m6.f29627s8);
        i7.f36170r = 12;
        i7.setPreTabClick(new org.telegram.messenger.s10() {
            @Override
            public final Object g(Number number, Object obj) {
                fi.p6 storiesController;
                int i10 = r3;
                final org.telegram.ui.Components.iq0 iq0Var2 = iq0Var;
                org.telegram.ui.Components.jq0 jq0Var2 = jq0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (jq0Var2.f50354f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.c5.P(iq0Var2.f36258a, iq0Var2.f36259b, iq0Var2.f36260c, new org.telegram.ui.Components.ky(iq0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !jq0Var2.f50354f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.jt0 jt0Var = iq0Var2.d;
                            org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36638y1;
                            storiesController = jt0Var.getStoriesController();
                            if (storiesController.i(jt0Var.f36602m1)) {
                                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(g2Var, view);
                                I.X(new bi.u5(iq0Var2));
                                I.c(2131231764, org.telegram.messenger.hd.N0(2131744557, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36638y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36602m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36638y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36602m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36638y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36602m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                jt0Var.B(new org.telegram.ui.Cells.c5(I), g2Var, jt0Var.f36602m1, intValue);
                                I.c(2131232118, org.telegram.messenger.hd.N0(2131744552, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36638y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36602m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36638y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36602m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36638y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36602m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232775, org.telegram.messenger.hd.N0(2131744549, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36638y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36602m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36638y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36602m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36638y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36602m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232110, org.telegram.messenger.hd.N0(2131744555, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36638y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36602m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36638y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36602m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36638y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36602m1, g2Var4);
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
        i7.setOnTabLongClick(new org.telegram.messenger.s10() {
            @Override
            public final Object g(Number number, Object obj) {
                fi.p6 storiesController;
                int i10 = r3;
                final org.telegram.ui.Components.iq0 iq0Var2 = iq0Var;
                org.telegram.ui.Components.jq0 jq0Var2 = jq0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (jq0Var2.f50354f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.c5.P(iq0Var2.f36258a, iq0Var2.f36259b, iq0Var2.f36260c, new org.telegram.ui.Components.ky(iq0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !jq0Var2.f50354f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.jt0 jt0Var = iq0Var2.d;
                            org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36638y1;
                            storiesController = jt0Var.getStoriesController();
                            if (storiesController.i(jt0Var.f36602m1)) {
                                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(g2Var, view);
                                I.X(new bi.u5(iq0Var2));
                                I.c(2131231764, org.telegram.messenger.hd.N0(2131744557, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36638y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36602m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36638y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36602m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36638y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36602m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                jt0Var.B(new org.telegram.ui.Cells.c5(I), g2Var, jt0Var.f36602m1, intValue);
                                I.c(2131232118, org.telegram.messenger.hd.N0(2131744552, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36638y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36602m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36638y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36602m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36638y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36602m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232775, org.telegram.messenger.hd.N0(2131744549, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36638y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36602m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36638y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36602m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36638y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36602m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232110, org.telegram.messenger.hd.N0(2131744555, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36638y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36602m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36638y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36602m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36638y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36602m1, g2Var4);
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
        addView(i7, c8.na.e(-1, 42, 48));
        c(!d6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i7;
        org.telegram.ui.Components.i71 i71Var = this.f50351b;
        if (i71Var != null) {
            i7 = i71Var.getCurrentTabId();
        } else {
            i7 = 0;
        }
        fi.d6 d6Var = this.f50352c;
        boolean a10 = d6Var.a();
        mx0 mx0Var = this.d;
        mx0Var.f50001a = a10;
        this.f50350a.j(true);
        c(!d6Var.h.isEmpty(), true, false);
        int i10 = this.f50353e;
        if (i10 > 0) {
            if (mx0Var.i(i10) != -1) {
                org.telegram.messenger.g0.h3(new lx0(this, this.f50353e, 1), 500L);
                this.f50353e = 0;
            }
        } else if (i71Var != null && i7 > 0 && d6Var.b(i7) == null) {
            i71Var.e(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.f50356r == z10 && !z12) {
            return;
        }
        this.f50356r = z10;
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
            this.f50355n = f10;
            b();
            return;
        }
        float f11 = this.f50355n;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(org.telegram.ui.Components.nr.h);
        this.h.addUpdateListener(new a3(this, 28));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25305l3 && ((Long) objArr[0]).longValue() == this.f50352c.f11846b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f50356r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f50351b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f50355n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f50355n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fi.d6 d6Var = this.f50352c;
        org.telegram.messenger.ls.f(d6Var.f11845a).c(this, org.telegram.messenger.ls.f25305l3);
        if (this.f50356r != d6Var.h.isEmpty() && this.d.f50001a == d6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.f(this.f50352c.f11845a).n(this, org.telegram.messenger.ls.f25305l3);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        Rect rect = this.f50357s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i7) {
        if (this.d.i(i7) != -1) {
            org.telegram.messenger.g0.h3(new lx0(this, i7, 0), 500L);
        } else {
            this.f50353e = i7;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f10;
        float f11;
        if (this.f50354f != z10) {
            this.f50354f = z10;
            org.telegram.ui.Components.i71 i71Var = this.f50351b;
            i71Var.setReordering(z10);
            boolean z11 = this.f50354f;
            org.telegram.ui.Components.jq0 jq0Var = (org.telegram.ui.Components.jq0) this;
            org.telegram.ui.Components.jt0 jt0Var = jq0Var.f36540x;
            TextView textView = jt0Var.f36624t0;
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
            scaleX.scaleY(f12).withEndAction(new org.telegram.ui.Components.rp0(2, jq0Var, z11)).start();
            jt0Var.I1(true);
            jt0Var.W0();
            if (z10) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.g3(new n90(profileActivity, 28));
                }
            }
            if (!z10) {
                org.telegram.messenger.g0.r(this.f50358w);
                fi.d6 d6Var = this.f50352c;
                d6Var.e();
                d6Var.f(false);
                int currentPosition = i71Var.getCurrentPosition();
                mx0 mx0Var = this.d;
                int f13 = mx0Var.f(currentPosition);
                this.f50350a.j(true);
                int i7 = mx0Var.i(f13);
                i71Var.f(0.0f, i7, i7);
            }
        }
    }
}
