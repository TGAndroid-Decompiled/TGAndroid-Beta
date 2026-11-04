package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class a61 implements org.telegram.messenger.ec, org.telegram.ui.Components.gj0, org.telegram.ui.Components.p61, org.telegram.ui.ActionBar.p1 {
    public final int f43640a;
    public final l71 f43641b;

    public a61(l71 l71Var, int i3) {
        this.f43640a = i3;
        this.f43641b = l71Var;
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean A2 = q1Var.A2(f10);
            l71 l71Var = this.f43641b;
            if (A2) {
                if (q1Var.getMessageObject().Q3()) {
                    l71Var.d1(3, true);
                    return;
                } else {
                    l71Var.d1(1, true);
                    return;
                }
            }
            l71Var.d1(2, true);
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void e(int i3, int i10) {
        l71 l71Var = this.f43641b;
        if (!l71Var.G1) {
            return;
        }
        l71Var.f47210z0.getBackground();
        float f10 = 1.0f;
        if (l71Var.D0 != null) {
            f10 = (l71Var.f47210z0.getScaleX() - 1.0f) / (l71Var.A1 - 1.0f);
        }
        l71Var.f47210z0.setTranslationX(i3 * f10);
        l71Var.f47210z0.setTranslationY(i10 * f10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        boolean z10;
        switch (this.f43640a) {
            case 3:
                this.f43641b.f47197u0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f43641b.S0(false);
                return;
            case 5:
                l71 l71Var = this.f43641b;
                org.telegram.ui.ActionBar.g6 g6Var = l71Var.f47201w;
                if (g6Var.f27532j == 4294967296L) {
                    g6Var.f27532j = 0L;
                    g6Var.f27533k = 0L;
                    g6Var.f27534l = 0L;
                    g6Var.f27535m = 0L;
                    l71Var.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                l71Var.f47204x = true;
                org.telegram.ui.ActionBar.k6.v1(true);
                l71Var.d1(2, false);
                return;
            case 6:
                l71 l71Var2 = this.f43641b;
                org.telegram.ui.ActionBar.g6 g6Var2 = l71Var2.f47201w;
                if (org.telegram.ui.ActionBar.k6.c1() && org.telegram.ui.ActionBar.k6.I.f27689j0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = g6Var2.f27546y;
                    g6Var2.f27532j = b6Var.d;
                    g6Var2.f27533k = b6Var.f27425e;
                    g6Var2.f27534l = b6Var.f27426f;
                    g6Var2.f27535m = b6Var.f27427g;
                    g6Var2.f27536n = b6Var.h;
                    String str = b6Var.f27424c;
                    g6Var2.f27537o = str;
                    float f10 = b6Var.f27430k;
                    g6Var2.f27538p = f10;
                    l71Var2.f47182n1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = l71Var2.W0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) l71Var2.W0.get(i10);
                                if (tL_wallPaper.pattern && g6Var2.f27537o.equals(tL_wallPaper.slug)) {
                                    l71Var2.Y0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        l71Var2.Y0 = null;
                    }
                    l71Var2.f47204x = true;
                    org.telegram.ui.Components.o61 o61Var = l71Var2.L0[1];
                    if (l71Var2.Y0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o61Var.a(z10, true);
                    l71Var2.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                Drawable background = l71Var2.f47210z0.getBackground();
                if (background instanceof org.telegram.ui.Components.la0) {
                    org.telegram.ui.Components.la0 la0Var = (org.telegram.ui.Components.la0) background;
                    la0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (l71Var2.f47182n1 < 0.0f) {
                            l71Var2.f47210z0.getImageReceiver().m0(la0Var.f35658k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = l71Var2.V0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = l71Var2.f47182n1;
                        if (f11 < 0.0f) {
                            l71Var2.f47182n1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = l71Var2.V0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(l71Var2.f47182n1);
                }
                org.telegram.ui.ActionBar.k6.v1(true);
                l71Var2.d1(2, false);
                return;
            default:
                l71 l71Var3 = this.f43641b;
                org.telegram.ui.ActionBar.g6 g6Var3 = l71Var3.f47201w;
                if (g6Var3.f27532j == 4294967296L) {
                    g6Var3.f27532j = 0L;
                    g6Var3.f27533k = 0L;
                    g6Var3.f27534l = 0L;
                    g6Var3.f27535m = 0L;
                    l71Var3.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                l71Var3.f47204x = true;
                org.telegram.ui.ActionBar.k6.v1(true);
                l71Var3.d1(2, false);
                return;
        }
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        l71 l71Var = this.f43641b;
        if (!(l71Var.D1 instanceof kc1)) {
            Drawable t10 = imageReceiver.t();
            if (z10 && t10 != null) {
                l61 l61Var = l71Var.f47141a;
                org.telegram.messenger.g0.q(t10);
                l61Var.k(l71Var.T0(t10), t10, Float.valueOf(l71Var.f47182n1));
                if (!z11 && l71Var.H1 && l71Var.f47209y1 == null) {
                    l71Var.f47210z0.getImageReceiver().B0 = false;
                    l71Var.n1();
                    l71Var.f47210z0.getImageReceiver().B0 = true;
                }
                l71Var.a1();
            }
        }
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
