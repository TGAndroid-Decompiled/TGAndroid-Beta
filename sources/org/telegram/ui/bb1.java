package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.xl0, org.telegram.ui.Components.e91, org.telegram.ui.ActionBar.a2 {
    public final int f35623a;
    public final mc1 f35624b;

    public bb1(mc1 mc1Var, int i10) {
        this.f35623a = i10;
        this.f35624b = mc1Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            mc1 mc1Var = this.f35624b;
            if (i32) {
                if (u1Var.getMessageObject().isOutOwner()) {
                    mc1Var.Y0(3, true);
                    return;
                } else {
                    mc1Var.Y0(1, true);
                    return;
                }
            }
            mc1Var.Y0(2, true);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mc1 mc1Var = this.f35624b;
        if (!(mc1Var.B1 instanceof uh1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                mb1 mb1Var = mc1Var.f39078a;
                AndroidUtilities.calcDrawableColor(drawable);
                mb1Var.b(mc1Var.P0(drawable), drawable, Float.valueOf(mc1Var.l1));
                if (!z11 && mc1Var.F1 && mc1Var.f39138w1 == null) {
                    mc1Var.f39140x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    mc1Var.i1();
                    mc1Var.f39140x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                mc1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        mc1 mc1Var = this.f35624b;
        if (!mc1Var.E1) {
            return;
        }
        mc1Var.f39140x0.getBackground();
        float f7 = 1.0f;
        if (mc1Var.B0 != null) {
            f7 = (mc1Var.f39140x0.getScaleX() - 1.0f) / (mc1Var.f39144y1 - 1.0f);
        }
        mc1Var.f39140x0.setTranslationX(i10 * f7);
        mc1Var.f39140x0.setTranslationY(i11 * f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        switch (this.f35623a) {
            case 3:
                this.f35624b.f39128s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f35624b.O0(false);
                return;
            case 5:
                mc1 mc1Var = this.f35624b;
                org.telegram.ui.ActionBar.f6 f6Var = mc1Var.f39127s;
                if (f6Var.f20834j == 4294967296L) {
                    f6Var.f20834j = 0L;
                    f6Var.f20835k = 0L;
                    f6Var.f20836l = 0L;
                    f6Var.f20837m = 0L;
                    mc1Var.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                mc1Var.v = true;
                org.telegram.ui.ActionBar.h6.q1(true);
                mc1Var.Y0(2, false);
                return;
            case 6:
                mc1 mc1Var2 = this.f35624b;
                org.telegram.ui.ActionBar.f6 f6Var2 = mc1Var2.f39127s;
                if (org.telegram.ui.ActionBar.h6.a1() && org.telegram.ui.ActionBar.h6.I.f20889i0.d != 0) {
                    org.telegram.ui.ActionBar.a6 a6Var = f6Var2.f20848y;
                    f6Var2.f20834j = a6Var.d;
                    f6Var2.f20835k = a6Var.e;
                    f6Var2.f20836l = a6Var.f20616f;
                    f6Var2.f20837m = a6Var.f20617g;
                    f6Var2.f20838n = a6Var.h;
                    String str = a6Var.f20615c;
                    f6Var2.f20839o = str;
                    float f7 = a6Var.f20620k;
                    f6Var2.f20840p = f7;
                    mc1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = mc1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) mc1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && f6Var2.f20839o.equals(tL_wallPaper.slug)) {
                                    mc1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        mc1Var2.W0 = null;
                    }
                    mc1Var2.v = true;
                    org.telegram.ui.Components.d91 d91Var = mc1Var2.J0[1];
                    if (mc1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d91Var.a(z10, true);
                    mc1Var2.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                Drawable background = mc1Var2.f39140x0.getBackground();
                if (background instanceof org.telegram.ui.Components.wc0) {
                    org.telegram.ui.Components.wc0 wc0Var = (org.telegram.ui.Components.wc0) background;
                    wc0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.h6.I.q()) {
                        if (mc1Var2.l1 < 0.0f) {
                            mc1Var2.f39140x0.getImageReceiver().setGradientBitmap(wc0Var.f32091k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = mc1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = mc1Var2.l1;
                        if (f10 < 0.0f) {
                            mc1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = mc1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(mc1Var2.l1);
                }
                org.telegram.ui.ActionBar.h6.q1(true);
                mc1Var2.Y0(2, false);
                return;
            default:
                mc1 mc1Var3 = this.f35624b;
                org.telegram.ui.ActionBar.f6 f6Var3 = mc1Var3.f39127s;
                if (f6Var3.f20834j == 4294967296L) {
                    f6Var3.f20834j = 0L;
                    f6Var3.f20835k = 0L;
                    f6Var3.f20836l = 0L;
                    f6Var3.f20837m = 0L;
                    mc1Var3.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                mc1Var3.v = true;
                org.telegram.ui.ActionBar.h6.q1(true);
                mc1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
