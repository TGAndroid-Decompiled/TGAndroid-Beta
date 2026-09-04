package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class lc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.al0, org.telegram.ui.Components.k81, org.telegram.ui.ActionBar.a2 {
    public final int f38301a;
    public final wd1 f38302b;

    public lc1(wd1 wd1Var, int i10) {
        this.f38301a = i10;
        this.f38302b = wd1Var;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f7);
            wd1 wd1Var = this.f38302b;
            if (i32) {
                if (t1Var.getMessageObject().isOutOwner()) {
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
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        wd1 wd1Var = this.f38302b;
        if (!(wd1Var.B1 instanceof gj1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                wc1 wc1Var = wd1Var.f41914a;
                AndroidUtilities.calcDrawableColor(drawable);
                wc1Var.b(wd1Var.P0(drawable), drawable, Float.valueOf(wd1Var.l1));
                if (!z11 && wd1Var.F1 && wd1Var.f41975w1 == null) {
                    wd1Var.f41977x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    wd1Var.i1();
                    wd1Var.f41977x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                wd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        switch (this.f38301a) {
            case 3:
                this.f38302b.f41965s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f38302b.O0(false);
                return;
            case 5:
                wd1 wd1Var = this.f38302b;
                org.telegram.ui.ActionBar.h6 h6Var = wd1Var.f41964s;
                if (h6Var.f20497j == 4294967296L) {
                    h6Var.f20497j = 0L;
                    h6Var.f20498k = 0L;
                    h6Var.f20499l = 0L;
                    h6Var.f20500m = 0L;
                    wd1Var.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                wd1Var.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                wd1Var.Y0(2, false);
                return;
            case 6:
                wd1 wd1Var2 = this.f38302b;
                org.telegram.ui.ActionBar.h6 h6Var2 = wd1Var2.f41964s;
                if (org.telegram.ui.ActionBar.j6.Z0() && org.telegram.ui.ActionBar.j6.I.f20553i0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = h6Var2.f20511y;
                    h6Var2.f20497j = b6Var.d;
                    h6Var2.f20498k = b6Var.f20277e;
                    h6Var2.f20499l = b6Var.f20278f;
                    h6Var2.f20500m = b6Var.f20279g;
                    h6Var2.f20501n = b6Var.h;
                    String str = b6Var.f20276c;
                    h6Var2.f20502o = str;
                    float f7 = b6Var.f20282k;
                    h6Var2.f20503p = f7;
                    wd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = wd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && h6Var2.f20502o.equals(tL_wallPaper.slug)) {
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
                    org.telegram.ui.Components.j81 j81Var = wd1Var2.J0[1];
                    if (wd1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j81Var.a(z10, true);
                    wd1Var2.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                Drawable background = wd1Var2.f41977x0.getBackground();
                if (background instanceof org.telegram.ui.Components.dc0) {
                    org.telegram.ui.Components.dc0 dc0Var = (org.telegram.ui.Components.dc0) background;
                    dc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (wd1Var2.l1 < 0.0f) {
                            wd1Var2.f41977x0.getImageReceiver().setGradientBitmap(dc0Var.f25353k);
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
                org.telegram.ui.ActionBar.j6.p1(true);
                wd1Var2.Y0(2, false);
                return;
            default:
                wd1 wd1Var3 = this.f38302b;
                org.telegram.ui.ActionBar.h6 h6Var3 = wd1Var3.f41964s;
                if (h6Var3.f20497j == 4294967296L) {
                    h6Var3.f20497j = 0L;
                    h6Var3.f20498k = 0L;
                    h6Var3.f20499l = 0L;
                    h6Var3.f20500m = 0L;
                    wd1Var3.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                wd1Var3.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                wd1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void h(int i10, int i11) {
        wd1 wd1Var = this.f38302b;
        if (!wd1Var.E1) {
            return;
        }
        wd1Var.f41977x0.getBackground();
        float f7 = 1.0f;
        if (wd1Var.B0 != null) {
            f7 = (wd1Var.f41977x0.getScaleX() - 1.0f) / (wd1Var.f41981y1 - 1.0f);
        }
        wd1Var.f41977x0.setTranslationX(i10 * f7);
        wd1Var.f41977x0.setTranslationY(i11 * f7);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
