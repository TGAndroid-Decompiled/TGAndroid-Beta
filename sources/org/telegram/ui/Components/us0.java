package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class us0 extends xj0 {
    public final Context f40411r;
    public final gt0 f40412s;

    public us0(gt0 gt0Var, Context context) {
        this.f40412s = gt0Var;
        this.f40411r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        vs0[] vs0VarArr = this.f40412s.f35636w1;
        int i10 = 1;
        if ((vs0VarArr[3].f41414c.size() == 0 && !vs0VarArr[3].f41417g) || i7 >= vs0VarArr[3].f41414c.size()) {
            return 1;
        }
        vs0 vs0Var = vs0VarArr[3];
        int size = ((ArrayList) vs0Var.d.get(vs0Var.f41414c.get(i7))).size();
        if (i7 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override
    public final int P(int i7, int i10) {
        vs0[] vs0VarArr = this.f40412s.f35636w1;
        if (vs0VarArr[3].f41414c.size() == 0 && !vs0VarArr[3].f41417g) {
            return 5;
        }
        if (i7 < vs0VarArr[3].f41414c.size()) {
            if (i7 != 0 && i10 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.us0.R():int");
    }

    @Override
    public final View T(int i7, View view) {
        gt0 gt0Var = this.f40412s;
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(28, this.f40411r, gt0Var.I1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < gt0Var.f35636w1[3].f41414c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) ((ArrayList) gt0Var.f35636w1[3].d.get((String) gt0Var.f35636w1[3].f41414c.get(i7))).get(0)).f23968k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        vs0[] vs0VarArr = this.f40412s.f35636w1;
        if (vs0VarArr[3].f41414c.size() != 0 || vs0VarArr[3].f41417g) {
            if (i7 != 0 && i10 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.f1 f1Var) {
        boolean z10;
        char c10;
        gt0 gt0Var = this.f40412s;
        vs0[] vs0VarArr = gt0Var.f35636w1;
        int i11 = f1Var.f59126f;
        View view = f1Var.f59122a;
        if (i11 != 6 && i11 != 5) {
            ArrayList arrayList = (ArrayList) vs0VarArr[3].d.get((String) vs0VarArr[3].f41414c.get(i7));
            int i12 = f1Var.f59126f;
            boolean z11 = false;
            if (i12 != 3) {
                if (i12 == 4) {
                    if (i7 != 0) {
                        i10--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.k7) && i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i10);
                        if (i10 == arrayList.size() - 1 && (i7 != vs0VarArr[3].f41414c.size() - 1 || !vs0VarArr[3].f41417g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        k7Var.E = z10;
                        k7Var.e();
                        k7Var.f30936c0 = fjVar;
                        k7Var.requestLayout();
                        if (gt0Var.F1) {
                            SparseArray[] sparseArrayArr = gt0Var.f35577c1;
                            if (org.telegram.messenger.fj.B0(fjVar.f23968k) == gt0Var.f35606m1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                                z11 = true;
                            }
                            k7Var.f(z11, !gt0Var.f35583e1);
                            return;
                        }
                        k7Var.f(false, !gt0Var.f35583e1);
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.gd.e0(fjVar2.f23968k.date, false));
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        gt0 gt0Var = this.f40412s;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.f40411r;
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    wz wzVar = new wz(context, i6Var);
                    wzVar.setIsSingleCell(true);
                    wzVar.f41829x = false;
                    wzVar.setViewType(5);
                    x3Var = wzVar;
                } else {
                    x3 X = gt0.X(3, gt0Var.f35606m1, context, i6Var);
                    X.setLayoutParams(new v4.q0(-1, -1));
                    return new v4.f1(X);
                }
            } else {
                org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, i6Var);
                k7Var.setDelegate(gt0Var.W1);
                x3Var = k7Var;
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(28, context, i6Var);
        }
        return i5.c.q(x3Var, x3Var, -1, -2);
    }
}
