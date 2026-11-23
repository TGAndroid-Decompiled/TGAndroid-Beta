package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class j61 implements org.telegram.messenger.jc, org.telegram.ui.Components.rj0, org.telegram.ui.Components.m71, org.telegram.ui.ActionBar.q1 {
    public final int f48997a;
    public final v71 f48998b;

    public j61(v71 v71Var, int i7) {
        this.f48997a = i7;
        this.f48998b = v71Var;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void f(int i7, int i10) {
        v71 v71Var = this.f48998b;
        if (!v71Var.G1) {
            return;
        }
        v71Var.f52914z0.getBackground();
        float f10 = 1.0f;
        if (v71Var.D0 != null) {
            f10 = (v71Var.f52914z0.getScaleX() - 1.0f) / (v71Var.A1 - 1.0f);
        }
        v71Var.f52914z0.setTranslationX(i7 * f10);
        v71Var.f52914z0.setTranslationY(i10 * f10);
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            boolean E2 = r1Var.E2(f10);
            v71 v71Var = this.f48998b;
            if (E2) {
                if (r1Var.getMessageObject().P3()) {
                    v71Var.d1(3, true);
                    return;
                } else {
                    v71Var.d1(1, true);
                    return;
                }
            }
            v71Var.d1(2, true);
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        boolean z10;
        switch (this.f48997a) {
            case 3:
                this.f48998b.f52901u0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f48998b.S0(false);
                return;
            case 5:
                v71 v71Var = this.f48998b;
                org.telegram.ui.ActionBar.k6 k6Var = v71Var.f52905w;
                if (k6Var.f29231j == 4294967296L) {
                    k6Var.f29231j = 0L;
                    k6Var.f29232k = 0L;
                    k6Var.f29233l = 0L;
                    k6Var.f29234m = 0L;
                    v71Var.r1(false);
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                }
                v71Var.f52908x = true;
                org.telegram.ui.ActionBar.n6.v1(true);
                v71Var.d1(2, false);
                return;
            case 6:
                v71 v71Var2 = this.f48998b;
                org.telegram.ui.ActionBar.k6 k6Var2 = v71Var2.f52905w;
                if (org.telegram.ui.ActionBar.n6.c1() && org.telegram.ui.ActionBar.n6.I.f29334j0.d != 0) {
                    org.telegram.ui.ActionBar.e6 e6Var = k6Var2.f29245y;
                    k6Var2.f29231j = e6Var.d;
                    k6Var2.f29232k = e6Var.f28983e;
                    k6Var2.f29233l = e6Var.f28984f;
                    k6Var2.f29234m = e6Var.f28985g;
                    k6Var2.f29235n = e6Var.h;
                    String str = e6Var.f28982c;
                    k6Var2.f29236o = str;
                    float f10 = e6Var.f28988k;
                    k6Var2.f29237p = f10;
                    v71Var2.n1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = v71Var2.W0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) v71Var2.W0.get(i10);
                                if (tL_wallPaper.pattern && k6Var2.f29236o.equals(tL_wallPaper.slug)) {
                                    v71Var2.Y0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        v71Var2.Y0 = null;
                    }
                    v71Var2.f52908x = true;
                    org.telegram.ui.Components.l71 l71Var = v71Var2.L0[1];
                    if (v71Var2.Y0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l71Var.a(z10, true);
                    v71Var2.r1(false);
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                }
                Drawable background = v71Var2.f52914z0.getBackground();
                if (background instanceof org.telegram.ui.Components.za0) {
                    org.telegram.ui.Components.za0 za0Var = (org.telegram.ui.Components.za0) background;
                    za0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.n6.I.q()) {
                        if (v71Var2.n1 < 0.0f) {
                            v71Var2.f52914z0.getImageReceiver().n0(za0Var.f42795k);
                        }
                        org.telegram.ui.Cells.i0 i0Var = v71Var2.V0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = v71Var2.n1;
                        if (f11 < 0.0f) {
                            v71Var2.n1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.i0 i0Var2 = v71Var2.V0;
                if (i0Var2 != null) {
                    i0Var2.setProgress(v71Var2.n1);
                }
                org.telegram.ui.ActionBar.n6.v1(true);
                v71Var2.d1(2, false);
                return;
            default:
                v71 v71Var3 = this.f48998b;
                org.telegram.ui.ActionBar.k6 k6Var3 = v71Var3.f52905w;
                if (k6Var3.f29231j == 4294967296L) {
                    k6Var3.f29231j = 0L;
                    k6Var3.f29232k = 0L;
                    k6Var3.f29233l = 0L;
                    k6Var3.f29234m = 0L;
                    v71Var3.r1(false);
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                }
                v71Var3.f52908x = true;
                org.telegram.ui.ActionBar.n6.v1(true);
                v71Var3.d1(2, false);
                return;
        }
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        v71 v71Var = this.f48998b;
        if (!(v71Var.D1 instanceof pc1)) {
            Drawable t6 = imageReceiver.t();
            if (z10 && t6 != null) {
                u61 u61Var = v71Var.f52845a;
                org.telegram.messenger.g0.q(t6);
                u61Var.a(v71Var.T0(t6), t6, Float.valueOf(v71Var.n1));
                if (!z11 && v71Var.H1 && v71Var.f52913y1 == null) {
                    v71Var.f52914z0.getImageReceiver().B0 = false;
                    v71Var.n1();
                    v71Var.f52914z0.getImageReceiver().B0 = true;
                }
                v71Var.a1();
            }
        }
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
