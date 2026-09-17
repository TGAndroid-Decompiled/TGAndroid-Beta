package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.bl0, org.telegram.ui.Components.l81, org.telegram.ui.ActionBar.b2 {
    public final int f35762a;
    public final xd1 f35763b;

    public mc1(xd1 xd1Var, int i10) {
        this.f35762a = i10;
        this.f35763b = xd1Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f7);
            xd1 xd1Var = this.f35763b;
            if (i32) {
                if (t1Var.getMessageObject().isOutOwner()) {
                    xd1Var.Y0(3, true);
                    return;
                } else {
                    xd1Var.Y0(1, true);
                    return;
                }
            }
            xd1Var.Y0(2, true);
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xd1 xd1Var = this.f35763b;
        if (!(xd1Var.B1 instanceof fj1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                xc1 xc1Var = xd1Var.f39531a;
                AndroidUtilities.calcDrawableColor(drawable);
                xc1Var.b(xd1Var.P0(drawable), drawable, Float.valueOf(xd1Var.l1));
                if (!z11 && xd1Var.F1 && xd1Var.f39591w1 == null) {
                    xd1Var.f39593x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    xd1Var.i1();
                    xd1Var.f39593x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                xd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        xd1 xd1Var = this.f35763b;
        if (!xd1Var.E1) {
            return;
        }
        xd1Var.f39593x0.getBackground();
        float f7 = 1.0f;
        if (xd1Var.B0 != null) {
            f7 = (xd1Var.f39593x0.getScaleX() - 1.0f) / (xd1Var.f39597y1 - 1.0f);
        }
        xd1Var.f39593x0.setTranslationX(i10 * f7);
        xd1Var.f39593x0.setTranslationY(i11 * f7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean z10;
        switch (this.f35762a) {
            case 3:
                this.f35763b.f39581s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f35763b.O0(false);
                return;
            case 5:
                xd1 xd1Var = this.f35763b;
                org.telegram.ui.ActionBar.h6 h6Var = xd1Var.f39580s;
                if (h6Var.f18726j == 4294967296L) {
                    h6Var.f18726j = 0L;
                    h6Var.f18727k = 0L;
                    h6Var.f18728l = 0L;
                    h6Var.f18729m = 0L;
                    xd1Var.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                xd1Var.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                xd1Var.Y0(2, false);
                return;
            case 6:
                xd1 xd1Var2 = this.f35763b;
                org.telegram.ui.ActionBar.h6 h6Var2 = xd1Var2.f39580s;
                if (org.telegram.ui.ActionBar.j6.Z0() && org.telegram.ui.ActionBar.j6.I.f18768i0.d != 0) {
                    org.telegram.ui.ActionBar.c6 c6Var = h6Var2.f18740y;
                    h6Var2.f18726j = c6Var.d;
                    h6Var2.f18727k = c6Var.e;
                    h6Var2.f18728l = c6Var.f18540f;
                    h6Var2.f18729m = c6Var.f18541g;
                    h6Var2.f18730n = c6Var.h;
                    String str = c6Var.f18539c;
                    h6Var2.f18731o = str;
                    float f7 = c6Var.f18544k;
                    h6Var2.f18732p = f7;
                    xd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = xd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) xd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && h6Var2.f18731o.equals(tL_wallPaper.slug)) {
                                    xd1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        xd1Var2.W0 = null;
                    }
                    xd1Var2.v = true;
                    org.telegram.ui.Components.k81 k81Var = xd1Var2.J0[1];
                    if (xd1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    k81Var.a(z10, true);
                    xd1Var2.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                Drawable background = xd1Var2.f39593x0.getBackground();
                if (background instanceof org.telegram.ui.Components.cc0) {
                    org.telegram.ui.Components.cc0 cc0Var = (org.telegram.ui.Components.cc0) background;
                    cc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (xd1Var2.l1 < 0.0f) {
                            xd1Var2.f39593x0.getImageReceiver().setGradientBitmap(cc0Var.f23006k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = xd1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = xd1Var2.l1;
                        if (f10 < 0.0f) {
                            xd1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = xd1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(xd1Var2.l1);
                }
                org.telegram.ui.ActionBar.j6.p1(true);
                xd1Var2.Y0(2, false);
                return;
            default:
                xd1 xd1Var3 = this.f35763b;
                org.telegram.ui.ActionBar.h6 h6Var3 = xd1Var3.f39580s;
                if (h6Var3.f18726j == 4294967296L) {
                    h6Var3.f18726j = 0L;
                    h6Var3.f18727k = 0L;
                    h6Var3.f18728l = 0L;
                    h6Var3.f18729m = 0L;
                    xd1Var3.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                xd1Var3.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                xd1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
