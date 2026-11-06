package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class k61 implements org.telegram.messenger.lc, org.telegram.ui.Components.cj0, org.telegram.ui.Components.x61, org.telegram.ui.ActionBar.r1 {
    public final int f47128a;
    public final u71 f47129b;

    public k61(u71 u71Var, int i7) {
        this.f47128a = i7;
        this.f47129b = u71Var;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean B2 = q1Var.B2(f10);
            u71 u71Var = this.f47129b;
            if (B2) {
                if (q1Var.getMessageObject().Q3()) {
                    u71Var.d1(3, true);
                    return;
                } else {
                    u71Var.d1(1, true);
                    return;
                }
            }
            u71Var.d1(2, true);
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        u71 u71Var = this.f47129b;
        if (!(u71Var.C1 instanceof oc1)) {
            Drawable t6 = imageReceiver.t();
            if (z9 && t6 != null) {
                v61 v61Var = u71Var.f50265a;
                org.telegram.messenger.g0.q(t6);
                v61Var.k(u71Var.T0(t6), t6, Float.valueOf(u71Var.f50303m1));
                if (!z10 && u71Var.G1 && u71Var.f50329x1 == null) {
                    u71Var.f50331y0.getImageReceiver().A0 = false;
                    u71Var.n1();
                    u71Var.f50331y0.getImageReceiver().A0 = true;
                }
                u71Var.a1();
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
        switch (this.f47128a) {
            case 3:
                this.f47129b.f50318t0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f47129b.S0(false);
                return;
            case 5:
                u71 u71Var = this.f47129b;
                org.telegram.ui.ActionBar.h6 h6Var = u71Var.f50324w;
                if (h6Var.f27523j == 4294967296L) {
                    h6Var.f27523j = 0L;
                    h6Var.f27524k = 0L;
                    h6Var.f27525l = 0L;
                    h6Var.f27526m = 0L;
                    u71Var.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                u71Var.f50327x = true;
                org.telegram.ui.ActionBar.k6.v1(true);
                u71Var.d1(2, false);
                return;
            case 6:
                u71 u71Var2 = this.f47129b;
                org.telegram.ui.ActionBar.h6 h6Var2 = u71Var2.f50324w;
                if (org.telegram.ui.ActionBar.k6.c1() && org.telegram.ui.ActionBar.k6.I.f27639i0.d != 0) {
                    org.telegram.ui.ActionBar.c6 c6Var = h6Var2.f27537y;
                    h6Var2.f27523j = c6Var.d;
                    h6Var2.f27524k = c6Var.f27402e;
                    h6Var2.f27525l = c6Var.f27403f;
                    h6Var2.f27526m = c6Var.f27404g;
                    h6Var2.f27527n = c6Var.h;
                    String str = c6Var.f27401c;
                    h6Var2.f27528o = str;
                    float f10 = c6Var.f27407k;
                    h6Var2.f27529p = f10;
                    u71Var2.f50303m1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = u71Var2.V0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) u71Var2.V0.get(i10);
                                if (tL_wallPaper.pattern && h6Var2.f27528o.equals(tL_wallPaper.slug)) {
                                    u71Var2.X0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        u71Var2.X0 = null;
                    }
                    u71Var2.f50327x = true;
                    org.telegram.ui.Components.w61 w61Var = u71Var2.K0[1];
                    if (u71Var2.X0 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    w61Var.a(z9, true);
                    u71Var2.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                Drawable background = u71Var2.f50331y0.getBackground();
                if (background instanceof org.telegram.ui.Components.qa0) {
                    org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) background;
                    qa0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (u71Var2.f50303m1 < 0.0f) {
                            u71Var2.f50331y0.getImageReceiver().m0(qa0Var.f37230k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = u71Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = u71Var2.f50303m1;
                        if (f11 < 0.0f) {
                            u71Var2.f50303m1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = u71Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(u71Var2.f50303m1);
                }
                org.telegram.ui.ActionBar.k6.v1(true);
                u71Var2.d1(2, false);
                return;
            default:
                u71 u71Var3 = this.f47129b;
                org.telegram.ui.ActionBar.h6 h6Var3 = u71Var3.f50324w;
                if (h6Var3.f27523j == 4294967296L) {
                    h6Var3.f27523j = 0L;
                    h6Var3.f27524k = 0L;
                    h6Var3.f27525l = 0L;
                    h6Var3.f27526m = 0L;
                    u71Var3.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                u71Var3.f50327x = true;
                org.telegram.ui.ActionBar.k6.v1(true);
                u71Var3.d1(2, false);
                return;
        }
    }

    @Override
    public void h(int i7, int i10) {
        u71 u71Var = this.f47129b;
        if (!u71Var.F1) {
            return;
        }
        u71Var.f50331y0.getBackground();
        float f10 = 1.0f;
        if (u71Var.C0 != null) {
            f10 = (u71Var.f50331y0.getScaleX() - 1.0f) / (u71Var.f50334z1 - 1.0f);
        }
        u71Var.f50331y0.setTranslationX(i7 * f10);
        u71Var.f50331y0.setTranslationY(i10 * f10);
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
