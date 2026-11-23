package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class vs0 extends kj0 {
    public final Context f41432c;
    public final int d;
    public boolean f41433e;
    public final it0 f41434f;

    public vs0(it0 it0Var, Context context, int i7) {
        this.f41434f = it0Var;
        this.f41432c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList = this.f41434f.f36160w1[this.d].f42168e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i7 <= ((is0) arrayList.get(i10)).f36085b) {
                    return ((is0) arrayList.get(i10)).f36084a;
                }
            }
            return ((is0) i5.c.h(1, arrayList)).f36084a;
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
        if (this.f41433e) {
            this.f41433e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < ek0Var.getChildCount() && (i7 = it0.o(ek0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f41434f.c0(this.d, ek0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f41433e = true;
        ds0 g02 = this.f41434f.g0(this.d);
        if (g02 != null) {
            it0.s(g02, null, false);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        xs0[] xs0VarArr = this.f41434f.f36160w1;
        int i11 = this.d;
        xs0 xs0Var = xs0VarArr[i11];
        if (xs0Var.f42177o) {
            return xs0Var.e();
        }
        if (xs0Var.f42165a.size() == 0 && !xs0VarArr[i11].f42170g) {
            return 1;
        }
        if (xs0VarArr[i11].f42165a.size() == 0) {
            xs0 xs0Var2 = xs0VarArr[i11];
            boolean[] zArr = xs0Var2.f42171i;
            if ((!zArr[0] || !zArr[1]) && xs0Var2.f42174l) {
                return 0;
            }
        }
        if (xs0VarArr[i11].e() == 0) {
            int size = xs0VarArr[i11].c().size() + xs0VarArr[i11].d();
            if (size != 0) {
                xs0 xs0Var3 = xs0VarArr[i11];
                boolean[] zArr2 = xs0Var3.f42171i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = xs0Var3.f42180r;
                    if (z10) {
                        i7 = xs0Var3.f42183u;
                    } else {
                        i7 = xs0Var3.f42176n;
                    }
                    if (i7 != 0) {
                        if (z10) {
                            i10 = xs0Var3.f42183u;
                        } else {
                            i10 = xs0Var3.f42176n;
                        }
                        return i10 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(xs0VarArr[i11].e(), xs0VarArr[i11].c().size() + xs0VarArr[i11].d());
    }

    @Override
    public final int d(int i7) {
        xs0[] xs0VarArr = this.f41434f.f36160w1;
        int i10 = this.d;
        if (xs0VarArr[i10].f42167c.size() == 0 && !xs0VarArr[i10].f42170g) {
            return 9;
        }
        xs0 xs0Var = xs0VarArr[i10];
        int i11 = xs0Var.f42175m;
        if (i7 >= i11 && i7 < xs0Var.f42165a.size() + i11) {
            if (i10 != 2 && i10 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f41434f.f36160w1[this.d].e();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        it0 it0Var = this.f41434f;
        long j3 = it0Var.f36130m1;
        SparseArray[] sparseArrayArr = it0Var.f36101c1;
        xs0 xs0Var = it0Var.f36160w1[this.d];
        ArrayList arrayList = xs0Var.f42165a;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z12 = false;
        if (i10 != 7) {
            if (i10 == 10 && (view instanceof org.telegram.ui.Cells.g7)) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7 - xs0Var.f42175m);
                if (i7 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                g7Var.f(fjVar, z11);
                if (it0Var.F1) {
                    if (org.telegram.messenger.fj.B0(fjVar.f24073k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(fjVar.e1()) >= 0) {
                        z12 = true;
                    }
                    g7Var.e(z12, !it0Var.f36107e1);
                    return;
                }
                g7Var.e(false, !it0Var.f36107e1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.h7)) {
        } else {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i7 - xs0Var.f42175m);
            if (i7 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            h7Var.c(fjVar2, z10);
            if (it0Var.F1) {
                if (org.telegram.messenger.fj.B0(fjVar2.f24073k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(fjVar2.e1()) >= 0) {
                    z12 = true;
                }
                h7Var.b(z12, !it0Var.f36107e1);
                return;
            }
            h7Var.b(false, !it0Var.f36107e1);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        it0 it0Var = this.f41434f;
        vz vzVar = it0Var.E;
        ArrayList arrayList = it0Var.J0;
        org.telegram.ui.ActionBar.i6 i6Var = it0Var.I1;
        Context context = this.f41432c;
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
                        view2 = new es0(this, context, i6Var, 1);
                    }
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view2;
                    g7Var.setGlobalGradientView(vzVar);
                    view = view2;
                    if (i10 == 4) {
                        it0Var.K0.add(g7Var);
                        view = view2;
                    }
                } else {
                    x3 X = it0.X(i10, it0Var.f36130m1, context, i6Var);
                    X.setLayoutParams(new v4.q0(-1, -1));
                    return new v4.f1(X);
                }
            } else {
                vz vzVar2 = new vz(context, i6Var);
                if (i10 == 2) {
                    vzVar2.setViewType(4);
                } else {
                    vzVar2.setViewType(3);
                }
                vzVar2.f41457x = false;
                vzVar2.setIsSingleCell(true);
                vzVar2.setGlobalGradientView(vzVar);
                view = vzVar2;
            }
        } else {
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(0, context, i6Var);
            h7Var.setGlobalGradientView(vzVar);
            view = h7Var;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
