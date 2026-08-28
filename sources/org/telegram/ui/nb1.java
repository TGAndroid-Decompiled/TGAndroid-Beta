package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class nb1 implements View.OnClickListener {
    public final int f40689a;
    public int f40690b = 0;
    public final oc1 f40691c;

    public nb1(oc1 oc1Var, int i9) {
        this.f40689a = i9;
        this.f40691c = oc1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40689a) {
            case 0:
                oc1 oc1Var = this.f40691c;
                oc1Var.B0.setRotation(this.f40690b);
                this.f40690b -= 45;
                oc1Var.B0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.gr.f28845g).start();
                dc1[] dc1VarArr = oc1Var.f41103s0;
                dc1 dc1Var = dc1VarArr[0];
                if (dc1Var != null) {
                    Drawable background = dc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.jb0) {
                        ((org.telegram.ui.Components.jb0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.d6 d6Var = oc1Var.f41102s;
                        if (oc1Var.f41059b == 2) {
                            oc1Var.f41068d1 += 45;
                            while (true) {
                                int i9 = oc1Var.f41068d1;
                                if (i9 >= 360) {
                                    oc1Var.f41068d1 = i9 - 360;
                                } else {
                                    oc1Var.a1(oc1Var.V0, 0, true);
                                }
                            }
                        } else if (d6Var != null) {
                            d6Var.f22877n += 45;
                            while (true) {
                                int i10 = d6Var.f22877n;
                                if (i10 >= 360) {
                                    d6Var.f22877n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.f6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                dc1 dc1Var2 = dc1VarArr[1];
                if (dc1Var2 != null) {
                    Drawable background2 = dc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.jb0) {
                        ((org.telegram.ui.Components.jb0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                oc1 oc1Var2 = this.f40691c;
                org.telegram.ui.ActionBar.n5 n5Var = oc1Var2.N;
                oc1Var2.C0.setRotation(this.f40690b);
                this.f40690b -= 45;
                oc1Var2.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.gr.f28845g).start();
                org.telegram.ui.ActionBar.d6 d6Var2 = oc1Var2.f41102s;
                if (d6Var2.f22872i) {
                    if (n5Var.i() != null) {
                        n5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i11 = d6Var2.h;
                if (i11 != 0) {
                    int i12 = d6Var2.f22869e;
                    if (i12 == 0) {
                        i12 = d6Var2.f22868c;
                    }
                    d6Var2.f22869e = d6Var2.f22870f;
                    d6Var2.f22870f = d6Var2.f22871g;
                    d6Var2.f22871g = i11;
                    d6Var2.h = i12;
                } else {
                    int i13 = d6Var2.f22869e;
                    if (i13 == 0) {
                        i13 = d6Var2.f22868c;
                    }
                    d6Var2.f22869e = d6Var2.f22870f;
                    d6Var2.f22870f = d6Var2.f22871g;
                    d6Var2.f22871g = i13;
                }
                oc1Var2.R.e(d6Var2.h, 3);
                oc1Var2.R.e(d6Var2.f22871g, 2);
                oc1Var2.R.e(d6Var2.f22870f, 1);
                org.telegram.ui.Components.cq cqVar = oc1Var2.R;
                int i14 = d6Var2.f22869e;
                if (i14 == 0) {
                    i14 = d6Var2.f22868c;
                }
                cqVar.e(i14, 0);
                oc1Var2.G0[1].b(0, d6Var2.f22869e);
                oc1Var2.G0[1].b(1, d6Var2.f22870f);
                oc1Var2.G0[1].b(2, d6Var2.f22871g);
                oc1Var2.G0[1].b(3, d6Var2.h);
                org.telegram.ui.ActionBar.f6.n1(true, true);
                oc1Var2.f41097q0.f1();
                return;
        }
    }
}
