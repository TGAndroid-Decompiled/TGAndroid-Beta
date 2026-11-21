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
public abstract class nx0 extends FrameLayout implements org.telegram.messenger.fs {
    public final bi.q5 f50343a;
    public final org.telegram.ui.Components.i71 f50344b;
    public final fi.d6 f50345c;
    public final mx0 d;
    public int f50346e;
    public boolean f50347f;
    public ValueAnimator h;
    public float f50348n;
    public boolean f50349r;
    public final Rect f50350s;
    public final ru0 f50351w;

    public nx0(Context context, fi.d6 d6Var, final org.telegram.ui.Components.iq0 iq0Var) {
        super(context);
        this.f50350s = new Rect();
        this.f50345c = d6Var;
        Objects.requireNonNull(d6Var);
        this.f50351w = new ru0(d6Var, 8);
        final org.telegram.ui.Components.jq0 jq0Var = (org.telegram.ui.Components.jq0) this;
        bi.q5 q5Var = new bi.q5(jq0Var, context, iq0Var, 2);
        this.f50343a = q5Var;
        q5Var.setAllowDisallowInterceptTouch(true);
        mx0 mx0Var = new mx0(jq0Var);
        this.d = mx0Var;
        mx0Var.f50023a = d6Var.a();
        q5Var.setAdapter(mx0Var);
        q5Var.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.i71 i7 = q5Var.i(10, true);
        this.f50344b = i7;
        i7.h(org.telegram.ui.ActionBar.m6.f29762xi, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.f29724vi, org.telegram.ui.ActionBar.m6.f29781yi, org.telegram.ui.ActionBar.m6.f29658s8);
        i7.f36222r = 12;
        i7.setPreTabClick(new org.telegram.messenger.r10() {
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
                        if (jq0Var2.f50347f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.c5.P(iq0Var2.f36306a, iq0Var2.f36307b, iq0Var2.f36308c, new org.telegram.ui.Components.ky(iq0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !jq0Var2.f50347f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.jt0 jt0Var = iq0Var2.d;
                            org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36689y1;
                            storiesController = jt0Var.getStoriesController();
                            if (storiesController.i(jt0Var.f36653m1)) {
                                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(g2Var, view);
                                I.X(new bi.s5(iq0Var2));
                                I.c(2131231764, org.telegram.messenger.gd.N0(2131744557, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36689y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36653m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36689y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36653m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36689y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36653m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                jt0Var.B(new org.telegram.ui.Cells.c5(I), g2Var, jt0Var.f36653m1, intValue);
                                I.c(2131232118, org.telegram.messenger.gd.N0(2131744552, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36689y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36653m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36689y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36653m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36689y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36653m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232775, org.telegram.messenger.gd.N0(2131744549, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36689y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36653m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36689y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36653m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36689y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36653m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232110, org.telegram.messenger.gd.N0(2131744555, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36689y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36653m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36689y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36653m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36689y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36653m1, g2Var4);
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
        i7.setOnTabLongClick(new org.telegram.messenger.r10() {
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
                        if (jq0Var2.f50347f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.c5.P(iq0Var2.f36306a, iq0Var2.f36307b, iq0Var2.f36308c, new org.telegram.ui.Components.ky(iq0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !jq0Var2.f50347f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.jt0 jt0Var = iq0Var2.d;
                            org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36689y1;
                            storiesController = jt0Var.getStoriesController();
                            if (storiesController.i(jt0Var.f36653m1)) {
                                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(g2Var, view);
                                I.X(new bi.s5(iq0Var2));
                                I.c(2131231764, org.telegram.messenger.gd.N0(2131744557, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36689y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36653m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36689y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36653m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36689y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36653m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                jt0Var.B(new org.telegram.ui.Cells.c5(I), g2Var, jt0Var.f36653m1, intValue);
                                I.c(2131232118, org.telegram.messenger.gd.N0(2131744552, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36689y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36653m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36689y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36653m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36689y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36653m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232775, org.telegram.messenger.gd.N0(2131744549, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36689y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36653m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36689y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36653m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36689y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36653m1, g2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232110, org.telegram.messenger.gd.N0(2131744555, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                jt0 jt0Var2 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var2.f36689y1;
                                                jt0Var2.a1(intValue, jt0Var2.f36653m1, g2Var2);
                                                return;
                                            case 1:
                                                jt0 jt0Var3 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var3.f36689y1;
                                                jt0Var3.c1(intValue, jt0Var3.f36653m1, g2Var3);
                                                return;
                                            case 2:
                                                iq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                jt0 jt0Var4 = iq0Var2.d;
                                                org.telegram.ui.ActionBar.g2 g2Var4 = jt0Var4.f36689y1;
                                                jt0Var4.b1(intValue, jt0Var4.f36653m1, g2Var4);
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
        addView(i7, c8.ma.e(-1, 42, 48));
        c(!d6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i7;
        org.telegram.ui.Components.i71 i71Var = this.f50344b;
        if (i71Var != null) {
            i7 = i71Var.getCurrentTabId();
        } else {
            i7 = 0;
        }
        fi.d6 d6Var = this.f50345c;
        boolean a10 = d6Var.a();
        mx0 mx0Var = this.d;
        mx0Var.f50023a = a10;
        this.f50343a.j(true);
        c(!d6Var.h.isEmpty(), true, false);
        int i10 = this.f50346e;
        if (i10 > 0) {
            if (mx0Var.i(i10) != -1) {
                org.telegram.messenger.g0.h3(new lx0(this, this.f50346e, 1), 500L);
                this.f50346e = 0;
            }
        } else if (i71Var != null && i7 > 0 && d6Var.b(i7) == null) {
            i71Var.e(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.f50349r == z10 && !z12) {
            return;
        }
        this.f50349r = z10;
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
            this.f50348n = f10;
            b();
            return;
        }
        float f11 = this.f50348n;
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
        if (i7 == org.telegram.messenger.ks.f25175l3 && ((Long) objArr[0]).longValue() == this.f50345c.f11892b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f50349r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f50344b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f50348n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f50348n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fi.d6 d6Var = this.f50345c;
        org.telegram.messenger.ks.f(d6Var.f11891a).c(this, org.telegram.messenger.ks.f25175l3);
        if (this.f50349r != d6Var.h.isEmpty() && this.d.f50023a == d6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f50345c.f11891a).n(this, org.telegram.messenger.ks.f25175l3);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        Rect rect = this.f50350s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i7) {
        if (this.d.i(i7) != -1) {
            org.telegram.messenger.g0.h3(new lx0(this, i7, 0), 500L);
        } else {
            this.f50346e = i7;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f10;
        float f11;
        if (this.f50347f != z10) {
            this.f50347f = z10;
            org.telegram.ui.Components.i71 i71Var = this.f50344b;
            i71Var.setReordering(z10);
            boolean z11 = this.f50347f;
            org.telegram.ui.Components.jq0 jq0Var = (org.telegram.ui.Components.jq0) this;
            org.telegram.ui.Components.jt0 jt0Var = jq0Var.f36591x;
            TextView textView = jt0Var.f36675t0;
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
                org.telegram.messenger.g0.r(this.f50351w);
                fi.d6 d6Var = this.f50345c;
                d6Var.e();
                d6Var.f(false);
                int currentPosition = i71Var.getCurrentPosition();
                mx0 mx0Var = this.d;
                int f13 = mx0Var.f(currentPosition);
                this.f50343a.j(true);
                int i7 = mx0Var.i(f13);
                i71Var.f(0.0f, i7, i7);
            }
        }
    }
}
