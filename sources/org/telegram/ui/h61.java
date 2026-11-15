package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h61 implements org.telegram.messenger.kc, org.telegram.ui.Components.hj0, org.telegram.ui.Components.y61, org.telegram.ui.ActionBar.q1 {
    public final int f47612a;
    public final t71 f47613b;

    public h61(t71 t71Var, int i7) {
        this.f47612a = i7;
        this.f47613b = t71Var;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        t71 t71Var = this.f47613b;
        if (!(t71Var.D1 instanceof oc1)) {
            Drawable t6 = imageReceiver.t();
            if (z10 && t6 != null) {
                s61 s61Var = t71Var.f51409a;
                org.telegram.messenger.g0.q(t6);
                s61Var.k(t71Var.T0(t6), t6, Float.valueOf(t71Var.n1));
                if (!z11 && t71Var.H1 && t71Var.f51477y1 == null) {
                    t71Var.f51478z0.getImageReceiver().B0 = false;
                    t71Var.n1();
                    t71Var.f51478z0.getImageReceiver().B0 = true;
                }
                t71Var.a1();
            }
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean C2 = q1Var.C2(f10);
            t71 t71Var = this.f47613b;
            if (C2) {
                if (q1Var.getMessageObject().P3()) {
                    t71Var.d1(3, true);
                    return;
                } else {
                    t71Var.d1(1, true);
                    return;
                }
            }
            t71Var.d1(2, true);
        }
    }

    @Override
    public void g(int i7, int i10) {
        t71 t71Var = this.f47613b;
        if (!t71Var.G1) {
            return;
        }
        t71Var.f51478z0.getBackground();
        float f10 = 1.0f;
        if (t71Var.D0 != null) {
            f10 = (t71Var.f51478z0.getScaleX() - 1.0f) / (t71Var.A1 - 1.0f);
        }
        t71Var.f51478z0.setTranslationX(i7 * f10);
        t71Var.f51478z0.setTranslationY(i10 * f10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        boolean z10;
        switch (this.f47612a) {
            case 3:
                this.f47613b.f51465u0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f47613b.S0(false);
                return;
            case 5:
                t71 t71Var = this.f47613b;
                org.telegram.ui.ActionBar.g6 g6Var = t71Var.f51469w;
                if (g6Var.f28609j == 4294967296L) {
                    g6Var.f28609j = 0L;
                    g6Var.f28610k = 0L;
                    g6Var.f28611l = 0L;
                    g6Var.f28612m = 0L;
                    t71Var.r1(false);
                    org.telegram.ui.ActionBar.j6.t1(false, false);
                }
                t71Var.f51472x = true;
                org.telegram.ui.ActionBar.j6.v1(true);
                t71Var.d1(2, false);
                return;
            case 6:
                t71 t71Var2 = this.f47613b;
                org.telegram.ui.ActionBar.g6 g6Var2 = t71Var2.f51469w;
                if (org.telegram.ui.ActionBar.j6.c1() && org.telegram.ui.ActionBar.j6.I.f28712j0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = g6Var2.f28623y;
                    g6Var2.f28609j = b6Var.d;
                    g6Var2.f28610k = b6Var.f28455e;
                    g6Var2.f28611l = b6Var.f28456f;
                    g6Var2.f28612m = b6Var.f28457g;
                    g6Var2.f28613n = b6Var.h;
                    String str = b6Var.f28454c;
                    g6Var2.f28614o = str;
                    float f10 = b6Var.f28460k;
                    g6Var2.f28615p = f10;
                    t71Var2.n1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = t71Var2.W0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) t71Var2.W0.get(i10);
                                if (tL_wallPaper.pattern && g6Var2.f28614o.equals(tL_wallPaper.slug)) {
                                    t71Var2.Y0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        t71Var2.Y0 = null;
                    }
                    t71Var2.f51472x = true;
                    org.telegram.ui.Components.x61 x61Var = t71Var2.L0[1];
                    if (t71Var2.Y0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x61Var.a(z10, true);
                    t71Var2.r1(false);
                    org.telegram.ui.ActionBar.j6.t1(false, false);
                }
                Drawable background = t71Var2.f51478z0.getBackground();
                if (background instanceof org.telegram.ui.Components.ra0) {
                    org.telegram.ui.Components.ra0 ra0Var = (org.telegram.ui.Components.ra0) background;
                    ra0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (t71Var2.n1 < 0.0f) {
                            t71Var2.f51478z0.getImageReceiver().m0(ra0Var.f38923k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = t71Var2.V0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = t71Var2.n1;
                        if (f11 < 0.0f) {
                            t71Var2.n1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = t71Var2.V0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(t71Var2.n1);
                }
                org.telegram.ui.ActionBar.j6.v1(true);
                t71Var2.d1(2, false);
                return;
            default:
                t71 t71Var3 = this.f47613b;
                org.telegram.ui.ActionBar.g6 g6Var3 = t71Var3.f51469w;
                if (g6Var3.f28609j == 4294967296L) {
                    g6Var3.f28609j = 0L;
                    g6Var3.f28610k = 0L;
                    g6Var3.f28611l = 0L;
                    g6Var3.f28612m = 0L;
                    t71Var3.r1(false);
                    org.telegram.ui.ActionBar.j6.t1(false, false);
                }
                t71Var3.f51472x = true;
                org.telegram.ui.ActionBar.j6.v1(true);
                t71Var3.d1(2, false);
                return;
        }
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
