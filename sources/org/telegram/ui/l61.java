package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class l61 implements org.telegram.messenger.jc, org.telegram.ui.Components.rj0, org.telegram.ui.Components.l71, org.telegram.ui.ActionBar.q1 {
    public final int f49506a;
    public final x71 f49507b;

    public l61(x71 x71Var, int i7) {
        this.f49506a = i7;
        this.f49507b = x71Var;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            boolean E2 = r1Var.E2(f10);
            x71 x71Var = this.f49507b;
            if (E2) {
                if (r1Var.getMessageObject().P3()) {
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
    public void g(int i7, int i10) {
        x71 x71Var = this.f49507b;
        if (!x71Var.G1) {
            return;
        }
        x71Var.f53780z0.getBackground();
        float f10 = 1.0f;
        if (x71Var.D0 != null) {
            f10 = (x71Var.f53780z0.getScaleX() - 1.0f) / (x71Var.A1 - 1.0f);
        }
        x71Var.f53780z0.setTranslationX(i7 * f10);
        x71Var.f53780z0.setTranslationY(i10 * f10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        boolean z10;
        switch (this.f49506a) {
            case 3:
                this.f49507b.f53767u0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f49507b.S0(false);
                return;
            case 5:
                x71 x71Var = this.f49507b;
                org.telegram.ui.ActionBar.j6 j6Var = x71Var.f53771w;
                if (j6Var.f29100j == 4294967296L) {
                    j6Var.f29100j = 0L;
                    j6Var.f29101k = 0L;
                    j6Var.f29102l = 0L;
                    j6Var.f29103m = 0L;
                    x71Var.r1(false);
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                }
                x71Var.f53774x = true;
                org.telegram.ui.ActionBar.m6.v1(true);
                x71Var.d1(2, false);
                return;
            case 6:
                x71 x71Var2 = this.f49507b;
                org.telegram.ui.ActionBar.j6 j6Var2 = x71Var2.f53771w;
                if (org.telegram.ui.ActionBar.m6.c1() && org.telegram.ui.ActionBar.m6.I.f29243j0.d != 0) {
                    org.telegram.ui.ActionBar.d6 d6Var = j6Var2.f29114y;
                    j6Var2.f29100j = d6Var.d;
                    j6Var2.f29101k = d6Var.f28883e;
                    j6Var2.f29102l = d6Var.f28884f;
                    j6Var2.f29103m = d6Var.f28885g;
                    j6Var2.f29104n = d6Var.h;
                    String str = d6Var.f28882c;
                    j6Var2.f29105o = str;
                    float f10 = d6Var.f28888k;
                    j6Var2.f29106p = f10;
                    x71Var2.n1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = x71Var2.W0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) x71Var2.W0.get(i10);
                                if (tL_wallPaper.pattern && j6Var2.f29105o.equals(tL_wallPaper.slug)) {
                                    x71Var2.Y0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        x71Var2.Y0 = null;
                    }
                    x71Var2.f53774x = true;
                    org.telegram.ui.Components.k71 k71Var = x71Var2.L0[1];
                    if (x71Var2.Y0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    k71Var.a(z10, true);
                    x71Var2.r1(false);
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                }
                Drawable background = x71Var2.f53780z0.getBackground();
                if (background instanceof org.telegram.ui.Components.cb0) {
                    org.telegram.ui.Components.cb0 cb0Var = (org.telegram.ui.Components.cb0) background;
                    cb0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.m6.I.q()) {
                        if (x71Var2.n1 < 0.0f) {
                            x71Var2.f53780z0.getImageReceiver().m0(cb0Var.f34161k);
                        }
                        org.telegram.ui.Cells.i0 i0Var = x71Var2.V0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = x71Var2.n1;
                        if (f11 < 0.0f) {
                            x71Var2.n1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.i0 i0Var2 = x71Var2.V0;
                if (i0Var2 != null) {
                    i0Var2.setProgress(x71Var2.n1);
                }
                org.telegram.ui.ActionBar.m6.v1(true);
                x71Var2.d1(2, false);
                return;
            default:
                x71 x71Var3 = this.f49507b;
                org.telegram.ui.ActionBar.j6 j6Var3 = x71Var3.f53771w;
                if (j6Var3.f29100j == 4294967296L) {
                    j6Var3.f29100j = 0L;
                    j6Var3.f29101k = 0L;
                    j6Var3.f29102l = 0L;
                    j6Var3.f29103m = 0L;
                    x71Var3.r1(false);
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                }
                x71Var3.f53774x = true;
                org.telegram.ui.ActionBar.m6.v1(true);
                x71Var3.d1(2, false);
                return;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        x71 x71Var = this.f49507b;
        if (!(x71Var.D1 instanceof rc1)) {
            Drawable t6 = imageReceiver.t();
            if (z10 && t6 != null) {
                w61 w61Var = x71Var.f53711a;
                org.telegram.messenger.g0.q(t6);
                w61Var.a(x71Var.T0(t6), t6, Float.valueOf(x71Var.n1));
                if (!z11 && x71Var.H1 && x71Var.f53779y1 == null) {
                    x71Var.f53780z0.getImageReceiver().B0 = false;
                    x71Var.n1();
                    x71Var.f53780z0.getImageReceiver().B0 = true;
                }
                x71Var.a1();
            }
        }
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
