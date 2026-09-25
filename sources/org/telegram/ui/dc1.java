package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class dc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.ll0, org.telegram.ui.Components.y81, org.telegram.ui.ActionBar.z1 {
    public final int f33078a;
    public final od1 f33079b;

    public dc1(od1 od1Var, int i10) {
        this.f33078a = i10;
        this.f33079b = od1Var;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            od1 od1Var = this.f33079b;
            if (i32) {
                if (u1Var.getMessageObject().isOutOwner()) {
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
        od1 od1Var = this.f33079b;
        if (!(od1Var.B1 instanceof yi1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                oc1 oc1Var = od1Var.f36153a;
                AndroidUtilities.calcDrawableColor(drawable);
                oc1Var.b(od1Var.P0(drawable), drawable, Float.valueOf(od1Var.l1));
                if (!z11 && od1Var.F1 && od1Var.f36213w1 == null) {
                    od1Var.f36215x0.getImageReceiver().setCrossfadeWithOldImage(false);
                    od1Var.i1();
                    od1Var.f36215x0.getImageReceiver().setCrossfadeWithOldImage(true);
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
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10;
        switch (this.f33078a) {
            case 3:
                this.f33079b.f36203s0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f33079b.O0(false);
                return;
            case 5:
                od1 od1Var = this.f33079b;
                org.telegram.ui.ActionBar.f6 f6Var = od1Var.f36202s;
                if (f6Var.f18892j == 4294967296L) {
                    f6Var.f18892j = 0L;
                    f6Var.f18893k = 0L;
                    f6Var.f18894l = 0L;
                    f6Var.f18895m = 0L;
                    od1Var.m1(false);
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                }
                od1Var.v = true;
                org.telegram.ui.ActionBar.h6.p1(true);
                od1Var.Y0(2, false);
                return;
            case 6:
                od1 od1Var2 = this.f33079b;
                org.telegram.ui.ActionBar.f6 f6Var2 = od1Var2.f36202s;
                if (org.telegram.ui.ActionBar.h6.Z0() && org.telegram.ui.ActionBar.h6.I.f18945i0.d != 0) {
                    org.telegram.ui.ActionBar.z5 z5Var = f6Var2.f18906y;
                    f6Var2.f18892j = z5Var.d;
                    f6Var2.f18893k = z5Var.e;
                    f6Var2.f18894l = z5Var.f19962f;
                    f6Var2.f18895m = z5Var.f19963g;
                    f6Var2.f18896n = z5Var.h;
                    String str = z5Var.f19961c;
                    f6Var2.f18897o = str;
                    float f7 = z5Var.f19966k;
                    f6Var2.f18898p = f7;
                    od1Var2.l1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = od1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) od1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && f6Var2.f18897o.equals(tL_wallPaper.slug)) {
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
                    org.telegram.ui.Components.x81 x81Var = od1Var2.J0[1];
                    if (od1Var2.W0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x81Var.a(z10, true);
                    od1Var2.m1(false);
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                }
                Drawable background = od1Var2.f36215x0.getBackground();
                if (background instanceof org.telegram.ui.Components.mc0) {
                    org.telegram.ui.Components.mc0 mc0Var = (org.telegram.ui.Components.mc0) background;
                    mc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.h6.I.q()) {
                        if (od1Var2.l1 < 0.0f) {
                            od1Var2.f36215x0.getImageReceiver().setGradientBitmap(mc0Var.f26443k);
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
                od1 od1Var3 = this.f33079b;
                org.telegram.ui.ActionBar.f6 f6Var3 = od1Var3.f36202s;
                if (f6Var3.f18892j == 4294967296L) {
                    f6Var3.f18892j = 0L;
                    f6Var3.f18893k = 0L;
                    f6Var3.f18894l = 0L;
                    f6Var3.f18895m = 0L;
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
    public void g(int i10, int i11) {
        od1 od1Var = this.f33079b;
        if (!od1Var.E1) {
            return;
        }
        od1Var.f36215x0.getBackground();
        float f7 = 1.0f;
        if (od1Var.B0 != null) {
            f7 = (od1Var.f36215x0.getScaleX() - 1.0f) / (od1Var.f36219y1 - 1.0f);
        }
        od1Var.f36215x0.setTranslationX(i10 * f7);
        od1Var.f36215x0.setTranslationY(i11 * f7);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
