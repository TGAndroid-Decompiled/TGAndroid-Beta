package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.fm0, org.telegram.ui.Components.q91, org.telegram.ui.ActionBar.a2 {
    public final int f39834a;
    public final xd1 f39835b;

    public mc1(xd1 xd1Var, int i10) {
        this.f39834a = i10;
        this.f39835b = xd1Var;
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
            xd1 xd1Var = this.f39835b;
            if (i32) {
                if (u1Var.getMessageObject().isOutOwner()) {
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
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xd1 xd1Var = this.f39835b;
        if (!(xd1Var.B1 instanceof ij1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                xc1 xc1Var = xd1Var.f43935a;
                AndroidUtilities.calcDrawableColor(drawable);
                xc1Var.b(xd1Var.P0(drawable), drawable, Float.valueOf(xd1Var.l1));
                if (!z11 && xd1Var.F1 && xd1Var.f43996w1 == null) {
                    xd1Var.f43998x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    xd1Var.i1();
                    xd1Var.f43998x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                xd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        xd1 xd1Var = this.f39835b;
        if (!xd1Var.E1) {
            return;
        }
        xd1Var.f43998x0.getBackground();
        float f7 = 1.0f;
        if (xd1Var.B0 != null) {
            f7 = (xd1Var.f43998x0.getScaleX() - 1.0f) / (xd1Var.f44002y1 - 1.0f);
        }
        xd1Var.f43998x0.setTranslationX(i10 * f7);
        xd1Var.f43998x0.setTranslationY(i11 * f7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        switch (this.f39834a) {
            case 3:
                this.f39835b.f43986s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f39835b.O0(false);
                return;
            case 5:
                xd1 xd1Var = this.f39835b;
                org.telegram.ui.ActionBar.g6 g6Var = xd1Var.f43985s;
                if (g6Var.f20660j == 4294967296L) {
                    g6Var.f20660j = 0L;
                    g6Var.f20661k = 0L;
                    g6Var.f20662l = 0L;
                    g6Var.f20663m = 0L;
                    xd1Var.m1(false);
                    org.telegram.ui.ActionBar.i6.o1(false, false);
                }
                xd1Var.v = true;
                org.telegram.ui.ActionBar.i6.q1(true);
                xd1Var.Y0(2, false);
                return;
            case 6:
                xd1 xd1Var2 = this.f39835b;
                org.telegram.ui.ActionBar.g6 g6Var2 = xd1Var2.f43985s;
                if (org.telegram.ui.ActionBar.i6.a1() && org.telegram.ui.ActionBar.i6.I.f20716i0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = g6Var2.f20674y;
                    g6Var2.f20660j = b6Var.d;
                    g6Var2.f20661k = b6Var.f20466e;
                    g6Var2.f20662l = b6Var.f20467f;
                    g6Var2.f20663m = b6Var.f20468g;
                    g6Var2.f20664n = b6Var.h;
                    String str = b6Var.f20465c;
                    g6Var2.f20665o = str;
                    float f7 = b6Var.f20471k;
                    g6Var2.f20666p = f7;
                    xd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = xd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) xd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && g6Var2.f20665o.equals(tL_wallPaper.slug)) {
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
                    org.telegram.ui.Components.p91 p91Var = xd1Var2.J0[1];
                    if (xd1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p91Var.a(z10, true);
                    xd1Var2.m1(false);
                    org.telegram.ui.ActionBar.i6.o1(false, false);
                }
                Drawable background = xd1Var2.f43998x0.getBackground();
                if (background instanceof org.telegram.ui.Components.cd0) {
                    org.telegram.ui.Components.cd0 cd0Var = (org.telegram.ui.Components.cd0) background;
                    cd0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.i6.I.q()) {
                        if (xd1Var2.l1 < 0.0f) {
                            xd1Var2.f43998x0.getImageReceiver().setGradientBitmap(cd0Var.f25341k);
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
                org.telegram.ui.ActionBar.i6.q1(true);
                xd1Var2.Y0(2, false);
                return;
            default:
                xd1 xd1Var3 = this.f39835b;
                org.telegram.ui.ActionBar.g6 g6Var3 = xd1Var3.f43985s;
                if (g6Var3.f20660j == 4294967296L) {
                    g6Var3.f20660j = 0L;
                    g6Var3.f20661k = 0L;
                    g6Var3.f20662l = 0L;
                    g6Var3.f20663m = 0L;
                    xd1Var3.m1(false);
                    org.telegram.ui.ActionBar.i6.o1(false, false);
                }
                xd1Var3.v = true;
                org.telegram.ui.ActionBar.i6.q1(true);
                xd1Var3.Y0(2, false);
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
