package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class pv0 extends zl0 {
    public final Context f29867c;
    public final int d;
    public boolean f29868e;
    public final cw0 f29869f;

    public pv0(cw0 cw0Var, Context context, int i10) {
        this.f29869f = cw0Var;
        this.f29867c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f29869f.f25470t1[this.d].f30581e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((av0) arrayList.get(i11)).f24649b) {
                    return ((av0) arrayList.get(i11)).f24648a;
                }
            }
            return ((av0) hg.c.g(1, arrayList)).f24648a;
        }
        return "";
    }

    @Override
    public final void G(rm0 rm0Var, float f7, int[] iArr) {
        int measuredHeight = rm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (rm0Var.getMeasuredHeight() - rm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(rm0 rm0Var) {
        if (this.f29868e) {
            this.f29868e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < rm0Var.getChildCount() && (i10 = cw0.p(rm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f29869f.S(this.d, rm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f29868e = true;
        vu0 W = this.f29869f.W(this.d);
        if (W != null) {
            cw0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        rv0[] rv0VarArr = this.f29869f.f25470t1;
        int i12 = this.d;
        rv0 rv0Var = rv0VarArr[i12];
        if (rv0Var.f30590o) {
            return rv0Var.e();
        }
        if (rv0Var.f30578a.size() == 0 && !rv0VarArr[i12].f30583g) {
            return 1;
        }
        if (rv0VarArr[i12].f30578a.size() == 0) {
            rv0 rv0Var2 = rv0VarArr[i12];
            boolean[] zArr = rv0Var2.f30584i;
            if ((!zArr[0] || !zArr[1]) && rv0Var2.f30587l) {
                return 0;
            }
        }
        if (rv0VarArr[i12].e() == 0) {
            int size = rv0VarArr[i12].c().size() + rv0VarArr[i12].d();
            if (size != 0) {
                rv0 rv0Var3 = rv0VarArr[i12];
                boolean[] zArr2 = rv0Var3.f30584i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = rv0Var3.f30593r;
                    if (z10) {
                        i10 = rv0Var3.f30596u;
                    } else {
                        i10 = rv0Var3.f30589n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = rv0Var3.f30596u;
                        } else {
                            i11 = rv0Var3.f30589n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(rv0VarArr[i12].e(), rv0VarArr[i12].c().size() + rv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        rv0[] rv0VarArr = this.f29869f.f25470t1;
        int i11 = this.d;
        if (rv0VarArr[i11].f30580c.size() == 0 && !rv0VarArr[i11].f30583g) {
            return 9;
        }
        rv0 rv0Var = rv0VarArr[i11];
        int i12 = rv0Var.f30588m;
        if (i10 >= i12 && i10 < rv0Var.f30578a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f29869f.f25470t1[this.d].e();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        cw0 cw0Var = this.f29869f;
        long j3 = cw0Var.f25449j1;
        SparseArray[] sparseArrayArr = cw0Var.Z0;
        rv0 rv0Var = cw0Var.f25470t1[this.d];
        ArrayList arrayList = rv0Var.f30578a;
        int i11 = d1Var.f47706f;
        View view = d1Var.f47702a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - rv0Var.f30588m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.f(messageObject, z11);
                if (cw0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    j7Var.e(z12, !cw0Var.f25428b1);
                    return;
                }
                j7Var.e(false, !cw0Var.f25428b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.k7)) {
        } else {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - rv0Var.f30588m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.c(messageObject2, z10);
            if (cw0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                k7Var.b(z12, !cw0Var.f25428b1);
                return;
            }
            k7Var.b(false, !cw0Var.f25428b1);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        cw0 cw0Var = this.f29869f;
        k10 k10Var = cw0Var.f25481y;
        ArrayList arrayList = cw0Var.G0;
        org.telegram.ui.ActionBar.e6 e6Var = cw0Var.F1;
        Context context = this.f29867c;
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
                        view2 = new xu0(this, context, e6Var, 1);
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view2;
                    j7Var.setGlobalGradientView(k10Var);
                    view = view2;
                    if (i11 == 4) {
                        cw0Var.H0.add(j7Var);
                        view = view2;
                    }
                } else {
                    pu0 M = cw0.M(i11, cw0Var.f25449j1, context, e6Var);
                    M.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.d1(M);
                }
            } else {
                k10 k10Var2 = new k10(context, e6Var);
                if (i11 == 2) {
                    k10Var2.setViewType(4);
                } else {
                    k10Var2.setViewType(3);
                }
                k10Var2.f27857w = false;
                k10Var2.setIsSingleCell(true);
                k10Var2.setGlobalGradientView(k10Var);
                view = k10Var2;
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, e6Var);
            k7Var.setGlobalGradientView(k10Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
