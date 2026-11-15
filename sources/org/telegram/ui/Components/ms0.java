package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ms0 extends pj0 {
    public final Context f37371r;
    public final ys0 f37372s;

    public ms0(ys0 ys0Var, Context context) {
        this.f37372s = ys0Var;
        this.f37371r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        ns0[] ns0VarArr = this.f37372s.f42144w1;
        int i10 = 1;
        if ((ns0VarArr[3].f37694c.size() == 0 && !ns0VarArr[3].f37697g) || i7 >= ns0VarArr[3].f37694c.size()) {
            return 1;
        }
        ns0 ns0Var = ns0VarArr[3];
        int size = ((ArrayList) ns0Var.d.get(ns0Var.f37694c.get(i7))).size();
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
        ns0[] ns0VarArr = this.f37372s.f42144w1;
        if (ns0VarArr[3].f37694c.size() == 0 && !ns0VarArr[3].f37697g) {
            return 5;
        }
        if (i7 < ns0VarArr[3].f37694c.size()) {
            if (i7 != 0 && i10 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ms0.R():int");
    }

    @Override
    public final View T(int i7, View view) {
        ys0 ys0Var = this.f37372s;
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(28, this.f37371r, ys0Var.I1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < ys0Var.f42144w1[3].f37694c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) ((ArrayList) ys0Var.f42144w1[3].d.get((String) ys0Var.f42144w1[3].f37694c.get(i7))).get(0)).f23817k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        ns0[] ns0VarArr = this.f37372s.f42144w1;
        if (ns0VarArr[3].f37694c.size() != 0 || ns0VarArr[3].f37697g) {
            if (i7 != 0 && i10 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.e1 e1Var) {
        boolean z10;
        char c10;
        ys0 ys0Var = this.f37372s;
        ns0[] ns0VarArr = ys0Var.f42144w1;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i11 != 6 && i11 != 5) {
            ArrayList arrayList = (ArrayList) ns0VarArr[3].d.get((String) ns0VarArr[3].f37694c.get(i7));
            int i12 = e1Var.f58539f;
            boolean z11 = false;
            if (i12 != 3) {
                if (i12 == 4) {
                    if (i7 != 0) {
                        i10--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.j7) && i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i10);
                        if (i10 == arrayList.size() - 1 && (i7 != ns0VarArr[3].f37694c.size() - 1 || !ns0VarArr[3].f37697g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        j7Var.E = z10;
                        j7Var.e();
                        j7Var.f30499c0 = gjVar;
                        j7Var.requestLayout();
                        if (ys0Var.F1) {
                            SparseArray[] sparseArrayArr = ys0Var.f42085c1;
                            if (org.telegram.messenger.gj.B0(gjVar.f23817k) == ys0Var.f42114m1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z11 = true;
                            }
                            j7Var.f(z11, !ys0Var.f42091e1);
                            return;
                        }
                        j7Var.f(false, !ys0Var.f42091e1);
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.x3) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(gjVar2.f23817k.date, false));
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        ys0 ys0Var = this.f37372s;
        org.telegram.ui.ActionBar.e6 e6Var = ys0Var.I1;
        Context context = this.f37371r;
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    pz pzVar = new pz(context, e6Var);
                    pzVar.setIsSingleCell(true);
                    pzVar.f38448x = false;
                    pzVar.setViewType(5);
                    x3Var = pzVar;
                } else {
                    p3 X = ys0.X(3, ys0Var.f42114m1, context, e6Var);
                    X.setLayoutParams(new v4.p0(-1, -1));
                    return new v4.e1(X);
                }
            } else {
                org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(0, context, e6Var);
                j7Var.setDelegate(ys0Var.W1);
                x3Var = j7Var;
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(28, context, e6Var);
        }
        return i5.c.q(x3Var, x3Var, -1, -2);
    }
}
