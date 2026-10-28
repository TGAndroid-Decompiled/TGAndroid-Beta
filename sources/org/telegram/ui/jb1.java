package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class jb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.bm0, org.telegram.ui.Components.x91, org.telegram.ui.ActionBar.b2 {
    public final int f40506a;
    public final vc1 f40507b;

    public jb1(vc1 vc1Var, int i10) {
        this.f40506a = i10;
        this.f40507b = vc1Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        vc1 vc1Var = this.f40507b;
        if (!(vc1Var.C1 instanceof di1)) {
            Drawable drawable = imageReceiver.getDrawable();
            if (z10 && drawable != null) {
                ub1 ub1Var = vc1Var.f44246a;
                AndroidUtilities.calcDrawableColor(drawable);
                ub1Var.j(vc1Var.P0(drawable), drawable, Float.valueOf(vc1Var.f44283m1));
                if (!z11 && vc1Var.G1 && vc1Var.f44310x1 == null) {
                    vc1Var.f44312y0.getImageReceiver().setCrossfadeWithOldImage(false);
                    vc1Var.j1();
                    vc1Var.f44312y0.getImageReceiver().setCrossfadeWithOldImage(true);
                }
                vc1Var.W0();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            boolean i32 = s1Var.i3(f7);
            vc1 vc1Var = this.f40507b;
            if (i32) {
                if (s1Var.getMessageObject().isOutOwner()) {
                    vc1Var.Z0(3, true);
                    return;
                } else {
                    vc1Var.Z0(1, true);
                    return;
                }
            }
            vc1Var.Z0(2, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        boolean z10;
        switch (this.f40506a) {
            case 3:
                this.f40507b.f44299t0.getActionBarMenuOnItemClick().b(4);
                return;
            case 4:
                this.f40507b.O0(false);
                return;
            case 5:
                vc1 vc1Var = this.f40507b;
                org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
                if (w6Var.f23222j == 4294967296L) {
                    w6Var.f23222j = 0L;
                    w6Var.f23223k = 0L;
                    w6Var.f23224l = 0L;
                    w6Var.f23225m = 0L;
                    vc1Var.n1(false);
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                }
                vc1Var.f44305w = true;
                org.telegram.ui.ActionBar.y6.s1(true);
                vc1Var.Z0(2, false);
                return;
            case 6:
                vc1 vc1Var2 = this.f40507b;
                org.telegram.ui.ActionBar.w6 w6Var2 = vc1Var2.v;
                if (org.telegram.ui.ActionBar.y6.b1() && org.telegram.ui.ActionBar.y6.I.f23264i0.d != 0) {
                    org.telegram.ui.ActionBar.r6 r6Var = w6Var2.f23236y;
                    w6Var2.f23222j = r6Var.d;
                    w6Var2.f23223k = r6Var.e;
                    w6Var2.f23224l = r6Var.f23054f;
                    w6Var2.f23225m = r6Var.f23055g;
                    w6Var2.f23226n = r6Var.h;
                    String str = r6Var.f23053c;
                    w6Var2.f23227o = str;
                    float f7 = r6Var.f23058k;
                    w6Var2.f23228p = f7;
                    vc1Var2.f44283m1 = f7;
                    if (str != null && !"c".equals(str)) {
                        int size = vc1Var2.V0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) vc1Var2.V0.get(i11);
                                if (tL_wallPaper.pattern && w6Var2.f23227o.equals(tL_wallPaper.slug)) {
                                    vc1Var2.X0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        vc1Var2.X0 = null;
                    }
                    vc1Var2.f44305w = true;
                    org.telegram.ui.Components.w91 w91Var = vc1Var2.K0[1];
                    if (vc1Var2.X0 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w91Var.a(z10, true);
                    vc1Var2.n1(false);
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                }
                Drawable background = vc1Var2.f44312y0.getBackground();
                if (background instanceof org.telegram.ui.Components.vc0) {
                    org.telegram.ui.Components.vc0 vc0Var = (org.telegram.ui.Components.vc0) background;
                    vc0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.y6.I.q()) {
                        if (vc1Var2.f44283m1 < 0.0f) {
                            vc1Var2.f44312y0.getImageReceiver().setGradientBitmap(vc0Var.f33688k);
                        }
                        org.telegram.ui.Cells.i0 i0Var = vc1Var2.U0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = vc1Var2.f44283m1;
                        if (f10 < 0.0f) {
                            vc1Var2.f44283m1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.i0 i0Var2 = vc1Var2.U0;
                if (i0Var2 != null) {
                    i0Var2.setProgress(vc1Var2.f44283m1);
                }
                org.telegram.ui.ActionBar.y6.s1(true);
                vc1Var2.Z0(2, false);
                return;
            default:
                vc1 vc1Var3 = this.f40507b;
                org.telegram.ui.ActionBar.w6 w6Var3 = vc1Var3.v;
                if (w6Var3.f23222j == 4294967296L) {
                    w6Var3.f23222j = 0L;
                    w6Var3.f23223k = 0L;
                    w6Var3.f23224l = 0L;
                    w6Var3.f23225m = 0L;
                    vc1Var3.n1(false);
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                }
                vc1Var3.f44305w = true;
                org.telegram.ui.ActionBar.y6.s1(true);
                vc1Var3.Z0(2, false);
                return;
        }
    }

    @Override
    public void i(int i10, int i11) {
        vc1 vc1Var = this.f40507b;
        if (!vc1Var.F1) {
            return;
        }
        vc1Var.f44312y0.getBackground();
        float f7 = 1.0f;
        if (vc1Var.C0 != null) {
            f7 = (vc1Var.f44312y0.getScaleX() - 1.0f) / (vc1Var.f44315z1 - 1.0f);
        }
        vc1Var.f44312y0.setTranslationX(i10 * f7);
        vc1Var.f44312y0.setTranslationY(i11 * f7);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
