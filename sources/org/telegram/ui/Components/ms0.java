package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ms0 extends wi0 {
    public final Context f36143c;
    public final int d;
    public boolean f36144e;
    public final zs0 f36145f;

    public ms0(zs0 zs0Var, Context context, int i7) {
        this.f36145f = zs0Var;
        this.f36143c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList = this.f36145f.f41121v1[this.d].f36781e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i7 <= ((zr0) arrayList.get(i10)).f41050b) {
                    return ((zr0) arrayList.get(i10)).f41049a;
                }
            }
            return ((zr0) jg.g.i(1, arrayList)).f41049a;
        }
        return "";
    }

    @Override
    public final void G(qj0 qj0Var, float f10, int[] iArr) {
        int measuredHeight = qj0Var.getChildAt(0).getMeasuredHeight();
        float e10 = f10 * ((e() * measuredHeight) - (qj0Var.getMeasuredHeight() - qj0Var.getPaddingTop()));
        iArr[0] = (int) (e10 / measuredHeight);
        iArr[1] = ((int) e10) % measuredHeight;
    }

    @Override
    public final void J(qj0 qj0Var) {
        if (this.f36144e) {
            this.f36144e = false;
            int i7 = 0;
            for (int i10 = 0; i10 < qj0Var.getChildCount() && (i7 = zs0.o(qj0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i7 == 0) {
                this.f36145f.c0(this.d, qj0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f36144e = true;
        ur0 g02 = this.f36145f.g0(this.d);
        if (g02 != null) {
            zs0.s(g02, null, false);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        os0[] os0VarArr = this.f36145f.f41121v1;
        int i11 = this.d;
        os0 os0Var = os0VarArr[i11];
        if (os0Var.f36790o) {
            return os0Var.e();
        }
        if (os0Var.f36778a.size() == 0 && !os0VarArr[i11].f36783g) {
            return 1;
        }
        if (os0VarArr[i11].f36778a.size() == 0) {
            os0 os0Var2 = os0VarArr[i11];
            boolean[] zArr = os0Var2.f36784i;
            if ((!zArr[0] || !zArr[1]) && os0Var2.f36787l) {
                return 0;
            }
        }
        if (os0VarArr[i11].e() == 0) {
            int size = os0VarArr[i11].c().size() + os0VarArr[i11].d();
            if (size != 0) {
                os0 os0Var3 = os0VarArr[i11];
                boolean[] zArr2 = os0Var3.f36784i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z9 = os0Var3.f36793r;
                    if (z9) {
                        i7 = os0Var3.f36796u;
                    } else {
                        i7 = os0Var3.f36789n;
                    }
                    if (i7 != 0) {
                        if (z9) {
                            i10 = os0Var3.f36796u;
                        } else {
                            i10 = os0Var3.f36789n;
                        }
                        return i10 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(os0VarArr[i11].e(), os0VarArr[i11].c().size() + os0VarArr[i11].d());
    }

    @Override
    public final int d(int i7) {
        os0[] os0VarArr = this.f36145f.f41121v1;
        int i10 = this.d;
        if (os0VarArr[i10].f36780c.size() == 0 && !os0VarArr[i10].f36783g) {
            return 9;
        }
        os0 os0Var = os0VarArr[i10];
        int i11 = os0Var.f36788m;
        if (i7 >= i11 && i7 < os0Var.f36778a.size() + i11) {
            if (i10 != 2 && i10 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f36145f.f41121v1[this.d].e();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        char c10;
        boolean z10;
        char c11;
        zs0 zs0Var = this.f36145f;
        long j3 = zs0Var.l1;
        SparseArray[] sparseArrayArr = zs0Var.f41062b1;
        os0 os0Var = zs0Var.f41121v1[this.d];
        ArrayList arrayList = os0Var.f36778a;
        int i10 = d1Var.f57060f;
        View view = d1Var.f57056a;
        boolean z11 = false;
        if (i10 != 7) {
            if (i10 == 10 && (view instanceof org.telegram.ui.Cells.g7)) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7 - os0Var.f36788m);
                if (i7 != arrayList.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g7Var.f(ijVar, z10);
                if (zs0Var.E1) {
                    if (org.telegram.messenger.ij.B0(ijVar.f23262k) == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(ijVar.e1()) >= 0) {
                        z11 = true;
                    }
                    g7Var.e(z11, !zs0Var.f41069d1);
                    return;
                }
                g7Var.e(false, !zs0Var.f41069d1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.h7)) {
        } else {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i7 - os0Var.f36788m);
            if (i7 != arrayList.size() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            h7Var.c(ijVar2, z9);
            if (zs0Var.E1) {
                if (org.telegram.messenger.ij.B0(ijVar2.f23262k) == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(ijVar2.e1()) >= 0) {
                    z11 = true;
                }
                h7Var.b(z11, !zs0Var.f41069d1);
                return;
            }
            h7Var.b(false, !zs0Var.f41069d1);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        zs0 zs0Var = this.f36145f;
        mz mzVar = zs0Var.D;
        ArrayList arrayList = zs0Var.I0;
        org.telegram.ui.ActionBar.g6 g6Var = zs0Var.H1;
        Context context = this.f36143c;
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
                        view2 = new vr0(this, context, g6Var, 1);
                    }
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view2;
                    g7Var.setGlobalGradientView(mzVar);
                    view = view2;
                    if (i10 == 4) {
                        zs0Var.J0.add(g7Var);
                        view = view2;
                    }
                } else {
                    r3 X = zs0.X(i10, zs0Var.l1, context, g6Var);
                    X.setLayoutParams(new v4.o0(-1, -1));
                    return new v4.d1(X);
                }
            } else {
                mz mzVar2 = new mz(context, g6Var);
                if (i10 == 2) {
                    mzVar2.setViewType(4);
                } else {
                    mzVar2.setViewType(3);
                }
                mzVar2.f36181x = false;
                mzVar2.setIsSingleCell(true);
                mzVar2.setGlobalGradientView(mzVar);
                view = mzVar2;
            }
        } else {
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(0, context, g6Var);
            h7Var.setGlobalGradientView(mzVar);
            view = h7Var;
        }
        return jg.g.r(view, view, -1, -2);
    }
}
