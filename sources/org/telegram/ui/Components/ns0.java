package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ns0 extends lj0 {
    public final Context f36494r;
    public final zs0 f36495s;

    public ns0(zs0 zs0Var, Context context) {
        this.f36495s = zs0Var;
        this.f36494r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(qj0 qj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        os0[] os0VarArr = this.f36495s.f41121v1;
        int i10 = 1;
        if ((os0VarArr[3].f36780c.size() == 0 && !os0VarArr[3].f36783g) || i7 >= os0VarArr[3].f36780c.size()) {
            return 1;
        }
        os0 os0Var = os0VarArr[3];
        int size = ((ArrayList) os0Var.d.get(os0Var.f36780c.get(i7))).size();
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
        os0[] os0VarArr = this.f36495s.f41121v1;
        if (os0VarArr[3].f36780c.size() == 0 && !os0VarArr[3].f36783g) {
            return 5;
        }
        if (i7 < os0VarArr[3].f36780c.size()) {
            if (i7 != 0 && i10 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ns0.R():int");
    }

    @Override
    public final View T(int i7, View view) {
        zs0 zs0Var = this.f36495s;
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(28, this.f36494r, zs0Var.H1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < zs0Var.f41121v1[3].f36780c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) ((ArrayList) zs0Var.f41121v1[3].d.get((String) zs0Var.f41121v1[3].f36780c.get(i7))).get(0)).f23262k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        os0[] os0VarArr = this.f36495s.f41121v1;
        if (os0VarArr[3].f36780c.size() != 0 || os0VarArr[3].f36783g) {
            if (i7 != 0 && i10 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        boolean z9;
        char c10;
        zs0 zs0Var = this.f36495s;
        os0[] os0VarArr = zs0Var.f41121v1;
        int i11 = d1Var.f57060f;
        View view = d1Var.f57056a;
        if (i11 != 6 && i11 != 5) {
            ArrayList arrayList = (ArrayList) os0VarArr[3].d.get((String) os0VarArr[3].f36780c.get(i7));
            int i12 = d1Var.f57060f;
            boolean z10 = false;
            if (i12 != 3) {
                if (i12 == 4) {
                    if (i7 != 0) {
                        i10--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.k7) && i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i10);
                        if (i10 == arrayList.size() - 1 && (i7 != os0VarArr[3].f36780c.size() - 1 || !os0VarArr[3].f36783g)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        k7Var.D = z9;
                        k7Var.e();
                        k7Var.f29439b0 = ijVar;
                        k7Var.requestLayout();
                        if (zs0Var.E1) {
                            SparseArray[] sparseArrayArr = zs0Var.f41062b1;
                            if (org.telegram.messenger.ij.B0(ijVar.f23262k) == zs0Var.l1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0) {
                                z10 = true;
                            }
                            k7Var.f(z10, !zs0Var.f41069d1);
                            return;
                        }
                        k7Var.f(false, !zs0Var.f41069d1);
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(ijVar2.f23262k.date, false));
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        zs0 zs0Var = this.f36495s;
        org.telegram.ui.ActionBar.g6 g6Var = zs0Var.H1;
        Context context = this.f36494r;
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    mz mzVar = new mz(context, g6Var);
                    mzVar.setIsSingleCell(true);
                    mzVar.f36181x = false;
                    mzVar.setViewType(5);
                    x3Var = mzVar;
                } else {
                    r3 X = zs0.X(3, zs0Var.l1, context, g6Var);
                    X.setLayoutParams(new v4.o0(-1, -1));
                    return new v4.d1(X);
                }
            } else {
                org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, g6Var);
                k7Var.setDelegate(zs0Var.V1);
                x3Var = k7Var;
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(28, context, g6Var);
        }
        return jg.g.r(x3Var, x3Var, -1, -2);
    }
}
