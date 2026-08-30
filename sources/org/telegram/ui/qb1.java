package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class qb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.jl0, org.telegram.ui.Components.n81, org.telegram.ui.ActionBar.c2 {
    public final int f37718a;
    public final cd1 f37719b;

    public qb1(cd1 cd1Var, int i10) {
        this.f37718a = i10;
        this.f37719b = cd1Var;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f10);
            cd1 cd1Var = this.f37719b;
            if (i32) {
                if (t1Var.getMessageObject().isOutOwner()) {
                    cd1Var.Y0(3, true);
                    return;
                } else {
                    cd1Var.Y0(1, true);
                    return;
                }
            }
            cd1Var.Y0(2, true);
        }
    }

    @Override
    public void d(int i10, int i11) {
        cd1 cd1Var = this.f37719b;
        if (!cd1Var.B1) {
            return;
        }
        cd1Var.f33338u0.getBackground();
        float f10 = 1.0f;
        if (cd1Var.f33349y0 != null) {
            f10 = (cd1Var.f33338u0.getScaleX() - 1.0f) / (cd1Var.f33341v1 - 1.0f);
        }
        cd1Var.f33338u0.setTranslationX(i10 * f10);
        cd1Var.f33338u0.setTranslationY(i11 * f10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        cd1 cd1Var = this.f37719b;
        if (!(cd1Var.f33350y1 instanceof mi1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z4 && drawable != null) {
                cc1 cc1Var = cd1Var.f33287a;
                AndroidUtilities.calcDrawableColor(drawable);
                cc1Var.b(cd1Var.P0(drawable), drawable, Float.valueOf(cd1Var.f33314i1));
                if (!z10 && cd1Var.C1 && cd1Var.f33337t1 == null) {
                    cd1Var.f33338u0.getImageReceiver().setCrossfadeWithOldImage(false);
                    cd1Var.i1();
                    cd1Var.f33338u0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                cd1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean z4;
        switch (this.f37718a) {
            case 3:
                this.f37719b.f33326p0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f37719b.O0(false);
                return;
            case 5:
                cd1 cd1Var = this.f37719b;
                org.telegram.ui.ActionBar.h6 h6Var = cd1Var.f33333s;
                if (h6Var.f19767j == 4294967296L) {
                    h6Var.f19767j = 0L;
                    h6Var.f19768k = 0L;
                    h6Var.f19769l = 0L;
                    h6Var.f19770m = 0L;
                    cd1Var.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                cd1Var.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                cd1Var.Y0(2, false);
                return;
            case 6:
                cd1 cd1Var2 = this.f37719b;
                org.telegram.ui.ActionBar.h6 h6Var2 = cd1Var2.f33333s;
                if (org.telegram.ui.ActionBar.j6.Z0() && org.telegram.ui.ActionBar.j6.I.f19814f0.d != 0) {
                    org.telegram.ui.ActionBar.c6 c6Var = h6Var2.f19781y;
                    h6Var2.f19767j = c6Var.d;
                    h6Var2.f19768k = c6Var.e;
                    h6Var2.f19769l = c6Var.f19557f;
                    h6Var2.f19770m = c6Var.f19558g;
                    h6Var2.f19771n = c6Var.h;
                    String str = c6Var.f19556c;
                    h6Var2.f19772o = str;
                    float f10 = c6Var.f19561k;
                    h6Var2.f19773p = f10;
                    cd1Var2.f33314i1 = f10;
                    if (str != null && !"c".equals(str)) {
                        int size = cd1Var2.R0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) cd1Var2.R0.get(i11);
                                if (tL_wallPaper.pattern && h6Var2.f19772o.equals(tL_wallPaper.slug)) {
                                    cd1Var2.T0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        cd1Var2.T0 = null;
                    }
                    cd1Var2.v = true;
                    org.telegram.ui.Components.m81 m81Var = cd1Var2.G0[1];
                    if (cd1Var2.T0 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    m81Var.a(z4, true);
                    cd1Var2.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                Drawable background = cd1Var2.f33338u0.getBackground();
                if (background instanceof org.telegram.ui.Components.dc0) {
                    org.telegram.ui.Components.dc0 dc0Var = (org.telegram.ui.Components.dc0) background;
                    dc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (cd1Var2.f33314i1 < 0.0f) {
                            cd1Var2.f33338u0.getImageReceiver().setGradientBitmap(dc0Var.f24241k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = cd1Var2.Q0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = cd1Var2.f33314i1;
                        if (f11 < 0.0f) {
                            cd1Var2.f33314i1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = cd1Var2.Q0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(cd1Var2.f33314i1);
                }
                org.telegram.ui.ActionBar.j6.p1(true);
                cd1Var2.Y0(2, false);
                return;
            default:
                cd1 cd1Var3 = this.f37719b;
                org.telegram.ui.ActionBar.h6 h6Var3 = cd1Var3.f33333s;
                if (h6Var3.f19767j == 4294967296L) {
                    h6Var3.f19767j = 0L;
                    h6Var3.f19768k = 0L;
                    h6Var3.f19769l = 0L;
                    h6Var3.f19770m = 0L;
                    cd1Var3.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                cd1Var3.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                cd1Var3.Y0(2, false);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
