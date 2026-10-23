package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class pb1 implements View.OnClickListener {
    public final int f40444a;
    public int f40445b = 0;
    public final qc1 f40446c;

    public pb1(qc1 qc1Var, int i10) {
        this.f40444a = i10;
        this.f40446c = qc1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40444a) {
            case 0:
                qc1 qc1Var = this.f40446c;
                qc1Var.G0.setRotation(this.f40445b);
                this.f40445b -= 45;
                qc1Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.bs.f25134g).start();
                fc1[] fc1VarArr = qc1Var.f40776x0;
                fc1 fc1Var = fc1VarArr[0];
                if (fc1Var != null) {
                    Drawable background = fc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.yc0) {
                        ((org.telegram.ui.Components.yc0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
                        if (qc1Var.f40716b == 2) {
                            qc1Var.f40741i1 += 45;
                            while (true) {
                                int i10 = qc1Var.f40741i1;
                                if (i10 >= 360) {
                                    qc1Var.f40741i1 = i10 - 360;
                                } else {
                                    qc1Var.a1(qc1Var.f40715a1, 0, true);
                                }
                            }
                        } else if (i6Var != null) {
                            i6Var.f20974n += 45;
                            while (true) {
                                int i11 = i6Var.f20974n;
                                if (i11 >= 360) {
                                    i6Var.f20974n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.k6.q1(false, false);
                                }
                            }
                        }
                    }
                }
                fc1 fc1Var2 = fc1VarArr[1];
                if (fc1Var2 != null) {
                    Drawable background2 = fc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.yc0) {
                        ((org.telegram.ui.Components.yc0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                qc1 qc1Var2 = this.f40446c;
                org.telegram.ui.ActionBar.s5 s5Var = qc1Var2.S;
                qc1Var2.H0.setRotation(this.f40445b);
                this.f40445b -= 45;
                qc1Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.bs.f25134g).start();
                org.telegram.ui.ActionBar.i6 i6Var2 = qc1Var2.v;
                if (i6Var2.f20969i) {
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
                        i13 = i6Var2.f20966c;
                    }
                    i6Var2.e = i6Var2.f20967f;
                    i6Var2.f20967f = i6Var2.f20968g;
                    i6Var2.f20968g = i12;
                    i6Var2.h = i13;
                } else {
                    int i14 = i6Var2.e;
                    if (i14 == 0) {
                        i14 = i6Var2.f20966c;
                    }
                    i6Var2.e = i6Var2.f20967f;
                    i6Var2.f20967f = i6Var2.f20968g;
                    i6Var2.f20968g = i14;
                }
                qc1Var2.W.e(i6Var2.h, 3);
                qc1Var2.W.e(i6Var2.f20968g, 2);
                qc1Var2.W.e(i6Var2.f20967f, 1);
                org.telegram.ui.Components.wq wqVar = qc1Var2.W;
                int i15 = i6Var2.e;
                if (i15 == 0) {
                    i15 = i6Var2.f20966c;
                }
                wqVar.e(i15, 0);
                qc1Var2.L0[1].b(0, i6Var2.e);
                qc1Var2.L0[1].b(1, i6Var2.f20967f);
                qc1Var2.L0[1].b(2, i6Var2.f20968g);
                qc1Var2.L0[1].b(3, i6Var2.h);
                org.telegram.ui.ActionBar.k6.q1(true, true);
                qc1Var2.f40770v0.g1();
                return;
        }
    }
}
