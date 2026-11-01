package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class oh0 extends org.telegram.ui.Components.tk0 {
    public final Context f40165c;
    public final qh0 d;

    public oh0(qh0 qh0Var, Context context) {
        this.d = qh0Var;
        this.f40165c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 0) {
            return ((org.telegram.ui.Cells.e5) c1Var.f47909a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.Q;
    }

    @Override
    public final int d(int i10) {
        qh0 qh0Var = this.d;
        if (qh0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != qh0Var.H && i10 != qh0Var.O) {
            if (i10 == qh0Var.K) {
                return 3;
            }
            if (i10 == qh0Var.L) {
                return 4;
            }
            if (i10 == qh0Var.N) {
                return 5;
            }
            if (i10 == qh0Var.P) {
                return 6;
            }
            if (i10 == qh0Var.M) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oh0.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.c7 c7Var;
        qh0 qh0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f40165c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    view = new org.telegram.ui.Cells.v4(context, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.o3(context, 16);
                                view.setLayoutParams(new s4.o0(-1, 16));
                            }
                        } else {
                            view = new ph0(qh0Var, context);
                            view.setLayoutParams(new s4.o0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    bg.h hVar = new bg.h(qh0Var.getResourceProvider());
                    qh0Var.f40785c0 = hVar;
                    view = new nh0(this, this.f40165c, i11, hVar, qh0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(this.f40165c, org.telegram.ui.ActionBar.t6.G6, 16, 11, false, qh0Var.getResourceProvider());
                    p4Var.setHeight(43);
                    c7Var = p4Var;
                }
            } else {
                qh0Var.getResourceProvider();
                c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
            }
            view = c7Var;
        } else {
            org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(6, 2, this.f40165c, qh0Var.getResourceProvider(), false);
            e5Var.setDividerColor(org.telegram.ui.ActionBar.t6.f20931d7);
            view = e5Var;
        }
        return new s4.c1(view);
    }
}
