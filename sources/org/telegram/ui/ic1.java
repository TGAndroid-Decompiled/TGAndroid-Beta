package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class ic1 implements View.OnClickListener {
    public final int f34899a;
    public int f34900b = 0;
    public final jd1 f34901c;

    public ic1(jd1 jd1Var, int i10) {
        this.f34899a = i10;
        this.f34901c = jd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34899a) {
            case 0:
                jd1 jd1Var = this.f34901c;
                jd1Var.C0.setRotation(this.f34900b);
                this.f34900b -= 45;
                jd1Var.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.mr.f27123g).start();
                yc1[] yc1VarArr = jd1Var.f35228t0;
                yc1 yc1Var = yc1VarArr[0];
                if (yc1Var != null) {
                    Drawable background = yc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.ec0) {
                        ((org.telegram.ui.Components.ec0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = jd1Var.f35225s;
                        if (jd1Var.f35182b == 2) {
                            jd1Var.f35194e1 += 45;
                            while (true) {
                                int i10 = jd1Var.f35194e1;
                                if (i10 >= 360) {
                                    jd1Var.f35194e1 = i10 - 360;
                                } else {
                                    jd1Var.a1(jd1Var.W0, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.f19746n += 45;
                            while (true) {
                                int i11 = h6Var.f19746n;
                                if (i11 >= 360) {
                                    h6Var.f19746n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.j6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                yc1 yc1Var2 = yc1VarArr[1];
                if (yc1Var2 != null) {
                    Drawable background2 = yc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.ec0) {
                        ((org.telegram.ui.Components.ec0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                jd1 jd1Var2 = this.f34901c;
                org.telegram.ui.ActionBar.q5 q5Var = jd1Var2.O;
                jd1Var2.D0.setRotation(this.f34900b);
                this.f34900b -= 45;
                jd1Var2.D0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.mr.f27123g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = jd1Var2.f35225s;
                if (h6Var2.f19741i) {
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
                        i13 = h6Var2.f19738c;
                    }
                    h6Var2.e = h6Var2.f19739f;
                    h6Var2.f19739f = h6Var2.f19740g;
                    h6Var2.f19740g = i12;
                    h6Var2.h = i13;
                } else {
                    int i14 = h6Var2.e;
                    if (i14 == 0) {
                        i14 = h6Var2.f19738c;
                    }
                    h6Var2.e = h6Var2.f19739f;
                    h6Var2.f19739f = h6Var2.f19740g;
                    h6Var2.f19740g = i14;
                }
                jd1Var2.S.e(h6Var2.h, 3);
                jd1Var2.S.e(h6Var2.f19740g, 2);
                jd1Var2.S.e(h6Var2.f19739f, 1);
                org.telegram.ui.Components.jq jqVar = jd1Var2.S;
                int i15 = h6Var2.e;
                if (i15 == 0) {
                    i15 = h6Var2.f19738c;
                }
                jqVar.e(i15, 0);
                jd1Var2.H0[1].b(0, h6Var2.e);
                jd1Var2.H0[1].b(1, h6Var2.f19739f);
                jd1Var2.H0[1].b(2, h6Var2.f19740g);
                jd1Var2.H0[1].b(3, h6Var2.h);
                org.telegram.ui.ActionBar.j6.n1(true, true);
                jd1Var2.f35223r0.e1();
                return;
        }
    }
}
