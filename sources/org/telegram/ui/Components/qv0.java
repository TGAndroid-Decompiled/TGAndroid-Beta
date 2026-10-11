package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class qv0 extends am0 {
    public final Context f30256c;
    public final int d;
    public boolean f30257e;
    public final dw0 f30258f;

    public qv0(dw0 dw0Var, Context context, int i10) {
        this.f30258f = dw0Var;
        this.f30256c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f30258f.f25731t1[this.d].f30870e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((bv0) arrayList.get(i11)).f25029b) {
                    return ((bv0) arrayList.get(i11)).f25028a;
                }
            }
            return ((bv0) hg.c.g(1, arrayList)).f25028a;
        }
        return "";
    }

    @Override
    public final void G(sm0 sm0Var, float f7, int[] iArr) {
        int measuredHeight = sm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (sm0Var.getMeasuredHeight() - sm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(sm0 sm0Var) {
        if (this.f30257e) {
            this.f30257e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < sm0Var.getChildCount() && (i10 = dw0.p(sm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f30258f.S(this.d, sm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f30257e = true;
        wu0 W = this.f30258f.W(this.d);
        if (W != null) {
            dw0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        sv0[] sv0VarArr = this.f30258f.f25731t1;
        int i12 = this.d;
        sv0 sv0Var = sv0VarArr[i12];
        if (sv0Var.f30879o) {
            return sv0Var.e();
        }
        if (sv0Var.f30867a.size() == 0 && !sv0VarArr[i12].f30872g) {
            return 1;
        }
        if (sv0VarArr[i12].f30867a.size() == 0) {
            sv0 sv0Var2 = sv0VarArr[i12];
            boolean[] zArr = sv0Var2.f30873i;
            if ((!zArr[0] || !zArr[1]) && sv0Var2.f30876l) {
                return 0;
            }
        }
        if (sv0VarArr[i12].e() == 0) {
            int size = sv0VarArr[i12].c().size() + sv0VarArr[i12].d();
            if (size != 0) {
                sv0 sv0Var3 = sv0VarArr[i12];
                boolean[] zArr2 = sv0Var3.f30873i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = sv0Var3.f30882r;
                    if (z10) {
                        i10 = sv0Var3.f30885u;
                    } else {
                        i10 = sv0Var3.f30878n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = sv0Var3.f30885u;
                        } else {
                            i11 = sv0Var3.f30878n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(sv0VarArr[i12].e(), sv0VarArr[i12].c().size() + sv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        sv0[] sv0VarArr = this.f30258f.f25731t1;
        int i11 = this.d;
        if (sv0VarArr[i11].f30869c.size() == 0 && !sv0VarArr[i11].f30872g) {
            return 9;
        }
        sv0 sv0Var = sv0VarArr[i11];
        int i12 = sv0Var.f30877m;
        if (i10 >= i12 && i10 < sv0Var.f30867a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f30258f.f25731t1[this.d].e();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        dw0 dw0Var = this.f30258f;
        long j3 = dw0Var.f25710j1;
        SparseArray[] sparseArrayArr = dw0Var.Z0;
        sv0 sv0Var = dw0Var.f25731t1[this.d];
        ArrayList arrayList = sv0Var.f30867a;
        int i11 = d1Var.f47752f;
        View view = d1Var.f47748a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - sv0Var.f30877m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.f(messageObject, z11);
                if (dw0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    j7Var.e(z12, !dw0Var.f25689b1);
                    return;
                }
                j7Var.e(false, !dw0Var.f25689b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.k7)) {
        } else {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - sv0Var.f30877m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.c(messageObject2, z10);
            if (dw0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                k7Var.b(z12, !dw0Var.f25689b1);
                return;
            }
            k7Var.b(false, !dw0Var.f25689b1);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        dw0 dw0Var = this.f30258f;
        k10 k10Var = dw0Var.f25742y;
        ArrayList arrayList = dw0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = dw0Var.F1;
        Context context = this.f30256c;
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
                        view2 = new yu0(this, context, d6Var, 1);
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view2;
                    j7Var.setGlobalGradientView(k10Var);
                    view = view2;
                    if (i11 == 4) {
                        dw0Var.H0.add(j7Var);
                        view = view2;
                    }
                } else {
                    qu0 M = dw0.M(i11, dw0Var.f25710j1, context, d6Var);
                    M.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.d1(M);
                }
            } else {
                k10 k10Var2 = new k10(context, d6Var);
                if (i11 == 2) {
                    k10Var2.setViewType(4);
                } else {
                    k10Var2.setViewType(3);
                }
                k10Var2.f27811w = false;
                k10Var2.setIsSingleCell(true);
                k10Var2.setGlobalGradientView(k10Var);
                view = k10Var2;
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, d6Var);
            k7Var.setGlobalGradientView(k10Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
