package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public final class aj0 extends org.telegram.ui.Components.ql0 {
    public final Context f32600c;
    public final cj0 d;

    public aj0(cj0 cj0Var, Context context) {
        this.d = cj0Var;
        this.f32600c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 0) {
            return ((org.telegram.ui.Cells.a5) l1Var.f5774a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.N;
    }

    @Override
    public final int j(int i10) {
        cj0 cj0Var = this.d;
        if (cj0Var.O.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != cj0Var.E && i10 != cj0Var.L) {
            if (i10 == cj0Var.H) {
                return 3;
            }
            if (i10 == cj0Var.I) {
                return 4;
            }
            if (i10 == cj0Var.K) {
                return 5;
            }
            if (i10 == cj0Var.M) {
                return 6;
            }
            if (i10 == cj0Var.J) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aj0.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.y6 y6Var;
        cj0 cj0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f32600c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    view = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.j3(context, 16);
                                view.setLayoutParams(new f2.w0(-1, 16));
                            }
                        } else {
                            view = new bj0(cj0Var, context);
                            view.setLayoutParams(new f2.w0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    vf.f fVar = new vf.f(cj0Var.getResourceProvider());
                    cj0Var.Z = fVar;
                    view = new zi0(this, this.f32600c, i11, fVar, cj0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f32600c, org.telegram.ui.ActionBar.j6.G6, 16, 11, false, cj0Var.getResourceProvider());
                    l4Var.setHeight(43);
                    y6Var = l4Var;
                }
            } else {
                cj0Var.getResourceProvider();
                y6Var = new org.telegram.ui.Cells.y6(context, (b) null);
            }
            view = y6Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f32600c, cj0Var.getResourceProvider(), false);
            a5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f19882d7);
            view = a5Var;
        }
        return new f2.l1(view);
    }
}
