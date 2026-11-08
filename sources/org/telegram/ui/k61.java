package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class k61 implements org.telegram.messenger.lc, org.telegram.ui.Components.cj0, org.telegram.ui.Components.x61, org.telegram.ui.ActionBar.r1 {
    public final int f47126a;
    public final v71 f47127b;

    public k61(v71 v71Var, int i7) {
        this.f47126a = i7;
        this.f47127b = v71Var;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean B2 = q1Var.B2(f10);
            v71 v71Var = this.f47127b;
            if (B2) {
                if (q1Var.getMessageObject().Q3()) {
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
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        v71 v71Var = this.f47127b;
        if (!(v71Var.C1 instanceof pc1)) {
            Drawable t6 = imageReceiver.t();
            if (z9 && t6 != null) {
                w61 w61Var = v71Var.f50520a;
                org.telegram.messenger.g0.q(t6);
                w61Var.k(v71Var.T0(t6), t6, Float.valueOf(v71Var.f50558m1));
                if (!z10 && v71Var.G1 && v71Var.f50584x1 == null) {
                    v71Var.f50586y0.getImageReceiver().A0 = false;
                    v71Var.n1();
                    v71Var.f50586y0.getImageReceiver().A0 = true;
                }
                v71Var.a1();
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
        switch (this.f47126a) {
            case 3:
                this.f47127b.f50573t0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f47127b.S0(false);
                return;
            case 5:
                v71 v71Var = this.f47127b;
                org.telegram.ui.ActionBar.h6 h6Var = v71Var.f50579w;
                if (h6Var.f27526j == 4294967296L) {
                    h6Var.f27526j = 0L;
                    h6Var.f27527k = 0L;
                    h6Var.f27528l = 0L;
                    h6Var.f27529m = 0L;
                    v71Var.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                v71Var.f50582x = true;
                org.telegram.ui.ActionBar.k6.v1(true);
                v71Var.d1(2, false);
                return;
            case 6:
                v71 v71Var2 = this.f47127b;
                org.telegram.ui.ActionBar.h6 h6Var2 = v71Var2.f50579w;
                if (org.telegram.ui.ActionBar.k6.c1() && org.telegram.ui.ActionBar.k6.I.f27642i0.d != 0) {
                    org.telegram.ui.ActionBar.c6 c6Var = h6Var2.f27540y;
                    h6Var2.f27526j = c6Var.d;
                    h6Var2.f27527k = c6Var.f27405e;
                    h6Var2.f27528l = c6Var.f27406f;
                    h6Var2.f27529m = c6Var.f27407g;
                    h6Var2.f27530n = c6Var.h;
                    String str = c6Var.f27404c;
                    h6Var2.f27531o = str;
                    float f10 = c6Var.f27410k;
                    h6Var2.f27532p = f10;
                    v71Var2.f50558m1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = v71Var2.V0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) v71Var2.V0.get(i10);
                                if (tL_wallPaper.pattern && h6Var2.f27531o.equals(tL_wallPaper.slug)) {
                                    v71Var2.X0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        v71Var2.X0 = null;
                    }
                    v71Var2.f50582x = true;
                    org.telegram.ui.Components.w61 w61Var = v71Var2.K0[1];
                    if (v71Var2.X0 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    w61Var.a(z9, true);
                    v71Var2.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                Drawable background = v71Var2.f50586y0.getBackground();
                if (background instanceof org.telegram.ui.Components.qa0) {
                    org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) background;
                    qa0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (v71Var2.f50558m1 < 0.0f) {
                            v71Var2.f50586y0.getImageReceiver().m0(qa0Var.f37260k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = v71Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = v71Var2.f50558m1;
                        if (f11 < 0.0f) {
                            v71Var2.f50558m1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = v71Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(v71Var2.f50558m1);
                }
                org.telegram.ui.ActionBar.k6.v1(true);
                v71Var2.d1(2, false);
                return;
            default:
                v71 v71Var3 = this.f47127b;
                org.telegram.ui.ActionBar.h6 h6Var3 = v71Var3.f50579w;
                if (h6Var3.f27526j == 4294967296L) {
                    h6Var3.f27526j = 0L;
                    h6Var3.f27527k = 0L;
                    h6Var3.f27528l = 0L;
                    h6Var3.f27529m = 0L;
                    v71Var3.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                v71Var3.f50582x = true;
                org.telegram.ui.ActionBar.k6.v1(true);
                v71Var3.d1(2, false);
                return;
        }
    }

    @Override
    public void h(int i7, int i10) {
        v71 v71Var = this.f47127b;
        if (!v71Var.F1) {
            return;
        }
        v71Var.f50586y0.getBackground();
        float f10 = 1.0f;
        if (v71Var.C0 != null) {
            f10 = (v71Var.f50586y0.getScaleX() - 1.0f) / (v71Var.f50589z1 - 1.0f);
        }
        v71Var.f50586y0.setTranslationX(i7 * f10);
        v71Var.f50586y0.setTranslationY(i10 * f10);
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
