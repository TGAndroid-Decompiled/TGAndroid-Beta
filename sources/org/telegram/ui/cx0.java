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
public abstract class cx0 extends FrameLayout implements org.telegram.messenger.cs {
    public final ai.q3 f44466a;
    public final org.telegram.ui.Components.m61 f44467b;
    public final ei.n6 f44468c;
    public final bx0 d;
    public int f44469e;
    public boolean f44470f;
    public ValueAnimator h;
    public float f44471n;
    public boolean f44472r;
    public final Rect f44473s;
    public final pu0 f44474w;

    public cx0(Context context, ei.n6 n6Var, final org.telegram.ui.Components.xp0 xp0Var) {
        super(context);
        this.f44473s = new Rect();
        this.f44468c = n6Var;
        Objects.requireNonNull(n6Var);
        this.f44474w = new pu0(n6Var, 7);
        final org.telegram.ui.Components.yp0 yp0Var = (org.telegram.ui.Components.yp0) this;
        ai.q3 q3Var = new ai.q3(yp0Var, context, xp0Var, 2);
        this.f44466a = q3Var;
        q3Var.setAllowDisallowInterceptTouch(true);
        bx0 bx0Var = new bx0(yp0Var);
        this.d = bx0Var;
        bx0Var.f44165a = n6Var.a();
        q3Var.setAdapter(bx0Var);
        q3Var.setTranslationY(org.telegram.messenger.g0.L(42.0f));
        org.telegram.ui.Components.m61 j10 = q3Var.j(10, true);
        this.f44467b = j10;
        j10.g(org.telegram.ui.ActionBar.k6.f28207ui, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f28169si, org.telegram.ui.ActionBar.k6.f28226vi, org.telegram.ui.ActionBar.k6.f28160s8);
        j10.f36048r = 12;
        j10.setPreTabClick(new org.telegram.messenger.o10() {
            @Override
            public final Object d(Number number, Object obj) {
                ei.z6 storiesController;
                int i3 = r3;
                final org.telegram.ui.Components.xp0 xp0Var2 = xp0Var;
                org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                Integer num = (Integer) number;
                switch (i3) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (yp0Var2.f44470f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.t4.R(xp0Var2.f40449a, xp0Var2.f40450b, xp0Var2.f40451c, new org.telegram.ui.Components.zw(xp0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !yp0Var2.f44470f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.ws0 ws0Var = xp0Var2.d;
                            org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
                            storiesController = ws0Var.getStoriesController();
                            if (storiesController.i(ws0Var.m1)) {
                                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(d2Var, view);
                                H.W(new ai.s3(xp0Var2));
                                H.c(2131231763, org.telegram.messenger.bd.M0(2131744808, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.f40142y1, ws0Var2.m1, intValue);
                                                return;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.f40142y1, ws0Var3.m1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.f40142y1, ws0Var4.m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                ws0Var.B(new org.telegram.ui.Components.y00(H), d2Var, ws0Var.m1, intValue);
                                H.c(2131232116, org.telegram.messenger.bd.M0(2131744803, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.f40142y1, ws0Var2.m1, intValue);
                                                return;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.f40142y1, ws0Var3.m1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.f40142y1, ws0Var4.m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232771, org.telegram.messenger.bd.M0(2131744800, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.f40142y1, ws0Var2.m1, intValue);
                                                return;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.f40142y1, ws0Var3.m1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.f40142y1, ws0Var4.m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232108, org.telegram.messenger.bd.M0(2131744806, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.f40142y1, ws0Var2.m1, intValue);
                                                return;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.f40142y1, ws0Var3.m1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.f40142y1, ws0Var4.m1, intValue);
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
        j10.setOnTabLongClick(new org.telegram.messenger.o10() {
            @Override
            public final Object d(Number number, Object obj) {
                ei.z6 storiesController;
                int i3 = r3;
                final org.telegram.ui.Components.xp0 xp0Var2 = xp0Var;
                org.telegram.ui.Components.yp0 yp0Var2 = yp0Var;
                Integer num = (Integer) number;
                switch (i3) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (yp0Var2.f44470f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.t4.R(xp0Var2.f40449a, xp0Var2.f40450b, xp0Var2.f40451c, new org.telegram.ui.Components.zw(xp0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !yp0Var2.f44470f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.ws0 ws0Var = xp0Var2.d;
                            org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
                            storiesController = ws0Var.getStoriesController();
                            if (storiesController.i(ws0Var.m1)) {
                                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(d2Var, view);
                                H.W(new ai.s3(xp0Var2));
                                H.c(2131231763, org.telegram.messenger.bd.M0(2131744808, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.f40142y1, ws0Var2.m1, intValue);
                                                return;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.f40142y1, ws0Var3.m1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.f40142y1, ws0Var4.m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                ws0Var.B(new org.telegram.ui.Components.y00(H), d2Var, ws0Var.m1, intValue);
                                H.c(2131232116, org.telegram.messenger.bd.M0(2131744803, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.f40142y1, ws0Var2.m1, intValue);
                                                return;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.f40142y1, ws0Var3.m1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.f40142y1, ws0Var4.m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232771, org.telegram.messenger.bd.M0(2131744800, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.f40142y1, ws0Var2.m1, intValue);
                                                return;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.f40142y1, ws0Var3.m1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.f40142y1, ws0Var4.m1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232108, org.telegram.messenger.bd.M0(2131744806, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                ws0 ws0Var2 = xp0Var2.d;
                                                ws0Var2.Y0(ws0Var2.f40142y1, ws0Var2.m1, intValue);
                                                return;
                                            case 1:
                                                ws0 ws0Var3 = xp0Var2.d;
                                                ws0Var3.a1(ws0Var3.f40142y1, ws0Var3.m1, intValue);
                                                return;
                                            case 2:
                                                xp0Var2.d.q1(intValue);
                                                return;
                                            default:
                                                ws0 ws0Var4 = xp0Var2.d;
                                                ws0Var4.Z0(ws0Var4.f40142y1, ws0Var4.m1, intValue);
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
        addView(j10, b8.mf.e(-1, 42, 48));
        c(!n6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i3;
        org.telegram.ui.Components.m61 m61Var = this.f44467b;
        if (m61Var != null) {
            i3 = m61Var.getCurrentTabId();
        } else {
            i3 = 0;
        }
        ei.n6 n6Var = this.f44468c;
        boolean a10 = n6Var.a();
        bx0 bx0Var = this.d;
        bx0Var.f44165a = a10;
        this.f44466a.k(true);
        c(!n6Var.h.isEmpty(), true, false);
        int i10 = this.f44469e;
        if (i10 > 0) {
            if (bx0Var.i(i10) != -1) {
                org.telegram.messenger.g0.i3(new ax0(this, this.f44469e, 1), 500L);
                this.f44469e = 0;
            }
        } else if (m61Var != null && i3 > 0 && n6Var.b(i3) == null) {
            m61Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.f44472r == z10 && !z12) {
            return;
        }
        this.f44472r = z10;
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
            this.f44471n = f10;
            b();
            return;
        }
        float f11 = this.f44471n;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(org.telegram.ui.Components.xq.h);
        this.h.addUpdateListener(new b3(this, 28));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23251j3 && ((Long) objArr[0]).longValue() == this.f44468c.f10670b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f44472r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f44467b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f44471n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f44471n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ei.n6 n6Var = this.f44468c;
        org.telegram.messenger.hs.f(n6Var.f10669a).c(this, org.telegram.messenger.hs.f23251j3);
        if (this.f44472r != n6Var.h.isEmpty() && this.d.f44165a == n6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.f44468c.f10669a).n(this, org.telegram.messenger.hs.f23251j3);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        Rect rect = this.f44473s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i3) {
        if (this.d.i(i3) != -1) {
            org.telegram.messenger.g0.i3(new ax0(this, i3, 0), 500L);
        } else {
            this.f44469e = i3;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f10;
        float f11;
        if (this.f44470f != z10) {
            this.f44470f = z10;
            org.telegram.ui.Components.m61 m61Var = this.f44467b;
            m61Var.setReordering(z10);
            boolean z11 = this.f44470f;
            org.telegram.ui.Components.yp0 yp0Var = (org.telegram.ui.Components.yp0) this;
            org.telegram.ui.Components.ws0 ws0Var = yp0Var.f40802x;
            TextView textView = ws0Var.f40128t0;
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
            scaleX.scaleY(f12).withEndAction(new org.telegram.ui.Components.up0(1, yp0Var, z11)).start();
            ws0Var.G1(true);
            if (z10) {
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.U4(false);
                    org.telegram.messenger.g0.h3(new g90(profileActivity, 28));
                }
            }
            if (!z10) {
                org.telegram.messenger.g0.r(this.f44474w);
                ei.n6 n6Var = this.f44468c;
                n6Var.e();
                n6Var.f(false);
                int currentPosition = m61Var.getCurrentPosition();
                bx0 bx0Var = this.d;
                int f13 = bx0Var.f(currentPosition);
                this.f44466a.k(true);
                int i3 = bx0Var.i(f13);
                m61Var.e(0.0f, i3, i3);
            }
        }
    }
}
