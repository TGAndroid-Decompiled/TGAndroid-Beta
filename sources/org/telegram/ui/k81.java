package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class k81 implements View.OnClickListener {
    public final int f38677a;
    public int f38678b = 0;
    public final k91 f38679c;

    public k81(k91 k91Var, int i10) {
        this.f38677a = i10;
        this.f38679c = k91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38677a) {
            case 0:
                k91 k91Var = this.f38679c;
                k91Var.G0.setRotation(this.f38678b);
                this.f38678b -= 45;
                k91Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.gr.f26524g).start();
                a91[] a91VarArr = k91Var.f38775x0;
                a91 a91Var = a91VarArr[0];
                if (a91Var != null) {
                    Drawable background = a91Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.jb0) {
                        ((org.telegram.ui.Components.jb0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.r6 r6Var = k91Var.f38771w;
                        if (k91Var.f38715b == 2) {
                            k91Var.f38740i1 += 45;
                            while (true) {
                                int i10 = k91Var.f38740i1;
                                if (i10 >= 360) {
                                    k91Var.f38740i1 = i10 - 360;
                                } else {
                                    k91Var.f1(k91Var.f38714a1, 0, true);
                                }
                            }
                        } else if (r6Var != null) {
                            r6Var.f20741n += 45;
                            while (true) {
                                int i11 = r6Var.f20741n;
                                if (i11 >= 360) {
                                    r6Var.f20741n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.t6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                a91 a91Var2 = a91VarArr[1];
                if (a91Var2 != null) {
                    Drawable background2 = a91Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.jb0) {
                        ((org.telegram.ui.Components.jb0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                k91 k91Var2 = this.f38679c;
                org.telegram.ui.ActionBar.a6 a6Var = k91Var2.S;
                k91Var2.H0.setRotation(this.f38678b);
                this.f38678b -= 45;
                k91Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.gr.f26524g).start();
                org.telegram.ui.ActionBar.r6 r6Var2 = k91Var2.f38771w;
                if (r6Var2.f20736i) {
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
                        i13 = r6Var2.f20733c;
                    }
                    r6Var2.e = r6Var2.f20734f;
                    r6Var2.f20734f = r6Var2.f20735g;
                    r6Var2.f20735g = i12;
                    r6Var2.h = i13;
                } else {
                    int i14 = r6Var2.e;
                    if (i14 == 0) {
                        i14 = r6Var2.f20733c;
                    }
                    r6Var2.e = r6Var2.f20734f;
                    r6Var2.f20734f = r6Var2.f20735g;
                    r6Var2.f20735g = i14;
                }
                k91Var2.W.e(r6Var2.h, 3);
                k91Var2.W.e(r6Var2.f20735g, 2);
                k91Var2.W.e(r6Var2.f20734f, 1);
                org.telegram.ui.Components.cq cqVar = k91Var2.W;
                int i15 = r6Var2.e;
                if (i15 == 0) {
                    i15 = r6Var2.f20733c;
                }
                cqVar.e(i15, 0);
                k91Var2.L0[1].b(0, r6Var2.e);
                k91Var2.L0[1].b(1, r6Var2.f20734f);
                k91Var2.L0[1].b(2, r6Var2.f20735g);
                k91Var2.L0[1].b(3, r6Var2.h);
                org.telegram.ui.ActionBar.t6.t1(true, true);
                k91Var2.f38769v0.g1();
                return;
        }
    }
}
