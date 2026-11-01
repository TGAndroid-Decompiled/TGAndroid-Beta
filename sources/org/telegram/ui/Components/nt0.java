package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class nt0 extends bk0 {
    public final Context f28963c;
    public final int d;
    public boolean e;
    public final au0 f28964f;

    public nt0(au0 au0Var, Context context, int i10) {
        this.f28964f = au0Var;
        this.f28963c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f28964f.f24562v1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((ys0) arrayList.get(i11)).f32902b) {
                    return ((ys0) arrayList.get(i11)).f32901a;
                }
            }
            return ((ys0) i0.a.g(1, arrayList)).f32901a;
        }
        return "";
    }

    @Override
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        int measuredHeight = uk0Var.getChildAt(0).getMeasuredHeight();
        float e = f7 * ((e() * measuredHeight) - (uk0Var.getMeasuredHeight() - uk0Var.getPaddingTop()));
        iArr[0] = (int) (e / measuredHeight);
        iArr[1] = ((int) e) % measuredHeight;
    }

    @Override
    public final void J(uk0 uk0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < uk0Var.getChildCount() && (i10 = au0.n(uk0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f28964f.b0(this.d, uk0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        ts0 f02 = this.f28964f.f0(this.d);
        if (f02 != null) {
            au0.p(f02, null, false);
        }
    }

    @Override
    public final int b() {
        int i10;
        int i11;
        pt0[] pt0VarArr = this.f28964f.f24562v1;
        int i12 = this.d;
        pt0 pt0Var = pt0VarArr[i12];
        if (pt0Var.f29543o) {
            return pt0Var.e();
        }
        if (pt0Var.f29532a.size() == 0 && !pt0VarArr[i12].f29536g) {
            return 1;
        }
        if (pt0VarArr[i12].f29532a.size() == 0) {
            pt0 pt0Var2 = pt0VarArr[i12];
            boolean[] zArr = pt0Var2.f29537i;
            if ((!zArr[0] || !zArr[1]) && pt0Var2.f29540l) {
                return 0;
            }
        }
        if (pt0VarArr[i12].e() == 0) {
            int size = pt0VarArr[i12].c().size() + pt0VarArr[i12].d();
            if (size != 0) {
                pt0 pt0Var3 = pt0VarArr[i12];
                boolean[] zArr2 = pt0Var3.f29537i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = pt0Var3.f29546r;
                    if (z10) {
                        i10 = pt0Var3.f29549u;
                    } else {
                        i10 = pt0Var3.f29542n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = pt0Var3.f29549u;
                        } else {
                            i11 = pt0Var3.f29542n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(pt0VarArr[i12].e(), pt0VarArr[i12].c().size() + pt0VarArr[i12].d());
    }

    @Override
    public final int d(int i10) {
        pt0[] pt0VarArr = this.f28964f.f24562v1;
        int i11 = this.d;
        if (pt0VarArr[i11].f29534c.size() == 0 && !pt0VarArr[i11].f29536g) {
            return 9;
        }
        pt0 pt0Var = pt0VarArr[i11];
        int i12 = pt0Var.f29541m;
        if (i10 >= i12 && i10 < pt0Var.f29532a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f28964f.f24562v1[this.d].e();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        au0 au0Var = this.f28964f;
        long j10 = au0Var.l1;
        SparseArray[] sparseArrayArr = au0Var.f24502b1;
        pt0 pt0Var = au0Var.f24562v1[this.d];
        ArrayList arrayList = pt0Var.f29532a;
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.k7)) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i10 - pt0Var.f29541m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k7Var.f(kjVar, z11);
                if (au0Var.E1) {
                    if (org.telegram.messenger.kj.B0(kjVar.f16690k) == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(kjVar.f1()) >= 0) {
                        z12 = true;
                    }
                    k7Var.e(z12, !au0Var.f24509d1);
                    return;
                }
                k7Var.e(false, !au0Var.f24509d1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.l7)) {
        } else {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get(i10 - pt0Var.f29541m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            l7Var.c(kjVar2, z10);
            if (au0Var.E1) {
                if (org.telegram.messenger.kj.B0(kjVar2.f16690k) == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(kjVar2.f1()) >= 0) {
                    z12 = true;
                }
                l7Var.b(z12, !au0Var.f24509d1);
                return;
            }
            l7Var.b(false, !au0Var.f24509d1);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        au0 au0Var = this.f28964f;
        zz zzVar = au0Var.D;
        ArrayList arrayList = au0Var.I0;
        org.telegram.ui.ActionBar.p6 p6Var = au0Var.H1;
        Context context = this.f28963c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 != 8) {
                if (i10 != 9) {
                    if (i11 == 4 && !arrayList.isEmpty()) {
                        View view3 = (View) arrayList.get(0);
                        arrayList.remove(0);
                        ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                        view2 = view3;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view3);
                            view2 = view3;
                        }
                    } else {
                        view2 = new us0(this, context, p6Var, 1);
                    }
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view2;
                    k7Var.setGlobalGradientView(zzVar);
                    view = view2;
                    if (i11 == 4) {
                        au0Var.J0.add(k7Var);
                        view = view2;
                    }
                } else {
                    p3 W = au0.W(i11, au0Var.l1, context, p6Var);
                    W.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.c1(W);
                }
            } else {
                zz zzVar2 = new zz(context, p6Var);
                if (i11 == 2) {
                    zzVar2.setViewType(4);
                } else {
                    zzVar2.setViewType(3);
                }
                zzVar2.f33280x = false;
                zzVar2.setIsSingleCell(true);
                zzVar2.setGlobalGradientView(zzVar);
                view = zzVar2;
            }
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(0, context, p6Var);
            l7Var.setGlobalGradientView(zzVar);
            view = l7Var;
        }
        return sc.e.o(view, view, -1, -2);
    }
}
