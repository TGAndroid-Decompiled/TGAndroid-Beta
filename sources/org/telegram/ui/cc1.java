package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class cc1 implements View.OnClickListener {
    public final int f35770a;
    public int f35771b = 0;
    public final ed1 f35772c;

    public cc1(ed1 ed1Var, int i10) {
        this.f35770a = i10;
        this.f35772c = ed1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35770a) {
            case 0:
                ed1 ed1Var = this.f35772c;
                ed1Var.C0.setRotation(this.f35771b);
                this.f35771b -= 45;
                ed1Var.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.pr.f30184g).start();
                tc1[] tc1VarArr = ed1Var.f36536t0;
                tc1 tc1Var = tc1VarArr[0];
                if (tc1Var != null) {
                    Drawable background = tc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.fc0) {
                        ((org.telegram.ui.Components.fc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = ed1Var.f36533s;
                        if (ed1Var.f36489b == 2) {
                            ed1Var.f36502e1 += 45;
                            while (true) {
                                int i10 = ed1Var.f36502e1;
                                if (i10 >= 360) {
                                    ed1Var.f36502e1 = i10 - 360;
                                } else {
                                    ed1Var.a1(ed1Var.W0, 0, true);
                                }
                            }
                        } else if (i6Var != null) {
                            i6Var.f21478n += 45;
                            while (true) {
                                int i11 = i6Var.f21478n;
                                if (i11 >= 360) {
                                    i6Var.f21478n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.k6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                tc1 tc1Var2 = tc1VarArr[1];
                if (tc1Var2 != null) {
                    Drawable background2 = tc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.fc0) {
                        ((org.telegram.ui.Components.fc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                ed1 ed1Var2 = this.f35772c;
                org.telegram.ui.ActionBar.r5 r5Var = ed1Var2.O;
                ed1Var2.D0.setRotation(this.f35771b);
                this.f35771b -= 45;
                ed1Var2.D0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.pr.f30184g).start();
                org.telegram.ui.ActionBar.i6 i6Var2 = ed1Var2.f36533s;
                if (i6Var2.f21473i) {
                    if (r5Var.i() != null) {
                        r5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = i6Var2.h;
                if (i12 != 0) {
                    int i13 = i6Var2.f21470e;
                    if (i13 == 0) {
                        i13 = i6Var2.f21469c;
                    }
                    i6Var2.f21470e = i6Var2.f21471f;
                    i6Var2.f21471f = i6Var2.f21472g;
                    i6Var2.f21472g = i12;
                    i6Var2.h = i13;
                } else {
                    int i14 = i6Var2.f21470e;
                    if (i14 == 0) {
                        i14 = i6Var2.f21469c;
                    }
                    i6Var2.f21470e = i6Var2.f21471f;
                    i6Var2.f21471f = i6Var2.f21472g;
                    i6Var2.f21472g = i14;
                }
                ed1Var2.S.e(i6Var2.h, 3);
                ed1Var2.S.e(i6Var2.f21472g, 2);
                ed1Var2.S.e(i6Var2.f21471f, 1);
                org.telegram.ui.Components.mq mqVar = ed1Var2.S;
                int i15 = i6Var2.f21470e;
                if (i15 == 0) {
                    i15 = i6Var2.f21469c;
                }
                mqVar.e(i15, 0);
                ed1Var2.H0[1].b(0, i6Var2.f21470e);
                ed1Var2.H0[1].b(1, i6Var2.f21471f);
                ed1Var2.H0[1].b(2, i6Var2.f21472g);
                ed1Var2.H0[1].b(3, i6Var2.h);
                org.telegram.ui.ActionBar.k6.n1(true, true);
                ed1Var2.f36531r0.f1();
                return;
        }
    }
}
