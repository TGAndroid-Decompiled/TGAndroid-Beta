package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class lc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.al0, org.telegram.ui.Components.k81, org.telegram.ui.ActionBar.a2 {
    public final int f38328a;
    public final wd1 f38329b;

    public lc1(wd1 wd1Var, int i10) {
        this.f38328a = i10;
        this.f38329b = wd1Var;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f7);
            wd1 wd1Var = this.f38329b;
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
        wd1 wd1Var = this.f38329b;
        if (!(wd1Var.B1 instanceof gj1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                wc1 wc1Var = wd1Var.f41941a;
                AndroidUtilities.calcDrawableColor(drawable);
                wc1Var.b(wd1Var.P0(drawable), drawable, Float.valueOf(wd1Var.l1));
                if (!z11 && wd1Var.F1 && wd1Var.f42002w1 == null) {
                    wd1Var.f42004x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    wd1Var.i1();
                    wd1Var.f42004x0.getImageReceiver().setCrossfadeWithOldImage(true);
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        switch (this.f38328a) {
            case 3:
                this.f38329b.f41992s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f38329b.O0(false);
                return;
            case 5:
                wd1 wd1Var = this.f38329b;
                org.telegram.ui.ActionBar.h6 h6Var = wd1Var.f41991s;
                if (h6Var.f20524j == 4294967296L) {
                    h6Var.f20524j = 0L;
                    h6Var.f20525k = 0L;
                    h6Var.f20526l = 0L;
                    h6Var.f20527m = 0L;
                    wd1Var.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                wd1Var.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                wd1Var.Y0(2, false);
                return;
            case 6:
                wd1 wd1Var2 = this.f38329b;
                org.telegram.ui.ActionBar.h6 h6Var2 = wd1Var2.f41991s;
                if (org.telegram.ui.ActionBar.j6.Z0() && org.telegram.ui.ActionBar.j6.I.f20580i0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = h6Var2.f20538y;
                    h6Var2.f20524j = b6Var.d;
                    h6Var2.f20525k = b6Var.f20304e;
                    h6Var2.f20526l = b6Var.f20305f;
                    h6Var2.f20527m = b6Var.f20306g;
                    h6Var2.f20528n = b6Var.h;
                    String str = b6Var.f20303c;
                    h6Var2.f20529o = str;
                    float f7 = b6Var.f20309k;
                    h6Var2.f20530p = f7;
                    wd1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = wd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && h6Var2.f20529o.equals(tL_wallPaper.slug)) {
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
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                Drawable background = wd1Var2.f42004x0.getBackground();
                if (background instanceof org.telegram.ui.Components.dc0) {
                    org.telegram.ui.Components.dc0 dc0Var = (org.telegram.ui.Components.dc0) background;
                    dc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (wd1Var2.l1 < 0.0f) {
                            wd1Var2.f42004x0.getImageReceiver().setGradientBitmap(dc0Var.f25380k);
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
                org.telegram.ui.ActionBar.j6.p1(true);
                wd1Var2.Y0(2, false);
                return;
            default:
                wd1 wd1Var3 = this.f38329b;
                org.telegram.ui.ActionBar.h6 h6Var3 = wd1Var3.f41991s;
                if (h6Var3.f20524j == 4294967296L) {
                    h6Var3.f20524j = 0L;
                    h6Var3.f20525k = 0L;
                    h6Var3.f20526l = 0L;
                    h6Var3.f20527m = 0L;
                    wd1Var3.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                wd1Var3.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                wd1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void h(int i10, int i11) {
        wd1 wd1Var = this.f38329b;
        if (!wd1Var.E1) {
            return;
        }
        wd1Var.f42004x0.getBackground();
        float f7 = 1.0f;
        if (wd1Var.B0 != null) {
            f7 = (wd1Var.f42004x0.getScaleX() - 1.0f) / (wd1Var.f42008y1 - 1.0f);
        }
        wd1Var.f42004x0.setTranslationX(i10 * f7);
        wd1Var.f42004x0.setTranslationY(i11 * f7);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
