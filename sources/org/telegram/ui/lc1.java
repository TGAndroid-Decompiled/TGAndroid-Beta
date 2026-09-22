package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class lc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.al0, org.telegram.ui.Components.k81, org.telegram.ui.ActionBar.a2 {
    public final int f35405a;
    public final wd1 f35406b;

    public lc1(wd1 wd1Var, int i10) {
        this.f35405a = i10;
        this.f35406b = wd1Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f7);
            wd1 wd1Var = this.f35406b;
            if (i32) {
                if (t1Var.getMessageObject().isOutOwner()) {
                    wd1Var.Y0(3, true);
                    return;
                } else {
                    wd1Var.Y0(1, true);
                    return;
                }
            }
            wd1Var.Y0(2, true);
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        wd1 wd1Var = this.f35406b;
        if (!(wd1Var.B1 instanceof gj1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                wc1 wc1Var = wd1Var.f38786a;
                AndroidUtilities.calcDrawableColor(drawable);
                wc1Var.b(wd1Var.P0(drawable), drawable, Float.valueOf(wd1Var.l1));
                if (!z11 && wd1Var.F1 && wd1Var.f38846w1 == null) {
                    wd1Var.f38848x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    wd1Var.i1();
                    wd1Var.f38848x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                wd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        wd1 wd1Var = this.f35406b;
        if (!wd1Var.E1) {
            return;
        }
        wd1Var.f38848x0.getBackground();
        float f7 = 1.0f;
        if (wd1Var.B0 != null) {
            f7 = (wd1Var.f38848x0.getScaleX() - 1.0f) / (wd1Var.f38852y1 - 1.0f);
        }
        wd1Var.f38848x0.setTranslationX(i10 * f7);
        wd1Var.f38848x0.setTranslationY(i11 * f7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        switch (this.f35405a) {
            case 3:
                this.f35406b.f38836s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f35406b.O0(false);
                return;
            case 5:
                wd1 wd1Var = this.f35406b;
                org.telegram.ui.ActionBar.g6 g6Var = wd1Var.f38835s;
                if (g6Var.f18696j == 4294967296L) {
                    g6Var.f18696j = 0L;
                    g6Var.f18697k = 0L;
                    g6Var.f18698l = 0L;
                    g6Var.f18699m = 0L;
                    wd1Var.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                wd1Var.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                wd1Var.Y0(2, false);
                return;
            case 6:
                wd1 wd1Var2 = this.f35406b;
                org.telegram.ui.ActionBar.g6 g6Var2 = wd1Var2.f38835s;
                if (org.telegram.ui.ActionBar.i6.Z0() && org.telegram.ui.ActionBar.i6.I.f18739i0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = g6Var2.f18710y;
                    g6Var2.f18696j = b6Var.d;
                    g6Var2.f18697k = b6Var.e;
                    g6Var2.f18698l = b6Var.f18509f;
                    g6Var2.f18699m = b6Var.f18510g;
                    g6Var2.f18700n = b6Var.h;
                    String str = b6Var.f18508c;
                    g6Var2.f18701o = str;
                    float f7 = b6Var.f18513k;
                    g6Var2.f18702p = f7;
                    wd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = wd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && g6Var2.f18701o.equals(tL_wallPaper.slug)) {
                                    wd1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        wd1Var2.W0 = null;
                    }
                    wd1Var2.v = true;
                    org.telegram.ui.Components.j81 j81Var = wd1Var2.J0[1];
                    if (wd1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j81Var.a(z10, true);
                    wd1Var2.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                Drawable background = wd1Var2.f38848x0.getBackground();
                if (background instanceof org.telegram.ui.Components.cc0) {
                    org.telegram.ui.Components.cc0 cc0Var = (org.telegram.ui.Components.cc0) background;
                    cc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.i6.I.q()) {
                        if (wd1Var2.l1 < 0.0f) {
                            wd1Var2.f38848x0.getImageReceiver().setGradientBitmap(cc0Var.f23054k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = wd1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = wd1Var2.l1;
                        if (f10 < 0.0f) {
                            wd1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = wd1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(wd1Var2.l1);
                }
                org.telegram.ui.ActionBar.i6.p1(true);
                wd1Var2.Y0(2, false);
                return;
            default:
                wd1 wd1Var3 = this.f35406b;
                org.telegram.ui.ActionBar.g6 g6Var3 = wd1Var3.f38835s;
                if (g6Var3.f18696j == 4294967296L) {
                    g6Var3.f18696j = 0L;
                    g6Var3.f18697k = 0L;
                    g6Var3.f18698l = 0L;
                    g6Var3.f18699m = 0L;
                    wd1Var3.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                wd1Var3.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                wd1Var3.Y0(2, false);
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
