package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class hc1 implements View.OnClickListener {
    public final int f37325a;
    public int f37326b = 0;
    public final jd1 f37327c;

    public hc1(jd1 jd1Var, int i10) {
        this.f37325a = i10;
        this.f37327c = jd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37325a) {
            case 0:
                jd1 jd1Var = this.f37327c;
                jd1Var.C0.setRotation(this.f37326b);
                this.f37326b -= 45;
                jd1Var.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.pr.f30169g).start();
                yc1[] yc1VarArr = jd1Var.f38011t0;
                yc1 yc1Var = yc1VarArr[0];
                if (yc1Var != null) {
                    Drawable background = yc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.fc0) {
                        ((org.telegram.ui.Components.fc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = jd1Var.f38008s;
                        if (jd1Var.f37964b == 2) {
                            jd1Var.f37977e1 += 45;
                            while (true) {
                                int i10 = jd1Var.f37977e1;
                                if (i10 >= 360) {
                                    jd1Var.f37977e1 = i10 - 360;
                                } else {
                                    jd1Var.a1(jd1Var.W0, 0, true);
                                }
                            }
                        } else if (i6Var != null) {
                            i6Var.f21480n += 45;
                            while (true) {
                                int i11 = i6Var.f21480n;
                                if (i11 >= 360) {
                                    i6Var.f21480n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.k6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                yc1 yc1Var2 = yc1VarArr[1];
                if (yc1Var2 != null) {
                    Drawable background2 = yc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.fc0) {
                        ((org.telegram.ui.Components.fc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                jd1 jd1Var2 = this.f37327c;
                org.telegram.ui.ActionBar.r5 r5Var = jd1Var2.O;
                jd1Var2.D0.setRotation(this.f37326b);
                this.f37326b -= 45;
                jd1Var2.D0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.pr.f30169g).start();
                org.telegram.ui.ActionBar.i6 i6Var2 = jd1Var2.f38008s;
                if (i6Var2.f21475i) {
                    if (r5Var.i() != null) {
                        r5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = i6Var2.h;
                if (i12 != 0) {
                    int i13 = i6Var2.f21472e;
                    if (i13 == 0) {
                        i13 = i6Var2.f21471c;
                    }
                    i6Var2.f21472e = i6Var2.f21473f;
                    i6Var2.f21473f = i6Var2.f21474g;
                    i6Var2.f21474g = i12;
                    i6Var2.h = i13;
                } else {
                    int i14 = i6Var2.f21472e;
                    if (i14 == 0) {
                        i14 = i6Var2.f21471c;
                    }
                    i6Var2.f21472e = i6Var2.f21473f;
                    i6Var2.f21473f = i6Var2.f21474g;
                    i6Var2.f21474g = i14;
                }
                jd1Var2.S.e(i6Var2.h, 3);
                jd1Var2.S.e(i6Var2.f21474g, 2);
                jd1Var2.S.e(i6Var2.f21473f, 1);
                org.telegram.ui.Components.mq mqVar = jd1Var2.S;
                int i15 = i6Var2.f21472e;
                if (i15 == 0) {
                    i15 = i6Var2.f21471c;
                }
                mqVar.e(i15, 0);
                jd1Var2.H0[1].b(0, i6Var2.f21472e);
                jd1Var2.H0[1].b(1, i6Var2.f21473f);
                jd1Var2.H0[1].b(2, i6Var2.f21474g);
                jd1Var2.H0[1].b(3, i6Var2.h);
                org.telegram.ui.ActionBar.k6.n1(true, true);
                jd1Var2.f38006r0.e1();
                return;
        }
    }
}
