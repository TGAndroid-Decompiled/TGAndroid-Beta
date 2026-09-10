package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class pc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.kl0, org.telegram.ui.Components.x81, org.telegram.ui.ActionBar.c2 {
    public final int f35789a;
    public final ae1 f35790b;

    public pc1(ae1 ae1Var, int i10) {
        this.f35789a = i10;
        this.f35790b = ae1Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f7);
            ae1 ae1Var = this.f35790b;
            if (i32) {
                if (t1Var.getMessageObject().isOutOwner()) {
                    ae1Var.Y0(3, true);
                    return;
                } else {
                    ae1Var.Y0(1, true);
                    return;
                }
            }
            ae1Var.Y0(2, true);
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ae1 ae1Var = this.f35790b;
        if (!(ae1Var.B1 instanceof kj1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                ad1 ad1Var = ae1Var.f30914a;
                AndroidUtilities.calcDrawableColor(drawable);
                ad1Var.b(ae1Var.P0(drawable), drawable, Float.valueOf(ae1Var.l1));
                if (!z11 && ae1Var.F1 && ae1Var.f30974w1 == null) {
                    ae1Var.f30976x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    ae1Var.i1();
                    ae1Var.f30976x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                ae1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean z10;
        switch (this.f35789a) {
            case 3:
                this.f35790b.f30964s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f35790b.O0(false);
                return;
            case 5:
                ae1 ae1Var = this.f35790b;
                org.telegram.ui.ActionBar.h6 h6Var = ae1Var.f30963s;
                if (h6Var.f17798j == 4294967296L) {
                    h6Var.f17798j = 0L;
                    h6Var.f17799k = 0L;
                    h6Var.f17800l = 0L;
                    h6Var.f17801m = 0L;
                    ae1Var.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                ae1Var.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                ae1Var.Y0(2, false);
                return;
            case 6:
                ae1 ae1Var2 = this.f35790b;
                org.telegram.ui.ActionBar.h6 h6Var2 = ae1Var2.f30963s;
                if (org.telegram.ui.ActionBar.j6.Z0() && org.telegram.ui.ActionBar.j6.I.f17846i0.d != 0) {
                    org.telegram.ui.ActionBar.c6 c6Var = h6Var2.f17812y;
                    h6Var2.f17798j = c6Var.d;
                    h6Var2.f17799k = c6Var.e;
                    h6Var2.f17800l = c6Var.f17578f;
                    h6Var2.f17801m = c6Var.f17579g;
                    h6Var2.f17802n = c6Var.h;
                    String str = c6Var.f17577c;
                    h6Var2.f17803o = str;
                    float f7 = c6Var.f17582k;
                    h6Var2.f17804p = f7;
                    ae1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = ae1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) ae1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && h6Var2.f17803o.equals(tL_wallPaper.slug)) {
                                    ae1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        ae1Var2.W0 = null;
                    }
                    ae1Var2.v = true;
                    org.telegram.ui.Components.w81 w81Var = ae1Var2.J0[1];
                    if (ae1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w81Var.a(z10, true);
                    ae1Var2.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                Drawable background = ae1Var2.f30976x0.getBackground();
                if (background instanceof org.telegram.ui.Components.lc0) {
                    org.telegram.ui.Components.lc0 lc0Var = (org.telegram.ui.Components.lc0) background;
                    lc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (ae1Var2.l1 < 0.0f) {
                            ae1Var2.f30976x0.getImageReceiver().setGradientBitmap(lc0Var.f24949k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = ae1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = ae1Var2.l1;
                        if (f10 < 0.0f) {
                            ae1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = ae1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(ae1Var2.l1);
                }
                org.telegram.ui.ActionBar.j6.p1(true);
                ae1Var2.Y0(2, false);
                return;
            default:
                ae1 ae1Var3 = this.f35790b;
                org.telegram.ui.ActionBar.h6 h6Var3 = ae1Var3.f30963s;
                if (h6Var3.f17798j == 4294967296L) {
                    h6Var3.f17798j = 0L;
                    h6Var3.f17799k = 0L;
                    h6Var3.f17800l = 0L;
                    h6Var3.f17801m = 0L;
                    ae1Var3.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                ae1Var3.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                ae1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void g(int i10, int i11) {
        ae1 ae1Var = this.f35790b;
        if (!ae1Var.E1) {
            return;
        }
        ae1Var.f30976x0.getBackground();
        float f7 = 1.0f;
        if (ae1Var.B0 != null) {
            f7 = (ae1Var.f30976x0.getScaleX() - 1.0f) / (ae1Var.f30980y1 - 1.0f);
        }
        ae1Var.f30976x0.setTranslationX(i10 * f7);
        ae1Var.f30976x0.setTranslationY(i11 * f7);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
