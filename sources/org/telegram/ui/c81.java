package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class c81 implements org.telegram.messenger.mc, org.telegram.ui.Components.hk0, org.telegram.ui.Components.y71, org.telegram.ui.ActionBar.u1 {
    public final int f36416a;
    public final m91 f36417b;

    public c81(m91 m91Var, int i10) {
        this.f36416a = i10;
        this.f36417b = m91Var;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean y22 = q1Var.y2(f7);
            m91 m91Var = this.f36417b;
            if (y22) {
                if (q1Var.getMessageObject().P3()) {
                    m91Var.c1(3, true);
                    return;
                } else {
                    m91Var.c1(1, true);
                    return;
                }
            }
            m91Var.c1(2, true);
        }
    }

    @Override
    public void e(int i10, int i11) {
        m91 m91Var = this.f36417b;
        if (!m91Var.F1) {
            return;
        }
        m91Var.f39603y0.getBackground();
        float f7 = 1.0f;
        if (m91Var.C0 != null) {
            f7 = (m91Var.f39603y0.getScaleX() - 1.0f) / (m91Var.f39606z1 - 1.0f);
        }
        m91Var.f39603y0.setTranslationX(i10 * f7);
        m91Var.f39603y0.setTranslationY(i11 * f7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        boolean z10;
        switch (this.f36416a) {
            case 3:
                this.f36417b.f39590t0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f36417b.R0(false);
                return;
            case 5:
                m91 m91Var = this.f36417b;
                org.telegram.ui.ActionBar.r6 r6Var = m91Var.f39596w;
                if (r6Var.f20736j == 4294967296L) {
                    r6Var.f20736j = 0L;
                    r6Var.f20737k = 0L;
                    r6Var.f20738l = 0L;
                    r6Var.f20739m = 0L;
                    m91Var.q1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                m91Var.f39599x = true;
                org.telegram.ui.ActionBar.t6.v1(true);
                m91Var.c1(2, false);
                return;
            case 6:
                m91 m91Var2 = this.f36417b;
                org.telegram.ui.ActionBar.r6 r6Var2 = m91Var2.f39596w;
                if (org.telegram.ui.ActionBar.t6.c1() && org.telegram.ui.ActionBar.t6.I.f20813i0.d != 0) {
                    org.telegram.ui.ActionBar.m6 m6Var = r6Var2.f20750y;
                    r6Var2.f20736j = m6Var.d;
                    r6Var2.f20737k = m6Var.e;
                    r6Var2.f20738l = m6Var.f20591f;
                    r6Var2.f20739m = m6Var.f20592g;
                    r6Var2.f20740n = m6Var.h;
                    String str = m6Var.f20590c;
                    r6Var2.f20741o = str;
                    float f7 = m6Var.f20595k;
                    r6Var2.f20742p = f7;
                    m91Var2.f39574m1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = m91Var2.V0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) m91Var2.V0.get(i11);
                                if (tL_wallPaper.pattern && r6Var2.f20741o.equals(tL_wallPaper.slug)) {
                                    m91Var2.X0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        m91Var2.X0 = null;
                    }
                    m91Var2.f39599x = true;
                    org.telegram.ui.Components.x71 x71Var = m91Var2.K0[1];
                    if (m91Var2.X0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x71Var.a(z10, true);
                    m91Var2.q1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                Drawable background = m91Var2.f39603y0.getBackground();
                if (background instanceof org.telegram.ui.Components.jb0) {
                    org.telegram.ui.Components.jb0 jb0Var = (org.telegram.ui.Components.jb0) background;
                    jb0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.t6.I.q()) {
                        if (m91Var2.f39574m1 < 0.0f) {
                            m91Var2.f39603y0.getImageReceiver().m0(jb0Var.f27287k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = m91Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = m91Var2.f39574m1;
                        if (f10 < 0.0f) {
                            m91Var2.f39574m1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = m91Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(m91Var2.f39574m1);
                }
                org.telegram.ui.ActionBar.t6.v1(true);
                m91Var2.c1(2, false);
                return;
            default:
                m91 m91Var3 = this.f36417b;
                org.telegram.ui.ActionBar.r6 r6Var3 = m91Var3.f39596w;
                if (r6Var3.f20736j == 4294967296L) {
                    r6Var3.f20736j = 0L;
                    r6Var3.f20737k = 0L;
                    r6Var3.f20738l = 0L;
                    r6Var3.f20739m = 0L;
                    m91Var3.q1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                m91Var3.f39599x = true;
                org.telegram.ui.ActionBar.t6.v1(true);
                m91Var3.c1(2, false);
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        m91 m91Var = this.f36417b;
        if (!(m91Var.C1 instanceof me1)) {
            Drawable t10 = imageReceiver.t();
            if (z10 && t10 != null) {
                n81 n81Var = m91Var.f39537a;
                org.telegram.messenger.i0.q(t10);
                n81Var.k(m91Var.S0(t10), t10, Float.valueOf(m91Var.f39574m1));
                if (!z11 && m91Var.G1 && m91Var.f39601x1 == null) {
                    m91Var.f39603y0.getImageReceiver().A0 = false;
                    m91Var.m1();
                    m91Var.f39603y0.getImageReceiver().A0 = true;
                }
                m91Var.Z0();
            }
        }
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
