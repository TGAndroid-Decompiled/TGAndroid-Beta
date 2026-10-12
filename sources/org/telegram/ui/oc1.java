package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class oc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.lm0, org.telegram.ui.Components.w91, org.telegram.ui.ActionBar.z1 {
    public final int f40647a;
    public final zd1 f40648b;

    public oc1(zd1 zd1Var, int i10) {
        this.f40647a = i10;
        this.f40648b = zd1Var;
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
            zd1 zd1Var = this.f40648b;
            if (i32) {
                if (u1Var.getMessageObject().isOutOwner()) {
                    zd1Var.Y0(3, true);
                    return;
                } else {
                    zd1Var.Y0(1, true);
                    return;
                }
            }
            zd1Var.Y0(2, true);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        zd1 zd1Var = this.f40648b;
        if (!(zd1Var.B1 instanceof jj1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                zc1 zc1Var = zd1Var.f44729a;
                AndroidUtilities.calcDrawableColor(drawable);
                zc1Var.b(zd1Var.P0(drawable), drawable, Float.valueOf(zd1Var.l1));
                if (!z11 && zd1Var.F1 && zd1Var.f44790w1 == null) {
                    zd1Var.f44792x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    zd1Var.i1();
                    zd1Var.f44792x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                zd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        zd1 zd1Var = this.f40648b;
        if (!zd1Var.E1) {
            return;
        }
        zd1Var.f44792x0.getBackground();
        float f7 = 1.0f;
        if (zd1Var.B0 != null) {
            f7 = (zd1Var.f44792x0.getScaleX() - 1.0f) / (zd1Var.f44796y1 - 1.0f);
        }
        zd1Var.f44792x0.setTranslationX(i10 * f7);
        zd1Var.f44792x0.setTranslationY(i11 * f7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10;
        switch (this.f40647a) {
            case 3:
                this.f40648b.f44780s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f40648b.O0(false);
                return;
            case 5:
                zd1 zd1Var = this.f40648b;
                org.telegram.ui.ActionBar.e6 e6Var = zd1Var.f44779s;
                if (e6Var.f20356j == 4294967296L) {
                    e6Var.f20356j = 0L;
                    e6Var.f20357k = 0L;
                    e6Var.f20358l = 0L;
                    e6Var.f20359m = 0L;
                    zd1Var.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                zd1Var.v = true;
                org.telegram.ui.ActionBar.h6.q1(true);
                zd1Var.Y0(2, false);
                return;
            case 6:
                zd1 zd1Var2 = this.f40648b;
                org.telegram.ui.ActionBar.e6 e6Var2 = zd1Var2.f44779s;
                if (org.telegram.ui.ActionBar.h6.a1() && org.telegram.ui.ActionBar.h6.I.f20441i0.d != 0) {
                    org.telegram.ui.ActionBar.z5 z5Var = e6Var2.f20370y;
                    e6Var2.f20356j = z5Var.d;
                    e6Var2.f20357k = z5Var.f21498e;
                    e6Var2.f20358l = z5Var.f21499f;
                    e6Var2.f20359m = z5Var.f21500g;
                    e6Var2.f20360n = z5Var.h;
                    String str = z5Var.f21497c;
                    e6Var2.f20361o = str;
                    float f7 = z5Var.f21503k;
                    e6Var2.f20362p = f7;
                    zd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = zd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) zd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && e6Var2.f20361o.equals(tL_wallPaper.slug)) {
                                    zd1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        zd1Var2.W0 = null;
                    }
                    zd1Var2.v = true;
                    org.telegram.ui.Components.v91 v91Var = zd1Var2.J0[1];
                    if (zd1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v91Var.a(z10, true);
                    zd1Var2.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                Drawable background = zd1Var2.f44792x0.getBackground();
                if (background instanceof org.telegram.ui.Components.gd0) {
                    org.telegram.ui.Components.gd0 gd0Var = (org.telegram.ui.Components.gd0) background;
                    gd0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.h6.I.q()) {
                        if (zd1Var2.l1 < 0.0f) {
                            zd1Var2.f44792x0.getImageReceiver().setGradientBitmap(gd0Var.f26407k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = zd1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = zd1Var2.l1;
                        if (f10 < 0.0f) {
                            zd1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = zd1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(zd1Var2.l1);
                }
                org.telegram.ui.ActionBar.h6.q1(true);
                zd1Var2.Y0(2, false);
                return;
            default:
                zd1 zd1Var3 = this.f40648b;
                org.telegram.ui.ActionBar.e6 e6Var3 = zd1Var3.f44779s;
                if (e6Var3.f20356j == 4294967296L) {
                    e6Var3.f20356j = 0L;
                    e6Var3.f20357k = 0L;
                    e6Var3.f20358l = 0L;
                    e6Var3.f20359m = 0L;
                    zd1Var3.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                zd1Var3.v = true;
                org.telegram.ui.ActionBar.h6.q1(true);
                zd1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
