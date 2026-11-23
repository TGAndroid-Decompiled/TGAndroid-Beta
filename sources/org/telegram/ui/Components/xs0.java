package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class xs0 extends zj0 {
    public final Context f42214r;
    public final jt0 f42215s;

    public xs0(jt0 jt0Var, Context context) {
        this.f42215s = jt0Var;
        this.f42214r = context;
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
        ys0[] ys0VarArr = this.f42215s.f36678w1;
        int i10 = 1;
        if ((ys0VarArr[3].f42516c.size() == 0 && !ys0VarArr[3].f42519g) || i7 >= ys0VarArr[3].f42516c.size()) {
            return 1;
        }
        ys0 ys0Var = ys0VarArr[3];
        int size = ((ArrayList) ys0Var.d.get(ys0Var.f42516c.get(i7))).size();
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
        ys0[] ys0VarArr = this.f42215s.f36678w1;
        if (ys0VarArr[3].f42516c.size() == 0 && !ys0VarArr[3].f42519g) {
            return 5;
        }
        if (i7 < ys0VarArr[3].f42516c.size()) {
            if (i7 != 0 && i10 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs0.R():int");
    }

    @Override
    public final View T(int i7, View view) {
        jt0 jt0Var = this.f42215s;
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(28, this.f42214r, jt0Var.I1);
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i7 < jt0Var.f36678w1[3].f42516c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) ((ArrayList) jt0Var.f36678w1[3].d.get((String) jt0Var.f36678w1[3].f42516c.get(i7))).get(0)).f24213k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        ys0[] ys0VarArr = this.f42215s.f36678w1;
        if (ys0VarArr[3].f42516c.size() != 0 || ys0VarArr[3].f42519g) {
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
        jt0 jt0Var = this.f42215s;
        ys0[] ys0VarArr = jt0Var.f36678w1;
        int i11 = f1Var.f59169f;
        View view = f1Var.f59165a;
        if (i11 != 6 && i11 != 5) {
            ArrayList arrayList = (ArrayList) ys0VarArr[3].d.get((String) ys0VarArr[3].f42516c.get(i7));
            int i12 = f1Var.f59169f;
            boolean z11 = false;
            if (i12 != 3) {
                if (i12 == 4) {
                    if (i7 != 0) {
                        i10--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.l7) && i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i10);
                        if (i10 == arrayList.size() - 1 && (i7 != ys0VarArr[3].f42516c.size() - 1 || !ys0VarArr[3].f42519g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        l7Var.E = z10;
                        l7Var.e();
                        l7Var.f31030c0 = gjVar;
                        l7Var.requestLayout();
                        if (jt0Var.F1) {
                            SparseArray[] sparseArrayArr = jt0Var.f36619c1;
                            if (org.telegram.messenger.gj.B0(gjVar.f24213k) == jt0Var.f36648m1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z11 = true;
                            }
                            l7Var.f(z11, !jt0Var.f36625e1);
                            return;
                        }
                        l7Var.f(false, !jt0Var.f36625e1);
                        return;
                    }
                    return;
                }
                return;
            }
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.y3) {
                ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.hd.e0(gjVar2.f24213k.date, false));
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y3 y3Var;
        jt0 jt0Var = this.f42215s;
        org.telegram.ui.ActionBar.h6 h6Var = jt0Var.I1;
        Context context = this.f42214r;
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    yz yzVar = new yz(context, h6Var);
                    yzVar.setIsSingleCell(true);
                    yzVar.f42606x = false;
                    yzVar.setViewType(5);
                    y3Var = yzVar;
                } else {
                    y3 X = jt0.X(3, jt0Var.f36648m1, context, h6Var);
                    X.setLayoutParams(new v4.q0(-1, -1));
                    return new v4.f1(X);
                }
            } else {
                org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(0, context, h6Var);
                l7Var.setDelegate(jt0Var.W1);
                y3Var = l7Var;
            }
        } else {
            y3Var = new org.telegram.ui.Cells.y3(28, context, h6Var);
        }
        return i5.c.q(y3Var, y3Var, -1, -2);
    }
}
