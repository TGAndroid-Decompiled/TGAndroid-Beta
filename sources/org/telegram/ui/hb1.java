package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class hb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.am0, org.telegram.ui.Components.w91, org.telegram.ui.ActionBar.b2 {
    public final int f39974a;
    public final tc1 f39975b;

    public hb1(tc1 tc1Var, int i10) {
        this.f39974a = i10;
        this.f39975b = tc1Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        tc1 tc1Var = this.f39975b;
        if (!(tc1Var.C1 instanceof bi1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                sb1 sb1Var = tc1Var.f43733a;
                AndroidUtilities.calcDrawableColor(drawable);
                sb1Var.j(tc1Var.P0(drawable), drawable, Float.valueOf(tc1Var.f43770m1));
                if (!z11 && tc1Var.G1 && tc1Var.f43797x1 == null) {
                    tc1Var.f43799y0.getImageReceiver().setCrossfadeWithOldImage(false);
                    tc1Var.j1();
                    tc1Var.f43799y0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                tc1Var.W0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            boolean i32 = s1Var.i3(f7);
            tc1 tc1Var = this.f39975b;
            if (i32) {
                if (s1Var.getMessageObject().isOutOwner()) {
                    tc1Var.Z0(3, true);
                    return;
                } else {
                    tc1Var.Z0(1, true);
                    return;
                }
            }
            tc1Var.Z0(2, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        boolean z10;
        switch (this.f39974a) {
            case 3:
                this.f39975b.f43786t0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f39975b.O0(false);
                return;
            case 5:
                tc1 tc1Var = this.f39975b;
                org.telegram.ui.ActionBar.w6 w6Var = tc1Var.v;
                if (w6Var.f23219j == 4294967296L) {
                    w6Var.f23219j = 0L;
                    w6Var.f23220k = 0L;
                    w6Var.f23221l = 0L;
                    w6Var.f23222m = 0L;
                    tc1Var.n1(false);
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                }
                tc1Var.f43792w = true;
                org.telegram.ui.ActionBar.y6.s1(true);
                tc1Var.Z0(2, false);
                return;
            case 6:
                tc1 tc1Var2 = this.f39975b;
                org.telegram.ui.ActionBar.w6 w6Var2 = tc1Var2.v;
                if (org.telegram.ui.ActionBar.y6.b1() && org.telegram.ui.ActionBar.y6.I.f23261i0.d != 0) {
                    org.telegram.ui.ActionBar.r6 r6Var = w6Var2.f23233y;
                    w6Var2.f23219j = r6Var.d;
                    w6Var2.f23220k = r6Var.e;
                    w6Var2.f23221l = r6Var.f23051f;
                    w6Var2.f23222m = r6Var.f23052g;
                    w6Var2.f23223n = r6Var.h;
                    String str = r6Var.f23050c;
                    w6Var2.f23224o = str;
                    float f7 = r6Var.f23055k;
                    w6Var2.f23225p = f7;
                    tc1Var2.f43770m1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = tc1Var2.V0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tc1Var2.V0.get(i11);
                                if (tL_wallPaper.pattern && w6Var2.f23224o.equals(tL_wallPaper.slug)) {
                                    tc1Var2.X0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        tc1Var2.X0 = null;
                    }
                    tc1Var2.f43792w = true;
                    org.telegram.ui.Components.v91 v91Var = tc1Var2.K0[1];
                    if (tc1Var2.X0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v91Var.a(z10, true);
                    tc1Var2.n1(false);
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                }
                Drawable background = tc1Var2.f43799y0.getBackground();
                if (background instanceof org.telegram.ui.Components.uc0) {
                    org.telegram.ui.Components.uc0 uc0Var = (org.telegram.ui.Components.uc0) background;
                    uc0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.y6.I.q()) {
                        if (tc1Var2.f43770m1 < 0.0f) {
                            tc1Var2.f43799y0.getImageReceiver().setGradientBitmap(uc0Var.f33361k);
                        }
                        org.telegram.ui.Cells.i0 i0Var = tc1Var2.U0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = tc1Var2.f43770m1;
                        if (f10 < 0.0f) {
                            tc1Var2.f43770m1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.i0 i0Var2 = tc1Var2.U0;
                if (i0Var2 != null) {
                    i0Var2.setProgress(tc1Var2.f43770m1);
                }
                org.telegram.ui.ActionBar.y6.s1(true);
                tc1Var2.Z0(2, false);
                return;
            default:
                tc1 tc1Var3 = this.f39975b;
                org.telegram.ui.ActionBar.w6 w6Var3 = tc1Var3.v;
                if (w6Var3.f23219j == 4294967296L) {
                    w6Var3.f23219j = 0L;
                    w6Var3.f23220k = 0L;
                    w6Var3.f23221l = 0L;
                    w6Var3.f23222m = 0L;
                    tc1Var3.n1(false);
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                }
                tc1Var3.f43792w = true;
                org.telegram.ui.ActionBar.y6.s1(true);
                tc1Var3.Z0(2, false);
                return;
        }
    }

    @Override
    public void i(int i10, int i11) {
        tc1 tc1Var = this.f39975b;
        if (!tc1Var.F1) {
            return;
        }
        tc1Var.f43799y0.getBackground();
        float f7 = 1.0f;
        if (tc1Var.C0 != null) {
            f7 = (tc1Var.f43799y0.getScaleX() - 1.0f) / (tc1Var.f43802z1 - 1.0f);
        }
        tc1Var.f43799y0.setTranslationX(i10 * f7);
        tc1Var.f43799y0.setTranslationY(i11 * f7);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
