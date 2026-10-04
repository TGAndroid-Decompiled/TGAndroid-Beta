package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class gc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.nl0, org.telegram.ui.Components.i91, org.telegram.ui.ActionBar.a2 {
    public final int f36563a;
    public final rd1 f36564b;

    public gc1(rd1 rd1Var, int i10) {
        this.f36563a = i10;
        this.f36564b = rd1Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            rd1 rd1Var = this.f36564b;
            if (i32) {
                if (u1Var.getMessageObject().isOutOwner()) {
                    rd1Var.Y0(3, true);
                    return;
                } else {
                    rd1Var.Y0(1, true);
                    return;
                }
            }
            rd1Var.Y0(2, true);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        rd1 rd1Var = this.f36564b;
        if (!(rd1Var.B1 instanceof yi1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                rc1 rc1Var = rd1Var.f40037a;
                AndroidUtilities.calcDrawableColor(drawable);
                rc1Var.b(rd1Var.P0(drawable), drawable, Float.valueOf(rd1Var.l1));
                if (!z11 && rd1Var.F1 && rd1Var.f40098w1 == null) {
                    rd1Var.f40100x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    rd1Var.i1();
                    rd1Var.f40100x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                rd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        rd1 rd1Var = this.f36564b;
        if (!rd1Var.E1) {
            return;
        }
        rd1Var.f40100x0.getBackground();
        float f7 = 1.0f;
        if (rd1Var.B0 != null) {
            f7 = (rd1Var.f40100x0.getScaleX() - 1.0f) / (rd1Var.f40104y1 - 1.0f);
        }
        rd1Var.f40100x0.setTranslationX(i10 * f7);
        rd1Var.f40100x0.setTranslationY(i11 * f7);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        switch (this.f36563a) {
            case 3:
                this.f36564b.f40088s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f36564b.O0(false);
                return;
            case 5:
                rd1 rd1Var = this.f36564b;
                org.telegram.ui.ActionBar.f6 f6Var = rd1Var.f40087s;
                if (f6Var.f20622j == 4294967296L) {
                    f6Var.f20622j = 0L;
                    f6Var.f20623k = 0L;
                    f6Var.f20624l = 0L;
                    f6Var.f20625m = 0L;
                    rd1Var.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                rd1Var.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                rd1Var.Y0(2, false);
                return;
            case 6:
                rd1 rd1Var2 = this.f36564b;
                org.telegram.ui.ActionBar.f6 f6Var2 = rd1Var2.f40087s;
                if (org.telegram.ui.ActionBar.i6.Z0() && org.telegram.ui.ActionBar.i6.I.f20705i0.d != 0) {
                    org.telegram.ui.ActionBar.a6 a6Var = f6Var2.f20636y;
                    f6Var2.f20622j = a6Var.d;
                    f6Var2.f20623k = a6Var.f20392e;
                    f6Var2.f20624l = a6Var.f20393f;
                    f6Var2.f20625m = a6Var.f20394g;
                    f6Var2.f20626n = a6Var.h;
                    String str = a6Var.f20391c;
                    f6Var2.f20627o = str;
                    float f7 = a6Var.f20397k;
                    f6Var2.f20628p = f7;
                    rd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = rd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) rd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && f6Var2.f20627o.equals(tL_wallPaper.slug)) {
                                    rd1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        rd1Var2.W0 = null;
                    }
                    rd1Var2.v = true;
                    org.telegram.ui.Components.h91 h91Var = rd1Var2.J0[1];
                    if (rd1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h91Var.a(z10, true);
                    rd1Var2.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                Drawable background = rd1Var2.f40100x0.getBackground();
                if (background instanceof org.telegram.ui.Components.pc0) {
                    org.telegram.ui.Components.pc0 pc0Var = (org.telegram.ui.Components.pc0) background;
                    pc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.i6.I.q()) {
                        if (rd1Var2.l1 < 0.0f) {
                            rd1Var2.f40100x0.getImageReceiver().setGradientBitmap(pc0Var.f29618k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = rd1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = rd1Var2.l1;
                        if (f10 < 0.0f) {
                            rd1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = rd1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(rd1Var2.l1);
                }
                org.telegram.ui.ActionBar.i6.p1(true);
                rd1Var2.Y0(2, false);
                return;
            default:
                rd1 rd1Var3 = this.f36564b;
                org.telegram.ui.ActionBar.f6 f6Var3 = rd1Var3.f40087s;
                if (f6Var3.f20622j == 4294967296L) {
                    f6Var3.f20622j = 0L;
                    f6Var3.f20623k = 0L;
                    f6Var3.f20624l = 0L;
                    f6Var3.f20625m = 0L;
                    rd1Var3.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                rd1Var3.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                rd1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
