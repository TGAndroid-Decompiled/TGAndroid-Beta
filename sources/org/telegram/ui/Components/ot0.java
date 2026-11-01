package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ot0 extends pk0 {
    public final Context f29229r;
    public final au0 f29230s;

    public ot0(au0 au0Var, Context context) {
        this.f29230s = au0Var;
        this.f29229r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        pt0[] pt0VarArr = this.f29230s.f24562v1;
        int i11 = 1;
        if ((pt0VarArr[3].f29534c.size() == 0 && !pt0VarArr[3].f29536g) || i10 >= pt0VarArr[3].f29534c.size()) {
            return 1;
        }
        pt0 pt0Var = pt0VarArr[3];
        int size = ((ArrayList) pt0Var.d.get(pt0Var.f29534c.get(i10))).size();
        if (i10 == 0) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        pt0[] pt0VarArr = this.f29230s.f24562v1;
        if (pt0VarArr[3].f29534c.size() == 0 && !pt0VarArr[3].f29536g) {
            return 5;
        }
        if (i10 < pt0VarArr[3].f29534c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ot0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        au0 au0Var = this.f29230s;
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(28, this.f29229r, au0Var.H1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < au0Var.f24562v1[3].f29534c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.e0(((org.telegram.messenger.kj) ((ArrayList) au0Var.f24562v1[3].d.get((String) au0Var.f24562v1[3].f29534c.get(i10))).get(0)).f16690k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        pt0[] pt0VarArr = this.f29230s.f24562v1;
        if (pt0VarArr[3].f29534c.size() != 0 || pt0VarArr[3].f29536g) {
            if (i10 != 0 && i11 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        boolean z10;
        char c10;
        au0 au0Var = this.f29230s;
        pt0[] pt0VarArr = au0Var.f24562v1;
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) pt0VarArr[3].d.get((String) pt0VarArr[3].f29534c.get(i10));
            int i13 = c1Var.f47912f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.o7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != pt0VarArr[3].f29534c.size() - 1 || !pt0VarArr[3].f29536g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        o7Var.D = z10;
                        o7Var.e();
                        o7Var.f22389b0 = kjVar;
                        o7Var.requestLayout();
                        if (au0Var.E1) {
                            SparseArray[] sparseArrayArr = au0Var.f24502b1;
                            if (org.telegram.messenger.kj.B0(kjVar.f16690k) == au0Var.l1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                                z11 = true;
                            }
                            o7Var.f(z11, !au0Var.f24509d1);
                            return;
                        }
                        o7Var.f(false, !au0Var.f24509d1);
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.e0(kjVar2.f16690k.date, false));
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        au0 au0Var = this.f29230s;
        org.telegram.ui.ActionBar.p6 p6Var = au0Var.H1;
        Context context = this.f29229r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    zz zzVar = new zz(context, p6Var);
                    zzVar.setIsSingleCell(true);
                    zzVar.f33280x = false;
                    zzVar.setViewType(5);
                    z3Var = zzVar;
                } else {
                    p3 W = au0.W(3, au0Var.l1, context, p6Var);
                    W.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.c1(W);
                }
            } else {
                org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(0, context, p6Var);
                o7Var.setDelegate(au0Var.V1);
                z3Var = o7Var;
            }
        } else {
            z3Var = new org.telegram.ui.Cells.z3(28, context, p6Var);
        }
        return sc.e.o(z3Var, z3Var, -1, -2);
    }
}
