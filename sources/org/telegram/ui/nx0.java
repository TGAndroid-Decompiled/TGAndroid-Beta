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
    public final bi.m5 f50336a;
    public final org.telegram.ui.Components.f71 f50337b;
    public final fi.d6 f50338c;
    public final mx0 d;
    public int f50339e;
    public boolean f50340f;
    public ValueAnimator h;
    public float f50341n;
    public boolean f50342r;
    public final Rect f50343s;
    public final ru0 f50344w;

    public nx0(Context context, fi.d6 d6Var, final org.telegram.ui.Components.gq0 gq0Var) {
        super(context);
        this.f50343s = new Rect();
        this.f50338c = d6Var;
        Objects.requireNonNull(d6Var);
        this.f50344w = new ru0(d6Var, 8);
        final org.telegram.ui.Components.hq0 hq0Var = (org.telegram.ui.Components.hq0) this;
        bi.m5 m5Var = new bi.m5(hq0Var, context, gq0Var, 2);
        this.f50336a = m5Var;
        m5Var.setAllowDisallowInterceptTouch(true);
        mx0 mx0Var = new mx0(hq0Var);
        this.d = mx0Var;
        mx0Var.f49982a = d6Var.a();
        m5Var.setAdapter(mx0Var);
        m5Var.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.f71 i7 = m5Var.i(10, true);
        this.f50337b = i7;
        i7.h(org.telegram.ui.ActionBar.n6.f29778xi, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.f29740vi, org.telegram.ui.ActionBar.n6.f29797yi, org.telegram.ui.ActionBar.n6.f29674s8);
        i7.f35012r = 12;
        i7.setPreTabClick(new org.telegram.messenger.r10() {
            @Override
            public final Object g(Number number, Object obj) {
                fi.p6 storiesController;
                int i10 = r3;
                final org.telegram.ui.Components.gq0 gq0Var2 = gq0Var;
                org.telegram.ui.Components.hq0 hq0Var2 = hq0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (hq0Var2.f50340f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.b5.P(gq0Var2.f35549a, gq0Var2.f35550b, gq0Var2.f35551c, new org.telegram.ui.Components.iy(gq0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !hq0Var2.f50340f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.gt0 gt0Var = gq0Var2.d;
                            org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
                            storiesController = gt0Var.getStoriesController();
                            if (storiesController.i(gt0Var.f35606m1)) {
                                org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(h2Var, view);
                                I.X(new bi.o5(gq0Var2));
                                I.c(2131231764, org.telegram.messenger.gd.M0(2131744563, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                                                gt0Var2.a1(intValue, gt0Var2.f35606m1, h2Var2);
                                                return;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.f35642y1;
                                                gt0Var3.c1(intValue, gt0Var3.f35606m1, h2Var3);
                                                return;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.f35642y1;
                                                gt0Var4.b1(intValue, gt0Var4.f35606m1, h2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                gt0Var.B(new org.telegram.ui.Cells.c5(I), h2Var, gt0Var.f35606m1, intValue);
                                I.c(2131232118, org.telegram.messenger.gd.M0(2131744558, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                                                gt0Var2.a1(intValue, gt0Var2.f35606m1, h2Var2);
                                                return;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.f35642y1;
                                                gt0Var3.c1(intValue, gt0Var3.f35606m1, h2Var3);
                                                return;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.f35642y1;
                                                gt0Var4.b1(intValue, gt0Var4.f35606m1, h2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232775, org.telegram.messenger.gd.M0(2131744555, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                                                gt0Var2.a1(intValue, gt0Var2.f35606m1, h2Var2);
                                                return;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.f35642y1;
                                                gt0Var3.c1(intValue, gt0Var3.f35606m1, h2Var3);
                                                return;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.f35642y1;
                                                gt0Var4.b1(intValue, gt0Var4.f35606m1, h2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232110, org.telegram.messenger.gd.M0(2131744561, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                                                gt0Var2.a1(intValue, gt0Var2.f35606m1, h2Var2);
                                                return;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.f35642y1;
                                                gt0Var3.c1(intValue, gt0Var3.f35606m1, h2Var3);
                                                return;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.f35642y1;
                                                gt0Var4.b1(intValue, gt0Var4.f35606m1, h2Var4);
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
                final org.telegram.ui.Components.gq0 gq0Var2 = gq0Var;
                org.telegram.ui.Components.hq0 hq0Var2 = hq0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (hq0Var2.f50340f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.b5.P(gq0Var2.f35549a, gq0Var2.f35550b, gq0Var2.f35551c, new org.telegram.ui.Components.iy(gq0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !hq0Var2.f50340f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.gt0 gt0Var = gq0Var2.d;
                            org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
                            storiesController = gt0Var.getStoriesController();
                            if (storiesController.i(gt0Var.f35606m1)) {
                                org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(h2Var, view);
                                I.X(new bi.o5(gq0Var2));
                                I.c(2131231764, org.telegram.messenger.gd.M0(2131744563, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                                                gt0Var2.a1(intValue, gt0Var2.f35606m1, h2Var2);
                                                return;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.f35642y1;
                                                gt0Var3.c1(intValue, gt0Var3.f35606m1, h2Var3);
                                                return;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.f35642y1;
                                                gt0Var4.b1(intValue, gt0Var4.f35606m1, h2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                gt0Var.B(new org.telegram.ui.Cells.c5(I), h2Var, gt0Var.f35606m1, intValue);
                                I.c(2131232118, org.telegram.messenger.gd.M0(2131744558, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                                                gt0Var2.a1(intValue, gt0Var2.f35606m1, h2Var2);
                                                return;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.f35642y1;
                                                gt0Var3.c1(intValue, gt0Var3.f35606m1, h2Var3);
                                                return;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.f35642y1;
                                                gt0Var4.b1(intValue, gt0Var4.f35606m1, h2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232775, org.telegram.messenger.gd.M0(2131744555, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                                                gt0Var2.a1(intValue, gt0Var2.f35606m1, h2Var2);
                                                return;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.f35642y1;
                                                gt0Var3.c1(intValue, gt0Var3.f35606m1, h2Var3);
                                                return;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.f35642y1;
                                                gt0Var4.b1(intValue, gt0Var4.f35606m1, h2Var4);
                                                return;
                                        }
                                    }
                                }, false);
                                I.c(2131232110, org.telegram.messenger.gd.M0(2131744561, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                gt0 gt0Var2 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var2.f35642y1;
                                                gt0Var2.a1(intValue, gt0Var2.f35606m1, h2Var2);
                                                return;
                                            case 1:
                                                gt0 gt0Var3 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var3.f35642y1;
                                                gt0Var3.c1(intValue, gt0Var3.f35606m1, h2Var3);
                                                return;
                                            case 2:
                                                gq0Var2.d.s1(intValue);
                                                return;
                                            default:
                                                gt0 gt0Var4 = gq0Var2.d;
                                                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var4.f35642y1;
                                                gt0Var4.b1(intValue, gt0Var4.f35606m1, h2Var4);
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
        org.telegram.ui.Components.f71 f71Var = this.f50337b;
        if (f71Var != null) {
            i7 = f71Var.getCurrentTabId();
        } else {
            i7 = 0;
        }
        fi.d6 d6Var = this.f50338c;
        boolean a10 = d6Var.a();
        mx0 mx0Var = this.d;
        mx0Var.f49982a = a10;
        this.f50336a.j(true);
        c(!d6Var.h.isEmpty(), true, false);
        int i10 = this.f50339e;
        if (i10 > 0) {
            if (mx0Var.i(i10) != -1) {
                org.telegram.messenger.g0.h3(new lx0(this, this.f50339e, 1), 500L);
                this.f50339e = 0;
            }
        } else if (f71Var != null && i7 > 0 && d6Var.b(i7) == null) {
            f71Var.e(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.f50342r == z10 && !z12) {
            return;
        }
        this.f50342r = z10;
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
            this.f50341n = f10;
            b();
            return;
        }
        float f11 = this.f50341n;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(org.telegram.ui.Components.lr.h);
        this.h.addUpdateListener(new a3(this, 28));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25147l3 && ((Long) objArr[0]).longValue() == this.f50338c.f11851b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f50342r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f50337b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f50341n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f50341n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fi.d6 d6Var = this.f50338c;
        org.telegram.messenger.ks.f(d6Var.f11850a).c(this, org.telegram.messenger.ks.f25147l3);
        if (this.f50342r != d6Var.h.isEmpty() && this.d.f49982a == d6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f50338c.f11850a).n(this, org.telegram.messenger.ks.f25147l3);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        Rect rect = this.f50343s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i7) {
        if (this.d.i(i7) != -1) {
            org.telegram.messenger.g0.h3(new lx0(this, i7, 0), 500L);
        } else {
            this.f50339e = i7;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f10;
        float f11;
        if (this.f50340f != z10) {
            this.f50340f = z10;
            org.telegram.ui.Components.f71 f71Var = this.f50337b;
            f71Var.setReordering(z10);
            boolean z11 = this.f50340f;
            org.telegram.ui.Components.hq0 hq0Var = (org.telegram.ui.Components.hq0) this;
            org.telegram.ui.Components.gt0 gt0Var = hq0Var.f35951x;
            TextView textView = gt0Var.f35628t0;
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
            scaleX.scaleY(f12).withEndAction(new org.telegram.ui.Components.pp0(2, hq0Var, z11)).start();
            gt0Var.I1(true);
            gt0Var.W0();
            if (z10) {
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.g3(new n90(profileActivity, 28));
                }
            }
            if (!z10) {
                org.telegram.messenger.g0.r(this.f50344w);
                fi.d6 d6Var = this.f50338c;
                d6Var.e();
                d6Var.f(false);
                int currentPosition = f71Var.getCurrentPosition();
                mx0 mx0Var = this.d;
                int f13 = mx0Var.f(currentPosition);
                this.f50336a.j(true);
                int i7 = mx0Var.i(f13);
                f71Var.f(0.0f, i7, i7);
            }
        }
    }
}
