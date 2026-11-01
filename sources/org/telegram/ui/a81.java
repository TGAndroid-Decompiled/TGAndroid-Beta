package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class a81 implements org.telegram.messenger.nc, org.telegram.ui.Components.ik0, org.telegram.ui.Components.z71, org.telegram.ui.ActionBar.u1 {
    public final int f35713a;
    public final k91 f35714b;

    public a81(k91 k91Var, int i10) {
        this.f35713a = i10;
        this.f35714b = k91Var;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean y22 = q1Var.y2(f7);
            k91 k91Var = this.f35714b;
            if (y22) {
                if (q1Var.getMessageObject().P3()) {
                    k91Var.d1(3, true);
                    return;
                } else {
                    k91Var.d1(1, true);
                    return;
                }
            }
            k91Var.d1(2, true);
        }
    }

    @Override
    public void e(int i10, int i11) {
        k91 k91Var = this.f35714b;
        if (!k91Var.F1) {
            return;
        }
        k91Var.f38778y0.getBackground();
        float f7 = 1.0f;
        if (k91Var.C0 != null) {
            f7 = (k91Var.f38778y0.getScaleX() - 1.0f) / (k91Var.f38781z1 - 1.0f);
        }
        k91Var.f38778y0.setTranslationX(i10 * f7);
        k91Var.f38778y0.setTranslationY(i11 * f7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        boolean z10;
        switch (this.f35713a) {
            case 3:
                this.f35714b.f38765t0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f35714b.S0(false);
                return;
            case 5:
                k91 k91Var = this.f35714b;
                org.telegram.ui.ActionBar.r6 r6Var = k91Var.f38771w;
                if (r6Var.f20737j == 4294967296L) {
                    r6Var.f20737j = 0L;
                    r6Var.f20738k = 0L;
                    r6Var.f20739l = 0L;
                    r6Var.f20740m = 0L;
                    k91Var.r1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                k91Var.f38774x = true;
                org.telegram.ui.ActionBar.t6.v1(true);
                k91Var.d1(2, false);
                return;
            case 6:
                k91 k91Var2 = this.f35714b;
                org.telegram.ui.ActionBar.r6 r6Var2 = k91Var2.f38771w;
                if (org.telegram.ui.ActionBar.t6.c1() && org.telegram.ui.ActionBar.t6.I.f20814i0.d != 0) {
                    org.telegram.ui.ActionBar.m6 m6Var = r6Var2.f20751y;
                    r6Var2.f20737j = m6Var.d;
                    r6Var2.f20738k = m6Var.e;
                    r6Var2.f20739l = m6Var.f20592f;
                    r6Var2.f20740m = m6Var.f20593g;
                    r6Var2.f20741n = m6Var.h;
                    String str = m6Var.f20591c;
                    r6Var2.f20742o = str;
                    float f7 = m6Var.f20596k;
                    r6Var2.f20743p = f7;
                    k91Var2.f38749m1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = k91Var2.V0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) k91Var2.V0.get(i11);
                                if (tL_wallPaper.pattern && r6Var2.f20742o.equals(tL_wallPaper.slug)) {
                                    k91Var2.X0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        k91Var2.X0 = null;
                    }
                    k91Var2.f38774x = true;
                    org.telegram.ui.Components.y71 y71Var = k91Var2.K0[1];
                    if (k91Var2.X0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    y71Var.a(z10, true);
                    k91Var2.r1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                Drawable background = k91Var2.f38778y0.getBackground();
                if (background instanceof org.telegram.ui.Components.jb0) {
                    org.telegram.ui.Components.jb0 jb0Var = (org.telegram.ui.Components.jb0) background;
                    jb0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.t6.I.q()) {
                        if (k91Var2.f38749m1 < 0.0f) {
                            k91Var2.f38778y0.getImageReceiver().m0(jb0Var.f27342k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = k91Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = k91Var2.f38749m1;
                        if (f10 < 0.0f) {
                            k91Var2.f38749m1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = k91Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(k91Var2.f38749m1);
                }
                org.telegram.ui.ActionBar.t6.v1(true);
                k91Var2.d1(2, false);
                return;
            default:
                k91 k91Var3 = this.f35714b;
                org.telegram.ui.ActionBar.r6 r6Var3 = k91Var3.f38771w;
                if (r6Var3.f20737j == 4294967296L) {
                    r6Var3.f20737j = 0L;
                    r6Var3.f20738k = 0L;
                    r6Var3.f20739l = 0L;
                    r6Var3.f20740m = 0L;
                    k91Var3.r1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                k91Var3.f38774x = true;
                org.telegram.ui.ActionBar.t6.v1(true);
                k91Var3.d1(2, false);
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        k91 k91Var = this.f35714b;
        if (!(k91Var.C1 instanceof ke1)) {
            Drawable t10 = imageReceiver.t();
            if (z10 && t10 != null) {
                l81 l81Var = k91Var.f38712a;
                org.telegram.messenger.i0.q(t10);
                l81Var.k(k91Var.T0(t10), t10, Float.valueOf(k91Var.f38749m1));
                if (!z11 && k91Var.G1 && k91Var.f38776x1 == null) {
                    k91Var.f38778y0.getImageReceiver().A0 = false;
                    k91Var.n1();
                    k91Var.f38778y0.getImageReceiver().A0 = true;
                }
                k91Var.a1();
            }
        }
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void s(int i10, Drawable drawable) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
