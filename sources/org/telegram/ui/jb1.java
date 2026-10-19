package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class jb1 implements View.OnClickListener {
    public final int f38215a;
    public int f38216b = 0;
    public final kc1 f38217c;

    public jb1(kc1 kc1Var, int i10) {
        this.f38215a = i10;
        this.f38217c = kc1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38215a) {
            case 0:
                kc1 kc1Var = this.f38217c;
                kc1Var.F0.setRotation(this.f38216b);
                this.f38216b -= 45;
                kc1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.bs.f25015g).start();
                zb1[] zb1VarArr = kc1Var.f38568w0;
                zb1 zb1Var = zb1VarArr[0];
                if (zb1Var != null) {
                    Drawable background = zb1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.wc0) {
                        ((org.telegram.ui.Components.wc0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = kc1Var.f38558s;
                        if (kc1Var.f38512b == 2) {
                            kc1Var.f38534h1 += 45;
                            while (true) {
                                int i10 = kc1Var.f38534h1;
                                if (i10 >= 360) {
                                    kc1Var.f38534h1 = i10 - 360;
                                } else {
                                    kc1Var.a1(kc1Var.Z0, 0, true);
                                }
                            }
                        } else if (f6Var != null) {
                            f6Var.f20841n += 45;
                            while (true) {
                                int i11 = f6Var.f20841n;
                                if (i11 >= 360) {
                                    f6Var.f20841n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.h6.o1(false, false);
                                }
                            }
                        }
                    }
                }
                zb1 zb1Var2 = zb1VarArr[1];
                if (zb1Var2 != null) {
                    Drawable background2 = zb1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.wc0) {
                        ((org.telegram.ui.Components.wc0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                kc1 kc1Var2 = this.f38217c;
                org.telegram.ui.ActionBar.p5 p5Var = kc1Var2.R;
                kc1Var2.G0.setRotation(this.f38216b);
                this.f38216b -= 45;
                kc1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.bs.f25015g).start();
                org.telegram.ui.ActionBar.f6 f6Var2 = kc1Var2.f38558s;
                if (f6Var2.f20836i) {
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
                        i13 = f6Var2.f20833c;
                    }
                    f6Var2.e = f6Var2.f20834f;
                    f6Var2.f20834f = f6Var2.f20835g;
                    f6Var2.f20835g = i12;
                    f6Var2.h = i13;
                } else {
                    int i14 = f6Var2.e;
                    if (i14 == 0) {
                        i14 = f6Var2.f20833c;
                    }
                    f6Var2.e = f6Var2.f20834f;
                    f6Var2.f20834f = f6Var2.f20835g;
                    f6Var2.f20835g = i14;
                }
                kc1Var2.V.e(f6Var2.h, 3);
                kc1Var2.V.e(f6Var2.f20835g, 2);
                kc1Var2.V.e(f6Var2.f20834f, 1);
                org.telegram.ui.Components.wq wqVar = kc1Var2.V;
                int i15 = f6Var2.e;
                if (i15 == 0) {
                    i15 = f6Var2.f20833c;
                }
                wqVar.e(i15, 0);
                kc1Var2.K0[1].b(0, f6Var2.e);
                kc1Var2.K0[1].b(1, f6Var2.f20834f);
                kc1Var2.K0[1].b(2, f6Var2.f20835g);
                kc1Var2.K0[1].b(3, f6Var2.h);
                org.telegram.ui.ActionBar.h6.o1(true, true);
                kc1Var2.f38563u0.f1();
                return;
        }
    }
}
