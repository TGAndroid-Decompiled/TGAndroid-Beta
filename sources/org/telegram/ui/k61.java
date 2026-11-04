package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class k61 implements View.OnClickListener {
    public final int f46785a;
    public int f46786b = 0;
    public final l71 f46787c;

    public k61(l71 l71Var, int i3) {
        this.f46785a = i3;
        this.f46787c = l71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46785a) {
            case 0:
                l71 l71Var = this.f46787c;
                l71Var.H0.setRotation(this.f46786b);
                this.f46786b -= 45;
                l71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.f40453g).start();
                b71[] b71VarArr = l71Var.f47208y0;
                b71 b71Var = b71VarArr[0];
                if (b71Var != null) {
                    Drawable background = b71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.la0) {
                        ((org.telegram.ui.Components.la0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = l71Var.f47201w;
                        if (l71Var.f47145b == 2) {
                            l71Var.f47173j1 += 45;
                            while (true) {
                                int i3 = l71Var.f47173j1;
                                if (i3 >= 360) {
                                    l71Var.f47173j1 = i3 - 360;
                                } else {
                                    l71Var.f1(l71Var.f47147b1, 0, true);
                                }
                            }
                        } else if (g6Var != null) {
                            g6Var.f27536n += 45;
                            while (true) {
                                int i10 = g6Var.f27536n;
                                if (i10 >= 360) {
                                    g6Var.f27536n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.k6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                b71 b71Var2 = b71VarArr[1];
                if (b71Var2 != null) {
                    Drawable background2 = b71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.la0) {
                        ((org.telegram.ui.Components.la0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                l71 l71Var2 = this.f46787c;
                org.telegram.ui.ActionBar.p5 p5Var = l71Var2.T;
                l71Var2.I0.setRotation(this.f46786b);
                this.f46786b -= 45;
                l71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.f40453g).start();
                org.telegram.ui.ActionBar.g6 g6Var2 = l71Var2.f47201w;
                if (g6Var2.f27531i) {
                    if (p5Var.k() != null) {
                        p5Var.k().w(false);
                        return;
                    }
                    return;
                }
                int i11 = g6Var2.h;
                if (i11 != 0) {
                    int i12 = g6Var2.f27528e;
                    if (i12 == 0) {
                        i12 = g6Var2.f27527c;
                    }
                    g6Var2.f27528e = g6Var2.f27529f;
                    g6Var2.f27529f = g6Var2.f27530g;
                    g6Var2.f27530g = i11;
                    g6Var2.h = i12;
                } else {
                    int i13 = g6Var2.f27528e;
                    if (i13 == 0) {
                        i13 = g6Var2.f27527c;
                    }
                    g6Var2.f27528e = g6Var2.f27529f;
                    g6Var2.f27529f = g6Var2.f27530g;
                    g6Var2.f27530g = i13;
                }
                l71Var2.X.e(g6Var2.h, 3);
                l71Var2.X.e(g6Var2.f27530g, 2);
                l71Var2.X.e(g6Var2.f27529f, 1);
                org.telegram.ui.Components.vp vpVar = l71Var2.X;
                int i14 = g6Var2.f27528e;
                if (i14 == 0) {
                    i14 = g6Var2.f27527c;
                }
                vpVar.e(i14, 0);
                l71Var2.M0[1].b(0, g6Var2.f27528e);
                l71Var2.M0[1].b(1, g6Var2.f27529f);
                l71Var2.M0[1].b(2, g6Var2.f27530g);
                l71Var2.M0[1].b(3, g6Var2.h);
                org.telegram.ui.ActionBar.k6.t1(true, true);
                l71Var2.f47202w0.g1();
                return;
        }
    }
}
