package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class lc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.gm0, org.telegram.ui.Components.r91, org.telegram.ui.ActionBar.z1 {
    public final int f39624a;
    public final wd1 f39625b;

    public lc1(wd1 wd1Var, int i10) {
        this.f39624a = i10;
        this.f39625b = wd1Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            wd1 wd1Var = this.f39625b;
            if (i32) {
                if (u1Var.getMessageObject().isOutOwner()) {
                    wd1Var.Y0(3, true);
                    return;
                } else {
                    wd1Var.Y0(1, true);
                    return;
                }
            }
            wd1Var.Y0(2, true);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        wd1 wd1Var = this.f39625b;
        if (!(wd1Var.B1 instanceof gj1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                wc1 wc1Var = wd1Var.f43359a;
                AndroidUtilities.calcDrawableColor(drawable);
                wc1Var.b(wd1Var.P0(drawable), drawable, Float.valueOf(wd1Var.l1));
                if (!z11 && wd1Var.F1 && wd1Var.f43420w1 == null) {
                    wd1Var.f43422x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    wd1Var.i1();
                    wd1Var.f43422x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                wd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        wd1 wd1Var = this.f39625b;
        if (!wd1Var.E1) {
            return;
        }
        wd1Var.f43422x0.getBackground();
        float f7 = 1.0f;
        if (wd1Var.B0 != null) {
            f7 = (wd1Var.f43422x0.getScaleX() - 1.0f) / (wd1Var.f43426y1 - 1.0f);
        }
        wd1Var.f43422x0.setTranslationX(i10 * f7);
        wd1Var.f43422x0.setTranslationY(i11 * f7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10;
        switch (this.f39624a) {
            case 3:
                this.f39625b.f43410s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f39625b.O0(false);
                return;
            case 5:
                wd1 wd1Var = this.f39625b;
                org.telegram.ui.ActionBar.f6 f6Var = wd1Var.f43409s;
                if (f6Var.f20649j == 4294967296L) {
                    f6Var.f20649j = 0L;
                    f6Var.f20650k = 0L;
                    f6Var.f20651l = 0L;
                    f6Var.f20652m = 0L;
                    wd1Var.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                wd1Var.v = true;
                org.telegram.ui.ActionBar.h6.q1(true);
                wd1Var.Y0(2, false);
                return;
            case 6:
                wd1 wd1Var2 = this.f39625b;
                org.telegram.ui.ActionBar.f6 f6Var2 = wd1Var2.f43409s;
                if (org.telegram.ui.ActionBar.h6.a1() && org.telegram.ui.ActionBar.h6.I.f20704i0.d != 0) {
                    org.telegram.ui.ActionBar.z5 z5Var = f6Var2.f20663y;
                    f6Var2.f20649j = z5Var.d;
                    f6Var2.f20650k = z5Var.f21760e;
                    f6Var2.f20651l = z5Var.f21761f;
                    f6Var2.f20652m = z5Var.f21762g;
                    f6Var2.f20653n = z5Var.h;
                    String str = z5Var.f21759c;
                    f6Var2.f20654o = str;
                    float f7 = z5Var.f21765k;
                    f6Var2.f20655p = f7;
                    wd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = wd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && f6Var2.f20654o.equals(tL_wallPaper.slug)) {
                                    wd1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        wd1Var2.W0 = null;
                    }
                    wd1Var2.v = true;
                    org.telegram.ui.Components.q91 q91Var = wd1Var2.J0[1];
                    if (wd1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q91Var.a(z10, true);
                    wd1Var2.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                Drawable background = wd1Var2.f43422x0.getBackground();
                if (background instanceof org.telegram.ui.Components.cd0) {
                    org.telegram.ui.Components.cd0 cd0Var = (org.telegram.ui.Components.cd0) background;
                    cd0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.h6.I.q()) {
                        if (wd1Var2.l1 < 0.0f) {
                            wd1Var2.f43422x0.getImageReceiver().setGradientBitmap(cd0Var.f25305k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = wd1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = wd1Var2.l1;
                        if (f10 < 0.0f) {
                            wd1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = wd1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(wd1Var2.l1);
                }
                org.telegram.ui.ActionBar.h6.q1(true);
                wd1Var2.Y0(2, false);
                return;
            default:
                wd1 wd1Var3 = this.f39625b;
                org.telegram.ui.ActionBar.f6 f6Var3 = wd1Var3.f43409s;
                if (f6Var3.f20649j == 4294967296L) {
                    f6Var3.f20649j = 0L;
                    f6Var3.f20650k = 0L;
                    f6Var3.f20651l = 0L;
                    f6Var3.f20652m = 0L;
                    wd1Var3.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                wd1Var3.v = true;
                org.telegram.ui.ActionBar.h6.q1(true);
                wd1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
