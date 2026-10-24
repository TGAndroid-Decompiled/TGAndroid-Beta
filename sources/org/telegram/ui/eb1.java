package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class eb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.am0, org.telegram.ui.Components.n91, org.telegram.ui.ActionBar.z1 {
    public final int f36872a;
    public final pc1 f36873b;

    public eb1(pc1 pc1Var, int i10) {
        this.f36872a = i10;
        this.f36873b = pc1Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean h32 = t1Var.h3(f7);
            pc1 pc1Var = this.f36873b;
            if (h32) {
                if (t1Var.getMessageObject().isOutOwner()) {
                    pc1Var.Y0(3, true);
                    return;
                } else {
                    pc1Var.Y0(1, true);
                    return;
                }
            }
            pc1Var.Y0(2, true);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        pc1 pc1Var = this.f36873b;
        if (!(pc1Var.C1 instanceof yh1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                pb1 pb1Var = pc1Var.f40442a;
                AndroidUtilities.calcDrawableColor(drawable);
                pb1Var.j(pc1Var.O0(drawable), drawable, Float.valueOf(pc1Var.f40479m1));
                if (!z11 && pc1Var.G1 && pc1Var.f40506x1 == null) {
                    pc1Var.f40508y0.getImageReceiver().setCrossfadeWithOldImage(false);
                    pc1Var.i1();
                    pc1Var.f40508y0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                pc1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        pc1 pc1Var = this.f36873b;
        if (!pc1Var.F1) {
            return;
        }
        pc1Var.f40508y0.getBackground();
        float f7 = 1.0f;
        if (pc1Var.C0 != null) {
            f7 = (pc1Var.f40508y0.getScaleX() - 1.0f) / (pc1Var.f40511z1 - 1.0f);
        }
        pc1Var.f40508y0.setTranslationX(i10 * f7);
        pc1Var.f40508y0.setTranslationY(i11 * f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean z10;
        switch (this.f36872a) {
            case 3:
                this.f36873b.f40495t0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f36873b.N0(false);
                return;
            case 5:
                pc1 pc1Var = this.f36873b;
                org.telegram.ui.ActionBar.i6 i6Var = pc1Var.v;
                if (i6Var.f20971j == 4294967296L) {
                    i6Var.f20971j = 0L;
                    i6Var.f20972k = 0L;
                    i6Var.f20973l = 0L;
                    i6Var.f20974m = 0L;
                    pc1Var.m1(false);
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                }
                pc1Var.f40501w = true;
                org.telegram.ui.ActionBar.k6.s1(true);
                pc1Var.Y0(2, false);
                return;
            case 6:
                pc1 pc1Var2 = this.f36873b;
                org.telegram.ui.ActionBar.i6 i6Var2 = pc1Var2.v;
                if (org.telegram.ui.ActionBar.k6.b1() && org.telegram.ui.ActionBar.k6.I.f21032i0.d != 0) {
                    org.telegram.ui.ActionBar.d6 d6Var = i6Var2.f20985y;
                    i6Var2.f20971j = d6Var.d;
                    i6Var2.f20972k = d6Var.e;
                    i6Var2.f20973l = d6Var.f20819f;
                    i6Var2.f20974m = d6Var.f20820g;
                    i6Var2.f20975n = d6Var.h;
                    String str = d6Var.f20818c;
                    i6Var2.f20976o = str;
                    float f7 = d6Var.f20823k;
                    i6Var2.f20977p = f7;
                    pc1Var2.f40479m1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = pc1Var2.V0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) pc1Var2.V0.get(i11);
                                if (tL_wallPaper.pattern && i6Var2.f20976o.equals(tL_wallPaper.slug)) {
                                    pc1Var2.X0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        pc1Var2.X0 = null;
                    }
                    pc1Var2.f40501w = true;
                    org.telegram.ui.Components.m91 m91Var = pc1Var2.K0[1];
                    if (pc1Var2.X0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m91Var.a(z10, true);
                    pc1Var2.m1(false);
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                }
                Drawable background = pc1Var2.f40508y0.getBackground();
                if (background instanceof org.telegram.ui.Components.wc0) {
                    org.telegram.ui.Components.wc0 wc0Var = (org.telegram.ui.Components.wc0) background;
                    wc0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (pc1Var2.f40479m1 < 0.0f) {
                            pc1Var2.f40508y0.getImageReceiver().setGradientBitmap(wc0Var.f32200k);
                        }
                        org.telegram.ui.Cells.i0 i0Var = pc1Var2.U0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = pc1Var2.f40479m1;
                        if (f10 < 0.0f) {
                            pc1Var2.f40479m1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.i0 i0Var2 = pc1Var2.U0;
                if (i0Var2 != null) {
                    i0Var2.setProgress(pc1Var2.f40479m1);
                }
                org.telegram.ui.ActionBar.k6.s1(true);
                pc1Var2.Y0(2, false);
                return;
            default:
                pc1 pc1Var3 = this.f36873b;
                org.telegram.ui.ActionBar.i6 i6Var3 = pc1Var3.v;
                if (i6Var3.f20971j == 4294967296L) {
                    i6Var3.f20971j = 0L;
                    i6Var3.f20972k = 0L;
                    i6Var3.f20973l = 0L;
                    i6Var3.f20974m = 0L;
                    pc1Var3.m1(false);
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                }
                pc1Var3.f40501w = true;
                org.telegram.ui.ActionBar.k6.s1(true);
                pc1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
