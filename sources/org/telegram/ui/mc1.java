package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.kl0, org.telegram.ui.Components.z81, org.telegram.ui.ActionBar.a2 {
    public final int f35655a;
    public final xd1 f35656b;

    public mc1(xd1 xd1Var, int i10) {
        this.f35655a = i10;
        this.f35656b = xd1Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            xd1 xd1Var = this.f35656b;
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
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xd1 xd1Var = this.f35656b;
        if (!(xd1Var.B1 instanceof fj1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                xc1 xc1Var = xd1Var.f39470a;
                AndroidUtilities.calcDrawableColor(drawable);
                xc1Var.b(xd1Var.P0(drawable), drawable, Float.valueOf(xd1Var.l1));
                if (!z11 && xd1Var.F1 && xd1Var.f39530w1 == null) {
                    xd1Var.f39532x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    xd1Var.i1();
                    xd1Var.f39532x0.getImageReceiver().setCrossfadeWithOldImage(true);
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
    public void f(int i10, int i11) {
        xd1 xd1Var = this.f35656b;
        if (!xd1Var.E1) {
            return;
        }
        xd1Var.f39532x0.getBackground();
        float f7 = 1.0f;
        if (xd1Var.B0 != null) {
            f7 = (xd1Var.f39532x0.getScaleX() - 1.0f) / (xd1Var.f39536y1 - 1.0f);
        }
        xd1Var.f39532x0.setTranslationX(i10 * f7);
        xd1Var.f39532x0.setTranslationY(i11 * f7);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        switch (this.f35655a) {
            case 3:
                this.f35656b.f39520s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f35656b.O0(false);
                return;
            case 5:
                xd1 xd1Var = this.f35656b;
                org.telegram.ui.ActionBar.h6 h6Var = xd1Var.f39519s;
                if (h6Var.f18933j == 4294967296L) {
                    h6Var.f18933j = 0L;
                    h6Var.f18934k = 0L;
                    h6Var.f18935l = 0L;
                    h6Var.f18936m = 0L;
                    xd1Var.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                xd1Var.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                xd1Var.Y0(2, false);
                return;
            case 6:
                xd1 xd1Var2 = this.f35656b;
                org.telegram.ui.ActionBar.h6 h6Var2 = xd1Var2.f39519s;
                if (org.telegram.ui.ActionBar.j6.Z0() && org.telegram.ui.ActionBar.j6.I.f18985i0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = h6Var2.f18947y;
                    h6Var2.f18933j = b6Var.d;
                    h6Var2.f18934k = b6Var.e;
                    h6Var2.f18935l = b6Var.f18728f;
                    h6Var2.f18936m = b6Var.f18729g;
                    h6Var2.f18937n = b6Var.h;
                    String str = b6Var.f18727c;
                    h6Var2.f18938o = str;
                    float f7 = b6Var.f18732k;
                    h6Var2.f18939p = f7;
                    xd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = xd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) xd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && h6Var2.f18938o.equals(tL_wallPaper.slug)) {
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
                    org.telegram.ui.Components.y81 y81Var = xd1Var2.J0[1];
                    if (xd1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    y81Var.a(z10, true);
                    xd1Var2.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                Drawable background = xd1Var2.f39532x0.getBackground();
                if (background instanceof org.telegram.ui.Components.kc0) {
                    org.telegram.ui.Components.kc0 kc0Var = (org.telegram.ui.Components.kc0) background;
                    kc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (xd1Var2.l1 < 0.0f) {
                            xd1Var2.f39532x0.getImageReceiver().setGradientBitmap(kc0Var.f25745k);
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
                xd1 xd1Var3 = this.f35656b;
                org.telegram.ui.ActionBar.h6 h6Var3 = xd1Var3.f39519s;
                if (h6Var3.f18933j == 4294967296L) {
                    h6Var3.f18933j = 0L;
                    h6Var3.f18934k = 0L;
                    h6Var3.f18935l = 0L;
                    h6Var3.f18936m = 0L;
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
    public void q0(View view, float f7, float f10) {
    }
}
