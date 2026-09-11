package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ku0 extends tk0 {
    public final Context f27904c;
    public final int d;
    public boolean f27905e;
    public final xu0 f27906f;

    public ku0(xu0 xu0Var, Context context, int i10) {
        this.f27906f = xu0Var;
        this.f27904c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f27906f.f32722t1[this.d].f28519e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((vt0) arrayList.get(i11)).f31979b) {
                    return ((vt0) arrayList.get(i11)).f31978a;
                }
            }
            return ((vt0) i2.g.h(1, arrayList)).f31978a;
        }
        return "";
    }

    @Override
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (ll0Var.getMeasuredHeight() - ll0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(ll0 ll0Var) {
        if (this.f27905e) {
            this.f27905e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < ll0Var.getChildCount() && (i10 = xu0.p(ll0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f27906f.S(this.d, ll0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f27905e = true;
        qt0 W = this.f27906f.W(this.d);
        if (W != null) {
            xu0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        mu0[] mu0VarArr = this.f27906f.f32722t1;
        int i12 = this.d;
        mu0 mu0Var = mu0VarArr[i12];
        if (mu0Var.f28528o) {
            return mu0Var.e();
        }
        if (mu0Var.f28516a.size() == 0 && !mu0VarArr[i12].f28521g) {
            return 1;
        }
        if (mu0VarArr[i12].f28516a.size() == 0) {
            mu0 mu0Var2 = mu0VarArr[i12];
            boolean[] zArr = mu0Var2.f28522i;
            if ((!zArr[0] || !zArr[1]) && mu0Var2.f28525l) {
                return 0;
            }
        }
        if (mu0VarArr[i12].e() == 0) {
            int size = mu0VarArr[i12].c().size() + mu0VarArr[i12].d();
            if (size != 0) {
                mu0 mu0Var3 = mu0VarArr[i12];
                boolean[] zArr2 = mu0Var3.f28522i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = mu0Var3.f28531r;
                    if (z10) {
                        i10 = mu0Var3.f28534u;
                    } else {
                        i10 = mu0Var3.f28527n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = mu0Var3.f28534u;
                        } else {
                            i11 = mu0Var3.f28527n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(mu0VarArr[i12].e(), mu0VarArr[i12].c().size() + mu0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        mu0[] mu0VarArr = this.f27906f.f32722t1;
        int i11 = this.d;
        if (mu0VarArr[i11].f28518c.size() == 0 && !mu0VarArr[i11].f28521g) {
            return 9;
        }
        mu0 mu0Var = mu0VarArr[i11];
        int i12 = mu0Var.f28526m;
        if (i10 >= i12 && i10 < mu0Var.f28516a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f27906f.f32722t1[this.d].e();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        xu0 xu0Var = this.f27906f;
        long j3 = xu0Var.f32701j1;
        SparseArray[] sparseArrayArr = xu0Var.Z0;
        mu0 mu0Var = xu0Var.f32722t1[this.d];
        ArrayList arrayList = mu0Var.f28516a;
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.i7)) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - mu0Var.f28526m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i7Var.f(messageObject, z11);
                if (xu0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    i7Var.e(z12, !xu0Var.f32680b1);
                    return;
                }
                i7Var.e(false, !xu0Var.f32680b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.j7)) {
        } else {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - mu0Var.f28526m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j7Var.c(messageObject2, z10);
            if (xu0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                j7Var.b(z12, !xu0Var.f32680b1);
                return;
            }
            j7Var.b(false, !xu0Var.f32680b1);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        xu0 xu0Var = this.f27906f;
        t00 t00Var = xu0Var.f32733y;
        ArrayList arrayList = xu0Var.G0;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.f27904c;
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
                        view2 = new st0(this, context, f6Var, 1);
                    }
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view2;
                    i7Var.setGlobalGradientView(t00Var);
                    view = view2;
                    if (i11 == 4) {
                        xu0Var.H0.add(i7Var);
                        view = view2;
                    }
                } else {
                    kt0 M = xu0.M(i11, xu0Var.f32701j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                t00 t00Var2 = new t00(context, f6Var);
                if (i11 == 2) {
                    t00Var2.setViewType(4);
                } else {
                    t00Var2.setViewType(3);
                }
                t00Var2.f30465w = false;
                t00Var2.setIsSingleCell(true);
                t00Var2.setGlobalGradientView(t00Var);
                view = t00Var2;
            }
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 0, f6Var);
            j7Var.setGlobalGradientView(t00Var);
            view = j7Var;
        }
        return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
    }
}
