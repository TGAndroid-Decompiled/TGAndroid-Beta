package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class oc1 implements View.OnClickListener {
    public final int f39172a;
    public int f39173b = 0;
    public final pd1 f39174c;

    public oc1(pd1 pd1Var, int i10) {
        this.f39172a = i10;
        this.f39174c = pd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39172a) {
            case 0:
                pd1 pd1Var = this.f39174c;
                pd1Var.F0.setRotation(this.f39173b);
                this.f39173b -= 45;
                pd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.tr.f31216g).start();
                ed1[] ed1VarArr = pd1Var.f39547w0;
                ed1 ed1Var = ed1VarArr[0];
                if (ed1Var != null) {
                    Drawable background = ed1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.pc0) {
                        ((org.telegram.ui.Components.pc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = pd1Var.f39537s;
                        if (pd1Var.f39490b == 2) {
                            pd1Var.f39513h1 += 45;
                            while (true) {
                                int i10 = pd1Var.f39513h1;
                                if (i10 >= 360) {
                                    pd1Var.f39513h1 = i10 - 360;
                                } else {
                                    pd1Var.a1(pd1Var.Z0, 0, true);
                                }
                            }
                        } else if (f6Var != null) {
                            f6Var.f20631n += 45;
                            while (true) {
                                int i11 = f6Var.f20631n;
                                if (i11 >= 360) {
                                    f6Var.f20631n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.i6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                ed1 ed1Var2 = ed1VarArr[1];
                if (ed1Var2 != null) {
                    Drawable background2 = ed1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.pc0) {
                        ((org.telegram.ui.Components.pc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                pd1 pd1Var2 = this.f39174c;
                org.telegram.ui.ActionBar.p5 p5Var = pd1Var2.R;
                pd1Var2.G0.setRotation(this.f39173b);
                this.f39173b -= 45;
                pd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.tr.f31216g).start();
                org.telegram.ui.ActionBar.f6 f6Var2 = pd1Var2.f39537s;
                if (f6Var2.f20626i) {
                    if (p5Var.i() != null) {
                        p5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = f6Var2.h;
                if (i12 != 0) {
                    int i13 = f6Var2.f20623e;
                    if (i13 == 0) {
                        i13 = f6Var2.f20622c;
                    }
                    f6Var2.f20623e = f6Var2.f20624f;
                    f6Var2.f20624f = f6Var2.f20625g;
                    f6Var2.f20625g = i12;
                    f6Var2.h = i13;
                } else {
                    int i14 = f6Var2.f20623e;
                    if (i14 == 0) {
                        i14 = f6Var2.f20622c;
                    }
                    f6Var2.f20623e = f6Var2.f20624f;
                    f6Var2.f20624f = f6Var2.f20625g;
                    f6Var2.f20625g = i14;
                }
                pd1Var2.V.e(f6Var2.h, 3);
                pd1Var2.V.e(f6Var2.f20625g, 2);
                pd1Var2.V.e(f6Var2.f20624f, 1);
                org.telegram.ui.Components.pq pqVar = pd1Var2.V;
                int i15 = f6Var2.f20623e;
                if (i15 == 0) {
                    i15 = f6Var2.f20622c;
                }
                pqVar.e(i15, 0);
                pd1Var2.K0[1].b(0, f6Var2.f20623e);
                pd1Var2.K0[1].b(1, f6Var2.f20624f);
                pd1Var2.K0[1].b(2, f6Var2.f20625g);
                pd1Var2.K0[1].b(3, f6Var2.h);
                org.telegram.ui.ActionBar.i6.n1(true, true);
                pd1Var2.f39542u0.g1();
                return;
        }
    }
}
