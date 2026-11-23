package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ws0 extends zj0 {
    public final Context f41717r;
    public final it0 f41718s;

    public ws0(it0 it0Var, Context context) {
        this.f41718s = it0Var;
        this.f41717r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        xs0[] xs0VarArr = this.f41718s.f36160w1;
        int i10 = 1;
        if ((xs0VarArr[3].f42167c.size() == 0 && !xs0VarArr[3].f42170g) || i7 >= xs0VarArr[3].f42167c.size()) {
            return 1;
        }
        xs0 xs0Var = xs0VarArr[3];
        int size = ((ArrayList) xs0Var.d.get(xs0Var.f42167c.get(i7))).size();
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
        xs0[] xs0VarArr = this.f41718s.f36160w1;
        if (xs0VarArr[3].f42167c.size() == 0 && !xs0VarArr[3].f42170g) {
            return 5;
        }
        if (i7 < xs0VarArr[3].f42167c.size()) {
            if (i7 != 0 && i10 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.R():int");
    }

    @Override
    public final View T(int i7, View view) {
        it0 it0Var = this.f41718s;
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(28, this.f41717r, it0Var.I1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < it0Var.f36160w1[3].f42167c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) ((ArrayList) it0Var.f36160w1[3].d.get((String) it0Var.f36160w1[3].f42167c.get(i7))).get(0)).f24073k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        xs0[] xs0VarArr = this.f41718s.f36160w1;
        if (xs0VarArr[3].f42167c.size() != 0 || xs0VarArr[3].f42170g) {
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
        it0 it0Var = this.f41718s;
        xs0[] xs0VarArr = it0Var.f36160w1;
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i11 != 6 && i11 != 5) {
            ArrayList arrayList = (ArrayList) xs0VarArr[3].d.get((String) xs0VarArr[3].f42167c.get(i7));
            int i12 = f1Var.f59249f;
            boolean z11 = false;
            if (i12 != 3) {
                if (i12 == 4) {
                    if (i7 != 0) {
                        i10--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.k7) && i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i10);
                        if (i10 == arrayList.size() - 1 && (i7 != xs0VarArr[3].f42167c.size() - 1 || !xs0VarArr[3].f42170g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        k7Var.E = z10;
                        k7Var.e();
                        k7Var.f31022c0 = fjVar;
                        k7Var.requestLayout();
                        if (it0Var.F1) {
                            SparseArray[] sparseArrayArr = it0Var.f36101c1;
                            if (org.telegram.messenger.fj.B0(fjVar.f24073k) == it0Var.f36130m1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                                z11 = true;
                            }
                            k7Var.f(z11, !it0Var.f36107e1);
                            return;
                        }
                        k7Var.f(false, !it0Var.f36107e1);
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.y3) {
                ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(fjVar2.f24073k.date, false));
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y3 y3Var;
        it0 it0Var = this.f41718s;
        org.telegram.ui.ActionBar.i6 i6Var = it0Var.I1;
        Context context = this.f41717r;
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    vz vzVar = new vz(context, i6Var);
                    vzVar.setIsSingleCell(true);
                    vzVar.f41457x = false;
                    vzVar.setViewType(5);
                    y3Var = vzVar;
                } else {
                    x3 X = it0.X(3, it0Var.f36130m1, context, i6Var);
                    X.setLayoutParams(new v4.q0(-1, -1));
                    return new v4.f1(X);
                }
            } else {
                org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, i6Var);
                k7Var.setDelegate(it0Var.W1);
                y3Var = k7Var;
            }
        } else {
            y3Var = new org.telegram.ui.Cells.y3(28, context, i6Var);
        }
        return i5.c.q(y3Var, y3Var, -1, -2);
    }
}
