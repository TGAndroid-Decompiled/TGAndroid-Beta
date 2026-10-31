package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class nt0 extends ok0 {
    public final Context f28889r;
    public final zt0 f28890s;

    public nt0(zt0 zt0Var, Context context) {
        this.f28890s = zt0Var;
        this.f28889r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ot0[] ot0VarArr = this.f28890s.f33234v1;
        int i11 = 1;
        if ((ot0VarArr[3].f29179c.size() == 0 && !ot0VarArr[3].f29181g) || i10 >= ot0VarArr[3].f29179c.size()) {
            return 1;
        }
        ot0 ot0Var = ot0VarArr[3];
        int size = ((ArrayList) ot0Var.d.get(ot0Var.f29179c.get(i10))).size();
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
        ot0[] ot0VarArr = this.f28890s.f33234v1;
        if (ot0VarArr[3].f29179c.size() == 0 && !ot0VarArr[3].f29181g) {
            return 5;
        }
        if (i10 < ot0VarArr[3].f29179c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nt0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        zt0 zt0Var = this.f28890s;
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(28, this.f28889r, zt0Var.H1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < zt0Var.f33234v1[3].f29179c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.e0(((org.telegram.messenger.jj) ((ArrayList) zt0Var.f33234v1[3].d.get((String) zt0Var.f33234v1[3].f29179c.get(i10))).get(0)).f16337k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        ot0[] ot0VarArr = this.f28890s.f33234v1;
        if (ot0VarArr[3].f29179c.size() != 0 || ot0VarArr[3].f29181g) {
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
        zt0 zt0Var = this.f28890s;
        ot0[] ot0VarArr = zt0Var.f33234v1;
        int i12 = c1Var.f47901f;
        View view = c1Var.f47898a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) ot0VarArr[3].d.get((String) ot0VarArr[3].f29179c.get(i10));
            int i13 = c1Var.f47901f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.o7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != ot0VarArr[3].f29179c.size() - 1 || !ot0VarArr[3].f29181g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        o7Var.D = z10;
                        o7Var.e();
                        o7Var.f22388b0 = jjVar;
                        o7Var.requestLayout();
                        if (zt0Var.E1) {
                            SparseArray[] sparseArrayArr = zt0Var.f33174b1;
                            if (org.telegram.messenger.jj.B0(jjVar.f16337k) == zt0Var.l1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                                z11 = true;
                            }
                            o7Var.f(z11, !zt0Var.f33181d1);
                            return;
                        }
                        o7Var.f(false, !zt0Var.f33181d1);
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.e0(jjVar2.f16337k.date, false));
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        zt0 zt0Var = this.f28890s;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.f28889r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    zz zzVar = new zz(context, p6Var);
                    zzVar.setIsSingleCell(true);
                    zzVar.f33274x = false;
                    zzVar.setViewType(5);
                    z3Var = zzVar;
                } else {
                    p3 V = zt0.V(3, zt0Var.l1, context, p6Var);
                    V.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.c1(V);
                }
            } else {
                org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(0, context, p6Var);
                o7Var.setDelegate(zt0Var.V1);
                z3Var = o7Var;
            }
        } else {
            z3Var = new org.telegram.ui.Cells.z3(28, context, p6Var);
        }
        return sc.e.o(z3Var, z3Var, -1, -2);
    }
}
