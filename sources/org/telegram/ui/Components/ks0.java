package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ks0 extends oj0 {
    public final Context f35478r;
    public final ws0 f35479s;

    public ks0(ws0 ws0Var, Context context) {
        this.f35479s = ws0Var;
        this.f35478r = context;
    }

    @Override
    public final String F(int i3) {
        return null;
    }

    @Override
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i3) {
        ls0[] ls0VarArr = this.f35479s.f40136w1;
        int i10 = 1;
        if ((ls0VarArr[3].f35856c.size() == 0 && !ls0VarArr[3].f35859g) || i3 >= ls0VarArr[3].f35856c.size()) {
            return 1;
        }
        ls0 ls0Var = ls0VarArr[3];
        int size = ((ArrayList) ls0Var.d.get(ls0Var.f35856c.get(i3))).size();
        if (i3 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i3, int i10) {
        return null;
    }

    @Override
    public final int P(int i3, int i10) {
        ls0[] ls0VarArr = this.f35479s.f40136w1;
        if (ls0VarArr[3].f35856c.size() == 0 && !ls0VarArr[3].f35859g) {
            return 5;
        }
        if (i3 < ls0VarArr[3].f35856c.size()) {
            if (i3 != 0 && i10 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ks0.R():int");
    }

    @Override
    public final View T(int i3, View view) {
        ws0 ws0Var = this.f35479s;
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(28, this.f35478r, ws0Var.I1);
        }
        if (i3 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i3 < ws0Var.f40136w1[3].f35856c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) ((ArrayList) ws0Var.f40136w1[3].d.get((String) ws0Var.f40136w1[3].f35856c.get(i3))).get(0)).f26868k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        ls0[] ls0VarArr = this.f35479s.f40136w1;
        if (ls0VarArr[3].f35856c.size() != 0 || ls0VarArr[3].f35859g) {
            if (i3 != 0 && i10 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i3, int i10, u4.d1 d1Var) {
        boolean z10;
        char c2;
        ws0 ws0Var = this.f35479s;
        ls0[] ls0VarArr = ws0Var.f40136w1;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i11 != 6 && i11 != 5) {
            ArrayList arrayList = (ArrayList) ls0VarArr[3].d.get((String) ls0VarArr[3].f35856c.get(i3));
            int i12 = d1Var.f55544f;
            boolean z11 = false;
            if (i12 != 3) {
                if (i12 == 4) {
                    if (i3 != 0) {
                        i10--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.j7) && i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i10);
                        if (i10 == arrayList.size() - 1 && (i3 != ls0VarArr[3].f35856c.size() - 1 || !ls0VarArr[3].f35859g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        j7Var.E = z10;
                        j7Var.e();
                        j7Var.f29438c0 = ziVar;
                        j7Var.requestLayout();
                        if (ws0Var.F1) {
                            SparseArray[] sparseArrayArr = ws0Var.f40077c1;
                            if (org.telegram.messenger.zi.B0(ziVar.f26868k) == ws0Var.m1) {
                                c2 = 0;
                            } else {
                                c2 = 1;
                            }
                            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                                z11 = true;
                            }
                            j7Var.f(z11, !ws0Var.f40083e1);
                            return;
                        }
                        j7Var.f(false, !ws0Var.f40083e1);
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(ziVar2.f26868k.date, false));
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.x3 x3Var;
        ws0 ws0Var = this.f35479s;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.f35478r;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 5) {
                    iz izVar = new iz(context, e6Var);
                    izVar.setIsSingleCell(true);
                    izVar.f34869x = false;
                    izVar.setViewType(5);
                    x3Var = izVar;
                } else {
                    p3 X = ws0.X(3, ws0Var.m1, context, e6Var);
                    X.setLayoutParams(new u4.p0(-1, -1));
                    return new u4.d1(X);
                }
            } else {
                org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(0, context, e6Var);
                j7Var.setDelegate(ws0Var.W1);
                x3Var = j7Var;
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(28, context, e6Var);
        }
        return k2.p1.p(x3Var, x3Var, -1, -2);
    }
}
