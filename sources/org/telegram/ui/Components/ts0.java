package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ts0 extends ij0 {
    public final Context f40094c;
    public final int d;
    public boolean f40095e;
    public final gt0 f40096f;

    public ts0(gt0 gt0Var, Context context, int i7) {
        this.f40096f = gt0Var;
        this.f40094c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList = this.f40096f.f35636w1[this.d].f41415e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i7 <= ((gs0) arrayList.get(i10)).f35558b) {
                    return ((gs0) arrayList.get(i10)).f35557a;
                }
            }
            return ((gs0) i5.c.h(1, arrayList)).f35557a;
        }
        return "";
    }

    @Override
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        int measuredHeight = ck0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (ck0Var.getMeasuredHeight() - ck0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override
    public final void J(ck0 ck0Var) {
        if (this.f40095e) {
            this.f40095e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < ck0Var.getChildCount() && (i7 = gt0.o(ck0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f40096f.c0(this.d, ck0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f40095e = true;
        bs0 g02 = this.f40096f.g0(this.d);
        if (g02 != null) {
            gt0.s(g02, null, false);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        vs0[] vs0VarArr = this.f40096f.f35636w1;
        int i11 = this.d;
        vs0 vs0Var = vs0VarArr[i11];
        if (vs0Var.f41424o) {
            return vs0Var.e();
        }
        if (vs0Var.f41412a.size() == 0 && !vs0VarArr[i11].f41417g) {
            return 1;
        }
        if (vs0VarArr[i11].f41412a.size() == 0) {
            vs0 vs0Var2 = vs0VarArr[i11];
            boolean[] zArr = vs0Var2.f41418i;
            if ((!zArr[0] || !zArr[1]) && vs0Var2.f41421l) {
                return 0;
            }
        }
        if (vs0VarArr[i11].e() == 0) {
            int size = vs0VarArr[i11].c().size() + vs0VarArr[i11].d();
            if (size != 0) {
                vs0 vs0Var3 = vs0VarArr[i11];
                boolean[] zArr2 = vs0Var3.f41418i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = vs0Var3.f41427r;
                    if (z10) {
                        i7 = vs0Var3.f41430u;
                    } else {
                        i7 = vs0Var3.f41423n;
                    }
                    if (i7 != 0) {
                        if (z10) {
                            i10 = vs0Var3.f41430u;
                        } else {
                            i10 = vs0Var3.f41423n;
                        }
                        return i10 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(vs0VarArr[i11].e(), vs0VarArr[i11].c().size() + vs0VarArr[i11].d());
    }

    @Override
    public final int d(int i7) {
        vs0[] vs0VarArr = this.f40096f.f35636w1;
        int i10 = this.d;
        if (vs0VarArr[i10].f41414c.size() == 0 && !vs0VarArr[i10].f41417g) {
            return 9;
        }
        vs0 vs0Var = vs0VarArr[i10];
        int i11 = vs0Var.f41422m;
        if (i7 >= i11 && i7 < vs0Var.f41412a.size() + i11) {
            if (i10 != 2 && i10 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f40096f.f35636w1[this.d].e();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        gt0 gt0Var = this.f40096f;
        long j3 = gt0Var.f35606m1;
        SparseArray[] sparseArrayArr = gt0Var.f35577c1;
        vs0 vs0Var = gt0Var.f35636w1[this.d];
        ArrayList arrayList = vs0Var.f41412a;
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        boolean z12 = false;
        if (i10 != 7) {
            if (i10 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7 - vs0Var.f41422m);
                if (i7 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.f(fjVar, z11);
                if (gt0Var.F1) {
                    if (org.telegram.messenger.fj.B0(fjVar.f23965k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(fjVar.e1()) >= 0) {
                        z12 = true;
                    }
                    h7Var.e(z12, !gt0Var.f35583e1);
                    return;
                }
                h7Var.e(false, !gt0Var.f35583e1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.i7)) {
        } else {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i7 - vs0Var.f41422m);
            if (i7 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i7Var.c(fjVar2, z10);
            if (gt0Var.F1) {
                if (org.telegram.messenger.fj.B0(fjVar2.f23965k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(fjVar2.e1()) >= 0) {
                    z12 = true;
                }
                i7Var.b(z12, !gt0Var.f35583e1);
                return;
            }
            i7Var.b(false, !gt0Var.f35583e1);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        gt0 gt0Var = this.f40096f;
        wz wzVar = gt0Var.E;
        ArrayList arrayList = gt0Var.J0;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.f40094c;
        if (i7 != 7) {
            int i10 = this.d;
            if (i7 != 8) {
                if (i7 != 9) {
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
                        view2 = new cs0(this, context, i6Var, 1);
                    }
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view2;
                    h7Var.setGlobalGradientView(wzVar);
                    view = view2;
                    if (i10 == 4) {
                        gt0Var.K0.add(h7Var);
                        view = view2;
                    }
                } else {
                    x3 X = gt0.X(i10, gt0Var.f35606m1, context, i6Var);
                    X.setLayoutParams(new v4.q0(-1, -1));
                    return new v4.f1(X);
                }
            } else {
                wz wzVar2 = new wz(context, i6Var);
                if (i10 == 2) {
                    wzVar2.setViewType(4);
                } else {
                    wzVar2.setViewType(3);
                }
                wzVar2.f41829x = false;
                wzVar2.setIsSingleCell(true);
                wzVar2.setGlobalGradientView(wzVar);
                view = wzVar2;
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(0, context, i6Var);
            i7Var.setGlobalGradientView(wzVar);
            view = i7Var;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
