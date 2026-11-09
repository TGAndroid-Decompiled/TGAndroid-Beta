package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class jg0 extends org.telegram.ui.Components.pj0 {
    public final Context f46964c;
    public final lg0 d;

    public jg0(lg0 lg0Var, Context context) {
        this.d = lg0Var;
        this.f46964c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f == 0) {
            return ((org.telegram.ui.Cells.a5) d1Var.f57056a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.Q;
    }

    @Override
    public final int d(int i7) {
        lg0 lg0Var = this.d;
        if (lg0Var.R.contains(Integer.valueOf(i7))) {
            return 1;
        }
        if (i7 != lg0Var.H && i7 != lg0Var.O) {
            if (i7 == lg0Var.K) {
                return 3;
            }
            if (i7 == lg0Var.L) {
                return 4;
            }
            if (i7 == lg0Var.N) {
                return 5;
            }
            if (i7 == lg0Var.P) {
                return 6;
            }
            if (i7 == lg0Var.M) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jg0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.Cells.y6 y6Var;
        lg0 lg0Var = this.d;
        if (i7 != 0) {
            int i10 = 1;
            Context context = this.f46964c;
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
                                view.setLayoutParams(new v4.o0(-1, 16));
                            }
                        } else {
                            view = new kg0(lg0Var, context);
                            view.setLayoutParams(new v4.o0(-1, -2));
                        }
                    }
                    if (i7 != 4) {
                        i10 = 2;
                    }
                    lg.f fVar = new lg.f(lg0Var.getResourceProvider());
                    lg0Var.f47606c0 = fVar;
                    view = new ig0(this, this.f46964c, i10, fVar, lg0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f46964c, org.telegram.ui.ActionBar.l6.G6, 16, 11, false, lg0Var.getResourceProvider());
                    n4Var.setHeight(43);
                    y6Var = n4Var;
                }
            } else {
                lg0Var.getResourceProvider();
                y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
            }
            view = y6Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f46964c, 6, 2, false, lg0Var.getResourceProvider());
            a5Var.setDividerColor(org.telegram.ui.ActionBar.l6.f27866d7);
            view = a5Var;
        }
        return new v4.d1(view);
    }
}
