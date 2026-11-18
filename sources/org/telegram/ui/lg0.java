package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class lg0 extends org.telegram.ui.Components.bk0 {
    public final Context f49603c;
    public final ng0 d;

    public lg0(ng0 ng0Var, Context context) {
        this.d = ng0Var;
        this.f49603c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59126f == 0) {
            return ((org.telegram.ui.Cells.a5) f1Var.f59122a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.R;
    }

    @Override
    public final int d(int i7) {
        ng0 ng0Var = this.d;
        if (ng0Var.S.contains(Integer.valueOf(i7))) {
            return 1;
        }
        if (i7 != ng0Var.I && i7 != ng0Var.P) {
            if (i7 == ng0Var.L) {
                return 3;
            }
            if (i7 == ng0Var.M) {
                return 4;
            }
            if (i7 == ng0Var.O) {
                return 5;
            }
            if (i7 == ng0Var.Q) {
                return 6;
            }
            if (i7 == ng0Var.N) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lg0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.Cells.y6 y6Var;
        ng0 ng0Var = this.d;
        if (i7 != 0) {
            int i10 = 1;
            Context context = this.f49603c;
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
                                view.setLayoutParams(new v4.q0(-1, 16));
                            }
                        } else {
                            view = new mg0(ng0Var, context);
                            view.setLayoutParams(new v4.q0(-1, -2));
                        }
                    }
                    if (i7 != 4) {
                        i10 = 2;
                    }
                    lg.f fVar = new lg.f(ng0Var.getResourceProvider());
                    ng0Var.f50182d0 = fVar;
                    view = new kg0(this, this.f49603c, i10, fVar, ng0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f49603c, org.telegram.ui.ActionBar.n6.G6, 16, 11, false, ng0Var.getResourceProvider());
                    n4Var.setHeight(43);
                    y6Var = n4Var;
                }
            } else {
                ng0Var.getResourceProvider();
                y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
            }
            view = y6Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f49603c, 6, 2, false, ng0Var.getResourceProvider());
            a5Var.setDividerColor(org.telegram.ui.ActionBar.n6.f29397d7);
            view = a5Var;
        }
        return new v4.f1(view);
    }
}
