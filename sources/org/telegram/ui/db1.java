package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class db1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.al0, org.telegram.ui.Components.b81, org.telegram.ui.ActionBar.b2 {
    public final int f37489a;
    public final qc1 f37490b;

    public db1(qc1 qc1Var, int i10) {
        this.f37489a = i10;
        this.f37490b = qc1Var;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            boolean i32 = s1Var.i3(f9);
            qc1 qc1Var = this.f37490b;
            if (i32) {
                if (s1Var.getMessageObject().isOutOwner()) {
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
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        qc1 qc1Var = this.f37490b;
        if (!(qc1Var.f41683x1 instanceof zh1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                pb1 pb1Var = qc1Var.f41623a;
                AndroidUtilities.calcDrawableColor(drawable);
                pb1Var.b(qc1Var.P0(drawable), drawable, Float.valueOf(qc1Var.f41648h1));
                if (!z11 && qc1Var.B1 && qc1Var.f41671s1 == null) {
                    qc1Var.f41672t0.getImageReceiver().setCrossfadeWithOldImage(false);
                    qc1Var.i1();
                    qc1Var.f41672t0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                qc1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        qc1 qc1Var = this.f37490b;
        if (!qc1Var.A1) {
            return;
        }
        qc1Var.f41672t0.getBackground();
        float f9 = 1.0f;
        if (qc1Var.f41682x0 != null) {
            f9 = (qc1Var.f41672t0.getScaleX() - 1.0f) / (qc1Var.f41675u1 - 1.0f);
        }
        qc1Var.f41672t0.setTranslationX(i10 * f9);
        qc1Var.f41672t0.setTranslationY(i11 * f9);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean z10;
        switch (this.f37489a) {
            case 3:
                this.f37490b.f41660o0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f37490b.O0(false);
                return;
            case 5:
                qc1 qc1Var = this.f37490b;
                org.telegram.ui.ActionBar.e6 e6Var = qc1Var.f41669s;
                if (e6Var.f22909j == 4294967296L) {
                    e6Var.f22909j = 0L;
                    e6Var.f22910k = 0L;
                    e6Var.f22911l = 0L;
                    e6Var.f22912m = 0L;
                    qc1Var.m1(false);
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                }
                qc1Var.v = true;
                org.telegram.ui.ActionBar.g6.p1(true);
                qc1Var.Y0(2, false);
                return;
            case 6:
                qc1 qc1Var2 = this.f37490b;
                org.telegram.ui.ActionBar.e6 e6Var2 = qc1Var2.f41669s;
                if (org.telegram.ui.ActionBar.g6.Z0() && org.telegram.ui.ActionBar.g6.I.f22949e0.d != 0) {
                    org.telegram.ui.ActionBar.z5 z5Var = e6Var2.f22923y;
                    e6Var2.f22909j = z5Var.d;
                    e6Var2.f22910k = z5Var.f24021e;
                    e6Var2.f22911l = z5Var.f24022f;
                    e6Var2.f22912m = z5Var.f24023g;
                    e6Var2.f22913n = z5Var.h;
                    String str = z5Var.f24020c;
                    e6Var2.f22914o = str;
                    float f9 = z5Var.f24026k;
                    e6Var2.f22915p = f9;
                    qc1Var2.f41648h1 = f9;
                    if (str != null && !"c".equals(str)) {
                        int size = qc1Var2.Q0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) qc1Var2.Q0.get(i11);
                                if (tL_wallPaper.pattern && e6Var2.f22914o.equals(tL_wallPaper.slug)) {
                                    qc1Var2.S0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        qc1Var2.S0 = null;
                    }
                    qc1Var2.v = true;
                    org.telegram.ui.Components.a81 a81Var = qc1Var2.F0[1];
                    if (qc1Var2.S0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a81Var.a(z10, true);
                    qc1Var2.m1(false);
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                }
                Drawable background = qc1Var2.f41672t0.getBackground();
                if (background instanceof org.telegram.ui.Components.yb0) {
                    org.telegram.ui.Components.yb0 yb0Var = (org.telegram.ui.Components.yb0) background;
                    yb0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.g6.I.q()) {
                        if (qc1Var2.f41648h1 < 0.0f) {
                            qc1Var2.f41672t0.getImageReceiver().setGradientBitmap(yb0Var.f35026k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = qc1Var2.P0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = qc1Var2.f41648h1;
                        if (f10 < 0.0f) {
                            qc1Var2.f41648h1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = qc1Var2.P0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(qc1Var2.f41648h1);
                }
                org.telegram.ui.ActionBar.g6.p1(true);
                qc1Var2.Y0(2, false);
                return;
            default:
                qc1 qc1Var3 = this.f37490b;
                org.telegram.ui.ActionBar.e6 e6Var3 = qc1Var3.f41669s;
                if (e6Var3.f22909j == 4294967296L) {
                    e6Var3.f22909j = 0L;
                    e6Var3.f22910k = 0L;
                    e6Var3.f22911l = 0L;
                    e6Var3.f22912m = 0L;
                    qc1Var3.m1(false);
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                }
                qc1Var3.v = true;
                org.telegram.ui.ActionBar.g6.p1(true);
                qc1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
