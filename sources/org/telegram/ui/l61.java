package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class l61 implements org.telegram.messenger.lc, org.telegram.ui.Components.dj0, org.telegram.ui.Components.y61, org.telegram.ui.ActionBar.r1 {
    public final int f47478a;
    public final w71 f47479b;

    public l61(w71 w71Var, int i7) {
        this.f47478a = i7;
        this.f47479b = w71Var;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean B2 = q1Var.B2(f10);
            w71 w71Var = this.f47479b;
            if (B2) {
                if (q1Var.getMessageObject().P3()) {
                    w71Var.d1(3, true);
                    return;
                } else {
                    w71Var.d1(1, true);
                    return;
                }
            }
            w71Var.d1(2, true);
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        w71 w71Var = this.f47479b;
        if (!(w71Var.C1 instanceof sc1)) {
            Drawable t6 = imageReceiver.t();
            if (z9 && t6 != null) {
                x61 x61Var = w71Var.f50902a;
                org.telegram.messenger.g0.q(t6);
                x61Var.k(w71Var.T0(t6), t6, Float.valueOf(w71Var.f50940m1));
                if (!z10 && w71Var.G1 && w71Var.f50966x1 == null) {
                    w71Var.f50968y0.getImageReceiver().A0 = false;
                    w71Var.n1();
                    w71Var.f50968y0.getImageReceiver().A0 = true;
                }
                w71Var.a1();
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        boolean z9;
        switch (this.f47478a) {
            case 3:
                this.f47479b.f50955t0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f47479b.S0(false);
                return;
            case 5:
                w71 w71Var = this.f47479b;
                org.telegram.ui.ActionBar.i6 i6Var = w71Var.f50961w;
                if (i6Var.f27578j == 4294967296L) {
                    i6Var.f27578j = 0L;
                    i6Var.f27579k = 0L;
                    i6Var.f27580l = 0L;
                    i6Var.f27581m = 0L;
                    w71Var.r1(false);
                    org.telegram.ui.ActionBar.l6.t1(false, false);
                }
                w71Var.f50964x = true;
                org.telegram.ui.ActionBar.l6.v1(true);
                w71Var.d1(2, false);
                return;
            case 6:
                w71 w71Var2 = this.f47479b;
                org.telegram.ui.ActionBar.i6 i6Var2 = w71Var2.f50961w;
                if (org.telegram.ui.ActionBar.l6.c1() && org.telegram.ui.ActionBar.l6.I.f27749i0.d != 0) {
                    org.telegram.ui.ActionBar.d6 d6Var = i6Var2.f27592y;
                    i6Var2.f27578j = d6Var.d;
                    i6Var2.f27579k = d6Var.f27431e;
                    i6Var2.f27580l = d6Var.f27432f;
                    i6Var2.f27581m = d6Var.f27433g;
                    i6Var2.f27582n = d6Var.h;
                    String str = d6Var.f27430c;
                    i6Var2.f27583o = str;
                    float f10 = d6Var.f27436k;
                    i6Var2.f27584p = f10;
                    w71Var2.f50940m1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = w71Var2.V0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) w71Var2.V0.get(i10);
                                if (tL_wallPaper.pattern && i6Var2.f27583o.equals(tL_wallPaper.slug)) {
                                    w71Var2.X0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        w71Var2.X0 = null;
                    }
                    w71Var2.f50964x = true;
                    org.telegram.ui.Components.x61 x61Var = w71Var2.K0[1];
                    if (w71Var2.X0 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    x61Var.a(z9, true);
                    w71Var2.r1(false);
                    org.telegram.ui.ActionBar.l6.t1(false, false);
                }
                Drawable background = w71Var2.f50968y0.getBackground();
                if (background instanceof org.telegram.ui.Components.ra0) {
                    org.telegram.ui.Components.ra0 ra0Var = (org.telegram.ui.Components.ra0) background;
                    ra0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.l6.I.q()) {
                        if (w71Var2.f50940m1 < 0.0f) {
                            w71Var2.f50968y0.getImageReceiver().m0(ra0Var.f37624k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = w71Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = w71Var2.f50940m1;
                        if (f11 < 0.0f) {
                            w71Var2.f50940m1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = w71Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(w71Var2.f50940m1);
                }
                org.telegram.ui.ActionBar.l6.v1(true);
                w71Var2.d1(2, false);
                return;
            default:
                w71 w71Var3 = this.f47479b;
                org.telegram.ui.ActionBar.i6 i6Var3 = w71Var3.f50961w;
                if (i6Var3.f27578j == 4294967296L) {
                    i6Var3.f27578j = 0L;
                    i6Var3.f27579k = 0L;
                    i6Var3.f27580l = 0L;
                    i6Var3.f27581m = 0L;
                    w71Var3.r1(false);
                    org.telegram.ui.ActionBar.l6.t1(false, false);
                }
                w71Var3.f50964x = true;
                org.telegram.ui.ActionBar.l6.v1(true);
                w71Var3.d1(2, false);
                return;
        }
    }

    @Override
    public void h(int i7, int i10) {
        w71 w71Var = this.f47479b;
        if (!w71Var.F1) {
            return;
        }
        w71Var.f50968y0.getBackground();
        float f10 = 1.0f;
        if (w71Var.C0 != null) {
            f10 = (w71Var.f50968y0.getScaleX() - 1.0f) / (w71Var.f50971z1 - 1.0f);
        }
        w71Var.f50968y0.setTranslationX(i7 * f10);
        w71Var.f50968y0.setTranslationY(i10 * f10);
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
