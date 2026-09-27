package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class dc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.nl0, org.telegram.ui.Components.a91, org.telegram.ui.ActionBar.b2 {
    public final int f32933a;
    public final pd1 f32934b;

    public dc1(pd1 pd1Var, int i10) {
        this.f32933a = i10;
        this.f32934b = pd1Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            pd1 pd1Var = this.f32934b;
            if (i32) {
                if (u1Var.getMessageObject().isOutOwner()) {
                    pd1Var.Y0(3, true);
                    return;
                } else {
                    pd1Var.Y0(1, true);
                    return;
                }
            }
            pd1Var.Y0(2, true);
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        pd1 pd1Var = this.f32934b;
        if (!(pd1Var.B1 instanceof wi1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                pc1 pc1Var = pd1Var.f36390a;
                AndroidUtilities.calcDrawableColor(drawable);
                pc1Var.b(pd1Var.P0(drawable), drawable, Float.valueOf(pd1Var.l1));
                if (!z11 && pd1Var.F1 && pd1Var.f36450w1 == null) {
                    pd1Var.f36452x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    pd1Var.i1();
                    pd1Var.f36452x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                pd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean z10;
        switch (this.f32933a) {
            case 3:
                this.f32934b.f36440s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f32934b.O0(false);
                return;
            case 5:
                pd1 pd1Var = this.f32934b;
                org.telegram.ui.ActionBar.g6 g6Var = pd1Var.f36439s;
                if (g6Var.f18912j == 4294967296L) {
                    g6Var.f18912j = 0L;
                    g6Var.f18913k = 0L;
                    g6Var.f18914l = 0L;
                    g6Var.f18915m = 0L;
                    pd1Var.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                pd1Var.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                pd1Var.Y0(2, false);
                return;
            case 6:
                pd1 pd1Var2 = this.f32934b;
                org.telegram.ui.ActionBar.g6 g6Var2 = pd1Var2.f36439s;
                if (org.telegram.ui.ActionBar.i6.Z0() && org.telegram.ui.ActionBar.i6.I.f18963i0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = g6Var2.f18926y;
                    g6Var2.f18912j = b6Var.d;
                    g6Var2.f18913k = b6Var.e;
                    g6Var2.f18914l = b6Var.f18695f;
                    g6Var2.f18915m = b6Var.f18696g;
                    g6Var2.f18916n = b6Var.h;
                    String str = b6Var.f18694c;
                    g6Var2.f18917o = str;
                    float f7 = b6Var.f18699k;
                    g6Var2.f18918p = f7;
                    pd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = pd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) pd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && g6Var2.f18917o.equals(tL_wallPaper.slug)) {
                                    pd1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        pd1Var2.W0 = null;
                    }
                    pd1Var2.v = true;
                    org.telegram.ui.Components.z81 z81Var = pd1Var2.J0[1];
                    if (pd1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z81Var.a(z10, true);
                    pd1Var2.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                Drawable background = pd1Var2.f36452x0.getBackground();
                if (background instanceof org.telegram.ui.Components.nc0) {
                    org.telegram.ui.Components.nc0 nc0Var = (org.telegram.ui.Components.nc0) background;
                    nc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.i6.I.q()) {
                        if (pd1Var2.l1 < 0.0f) {
                            pd1Var2.f36452x0.getImageReceiver().setGradientBitmap(nc0Var.f26793k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = pd1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = pd1Var2.l1;
                        if (f10 < 0.0f) {
                            pd1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = pd1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(pd1Var2.l1);
                }
                org.telegram.ui.ActionBar.i6.p1(true);
                pd1Var2.Y0(2, false);
                return;
            default:
                pd1 pd1Var3 = this.f32934b;
                org.telegram.ui.ActionBar.g6 g6Var3 = pd1Var3.f36439s;
                if (g6Var3.f18912j == 4294967296L) {
                    g6Var3.f18912j = 0L;
                    g6Var3.f18913k = 0L;
                    g6Var3.f18914l = 0L;
                    g6Var3.f18915m = 0L;
                    pd1Var3.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                pd1Var3.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                pd1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void g(int i10, int i11) {
        pd1 pd1Var = this.f32934b;
        if (!pd1Var.E1) {
            return;
        }
        pd1Var.f36452x0.getBackground();
        float f7 = 1.0f;
        if (pd1Var.B0 != null) {
            f7 = (pd1Var.f36452x0.getScaleX() - 1.0f) / (pd1Var.f36456y1 - 1.0f);
        }
        pd1Var.f36452x0.setTranslationX(i10 * f7);
        pd1Var.f36452x0.setTranslationY(i11 * f7);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
