package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.bm0, org.telegram.ui.Components.n91, org.telegram.ui.ActionBar.z1 {
    public final int f37298a;
    public final qc1 f37299b;

    public fb1(qc1 qc1Var, int i10) {
        this.f37298a = i10;
        this.f37299b = qc1Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean h32 = t1Var.h3(f7);
            qc1 qc1Var = this.f37299b;
            if (h32) {
                if (t1Var.getMessageObject().isOutOwner()) {
                    qc1Var.Y0(3, true);
                    return;
                } else {
                    qc1Var.Y0(1, true);
                    return;
                }
            }
            qc1Var.Y0(2, true);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        qc1 qc1Var = this.f37299b;
        if (!(qc1Var.C1 instanceof zh1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                qb1 qb1Var = qc1Var.f40713a;
                AndroidUtilities.calcDrawableColor(drawable);
                qb1Var.j(qc1Var.O0(drawable), drawable, Float.valueOf(qc1Var.f40750m1));
                if (!z11 && qc1Var.G1 && qc1Var.f40777x1 == null) {
                    qc1Var.f40779y0.getImageReceiver().setCrossfadeWithOldImage(false);
                    qc1Var.i1();
                    qc1Var.f40779y0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                qc1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        qc1 qc1Var = this.f37299b;
        if (!qc1Var.F1) {
            return;
        }
        qc1Var.f40779y0.getBackground();
        float f7 = 1.0f;
        if (qc1Var.C0 != null) {
            f7 = (qc1Var.f40779y0.getScaleX() - 1.0f) / (qc1Var.f40782z1 - 1.0f);
        }
        qc1Var.f40779y0.setTranslationX(i10 * f7);
        qc1Var.f40779y0.setTranslationY(i11 * f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean z10;
        switch (this.f37298a) {
            case 3:
                this.f37299b.f40766t0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f37299b.N0(false);
                return;
            case 5:
                qc1 qc1Var = this.f37299b;
                org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
                if (i6Var.f20970j == 4294967296L) {
                    i6Var.f20970j = 0L;
                    i6Var.f20971k = 0L;
                    i6Var.f20972l = 0L;
                    i6Var.f20973m = 0L;
                    qc1Var.m1(false);
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                }
                qc1Var.f40772w = true;
                org.telegram.ui.ActionBar.k6.s1(true);
                qc1Var.Y0(2, false);
                return;
            case 6:
                qc1 qc1Var2 = this.f37299b;
                org.telegram.ui.ActionBar.i6 i6Var2 = qc1Var2.v;
                if (org.telegram.ui.ActionBar.k6.b1() && org.telegram.ui.ActionBar.k6.I.f21031i0.d != 0) {
                    org.telegram.ui.ActionBar.d6 d6Var = i6Var2.f20984y;
                    i6Var2.f20970j = d6Var.d;
                    i6Var2.f20971k = d6Var.e;
                    i6Var2.f20972l = d6Var.f20818f;
                    i6Var2.f20973m = d6Var.f20819g;
                    i6Var2.f20974n = d6Var.h;
                    String str = d6Var.f20817c;
                    i6Var2.f20975o = str;
                    float f7 = d6Var.f20822k;
                    i6Var2.f20976p = f7;
                    qc1Var2.f40750m1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = qc1Var2.V0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) qc1Var2.V0.get(i11);
                                if (tL_wallPaper.pattern && i6Var2.f20975o.equals(tL_wallPaper.slug)) {
                                    qc1Var2.X0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        qc1Var2.X0 = null;
                    }
                    qc1Var2.f40772w = true;
                    org.telegram.ui.Components.m91 m91Var = qc1Var2.K0[1];
                    if (qc1Var2.X0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m91Var.a(z10, true);
                    qc1Var2.m1(false);
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                }
                Drawable background = qc1Var2.f40779y0.getBackground();
                if (background instanceof org.telegram.ui.Components.yc0) {
                    org.telegram.ui.Components.yc0 yc0Var = (org.telegram.ui.Components.yc0) background;
                    yc0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (qc1Var2.f40750m1 < 0.0f) {
                            qc1Var2.f40779y0.getImageReceiver().setGradientBitmap(yc0Var.f32887k);
                        }
                        org.telegram.ui.Cells.i0 i0Var = qc1Var2.U0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = qc1Var2.f40750m1;
                        if (f10 < 0.0f) {
                            qc1Var2.f40750m1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.i0 i0Var2 = qc1Var2.U0;
                if (i0Var2 != null) {
                    i0Var2.setProgress(qc1Var2.f40750m1);
                }
                org.telegram.ui.ActionBar.k6.s1(true);
                qc1Var2.Y0(2, false);
                return;
            default:
                qc1 qc1Var3 = this.f37299b;
                org.telegram.ui.ActionBar.i6 i6Var3 = qc1Var3.v;
                if (i6Var3.f20970j == 4294967296L) {
                    i6Var3.f20970j = 0L;
                    i6Var3.f20971k = 0L;
                    i6Var3.f20972l = 0L;
                    i6Var3.f20973m = 0L;
                    qc1Var3.m1(false);
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                }
                qc1Var3.f40772w = true;
                org.telegram.ui.ActionBar.k6.s1(true);
                qc1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
