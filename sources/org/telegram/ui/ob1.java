package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class ob1 implements View.OnClickListener {
    public final int f40152a;
    public int f40153b = 0;
    public final pc1 f40154c;

    public ob1(pc1 pc1Var, int i10) {
        this.f40152a = i10;
        this.f40154c = pc1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40152a) {
            case 0:
                pc1 pc1Var = this.f40154c;
                pc1Var.G0.setRotation(this.f40153b);
                this.f40153b -= 45;
                pc1Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.zr.f33338g).start();
                ec1[] ec1VarArr = pc1Var.f40505x0;
                ec1 ec1Var = ec1VarArr[0];
                if (ec1Var != null) {
                    Drawable background = ec1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.wc0) {
                        ((org.telegram.ui.Components.wc0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = pc1Var.v;
                        if (pc1Var.f40445b == 2) {
                            pc1Var.f40470i1 += 45;
                            while (true) {
                                int i10 = pc1Var.f40470i1;
                                if (i10 >= 360) {
                                    pc1Var.f40470i1 = i10 - 360;
                                } else {
                                    pc1Var.a1(pc1Var.f40444a1, 0, true);
                                }
                            }
                        } else if (i6Var != null) {
                            i6Var.f20975n += 45;
                            while (true) {
                                int i11 = i6Var.f20975n;
                                if (i11 >= 360) {
                                    i6Var.f20975n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.k6.q1(false, false);
                                }
                            }
                        }
                    }
                }
                ec1 ec1Var2 = ec1VarArr[1];
                if (ec1Var2 != null) {
                    Drawable background2 = ec1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.wc0) {
                        ((org.telegram.ui.Components.wc0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                pc1 pc1Var2 = this.f40154c;
                org.telegram.ui.ActionBar.s5 s5Var = pc1Var2.S;
                pc1Var2.H0.setRotation(this.f40153b);
                this.f40153b -= 45;
                pc1Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.zr.f33338g).start();
                org.telegram.ui.ActionBar.i6 i6Var2 = pc1Var2.v;
                if (i6Var2.f20970i) {
                    if (s5Var.i() != null) {
                        s5Var.i().w(false);
                        return;
                    }
                    return;
                }
                int i12 = i6Var2.h;
                if (i12 != 0) {
                    int i13 = i6Var2.e;
                    if (i13 == 0) {
                        i13 = i6Var2.f20967c;
                    }
                    i6Var2.e = i6Var2.f20968f;
                    i6Var2.f20968f = i6Var2.f20969g;
                    i6Var2.f20969g = i12;
                    i6Var2.h = i13;
                } else {
                    int i14 = i6Var2.e;
                    if (i14 == 0) {
                        i14 = i6Var2.f20967c;
                    }
                    i6Var2.e = i6Var2.f20968f;
                    i6Var2.f20968f = i6Var2.f20969g;
                    i6Var2.f20969g = i14;
                }
                pc1Var2.W.e(i6Var2.h, 3);
                pc1Var2.W.e(i6Var2.f20969g, 2);
                pc1Var2.W.e(i6Var2.f20968f, 1);
                org.telegram.ui.Components.uq uqVar = pc1Var2.W;
                int i15 = i6Var2.e;
                if (i15 == 0) {
                    i15 = i6Var2.f20967c;
                }
                uqVar.e(i15, 0);
                pc1Var2.L0[1].b(0, i6Var2.e);
                pc1Var2.L0[1].b(1, i6Var2.f20968f);
                pc1Var2.L0[1].b(2, i6Var2.f20969g);
                pc1Var2.L0[1].b(3, i6Var2.h);
                org.telegram.ui.ActionBar.k6.q1(true, true);
                pc1Var2.f40499v0.g1();
                return;
        }
    }
}
