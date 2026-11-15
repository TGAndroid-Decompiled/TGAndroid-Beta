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
public abstract class jx0 extends FrameLayout implements org.telegram.messenger.is {
    public final bi.f3 f48445a;
    public final org.telegram.ui.Components.v61 f48446b;
    public final fi.g6 f48447c;
    public final ix0 d;
    public int f48448e;
    public boolean f48449f;
    public ValueAnimator h;
    public float f48450n;
    public boolean f48451r;
    public final Rect f48452s;
    public final pu0 f48453w;

    public jx0(Context context, fi.g6 g6Var, final org.telegram.ui.Components.yp0 yp0Var) {
        super(context);
        this.f48452s = new Rect();
        this.f48447c = g6Var;
        Objects.requireNonNull(g6Var);
        this.f48453w = new pu0(g6Var, 8);
        final org.telegram.ui.Components.zp0 zp0Var = (org.telegram.ui.Components.zp0) this;
        bi.f3 f3Var = new bi.f3(zp0Var, context, yp0Var, 2);
        this.f48445a = f3Var;
        f3Var.setAllowDisallowInterceptTouch(true);
        ix0 ix0Var = new ix0(zp0Var);
        this.d = ix0Var;
        ix0Var.f48141a = g6Var.a();
        f3Var.setAdapter(ix0Var);
        f3Var.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.v61 i7 = f3Var.i(10, true);
        this.f48446b = i7;
        i7.g(org.telegram.ui.ActionBar.j6.f29233xi, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f29195vi, org.telegram.ui.ActionBar.j6.f29252yi, org.telegram.ui.ActionBar.j6.f29129s8);
        i7.f40313r = 12;
        i7.setPreTabClick(new org.telegram.messenger.t10() {
            @Override
            public final Object d(Number number, Object obj) {
                fi.s6 storiesController;
                int i10 = r3;
                final org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                org.telegram.ui.Components.zp0 zp0Var2 = zp0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (zp0Var2.f48449f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.t4.P(yp0Var2.f42057a, yp0Var2.f42058b, yp0Var2.f42059c, new org.telegram.ui.Components.gx(yp0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zp0Var2.f48449f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.ys0 ys0Var = yp0Var2.d;
                            org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42152y1;
                            storiesController = ys0Var.getStoriesController();
                            if (storiesController.i(ys0Var.f42116m1)) {
                                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(e2Var, view);
                                H.W(new bi.h3(yp0Var2));
                                H.c(2131231763, org.telegram.messenger.hd.M0(2131744798, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f42152y1, ys0Var2.f42116m1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f42152y1, ys0Var3.f42116m1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f42152y1, ys0Var4.f42116m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                ys0Var.B(new org.telegram.ui.Components.cf(H), e2Var, ys0Var.f42116m1, intValue);
                                H.c(2131232117, org.telegram.messenger.hd.M0(2131744793, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f42152y1, ys0Var2.f42116m1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f42152y1, ys0Var3.f42116m1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f42152y1, ys0Var4.f42116m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232774, org.telegram.messenger.hd.M0(2131744790, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f42152y1, ys0Var2.f42116m1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f42152y1, ys0Var3.f42116m1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f42152y1, ys0Var4.f42116m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232109, org.telegram.messenger.hd.M0(2131744796, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f42152y1, ys0Var2.f42116m1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f42152y1, ys0Var3.f42116m1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f42152y1, ys0Var4.f42116m1, intValue);
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
        i7.setOnTabLongClick(new org.telegram.messenger.t10() {
            @Override
            public final Object d(Number number, Object obj) {
                fi.s6 storiesController;
                int i10 = r3;
                final org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                org.telegram.ui.Components.zp0 zp0Var2 = zp0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (zp0Var2.f48449f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.t4.P(yp0Var2.f42057a, yp0Var2.f42058b, yp0Var2.f42059c, new org.telegram.ui.Components.gx(yp0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zp0Var2.f48449f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.ys0 ys0Var = yp0Var2.d;
                            org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42152y1;
                            storiesController = ys0Var.getStoriesController();
                            if (storiesController.i(ys0Var.f42116m1)) {
                                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(e2Var, view);
                                H.W(new bi.h3(yp0Var2));
                                H.c(2131231763, org.telegram.messenger.hd.M0(2131744798, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f42152y1, ys0Var2.f42116m1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f42152y1, ys0Var3.f42116m1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f42152y1, ys0Var4.f42116m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                ys0Var.B(new org.telegram.ui.Components.cf(H), e2Var, ys0Var.f42116m1, intValue);
                                H.c(2131232117, org.telegram.messenger.hd.M0(2131744793, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f42152y1, ys0Var2.f42116m1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f42152y1, ys0Var3.f42116m1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f42152y1, ys0Var4.f42116m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232774, org.telegram.messenger.hd.M0(2131744790, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f42152y1, ys0Var2.f42116m1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f42152y1, ys0Var3.f42116m1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f42152y1, ys0Var4.f42116m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232109, org.telegram.messenger.hd.M0(2131744796, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ys0 ys0Var2 = yp0Var2.d;
                                                ys0Var2.a1(ys0Var2.f42152y1, ys0Var2.f42116m1, intValue);
                                                return;
                                            case 1:
                                                ys0 ys0Var3 = yp0Var2.d;
                                                ys0Var3.c1(ys0Var3.f42152y1, ys0Var3.f42116m1, intValue);
                                                return;
                                            case 2:
                                                yp0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                ys0 ys0Var4 = yp0Var2.d;
                                                ys0Var4.b1(ys0Var4.f42152y1, ys0Var4.f42116m1, intValue);
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
        addView(i7, c8.ja.e(-1, 42, 48));
        c(!g6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i7;
        org.telegram.ui.Components.v61 v61Var = this.f48446b;
        if (v61Var != null) {
            i7 = v61Var.getCurrentTabId();
        } else {
            i7 = 0;
        }
        fi.g6 g6Var = this.f48447c;
        boolean a10 = g6Var.a();
        ix0 ix0Var = this.d;
        ix0Var.f48141a = a10;
        this.f48445a.k(true);
        c(!g6Var.h.isEmpty(), true, false);
        int i10 = this.f48448e;
        if (i10 > 0) {
            if (ix0Var.i(i10) != -1) {
                org.telegram.messenger.g0.i3(new hx0(this, this.f48448e, 1), 500L);
                this.f48448e = 0;
            }
        } else if (v61Var != null && i7 > 0 && g6Var.b(i7) == null) {
            v61Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.f48451r == z10 && !z12) {
            return;
        }
        this.f48451r = z10;
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
            this.f48450n = f10;
            b();
            return;
        }
        float f11 = this.f48450n;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(org.telegram.ui.Components.er.h);
        this.h.addUpdateListener(new a3(this, 28));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.j3 && ((Long) objArr[0]).longValue() == this.f48447c.f11743b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f48451r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f48446b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f48450n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f48450n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fi.g6 g6Var = this.f48447c;
        org.telegram.messenger.ns.f(g6Var.f11742a).c(this, org.telegram.messenger.ns.j3);
        if (this.f48451r != g6Var.h.isEmpty() && this.d.f48141a == g6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.f48447c.f11742a).n(this, org.telegram.messenger.ns.j3);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        Rect rect = this.f48452s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i7) {
        if (this.d.i(i7) != -1) {
            org.telegram.messenger.g0.i3(new hx0(this, i7, 0), 500L);
        } else {
            this.f48448e = i7;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f10;
        float f11;
        if (this.f48449f != z10) {
            this.f48449f = z10;
            org.telegram.ui.Components.v61 v61Var = this.f48446b;
            v61Var.setReordering(z10);
            boolean z11 = this.f48449f;
            org.telegram.ui.Components.zp0 zp0Var = (org.telegram.ui.Components.zp0) this;
            org.telegram.ui.Components.ys0 ys0Var = zp0Var.f42413x;
            TextView textView = ys0Var.f42138t0;
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
            scaleX.scaleY(f12).withEndAction(new org.telegram.ui.Components.fp0(2, zp0Var, z11)).start();
            ys0Var.I1(true);
            ys0Var.W0();
            if (z10) {
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.W4(false);
                    org.telegram.messenger.g0.h3(new k90(profileActivity, 28));
                }
            }
            if (!z10) {
                org.telegram.messenger.g0.r(this.f48453w);
                fi.g6 g6Var = this.f48447c;
                g6Var.e();
                g6Var.f(false);
                int currentPosition = v61Var.getCurrentPosition();
                ix0 ix0Var = this.d;
                int f13 = ix0Var.f(currentPosition);
                this.f48445a.k(true);
                int i7 = ix0Var.i(f13);
                v61Var.e(0.0f, i7, i7);
            }
        }
    }
}
