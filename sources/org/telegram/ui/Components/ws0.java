package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ws0 extends kj0 {
    public final Context f41852c;
    public final int d;
    public boolean f41853e;
    public final jt0 f41854f;

    public ws0(jt0 jt0Var, Context context, int i7) {
        this.f41854f = jt0Var;
        this.f41852c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList = this.f41854f.f36632w1[this.d].f42477e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i7 <= ((js0) arrayList.get(i10)).f36554b) {
                    return ((js0) arrayList.get(i10)).f36553a;
                }
            }
            return ((js0) i5.c.h(1, arrayList)).f36553a;
        }
        return "";
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override
    public final void J(ek0 ek0Var) {
        if (this.f41853e) {
            this.f41853e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < ek0Var.getChildCount() && (i7 = jt0.o(ek0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f41854f.c0(this.d, ek0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f41853e = true;
        ds0 g02 = this.f41854f.g0(this.d);
        if (g02 != null) {
            jt0.s(g02, null, false);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        ys0[] ys0VarArr = this.f41854f.f36632w1;
        int i11 = this.d;
        ys0 ys0Var = ys0VarArr[i11];
        if (ys0Var.f42486o) {
            return ys0Var.e();
        }
        if (ys0Var.f42474a.size() == 0 && !ys0VarArr[i11].f42479g) {
            return 1;
        }
        if (ys0VarArr[i11].f42474a.size() == 0) {
            ys0 ys0Var2 = ys0VarArr[i11];
            boolean[] zArr = ys0Var2.f42480i;
            if ((!zArr[0] || !zArr[1]) && ys0Var2.f42483l) {
                return 0;
            }
        }
        if (ys0VarArr[i11].e() == 0) {
            int size = ys0VarArr[i11].c().size() + ys0VarArr[i11].d();
            if (size != 0) {
                ys0 ys0Var3 = ys0VarArr[i11];
                boolean[] zArr2 = ys0Var3.f42480i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = ys0Var3.f42489r;
                    if (z10) {
                        i7 = ys0Var3.f42492u;
                    } else {
                        i7 = ys0Var3.f42485n;
                    }
                    if (i7 != 0) {
                        if (z10) {
                            i10 = ys0Var3.f42492u;
                        } else {
                            i10 = ys0Var3.f42485n;
                        }
                        return i10 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(ys0VarArr[i11].e(), ys0VarArr[i11].c().size() + ys0VarArr[i11].d());
    }

    @Override
    public final int d(int i7) {
        ys0[] ys0VarArr = this.f41854f.f36632w1;
        int i10 = this.d;
        if (ys0VarArr[i10].f42476c.size() == 0 && !ys0VarArr[i10].f42479g) {
            return 9;
        }
        ys0 ys0Var = ys0VarArr[i10];
        int i11 = ys0Var.f42484m;
        if (i7 >= i11 && i7 < ys0Var.f42474a.size() + i11) {
            if (i10 != 2 && i10 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f41854f.f36632w1[this.d].e();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        jt0 jt0Var = this.f41854f;
        long j3 = jt0Var.f36602m1;
        SparseArray[] sparseArrayArr = jt0Var.f36573c1;
        ys0 ys0Var = jt0Var.f36632w1[this.d];
        ArrayList arrayList = ys0Var.f42474a;
        int i10 = e1Var.f59115f;
        View view = e1Var.f59111a;
        boolean z12 = false;
        if (i10 != 7) {
            if (i10 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7 - ys0Var.f42484m);
                if (i7 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.f(gjVar, z11);
                if (jt0Var.F1) {
                    if (org.telegram.messenger.gj.B0(gjVar.f24177k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(gjVar.e1()) >= 0) {
                        z12 = true;
                    }
                    h7Var.e(z12, !jt0Var.f36579e1);
                    return;
                }
                h7Var.e(false, !jt0Var.f36579e1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.i7)) {
        } else {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(i7 - ys0Var.f42484m);
            if (i7 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i7Var.c(gjVar2, z10);
            if (jt0Var.F1) {
                if (org.telegram.messenger.gj.B0(gjVar2.f24177k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(gjVar2.e1()) >= 0) {
                    z12 = true;
                }
                i7Var.b(z12, !jt0Var.f36579e1);
                return;
            }
            i7Var.b(false, !jt0Var.f36579e1);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        jt0 jt0Var = this.f41854f;
        yz yzVar = jt0Var.E;
        ArrayList arrayList = jt0Var.J0;
        org.telegram.ui.ActionBar.h6 h6Var = jt0Var.I1;
        Context context = this.f41852c;
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
                        view2 = new fs0(this, context, h6Var, 1);
                    }
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view2;
                    h7Var.setGlobalGradientView(yzVar);
                    view = view2;
                    if (i10 == 4) {
                        jt0Var.K0.add(h7Var);
                        view = view2;
                    }
                } else {
                    y3 X = jt0.X(i10, jt0Var.f36602m1, context, h6Var);
                    X.setLayoutParams(new v4.p0(-1, -1));
                    return new v4.e1(X);
                }
            } else {
                yz yzVar2 = new yz(context, h6Var);
                if (i10 == 2) {
                    yzVar2.setViewType(4);
                } else {
                    yzVar2.setViewType(3);
                }
                yzVar2.f42563x = false;
                yzVar2.setIsSingleCell(true);
                yzVar2.setGlobalGradientView(yzVar);
                view = yzVar2;
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(0, context, h6Var);
            i7Var.setGlobalGradientView(yzVar);
            view = i7Var;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
