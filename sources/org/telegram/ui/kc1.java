package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class kc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.al0, org.telegram.ui.Components.k81, org.telegram.ui.ActionBar.a2 {
    public final int f35114a;
    public final vd1 f35115b;

    public kc1(vd1 vd1Var, int i10) {
        this.f35114a = i10;
        this.f35115b = vd1Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f7);
            vd1 vd1Var = this.f35115b;
            if (i32) {
                if (t1Var.getMessageObject().isOutOwner()) {
                    vd1Var.Y0(3, true);
                    return;
                } else {
                    vd1Var.Y0(1, true);
                    return;
                }
            }
            vd1Var.Y0(2, true);
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        vd1 vd1Var = this.f35115b;
        if (!(vd1Var.B1 instanceof fj1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                vc1 vc1Var = vd1Var.f38513a;
                AndroidUtilities.calcDrawableColor(drawable);
                vc1Var.b(vd1Var.P0(drawable), drawable, Float.valueOf(vd1Var.l1));
                if (!z11 && vd1Var.F1 && vd1Var.f38573w1 == null) {
                    vd1Var.f38575x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    vd1Var.i1();
                    vd1Var.f38575x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                vd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        vd1 vd1Var = this.f35115b;
        if (!vd1Var.E1) {
            return;
        }
        vd1Var.f38575x0.getBackground();
        float f7 = 1.0f;
        if (vd1Var.B0 != null) {
            f7 = (vd1Var.f38575x0.getScaleX() - 1.0f) / (vd1Var.f38579y1 - 1.0f);
        }
        vd1Var.f38575x0.setTranslationX(i10 * f7);
        vd1Var.f38575x0.setTranslationY(i11 * f7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        switch (this.f35114a) {
            case 3:
                this.f35115b.f38563s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f35115b.O0(false);
                return;
            case 5:
                vd1 vd1Var = this.f35115b;
                org.telegram.ui.ActionBar.g6 g6Var = vd1Var.f38562s;
                if (g6Var.f18698j == 4294967296L) {
                    g6Var.f18698j = 0L;
                    g6Var.f18699k = 0L;
                    g6Var.f18700l = 0L;
                    g6Var.f18701m = 0L;
                    vd1Var.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                vd1Var.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                vd1Var.Y0(2, false);
                return;
            case 6:
                vd1 vd1Var2 = this.f35115b;
                org.telegram.ui.ActionBar.g6 g6Var2 = vd1Var2.f38562s;
                if (org.telegram.ui.ActionBar.i6.Z0() && org.telegram.ui.ActionBar.i6.I.f18741i0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = g6Var2.f18712y;
                    g6Var2.f18698j = b6Var.d;
                    g6Var2.f18699k = b6Var.e;
                    g6Var2.f18700l = b6Var.f18511f;
                    g6Var2.f18701m = b6Var.f18512g;
                    g6Var2.f18702n = b6Var.h;
                    String str = b6Var.f18510c;
                    g6Var2.f18703o = str;
                    float f7 = b6Var.f18515k;
                    g6Var2.f18704p = f7;
                    vd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = vd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) vd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && g6Var2.f18703o.equals(tL_wallPaper.slug)) {
                                    vd1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        vd1Var2.W0 = null;
                    }
                    vd1Var2.v = true;
                    org.telegram.ui.Components.j81 j81Var = vd1Var2.J0[1];
                    if (vd1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j81Var.a(z10, true);
                    vd1Var2.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                Drawable background = vd1Var2.f38575x0.getBackground();
                if (background instanceof org.telegram.ui.Components.cc0) {
                    org.telegram.ui.Components.cc0 cc0Var = (org.telegram.ui.Components.cc0) background;
                    cc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.i6.I.q()) {
                        if (vd1Var2.l1 < 0.0f) {
                            vd1Var2.f38575x0.getImageReceiver().setGradientBitmap(cc0Var.f23056k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = vd1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = vd1Var2.l1;
                        if (f10 < 0.0f) {
                            vd1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = vd1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(vd1Var2.l1);
                }
                org.telegram.ui.ActionBar.i6.p1(true);
                vd1Var2.Y0(2, false);
                return;
            default:
                vd1 vd1Var3 = this.f35115b;
                org.telegram.ui.ActionBar.g6 g6Var3 = vd1Var3.f38562s;
                if (g6Var3.f18698j == 4294967296L) {
                    g6Var3.f18698j = 0L;
                    g6Var3.f18699k = 0L;
                    g6Var3.f18700l = 0L;
                    g6Var3.f18701m = 0L;
                    vd1Var3.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                vd1Var3.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                vd1Var3.Y0(2, false);
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
