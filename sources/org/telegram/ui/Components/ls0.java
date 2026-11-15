package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ls0 extends aj0 {
    public final Context f36898c;
    public final int d;
    public boolean f36899e;
    public final ys0 f36900f;

    public ls0(ys0 ys0Var, Context context, int i7) {
        this.f36900f = ys0Var;
        this.f36898c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList = this.f36900f.f42146w1[this.d].f37684e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i7 <= ((yr0) arrayList.get(i10)).f42069b) {
                    return ((yr0) arrayList.get(i10)).f42068a;
                }
            }
            return ((yr0) i5.c.h(1, arrayList)).f42068a;
        }
        return "";
    }

    @Override
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (uj0Var.getMeasuredHeight() - uj0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override
    public final void J(uj0 uj0Var) {
        if (this.f36899e) {
            this.f36899e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < uj0Var.getChildCount() && (i7 = ys0.o(uj0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f36900f.c0(this.d, uj0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f36899e = true;
        tr0 g02 = this.f36900f.g0(this.d);
        if (g02 != null) {
            ys0.s(g02, null, false);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        ns0[] ns0VarArr = this.f36900f.f42146w1;
        int i11 = this.d;
        ns0 ns0Var = ns0VarArr[i11];
        if (ns0Var.f37693o) {
            return ns0Var.e();
        }
        if (ns0Var.f37681a.size() == 0 && !ns0VarArr[i11].f37686g) {
            return 1;
        }
        if (ns0VarArr[i11].f37681a.size() == 0) {
            ns0 ns0Var2 = ns0VarArr[i11];
            boolean[] zArr = ns0Var2.f37687i;
            if ((!zArr[0] || !zArr[1]) && ns0Var2.f37690l) {
                return 0;
            }
        }
        if (ns0VarArr[i11].e() == 0) {
            int size = ns0VarArr[i11].c().size() + ns0VarArr[i11].d();
            if (size != 0) {
                ns0 ns0Var3 = ns0VarArr[i11];
                boolean[] zArr2 = ns0Var3.f37687i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = ns0Var3.f37696r;
                    if (z10) {
                        i7 = ns0Var3.f37699u;
                    } else {
                        i7 = ns0Var3.f37692n;
                    }
                    if (i7 != 0) {
                        if (z10) {
                            i10 = ns0Var3.f37699u;
                        } else {
                            i10 = ns0Var3.f37692n;
                        }
                        return i10 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(ns0VarArr[i11].e(), ns0VarArr[i11].c().size() + ns0VarArr[i11].d());
    }

    @Override
    public final int d(int i7) {
        ns0[] ns0VarArr = this.f36900f.f42146w1;
        int i10 = this.d;
        if (ns0VarArr[i10].f37683c.size() == 0 && !ns0VarArr[i10].f37686g) {
            return 9;
        }
        ns0 ns0Var = ns0VarArr[i10];
        int i11 = ns0Var.f37691m;
        if (i7 >= i11 && i7 < ns0Var.f37681a.size() + i11) {
            if (i10 != 2 && i10 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f36900f.f42146w1[this.d].e();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        ys0 ys0Var = this.f36900f;
        long j3 = ys0Var.f42116m1;
        SparseArray[] sparseArrayArr = ys0Var.f42087c1;
        ns0 ns0Var = ys0Var.f42146w1[this.d];
        ArrayList arrayList = ns0Var.f37681a;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z12 = false;
        if (i10 != 7) {
            if (i10 == 10 && (view instanceof org.telegram.ui.Cells.f7)) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7 - ns0Var.f37691m);
                if (i7 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f7Var.f(gjVar, z11);
                if (ys0Var.F1) {
                    if (org.telegram.messenger.gj.B0(gjVar.f23819k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(gjVar.e1()) >= 0) {
                        z12 = true;
                    }
                    f7Var.e(z12, !ys0Var.f42093e1);
                    return;
                }
                f7Var.e(false, !ys0Var.f42093e1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.g7)) {
        } else {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(i7 - ns0Var.f37691m);
            if (i7 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g7Var.c(gjVar2, z10);
            if (ys0Var.F1) {
                if (org.telegram.messenger.gj.B0(gjVar2.f23819k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(gjVar2.e1()) >= 0) {
                    z12 = true;
                }
                g7Var.b(z12, !ys0Var.f42093e1);
                return;
            }
            g7Var.b(false, !ys0Var.f42093e1);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        ys0 ys0Var = this.f36900f;
        pz pzVar = ys0Var.E;
        ArrayList arrayList = ys0Var.J0;
        org.telegram.ui.ActionBar.e6 e6Var = ys0Var.I1;
        Context context = this.f36898c;
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
                        view2 = new ur0(this, context, e6Var, 1);
                    }
                    org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view2;
                    f7Var.setGlobalGradientView(pzVar);
                    view = view2;
                    if (i10 == 4) {
                        ys0Var.K0.add(f7Var);
                        view = view2;
                    }
                } else {
                    p3 X = ys0.X(i10, ys0Var.f42116m1, context, e6Var);
                    X.setLayoutParams(new v4.p0(-1, -1));
                    return new v4.e1(X);
                }
            } else {
                pz pzVar2 = new pz(context, e6Var);
                if (i10 == 2) {
                    pzVar2.setViewType(4);
                } else {
                    pzVar2.setViewType(3);
                }
                pzVar2.f38448x = false;
                pzVar2.setIsSingleCell(true);
                pzVar2.setGlobalGradientView(pzVar);
                view = pzVar2;
            }
        } else {
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(0, context, e6Var);
            g7Var.setGlobalGradientView(pzVar);
            view = g7Var;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
