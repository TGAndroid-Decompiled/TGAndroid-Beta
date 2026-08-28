package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class cb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.nk0, org.telegram.ui.Components.p71, org.telegram.ui.ActionBar.b2 {
    public final int f37162a;
    public final oc1 f37163b;

    public cb1(oc1 oc1Var, int i9) {
        this.f37162a = i9;
        this.f37163b = oc1Var;
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f10);
            oc1 oc1Var = this.f37163b;
            if (i32) {
                if (t1Var.getMessageObject().isOutOwner()) {
                    oc1Var.Y0(3, true);
                    return;
                } else {
                    oc1Var.Y0(1, true);
                    return;
                }
            }
            oc1Var.Y0(2, true);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oc1 oc1Var = this.f37163b;
        if (!(oc1Var.f41116x1 instanceof xh1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                ob1 ob1Var = oc1Var.f41056a;
                AndroidUtilities.calcDrawableColor(drawable);
                ob1Var.b(oc1Var.P0(drawable), drawable, Float.valueOf(oc1Var.f41081h1));
                if (!z11 && oc1Var.B1 && oc1Var.f41104s1 == null) {
                    oc1Var.f41105t0.getImageReceiver().setCrossfadeWithOldImage(false);
                    oc1Var.i1();
                    oc1Var.f41105t0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                oc1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        boolean z10;
        switch (this.f37162a) {
            case 3:
                this.f37163b.f41093o0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f37163b.O0(false);
                return;
            case 5:
                oc1 oc1Var = this.f37163b;
                org.telegram.ui.ActionBar.d6 d6Var = oc1Var.f41102s;
                if (d6Var.f22873j == 4294967296L) {
                    d6Var.f22873j = 0L;
                    d6Var.f22874k = 0L;
                    d6Var.f22875l = 0L;
                    d6Var.f22876m = 0L;
                    oc1Var.m1(false);
                    org.telegram.ui.ActionBar.f6.n1(false, false);
                }
                oc1Var.v = true;
                org.telegram.ui.ActionBar.f6.p1(true);
                oc1Var.Y0(2, false);
                return;
            case 6:
                oc1 oc1Var2 = this.f37163b;
                org.telegram.ui.ActionBar.d6 d6Var2 = oc1Var2.f41102s;
                if (org.telegram.ui.ActionBar.f6.Z0() && org.telegram.ui.ActionBar.f6.I.f22914e0.d != 0) {
                    org.telegram.ui.ActionBar.y5 y5Var = d6Var2.f22887y;
                    d6Var2.f22873j = y5Var.d;
                    d6Var2.f22874k = y5Var.f23983e;
                    d6Var2.f22875l = y5Var.f23984f;
                    d6Var2.f22876m = y5Var.f23985g;
                    d6Var2.f22877n = y5Var.h;
                    String str = y5Var.f23982c;
                    d6Var2.f22878o = str;
                    float f10 = y5Var.f23988k;
                    d6Var2.f22879p = f10;
                    oc1Var2.f41081h1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = oc1Var2.Q0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) oc1Var2.Q0.get(i10);
                                if (tL_wallPaper.pattern && d6Var2.f22878o.equals(tL_wallPaper.slug)) {
                                    oc1Var2.S0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        oc1Var2.S0 = null;
                    }
                    oc1Var2.v = true;
                    org.telegram.ui.Components.o71 o71Var = oc1Var2.F0[1];
                    if (oc1Var2.S0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o71Var.a(z10, true);
                    oc1Var2.m1(false);
                    org.telegram.ui.ActionBar.f6.n1(false, false);
                }
                Drawable background = oc1Var2.f41105t0.getBackground();
                if (background instanceof org.telegram.ui.Components.jb0) {
                    org.telegram.ui.Components.jb0 jb0Var = (org.telegram.ui.Components.jb0) background;
                    jb0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.f6.I.q()) {
                        if (oc1Var2.f41081h1 < 0.0f) {
                            oc1Var2.f41105t0.getImageReceiver().setGradientBitmap(jb0Var.f29698k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = oc1Var2.P0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = oc1Var2.f41081h1;
                        if (f11 < 0.0f) {
                            oc1Var2.f41081h1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = oc1Var2.P0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(oc1Var2.f41081h1);
                }
                org.telegram.ui.ActionBar.f6.p1(true);
                oc1Var2.Y0(2, false);
                return;
            default:
                oc1 oc1Var3 = this.f37163b;
                org.telegram.ui.ActionBar.d6 d6Var3 = oc1Var3.f41102s;
                if (d6Var3.f22873j == 4294967296L) {
                    d6Var3.f22873j = 0L;
                    d6Var3.f22874k = 0L;
                    d6Var3.f22875l = 0L;
                    d6Var3.f22876m = 0L;
                    oc1Var3.m1(false);
                    org.telegram.ui.ActionBar.f6.n1(false, false);
                }
                oc1Var3.v = true;
                org.telegram.ui.ActionBar.f6.p1(true);
                oc1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(int i9, int i10) {
        oc1 oc1Var = this.f37163b;
        if (!oc1Var.A1) {
            return;
        }
        oc1Var.f41105t0.getBackground();
        float f10 = 1.0f;
        if (oc1Var.f41115x0 != null) {
            f10 = (oc1Var.f41105t0.getScaleX() - 1.0f) / (oc1Var.f41108u1 - 1.0f);
        }
        oc1Var.f41105t0.setTranslationX(i9 * f10);
        oc1Var.f41105t0.setTranslationY(i10 * f10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
