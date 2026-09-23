package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class dc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.bl0, org.telegram.ui.Components.j81, org.telegram.ui.ActionBar.a2 {
    public final int f32576a;
    public final od1 f32577b;

    public dc1(od1 od1Var, int i10) {
        this.f32576a = i10;
        this.f32577b = od1Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f7);
            od1 od1Var = this.f32577b;
            if (i32) {
                if (t1Var.getMessageObject().isOutOwner()) {
                    od1Var.Y0(3, true);
                    return;
                } else {
                    od1Var.Y0(1, true);
                    return;
                }
            }
            od1Var.Y0(2, true);
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        od1 od1Var = this.f32577b;
        if (!(od1Var.B1 instanceof yi1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                oc1 oc1Var = od1Var.f35780a;
                AndroidUtilities.calcDrawableColor(drawable);
                oc1Var.b(od1Var.P0(drawable), drawable, Float.valueOf(od1Var.l1));
                if (!z11 && od1Var.F1 && od1Var.f35840w1 == null) {
                    od1Var.f35842x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    od1Var.i1();
                    od1Var.f35842x0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                od1Var.V0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        od1 od1Var = this.f32577b;
        if (!od1Var.E1) {
            return;
        }
        od1Var.f35842x0.getBackground();
        float f7 = 1.0f;
        if (od1Var.B0 != null) {
            f7 = (od1Var.f35842x0.getScaleX() - 1.0f) / (od1Var.f35846y1 - 1.0f);
        }
        od1Var.f35842x0.setTranslationX(i10 * f7);
        od1Var.f35842x0.setTranslationY(i11 * f7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        switch (this.f32576a) {
            case 3:
                this.f32577b.f35830s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f32577b.O0(false);
                return;
            case 5:
                od1 od1Var = this.f32577b;
                org.telegram.ui.ActionBar.f6 f6Var = od1Var.f35829s;
                if (f6Var.f18642j == 4294967296L) {
                    f6Var.f18642j = 0L;
                    f6Var.f18643k = 0L;
                    f6Var.f18644l = 0L;
                    f6Var.f18645m = 0L;
                    od1Var.m1(false);
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                }
                od1Var.v = true;
                org.telegram.ui.ActionBar.h6.p1(true);
                od1Var.Y0(2, false);
                return;
            case 6:
                od1 od1Var2 = this.f32577b;
                org.telegram.ui.ActionBar.f6 f6Var2 = od1Var2.f35829s;
                if (org.telegram.ui.ActionBar.h6.Z0() && org.telegram.ui.ActionBar.h6.I.f18694i0.d != 0) {
                    org.telegram.ui.ActionBar.a6 a6Var = f6Var2.f18656y;
                    f6Var2.f18642j = a6Var.d;
                    f6Var2.f18643k = a6Var.e;
                    f6Var2.f18644l = a6Var.f18426f;
                    f6Var2.f18645m = a6Var.f18427g;
                    f6Var2.f18646n = a6Var.h;
                    String str = a6Var.f18425c;
                    f6Var2.f18647o = str;
                    float f7 = a6Var.f18430k;
                    f6Var2.f18648p = f7;
                    od1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = od1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) od1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && f6Var2.f18647o.equals(tL_wallPaper.slug)) {
                                    od1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        od1Var2.W0 = null;
                    }
                    od1Var2.v = true;
                    org.telegram.ui.Components.i81 i81Var = od1Var2.J0[1];
                    if (od1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i81Var.a(z10, true);
                    od1Var2.m1(false);
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                }
                Drawable background = od1Var2.f35842x0.getBackground();
                if (background instanceof org.telegram.ui.Components.bc0) {
                    org.telegram.ui.Components.bc0 bc0Var = (org.telegram.ui.Components.bc0) background;
                    bc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.h6.I.q()) {
                        if (od1Var2.l1 < 0.0f) {
                            od1Var2.f35842x0.getImageReceiver().setGradientBitmap(bc0Var.f22686k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = od1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = od1Var2.l1;
                        if (f10 < 0.0f) {
                            od1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = od1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(od1Var2.l1);
                }
                org.telegram.ui.ActionBar.h6.p1(true);
                od1Var2.Y0(2, false);
                return;
            default:
                od1 od1Var3 = this.f32577b;
                org.telegram.ui.ActionBar.f6 f6Var3 = od1Var3.f35829s;
                if (f6Var3.f18642j == 4294967296L) {
                    f6Var3.f18642j = 0L;
                    f6Var3.f18643k = 0L;
                    f6Var3.f18644l = 0L;
                    f6Var3.f18645m = 0L;
                    od1Var3.m1(false);
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                }
                od1Var3.v = true;
                org.telegram.ui.ActionBar.h6.p1(true);
                od1Var3.Y0(2, false);
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
