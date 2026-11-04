package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class bg0 extends org.telegram.ui.Components.sj0 {
    public final Context f44041c;
    public final dg0 d;

    public bg0(dg0 dg0Var, Context context) {
        this.d = dg0Var;
        this.f44041c = context;
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            return ((org.telegram.ui.Cells.a5) d1Var.f55540a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.R;
    }

    @Override
    public final int d(int i3) {
        dg0 dg0Var = this.d;
        if (dg0Var.S.contains(Integer.valueOf(i3))) {
            return 1;
        }
        if (i3 != dg0Var.I && i3 != dg0Var.P) {
            if (i3 == dg0Var.L) {
                return 3;
            }
            if (i3 == dg0Var.M) {
                return 4;
            }
            if (i3 == dg0Var.O) {
                return 5;
            }
            if (i3 == dg0Var.Q) {
                return 6;
            }
            if (i3 == dg0Var.N) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bg0.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        org.telegram.ui.Cells.x6 x6Var;
        dg0 dg0Var = this.d;
        if (i3 != 0) {
            int i10 = 1;
            Context context = this.f44041c;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                if (i3 != 7) {
                                    view = new org.telegram.ui.Cells.t4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.m3(context, 16);
                                view.setLayoutParams(new u4.p0(-1, 16));
                            }
                        } else {
                            view = new cg0(dg0Var, context);
                            view.setLayoutParams(new u4.p0(-1, -2));
                        }
                    }
                    if (i3 != 4) {
                        i10 = 2;
                    }
                    mg.f fVar = new mg.f(dg0Var.getResourceProvider());
                    dg0Var.f44697d0 = fVar;
                    view = new ag0(this, this.f44041c, i10, fVar, dg0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f44041c, org.telegram.ui.ActionBar.k6.G6, 16, 11, false, dg0Var.getResourceProvider());
                    n4Var.setHeight(43);
                    x6Var = n4Var;
                }
            } else {
                dg0Var.getResourceProvider();
                x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
            }
            view = x6Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f44041c, 6, 2, false, dg0Var.getResourceProvider());
            a5Var.setDividerColor(org.telegram.ui.ActionBar.k6.f27879d7);
            view = a5Var;
        }
        return new u4.d1(view);
    }
}
