package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class mg0 extends org.telegram.ui.Components.bk0 {
    public final Context f49837c;
    public final og0 d;

    public mg0(og0 og0Var, Context context) {
        this.d = og0Var;
        this.f49837c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 0) {
            return ((org.telegram.ui.Cells.b5) f1Var.f59123a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.R;
    }

    @Override
    public final int d(int i7) {
        og0 og0Var = this.d;
        if (og0Var.S.contains(Integer.valueOf(i7))) {
            return 1;
        }
        if (i7 != og0Var.I && i7 != og0Var.P) {
            if (i7 == og0Var.L) {
                return 3;
            }
            if (i7 == og0Var.M) {
                return 4;
            }
            if (i7 == og0Var.O) {
                return 5;
            }
            if (i7 == og0Var.Q) {
                return 6;
            }
            if (i7 == og0Var.N) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mg0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.Cells.z6 z6Var;
        og0 og0Var = this.d;
        if (i7 != 0) {
            int i10 = 1;
            Context context = this.f49837c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    view = new org.telegram.ui.Cells.u4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.n3(context, 16);
                                view.setLayoutParams(new v4.q0(-1, 16));
                            }
                        } else {
                            view = new ng0(og0Var, context);
                            view.setLayoutParams(new v4.q0(-1, -2));
                        }
                    }
                    if (i7 != 4) {
                        i10 = 2;
                    }
                    lg.f fVar = new lg.f(og0Var.getResourceProvider());
                    og0Var.f50557d0 = fVar;
                    view = new lg0(this, this.f49837c, i10, fVar, og0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(this.f49837c, org.telegram.ui.ActionBar.n6.G6, 16, 11, false, og0Var.getResourceProvider());
                    o4Var.setHeight(43);
                    z6Var = o4Var;
                }
            } else {
                og0Var.getResourceProvider();
                z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
            }
            view = z6Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f49837c, 6, 2, false, og0Var.getResourceProvider());
            b5Var.setDividerColor(org.telegram.ui.ActionBar.n6.f29395d7);
            view = b5Var;
        }
        return new v4.f1(view);
    }
}
