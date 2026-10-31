package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class m81 implements View.OnClickListener {
    public final int f39528a;
    public int f39529b = 0;
    public final m91 f39530c;

    public m81(m91 m91Var, int i10) {
        this.f39528a = i10;
        this.f39530c = m91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39528a) {
            case 0:
                m91 m91Var = this.f39530c;
                m91Var.G0.setRotation(this.f39529b);
                this.f39529b -= 45;
                m91Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.gr.f26496g).start();
                c91[] c91VarArr = m91Var.f39600x0;
                c91 c91Var = c91VarArr[0];
                if (c91Var != null) {
                    Drawable background = c91Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.jb0) {
                        ((org.telegram.ui.Components.jb0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.r6 r6Var = m91Var.f39596w;
                        if (m91Var.f39540b == 2) {
                            m91Var.f39565i1 += 45;
                            while (true) {
                                int i10 = m91Var.f39565i1;
                                if (i10 >= 360) {
                                    m91Var.f39565i1 = i10 - 360;
                                } else {
                                    m91Var.e1(m91Var.f39539a1, 0, true);
                                }
                            }
                        } else if (r6Var != null) {
                            r6Var.f20740n += 45;
                            while (true) {
                                int i11 = r6Var.f20740n;
                                if (i11 >= 360) {
                                    r6Var.f20740n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.t6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                c91 c91Var2 = c91VarArr[1];
                if (c91Var2 != null) {
                    Drawable background2 = c91Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.jb0) {
                        ((org.telegram.ui.Components.jb0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                m91 m91Var2 = this.f39530c;
                org.telegram.ui.ActionBar.a6 a6Var = m91Var2.S;
                m91Var2.H0.setRotation(this.f39529b);
                this.f39529b -= 45;
                m91Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.gr.f26496g).start();
                org.telegram.ui.ActionBar.r6 r6Var2 = m91Var2.f39596w;
                if (r6Var2.f20735i) {
                    if (a6Var.k() != null) {
                        a6Var.k().w(false);
                        return;
                    }
                    return;
                }
                int i12 = r6Var2.h;
                if (i12 != 0) {
                    int i13 = r6Var2.e;
                    if (i13 == 0) {
                        i13 = r6Var2.f20732c;
                    }
                    r6Var2.e = r6Var2.f20733f;
                    r6Var2.f20733f = r6Var2.f20734g;
                    r6Var2.f20734g = i12;
                    r6Var2.h = i13;
                } else {
                    int i14 = r6Var2.e;
                    if (i14 == 0) {
                        i14 = r6Var2.f20732c;
                    }
                    r6Var2.e = r6Var2.f20733f;
                    r6Var2.f20733f = r6Var2.f20734g;
                    r6Var2.f20734g = i14;
                }
                m91Var2.W.e(r6Var2.h, 3);
                m91Var2.W.e(r6Var2.f20734g, 2);
                m91Var2.W.e(r6Var2.f20733f, 1);
                org.telegram.ui.Components.cq cqVar = m91Var2.W;
                int i15 = r6Var2.e;
                if (i15 == 0) {
                    i15 = r6Var2.f20732c;
                }
                cqVar.e(i15, 0);
                m91Var2.L0[1].b(0, r6Var2.e);
                m91Var2.L0[1].b(1, r6Var2.f20733f);
                m91Var2.L0[1].b(2, r6Var2.f20734g);
                m91Var2.L0[1].b(3, r6Var2.h);
                org.telegram.ui.ActionBar.t6.t1(true, true);
                m91Var2.f39594v0.g1();
                return;
        }
    }
}
