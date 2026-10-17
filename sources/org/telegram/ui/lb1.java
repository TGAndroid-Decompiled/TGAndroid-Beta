package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class lb1 implements View.OnClickListener {
    public final int f38843a;
    public int f38844b = 0;
    public final mc1 f38845c;

    public lb1(mc1 mc1Var, int i10) {
        this.f38843a = i10;
        this.f38845c = mc1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38843a) {
            case 0:
                mc1 mc1Var = this.f38845c;
                mc1Var.F0.setRotation(this.f38844b);
                this.f38844b -= 45;
                mc1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.bs.f25031g).start();
                bc1[] bc1VarArr = mc1Var.f39156w0;
                bc1 bc1Var = bc1VarArr[0];
                if (bc1Var != null) {
                    Drawable background = bc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.wc0) {
                        ((org.telegram.ui.Components.wc0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = mc1Var.f39146s;
                        if (mc1Var.f39100b == 2) {
                            mc1Var.f39122h1 += 45;
                            while (true) {
                                int i10 = mc1Var.f39122h1;
                                if (i10 >= 360) {
                                    mc1Var.f39122h1 = i10 - 360;
                                } else {
                                    mc1Var.a1(mc1Var.Z0, 0, true);
                                }
                            }
                        } else if (f6Var != null) {
                            f6Var.f20838n += 45;
                            while (true) {
                                int i11 = f6Var.f20838n;
                                if (i11 >= 360) {
                                    f6Var.f20838n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.h6.o1(false, false);
                                }
                            }
                        }
                    }
                }
                bc1 bc1Var2 = bc1VarArr[1];
                if (bc1Var2 != null) {
                    Drawable background2 = bc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.wc0) {
                        ((org.telegram.ui.Components.wc0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                mc1 mc1Var2 = this.f38845c;
                org.telegram.ui.ActionBar.p5 p5Var = mc1Var2.R;
                mc1Var2.G0.setRotation(this.f38844b);
                this.f38844b -= 45;
                mc1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.bs.f25031g).start();
                org.telegram.ui.ActionBar.f6 f6Var2 = mc1Var2.f39146s;
                if (f6Var2.f20833i) {
                    if (p5Var.i() != null) {
                        p5Var.i().w(false);
                        return;
                    }
                    return;
                }
                int i12 = f6Var2.h;
                if (i12 != 0) {
                    int i13 = f6Var2.e;
                    if (i13 == 0) {
                        i13 = f6Var2.f20830c;
                    }
                    f6Var2.e = f6Var2.f20831f;
                    f6Var2.f20831f = f6Var2.f20832g;
                    f6Var2.f20832g = i12;
                    f6Var2.h = i13;
                } else {
                    int i14 = f6Var2.e;
                    if (i14 == 0) {
                        i14 = f6Var2.f20830c;
                    }
                    f6Var2.e = f6Var2.f20831f;
                    f6Var2.f20831f = f6Var2.f20832g;
                    f6Var2.f20832g = i14;
                }
                mc1Var2.V.e(f6Var2.h, 3);
                mc1Var2.V.e(f6Var2.f20832g, 2);
                mc1Var2.V.e(f6Var2.f20831f, 1);
                org.telegram.ui.Components.wq wqVar = mc1Var2.V;
                int i15 = f6Var2.e;
                if (i15 == 0) {
                    i15 = f6Var2.f20830c;
                }
                wqVar.e(i15, 0);
                mc1Var2.K0[1].b(0, f6Var2.e);
                mc1Var2.K0[1].b(1, f6Var2.f20831f);
                mc1Var2.K0[1].b(2, f6Var2.f20832g);
                mc1Var2.K0[1].b(3, f6Var2.h);
                org.telegram.ui.ActionBar.h6.o1(true, true);
                mc1Var2.f39151u0.f1();
                return;
        }
    }
}
