package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class mt0 extends ak0 {
    public final Context f28591c;
    public final int d;
    public boolean e;
    public final zt0 f28592f;

    public mt0(zt0 zt0Var, Context context, int i10) {
        this.f28592f = zt0Var;
        this.f28591c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f28592f.f33234v1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((xs0) arrayList.get(i11)).f32543b) {
                    return ((xs0) arrayList.get(i11)).f32542a;
                }
            }
            return ((xs0) i0.a.g(1, arrayList)).f32542a;
        }
        return "";
    }

    @Override
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        int measuredHeight = tk0Var.getChildAt(0).getMeasuredHeight();
        float e = f7 * ((e() * measuredHeight) - (tk0Var.getMeasuredHeight() - tk0Var.getPaddingTop()));
        iArr[0] = (int) (e / measuredHeight);
        iArr[1] = ((int) e) % measuredHeight;
    }

    @Override
    public final void J(tk0 tk0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < tk0Var.getChildCount() && (i10 = zt0.n(tk0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f28592f.a0(this.d, tk0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        ss0 e02 = this.f28592f.e0(this.d);
        if (e02 != null) {
            zt0.p(e02, null, false);
        }
    }

    @Override
    public final int b() {
        int i10;
        int i11;
        ot0[] ot0VarArr = this.f28592f.f33234v1;
        int i12 = this.d;
        ot0 ot0Var = ot0VarArr[i12];
        if (ot0Var.f29188o) {
            return ot0Var.e();
        }
        if (ot0Var.f29177a.size() == 0 && !ot0VarArr[i12].f29181g) {
            return 1;
        }
        if (ot0VarArr[i12].f29177a.size() == 0) {
            ot0 ot0Var2 = ot0VarArr[i12];
            boolean[] zArr = ot0Var2.f29182i;
            if ((!zArr[0] || !zArr[1]) && ot0Var2.f29185l) {
                return 0;
            }
        }
        if (ot0VarArr[i12].e() == 0) {
            int size = ot0VarArr[i12].c().size() + ot0VarArr[i12].d();
            if (size != 0) {
                ot0 ot0Var3 = ot0VarArr[i12];
                boolean[] zArr2 = ot0Var3.f29182i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = ot0Var3.f29191r;
                    if (z10) {
                        i10 = ot0Var3.f29194u;
                    } else {
                        i10 = ot0Var3.f29187n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = ot0Var3.f29194u;
                        } else {
                            i11 = ot0Var3.f29187n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(ot0VarArr[i12].e(), ot0VarArr[i12].c().size() + ot0VarArr[i12].d());
    }

    @Override
    public final int d(int i10) {
        ot0[] ot0VarArr = this.f28592f.f33234v1;
        int i11 = this.d;
        if (ot0VarArr[i11].f29179c.size() == 0 && !ot0VarArr[i11].f29181g) {
            return 9;
        }
        ot0 ot0Var = ot0VarArr[i11];
        int i12 = ot0Var.f29186m;
        if (i10 >= i12 && i10 < ot0Var.f29177a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f28592f.f33234v1[this.d].e();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        zt0 zt0Var = this.f28592f;
        long j10 = zt0Var.l1;
        SparseArray[] sparseArrayArr = zt0Var.f33174b1;
        ot0 ot0Var = zt0Var.f33234v1[this.d];
        ArrayList arrayList = ot0Var.f29177a;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.k7)) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i10 - ot0Var.f29186m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k7Var.f(jjVar, z11);
                if (zt0Var.E1) {
                    if (org.telegram.messenger.jj.B0(jjVar.f16337k) == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(jjVar.f1()) >= 0) {
                        z12 = true;
                    }
                    k7Var.e(z12, !zt0Var.f33181d1);
                    return;
                }
                k7Var.e(false, !zt0Var.f33181d1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.l7)) {
        } else {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(i10 - ot0Var.f29186m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            l7Var.c(jjVar2, z10);
            if (zt0Var.E1) {
                if (org.telegram.messenger.jj.B0(jjVar2.f16337k) == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(jjVar2.f1()) >= 0) {
                    z12 = true;
                }
                l7Var.b(z12, !zt0Var.f33181d1);
                return;
            }
            l7Var.b(false, !zt0Var.f33181d1);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        zt0 zt0Var = this.f28592f;
        zz zzVar = zt0Var.D;
        ArrayList arrayList = zt0Var.I0;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.f28591c;
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
                        view2 = new ts0(this, context, p6Var, 1);
                    }
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view2;
                    k7Var.setGlobalGradientView(zzVar);
                    view = view2;
                    if (i11 == 4) {
                        zt0Var.J0.add(k7Var);
                        view = view2;
                    }
                } else {
                    p3 V = zt0.V(i11, zt0Var.l1, context, p6Var);
                    V.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.c1(V);
                }
            } else {
                zz zzVar2 = new zz(context, p6Var);
                if (i11 == 2) {
                    zzVar2.setViewType(4);
                } else {
                    zzVar2.setViewType(3);
                }
                zzVar2.f33274x = false;
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
