package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class oc1 implements View.OnClickListener {
    public final int f36183a;
    public int f36184b = 0;
    public final pd1 f36185c;

    public oc1(pd1 pd1Var, int i10) {
        this.f36183a = i10;
        this.f36185c = pd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36183a) {
            case 0:
                pd1 pd1Var = this.f36185c;
                pd1Var.F0.setRotation(this.f36184b);
                this.f36184b -= 45;
                pd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.sr.f28360g).start();
                ed1[] ed1VarArr = pd1Var.f36449w0;
                ed1 ed1Var = ed1VarArr[0];
                if (ed1Var != null) {
                    Drawable background = ed1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.nc0) {
                        ((org.telegram.ui.Components.nc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = pd1Var.f36439s;
                        if (pd1Var.f36393b == 2) {
                            pd1Var.f36415h1 += 45;
                            while (true) {
                                int i10 = pd1Var.f36415h1;
                                if (i10 >= 360) {
                                    pd1Var.f36415h1 = i10 - 360;
                                } else {
                                    pd1Var.a1(pd1Var.Z0, 0, true);
                                }
                            }
                        } else if (g6Var != null) {
                            g6Var.f18916n += 45;
                            while (true) {
                                int i11 = g6Var.f18916n;
                                if (i11 >= 360) {
                                    g6Var.f18916n = i11 - 360;
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
                    if (background2 instanceof org.telegram.ui.Components.nc0) {
                        ((org.telegram.ui.Components.nc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                pd1 pd1Var2 = this.f36185c;
                org.telegram.ui.ActionBar.q5 q5Var = pd1Var2.R;
                pd1Var2.G0.setRotation(this.f36184b);
                this.f36184b -= 45;
                pd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.sr.f28360g).start();
                org.telegram.ui.ActionBar.g6 g6Var2 = pd1Var2.f36439s;
                if (g6Var2.f18911i) {
                    if (q5Var.i() != null) {
                        q5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = g6Var2.h;
                if (i12 != 0) {
                    int i13 = g6Var2.e;
                    if (i13 == 0) {
                        i13 = g6Var2.f18908c;
                    }
                    g6Var2.e = g6Var2.f18909f;
                    g6Var2.f18909f = g6Var2.f18910g;
                    g6Var2.f18910g = i12;
                    g6Var2.h = i13;
                } else {
                    int i14 = g6Var2.e;
                    if (i14 == 0) {
                        i14 = g6Var2.f18908c;
                    }
                    g6Var2.e = g6Var2.f18909f;
                    g6Var2.f18909f = g6Var2.f18910g;
                    g6Var2.f18910g = i14;
                }
                pd1Var2.V.e(g6Var2.h, 3);
                pd1Var2.V.e(g6Var2.f18910g, 2);
                pd1Var2.V.e(g6Var2.f18909f, 1);
                org.telegram.ui.Components.oq oqVar = pd1Var2.V;
                int i15 = g6Var2.e;
                if (i15 == 0) {
                    i15 = g6Var2.f18908c;
                }
                oqVar.e(i15, 0);
                pd1Var2.K0[1].b(0, g6Var2.e);
                pd1Var2.K0[1].b(1, g6Var2.f18909f);
                pd1Var2.K0[1].b(2, g6Var2.f18910g);
                pd1Var2.K0[1].b(3, g6Var2.h);
                org.telegram.ui.ActionBar.i6.n1(true, true);
                pd1Var2.f36444u0.g1();
                return;
        }
    }
}
