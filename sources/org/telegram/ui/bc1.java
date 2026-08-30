package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class bc1 implements View.OnClickListener {
    public final int f32907a;
    public int f32908b = 0;
    public final cd1 f32909c;

    public bc1(cd1 cd1Var, int i10) {
        this.f32907a = i10;
        this.f32909c = cd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32907a) {
            case 0:
                cd1 cd1Var = this.f32909c;
                cd1Var.C0.setRotation(this.f32908b);
                this.f32908b -= 45;
                cd1Var.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.f27347g).start();
                rc1[] rc1VarArr = cd1Var.f33336t0;
                rc1 rc1Var = rc1VarArr[0];
                if (rc1Var != null) {
                    Drawable background = rc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.dc0) {
                        ((org.telegram.ui.Components.dc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = cd1Var.f33333s;
                        if (cd1Var.f33290b == 2) {
                            cd1Var.f33302e1 += 45;
                            while (true) {
                                int i10 = cd1Var.f33302e1;
                                if (i10 >= 360) {
                                    cd1Var.f33302e1 = i10 - 360;
                                } else {
                                    cd1Var.a1(cd1Var.W0, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.f19771n += 45;
                            while (true) {
                                int i11 = h6Var.f19771n;
                                if (i11 >= 360) {
                                    h6Var.f19771n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.j6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                rc1 rc1Var2 = rc1VarArr[1];
                if (rc1Var2 != null) {
                    Drawable background2 = rc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.dc0) {
                        ((org.telegram.ui.Components.dc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                cd1 cd1Var2 = this.f32909c;
                org.telegram.ui.ActionBar.q5 q5Var = cd1Var2.O;
                cd1Var2.D0.setRotation(this.f32908b);
                this.f32908b -= 45;
                cd1Var2.D0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.f27347g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = cd1Var2.f33333s;
                if (h6Var2.f19766i) {
                    if (q5Var.i() != null) {
                        q5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = h6Var2.h;
                if (i12 != 0) {
                    int i13 = h6Var2.e;
                    if (i13 == 0) {
                        i13 = h6Var2.f19763c;
                    }
                    h6Var2.e = h6Var2.f19764f;
                    h6Var2.f19764f = h6Var2.f19765g;
                    h6Var2.f19765g = i12;
                    h6Var2.h = i13;
                } else {
                    int i14 = h6Var2.e;
                    if (i14 == 0) {
                        i14 = h6Var2.f19763c;
                    }
                    h6Var2.e = h6Var2.f19764f;
                    h6Var2.f19764f = h6Var2.f19765g;
                    h6Var2.f19765g = i14;
                }
                cd1Var2.S.e(h6Var2.h, 3);
                cd1Var2.S.e(h6Var2.f19765g, 2);
                cd1Var2.S.e(h6Var2.f19764f, 1);
                org.telegram.ui.Components.kq kqVar = cd1Var2.S;
                int i15 = h6Var2.e;
                if (i15 == 0) {
                    i15 = h6Var2.f19763c;
                }
                kqVar.e(i15, 0);
                cd1Var2.H0[1].b(0, h6Var2.e);
                cd1Var2.H0[1].b(1, h6Var2.f19764f);
                cd1Var2.H0[1].b(2, h6Var2.f19765g);
                cd1Var2.H0[1].b(3, h6Var2.h);
                org.telegram.ui.ActionBar.j6.n1(true, true);
                cd1Var2.f33331r0.f1();
                return;
        }
    }
}
