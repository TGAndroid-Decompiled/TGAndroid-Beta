package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class qc1 implements View.OnClickListener {
    public final int f39694a;
    public int f39695b = 0;
    public final rd1 f39696c;

    public qc1(rd1 rd1Var, int i10) {
        this.f39694a = i10;
        this.f39696c = rd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39694a) {
            case 0:
                rd1 rd1Var = this.f39696c;
                rd1Var.F0.setRotation(this.f39695b);
                this.f39695b -= 45;
                rd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.tr.f31142g).start();
                gd1[] gd1VarArr = rd1Var.f40092w0;
                gd1 gd1Var = gd1VarArr[0];
                if (gd1Var != null) {
                    Drawable background = gd1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.pc0) {
                        ((org.telegram.ui.Components.pc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = rd1Var.f40082s;
                        if (rd1Var.f40035b == 2) {
                            rd1Var.f40058h1 += 45;
                            while (true) {
                                int i10 = rd1Var.f40058h1;
                                if (i10 >= 360) {
                                    rd1Var.f40058h1 = i10 - 360;
                                } else {
                                    rd1Var.a1(rd1Var.Z0, 0, true);
                                }
                            }
                        } else if (f6Var != null) {
                            f6Var.f20622n += 45;
                            while (true) {
                                int i11 = f6Var.f20622n;
                                if (i11 >= 360) {
                                    f6Var.f20622n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.i6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                gd1 gd1Var2 = gd1VarArr[1];
                if (gd1Var2 != null) {
                    Drawable background2 = gd1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.pc0) {
                        ((org.telegram.ui.Components.pc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                rd1 rd1Var2 = this.f39696c;
                org.telegram.ui.ActionBar.p5 p5Var = rd1Var2.R;
                rd1Var2.G0.setRotation(this.f39695b);
                this.f39695b -= 45;
                rd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.tr.f31142g).start();
                org.telegram.ui.ActionBar.f6 f6Var2 = rd1Var2.f40082s;
                if (f6Var2.f20617i) {
                    if (p5Var.i() != null) {
                        p5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = f6Var2.h;
                if (i12 != 0) {
                    int i13 = f6Var2.f20614e;
                    if (i13 == 0) {
                        i13 = f6Var2.f20613c;
                    }
                    f6Var2.f20614e = f6Var2.f20615f;
                    f6Var2.f20615f = f6Var2.f20616g;
                    f6Var2.f20616g = i12;
                    f6Var2.h = i13;
                } else {
                    int i14 = f6Var2.f20614e;
                    if (i14 == 0) {
                        i14 = f6Var2.f20613c;
                    }
                    f6Var2.f20614e = f6Var2.f20615f;
                    f6Var2.f20615f = f6Var2.f20616g;
                    f6Var2.f20616g = i14;
                }
                rd1Var2.V.e(f6Var2.h, 3);
                rd1Var2.V.e(f6Var2.f20616g, 2);
                rd1Var2.V.e(f6Var2.f20615f, 1);
                org.telegram.ui.Components.pq pqVar = rd1Var2.V;
                int i15 = f6Var2.f20614e;
                if (i15 == 0) {
                    i15 = f6Var2.f20613c;
                }
                pqVar.e(i15, 0);
                rd1Var2.K0[1].b(0, f6Var2.f20614e);
                rd1Var2.K0[1].b(1, f6Var2.f20615f);
                rd1Var2.K0[1].b(2, f6Var2.f20616g);
                rd1Var2.K0[1].b(3, f6Var2.h);
                org.telegram.ui.ActionBar.i6.n1(true, true);
                rd1Var2.f40087u0.h1();
                return;
        }
    }
}
