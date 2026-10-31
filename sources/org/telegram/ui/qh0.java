package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class qh0 extends org.telegram.ui.Components.sk0 {
    public final Context f40988c;
    public final sh0 d;

    public qh0(sh0 sh0Var, Context context) {
        this.d = sh0Var;
        this.f40988c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 0) {
            return ((org.telegram.ui.Cells.e5) c1Var.f47898a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.Q;
    }

    @Override
    public final int d(int i10) {
        sh0 sh0Var = this.d;
        if (sh0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != sh0Var.H && i10 != sh0Var.O) {
            if (i10 == sh0Var.K) {
                return 3;
            }
            if (i10 == sh0Var.L) {
                return 4;
            }
            if (i10 == sh0Var.N) {
                return 5;
            }
            if (i10 == sh0Var.P) {
                return 6;
            }
            if (i10 == sh0Var.M) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qh0.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.c7 c7Var;
        sh0 sh0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f40988c;
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
                            view = new rh0(sh0Var, context);
                            view.setLayoutParams(new s4.o0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    bg.h hVar = new bg.h(sh0Var.getResourceProvider());
                    sh0Var.f41517c0 = hVar;
                    view = new ph0(this, this.f40988c, i11, hVar, sh0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(this.f40988c, org.telegram.ui.ActionBar.t6.G6, 16, 11, false, sh0Var.getResourceProvider());
                    p4Var.setHeight(43);
                    c7Var = p4Var;
                }
            } else {
                sh0Var.getResourceProvider();
                c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
            }
            view = c7Var;
        } else {
            org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(6, 2, this.f40988c, sh0Var.getResourceProvider(), false);
            e5Var.setDividerColor(org.telegram.ui.ActionBar.t6.f20930d7);
            view = e5Var;
        }
        return new s4.c1(view);
    }
}
