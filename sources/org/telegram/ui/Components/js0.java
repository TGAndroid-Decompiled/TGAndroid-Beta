package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class js0 extends zi0 {
    public final Context f35185c;
    public final int d;
    public boolean f35186e;
    public final ws0 f35187f;

    public js0(ws0 ws0Var, Context context, int i3) {
        this.f35187f = ws0Var;
        this.f35185c = context;
        this.d = i3;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final String F(int i3) {
        ArrayList arrayList = this.f35187f.f40136w1[this.d].f35857e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i3 <= ((wr0) arrayList.get(i10)).f40061b) {
                    return ((wr0) arrayList.get(i10)).f40060a;
                }
            }
            return ((wr0) k2.p1.h(1, arrayList)).f40060a;
        }
        return "";
    }

    @Override
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (tj0Var.getMeasuredHeight() - tj0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override
    public final void J(tj0 tj0Var) {
        if (this.f35186e) {
            this.f35186e = false;
            int i3 = 0;
            for (int i10 = 0; i10 < tj0Var.getChildCount() && (i3 = ws0.o(tj0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i3 == 0) {
                this.f35187f.c0(this.d, tj0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f35186e = true;
        rr0 g02 = this.f35187f.g0(this.d);
        if (g02 != null) {
            ws0.s(g02, null, false);
        }
    }

    @Override
    public final int b() {
        int i3;
        int i10;
        ls0[] ls0VarArr = this.f35187f.f40136w1;
        int i11 = this.d;
        ls0 ls0Var = ls0VarArr[i11];
        if (ls0Var.f35866o) {
            return ls0Var.e();
        }
        if (ls0Var.f35854a.size() == 0 && !ls0VarArr[i11].f35859g) {
            return 1;
        }
        if (ls0VarArr[i11].f35854a.size() == 0) {
            ls0 ls0Var2 = ls0VarArr[i11];
            boolean[] zArr = ls0Var2.f35860i;
            if ((!zArr[0] || !zArr[1]) && ls0Var2.f35863l) {
                return 0;
            }
        }
        if (ls0VarArr[i11].e() == 0) {
            int size = ls0VarArr[i11].c().size() + ls0VarArr[i11].d();
            if (size != 0) {
                ls0 ls0Var3 = ls0VarArr[i11];
                boolean[] zArr2 = ls0Var3.f35860i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = ls0Var3.f35869r;
                    if (z10) {
                        i3 = ls0Var3.f35872u;
                    } else {
                        i3 = ls0Var3.f35865n;
                    }
                    if (i3 != 0) {
                        if (z10) {
                            i10 = ls0Var3.f35872u;
                        } else {
                            i10 = ls0Var3.f35865n;
                        }
                        return i10 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(ls0VarArr[i11].e(), ls0VarArr[i11].c().size() + ls0VarArr[i11].d());
    }

    @Override
    public final int d(int i3) {
        ls0[] ls0VarArr = this.f35187f.f40136w1;
        int i10 = this.d;
        if (ls0VarArr[i10].f35856c.size() == 0 && !ls0VarArr[i10].f35859g) {
            return 9;
        }
        ls0 ls0Var = ls0VarArr[i10];
        int i11 = ls0Var.f35864m;
        if (i3 >= i11 && i3 < ls0Var.f35854a.size() + i11) {
            if (i10 != 2 && i10 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f35187f.f40136w1[this.d].e();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        char c2;
        boolean z11;
        char c10;
        ws0 ws0Var = this.f35187f;
        long j10 = ws0Var.m1;
        SparseArray[] sparseArrayArr = ws0Var.f40077c1;
        ls0 ls0Var = ws0Var.f40136w1[this.d];
        ArrayList arrayList = ls0Var.f35854a;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z12 = false;
        if (i10 != 7) {
            if (i10 == 10 && (view instanceof org.telegram.ui.Cells.f7)) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3 - ls0Var.f35864m);
                if (i3 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f7Var.f(ziVar, z11);
                if (ws0Var.F1) {
                    if (org.telegram.messenger.zi.B0(ziVar.f26868k) == j10) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    if (sparseArrayArr[c10].indexOfKey(ziVar.f1()) >= 0) {
                        z12 = true;
                    }
                    f7Var.e(z12, !ws0Var.f40083e1);
                    return;
                }
                f7Var.e(false, !ws0Var.f40083e1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.g7)) {
        } else {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i3 - ls0Var.f35864m);
            if (i3 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g7Var.c(ziVar2, z10);
            if (ws0Var.F1) {
                if (org.telegram.messenger.zi.B0(ziVar2.f26868k) == j10) {
                    c2 = 0;
                } else {
                    c2 = 1;
                }
                if (sparseArrayArr[c2].indexOfKey(ziVar2.f1()) >= 0) {
                    z12 = true;
                }
                g7Var.b(z12, !ws0Var.f40083e1);
                return;
            }
            g7Var.b(false, !ws0Var.f40083e1);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        ws0 ws0Var = this.f35187f;
        iz izVar = ws0Var.E;
        ArrayList arrayList = ws0Var.J0;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.f35185c;
        if (i3 != 7) {
            int i10 = this.d;
            if (i3 != 8) {
                if (i3 != 9) {
                    if (i10 == 4 && !arrayList.isEmpty()) {
                        View view3 = (View) arrayList.get(0);
                        arrayList.remove(0);
                        ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                        view2 = view3;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view3);
                            view2 = view3;
                        }
                    } else {
                        view2 = new sr0(this, context, e6Var, 1);
                    }
                    org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view2;
                    f7Var.setGlobalGradientView(izVar);
                    view = view2;
                    if (i10 == 4) {
                        ws0Var.K0.add(f7Var);
                        view = view2;
                    }
                } else {
                    p3 X = ws0.X(i10, ws0Var.m1, context, e6Var);
                    X.setLayoutParams(new u4.p0(-1, -1));
                    return new u4.d1(X);
                }
            } else {
                iz izVar2 = new iz(context, e6Var);
                if (i10 == 2) {
                    izVar2.setViewType(4);
                } else {
                    izVar2.setViewType(3);
                }
                izVar2.f34869x = false;
                izVar2.setIsSingleCell(true);
                izVar2.setGlobalGradientView(izVar);
                view = izVar2;
            }
        } else {
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(0, context, e6Var);
            g7Var.setGlobalGradientView(izVar);
            view = g7Var;
        }
        return k2.p1.p(view, view, -1, -2);
    }
}
