package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class nc1 implements View.OnClickListener {
    public final int f35499a;
    public int f35500b = 0;
    public final od1 f35501c;

    public nc1(od1 od1Var, int i10) {
        this.f35499a = i10;
        this.f35501c = od1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35499a) {
            case 0:
                od1 od1Var = this.f35501c;
                od1Var.F0.setRotation(this.f35500b);
                this.f35500b -= 45;
                od1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.rr.f27702g).start();
                dd1[] dd1VarArr = od1Var.f35839w0;
                dd1 dd1Var = dd1VarArr[0];
                if (dd1Var != null) {
                    Drawable background = dd1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.bc0) {
                        ((org.telegram.ui.Components.bc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = od1Var.f35829s;
                        if (od1Var.f35783b == 2) {
                            od1Var.f35805h1 += 45;
                            while (true) {
                                int i10 = od1Var.f35805h1;
                                if (i10 >= 360) {
                                    od1Var.f35805h1 = i10 - 360;
                                } else {
                                    od1Var.a1(od1Var.Z0, 0, true);
                                }
                            }
                        } else if (f6Var != null) {
                            f6Var.f18646n += 45;
                            while (true) {
                                int i11 = f6Var.f18646n;
                                if (i11 >= 360) {
                                    f6Var.f18646n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.h6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                dd1 dd1Var2 = dd1VarArr[1];
                if (dd1Var2 != null) {
                    Drawable background2 = dd1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.bc0) {
                        ((org.telegram.ui.Components.bc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                od1 od1Var2 = this.f35501c;
                org.telegram.ui.ActionBar.p5 p5Var = od1Var2.R;
                od1Var2.G0.setRotation(this.f35500b);
                this.f35500b -= 45;
                od1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.rr.f27702g).start();
                org.telegram.ui.ActionBar.f6 f6Var2 = od1Var2.f35829s;
                if (f6Var2.f18641i) {
                    if (p5Var.i() != null) {
                        p5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = f6Var2.h;
                if (i12 != 0) {
                    int i13 = f6Var2.e;
                    if (i13 == 0) {
                        i13 = f6Var2.f18638c;
                    }
                    f6Var2.e = f6Var2.f18639f;
                    f6Var2.f18639f = f6Var2.f18640g;
                    f6Var2.f18640g = i12;
                    f6Var2.h = i13;
                } else {
                    int i14 = f6Var2.e;
                    if (i14 == 0) {
                        i14 = f6Var2.f18638c;
                    }
                    f6Var2.e = f6Var2.f18639f;
                    f6Var2.f18639f = f6Var2.f18640g;
                    f6Var2.f18640g = i14;
                }
                od1Var2.V.e(f6Var2.h, 3);
                od1Var2.V.e(f6Var2.f18640g, 2);
                od1Var2.V.e(f6Var2.f18639f, 1);
                org.telegram.ui.Components.nq nqVar = od1Var2.V;
                int i15 = f6Var2.e;
                if (i15 == 0) {
                    i15 = f6Var2.f18638c;
                }
                nqVar.e(i15, 0);
                od1Var2.K0[1].b(0, f6Var2.e);
                od1Var2.K0[1].b(1, f6Var2.f18639f);
                od1Var2.K0[1].b(2, f6Var2.f18640g);
                od1Var2.K0[1].b(3, f6Var2.h);
                org.telegram.ui.ActionBar.h6.n1(true, true);
                od1Var2.f35834u0.f1();
                return;
        }
    }
}
