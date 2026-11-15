package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class hg0 extends org.telegram.ui.Components.tj0 {
    public final Context f47699c;
    public final jg0 d;

    public hg0(jg0 jg0Var, Context context) {
        this.d = jg0Var;
        this.f47699c = context;
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 0) {
            return ((org.telegram.ui.Cells.a5) e1Var.f58535a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.R;
    }

    @Override
    public final int d(int i7) {
        jg0 jg0Var = this.d;
        if (jg0Var.S.contains(Integer.valueOf(i7))) {
            return 1;
        }
        if (i7 != jg0Var.I && i7 != jg0Var.P) {
            if (i7 == jg0Var.L) {
                return 3;
            }
            if (i7 == jg0Var.M) {
                return 4;
            }
            if (i7 == jg0Var.O) {
                return 5;
            }
            if (i7 == jg0Var.Q) {
                return 6;
            }
            if (i7 == jg0Var.N) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(v4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hg0.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.Cells.x6 x6Var;
        jg0 jg0Var = this.d;
        if (i7 != 0) {
            int i10 = 1;
            Context context = this.f47699c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    view = new org.telegram.ui.Cells.t4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.m3(context, 16);
                                view.setLayoutParams(new v4.p0(-1, 16));
                            }
                        } else {
                            view = new ig0(jg0Var, context);
                            view.setLayoutParams(new v4.p0(-1, -2));
                        }
                    }
                    if (i7 != 4) {
                        i10 = 2;
                    }
                    lg.f fVar = new lg.f(jg0Var.getResourceProvider());
                    jg0Var.f48323d0 = fVar;
                    view = new gg0(this, this.f47699c, i10, fVar, jg0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f47699c, org.telegram.ui.ActionBar.j6.G6, 16, 11, false, jg0Var.getResourceProvider());
                    n4Var.setHeight(43);
                    x6Var = n4Var;
                }
            } else {
                jg0Var.getResourceProvider();
                x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
            }
            view = x6Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f47699c, 6, 2, false, jg0Var.getResourceProvider());
            a5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f28850d7);
            view = a5Var;
        }
        return new v4.e1(view);
    }
}
