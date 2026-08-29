package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class ob1 implements View.OnClickListener {
    public final int f41081a;
    public int f41082b = 0;
    public final qc1 f41083c;

    public ob1(qc1 qc1Var, int i10) {
        this.f41081a = i10;
        this.f41083c = qc1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41081a) {
            case 0:
                qc1 qc1Var = this.f41083c;
                qc1Var.B0.setRotation(this.f41082b);
                this.f41082b -= 45;
                qc1Var.B0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.jr.f29801g).start();
                fc1[] fc1VarArr = qc1Var.f41670s0;
                fc1 fc1Var = fc1VarArr[0];
                if (fc1Var != null) {
                    Drawable background = fc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.yb0) {
                        ((org.telegram.ui.Components.yb0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.e6 e6Var = qc1Var.f41669s;
                        if (qc1Var.f41626b == 2) {
                            qc1Var.f41635d1 += 45;
                            while (true) {
                                int i10 = qc1Var.f41635d1;
                                if (i10 >= 360) {
                                    qc1Var.f41635d1 = i10 - 360;
                                } else {
                                    qc1Var.a1(qc1Var.V0, 0, true);
                                }
                            }
                        } else if (e6Var != null) {
                            e6Var.f22913n += 45;
                            while (true) {
                                int i11 = e6Var.f22913n;
                                if (i11 >= 360) {
                                    e6Var.f22913n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.g6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                fc1 fc1Var2 = fc1VarArr[1];
                if (fc1Var2 != null) {
                    Drawable background2 = fc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.yb0) {
                        ((org.telegram.ui.Components.yb0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                qc1 qc1Var2 = this.f41083c;
                org.telegram.ui.ActionBar.n5 n5Var = qc1Var2.N;
                qc1Var2.C0.setRotation(this.f41082b);
                this.f41082b -= 45;
                qc1Var2.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.jr.f29801g).start();
                org.telegram.ui.ActionBar.e6 e6Var2 = qc1Var2.f41669s;
                if (e6Var2.f22908i) {
                    if (n5Var.i() != null) {
                        n5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = e6Var2.h;
                if (i12 != 0) {
                    int i13 = e6Var2.f22905e;
                    if (i13 == 0) {
                        i13 = e6Var2.f22904c;
                    }
                    e6Var2.f22905e = e6Var2.f22906f;
                    e6Var2.f22906f = e6Var2.f22907g;
                    e6Var2.f22907g = i12;
                    e6Var2.h = i13;
                } else {
                    int i14 = e6Var2.f22905e;
                    if (i14 == 0) {
                        i14 = e6Var2.f22904c;
                    }
                    e6Var2.f22905e = e6Var2.f22906f;
                    e6Var2.f22906f = e6Var2.f22907g;
                    e6Var2.f22907g = i14;
                }
                qc1Var2.R.e(e6Var2.h, 3);
                qc1Var2.R.e(e6Var2.f22907g, 2);
                qc1Var2.R.e(e6Var2.f22906f, 1);
                org.telegram.ui.Components.gq gqVar = qc1Var2.R;
                int i15 = e6Var2.f22905e;
                if (i15 == 0) {
                    i15 = e6Var2.f22904c;
                }
                gqVar.e(i15, 0);
                qc1Var2.G0[1].b(0, e6Var2.f22905e);
                qc1Var2.G0[1].b(1, e6Var2.f22906f);
                qc1Var2.G0[1].b(2, e6Var2.f22907g);
                qc1Var2.G0[1].b(3, e6Var2.h);
                org.telegram.ui.ActionBar.g6.n1(true, true);
                qc1Var2.f41664q0.f1();
                return;
        }
    }
}
