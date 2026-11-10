package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class m61 implements org.telegram.messenger.lc, org.telegram.ui.Components.cj0, org.telegram.ui.Components.x61, org.telegram.ui.ActionBar.r1 {
    public final int f47806a;
    public final x71 f47807b;

    public m61(x71 x71Var, int i7) {
        this.f47806a = i7;
        this.f47807b = x71Var;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean B2 = q1Var.B2(f10);
            x71 x71Var = this.f47807b;
            if (B2) {
                if (q1Var.getMessageObject().P3()) {
                    x71Var.d1(3, true);
                    return;
                } else {
                    x71Var.d1(1, true);
                    return;
                }
            }
            x71Var.d1(2, true);
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        x71 x71Var = this.f47807b;
        if (!(x71Var.C1 instanceof tc1)) {
            Drawable t6 = imageReceiver.t();
            if (z9 && t6 != null) {
                y61 y61Var = x71Var.f51561a;
                org.telegram.messenger.g0.q(t6);
                y61Var.k(x71Var.T0(t6), t6, Float.valueOf(x71Var.f51599m1));
                if (!z10 && x71Var.G1 && x71Var.f51625x1 == null) {
                    x71Var.f51627y0.getImageReceiver().A0 = false;
                    x71Var.n1();
                    x71Var.f51627y0.getImageReceiver().A0 = true;
                }
                x71Var.a1();
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
        switch (this.f47806a) {
            case 3:
                this.f47807b.f51614t0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f47807b.S0(false);
                return;
            case 5:
                x71 x71Var = this.f47807b;
                org.telegram.ui.ActionBar.j6 j6Var = x71Var.f51620w;
                if (j6Var.f27616j == 4294967296L) {
                    j6Var.f27616j = 0L;
                    j6Var.f27617k = 0L;
                    j6Var.f27618l = 0L;
                    j6Var.f27619m = 0L;
                    x71Var.r1(false);
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                }
                x71Var.f51623x = true;
                org.telegram.ui.ActionBar.m6.v1(true);
                x71Var.d1(2, false);
                return;
            case 6:
                x71 x71Var2 = this.f47807b;
                org.telegram.ui.ActionBar.j6 j6Var2 = x71Var2.f51620w;
                if (org.telegram.ui.ActionBar.m6.c1() && org.telegram.ui.ActionBar.m6.I.f27778i0.d != 0) {
                    org.telegram.ui.ActionBar.e6 e6Var = j6Var2.f27630y;
                    j6Var2.f27616j = e6Var.d;
                    j6Var2.f27617k = e6Var.f27451e;
                    j6Var2.f27618l = e6Var.f27452f;
                    j6Var2.f27619m = e6Var.f27453g;
                    j6Var2.f27620n = e6Var.h;
                    String str = e6Var.f27450c;
                    j6Var2.f27621o = str;
                    float f10 = e6Var.f27456k;
                    j6Var2.f27622p = f10;
                    x71Var2.f51599m1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = x71Var2.V0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) x71Var2.V0.get(i10);
                                if (tL_wallPaper.pattern && j6Var2.f27621o.equals(tL_wallPaper.slug)) {
                                    x71Var2.X0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        x71Var2.X0 = null;
                    }
                    x71Var2.f51623x = true;
                    org.telegram.ui.Components.w61 w61Var = x71Var2.K0[1];
                    if (x71Var2.X0 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    w61Var.a(z9, true);
                    x71Var2.r1(false);
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                }
                Drawable background = x71Var2.f51627y0.getBackground();
                if (background instanceof org.telegram.ui.Components.qa0) {
                    org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) background;
                    qa0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.m6.I.q()) {
                        if (x71Var2.f51599m1 < 0.0f) {
                            x71Var2.f51627y0.getImageReceiver().m0(qa0Var.f37215k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = x71Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = x71Var2.f51599m1;
                        if (f11 < 0.0f) {
                            x71Var2.f51599m1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = x71Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(x71Var2.f51599m1);
                }
                org.telegram.ui.ActionBar.m6.v1(true);
                x71Var2.d1(2, false);
                return;
            default:
                x71 x71Var3 = this.f47807b;
                org.telegram.ui.ActionBar.j6 j6Var3 = x71Var3.f51620w;
                if (j6Var3.f27616j == 4294967296L) {
                    j6Var3.f27616j = 0L;
                    j6Var3.f27617k = 0L;
                    j6Var3.f27618l = 0L;
                    j6Var3.f27619m = 0L;
                    x71Var3.r1(false);
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                }
                x71Var3.f51623x = true;
                org.telegram.ui.ActionBar.m6.v1(true);
                x71Var3.d1(2, false);
                return;
        }
    }

    @Override
    public void h(int i7, int i10) {
        x71 x71Var = this.f47807b;
        if (!x71Var.F1) {
            return;
        }
        x71Var.f51627y0.getBackground();
        float f10 = 1.0f;
        if (x71Var.C0 != null) {
            f10 = (x71Var.f51627y0.getScaleX() - 1.0f) / (x71Var.f51630z1 - 1.0f);
        }
        x71Var.f51627y0.setTranslationX(i7 * f10);
        x71Var.f51627y0.setTranslationY(i10 * f10);
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
