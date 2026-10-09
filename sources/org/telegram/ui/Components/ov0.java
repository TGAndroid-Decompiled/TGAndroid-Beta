package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ov0 extends yl0 {
    public final Context f29580c;
    public final int d;
    public boolean f29581e;
    public final bw0 f29582f;

    public ov0(bw0 bw0Var, Context context, int i10) {
        this.f29582f = bw0Var;
        this.f29580c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f29582f.f25162t1[this.d].f30277e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((zu0) arrayList.get(i11)).f33661b) {
                    return ((zu0) arrayList.get(i11)).f33660a;
                }
            }
            return ((zu0) hg.c.g(1, arrayList)).f33660a;
        }
        return "";
    }

    @Override
    public final void G(qm0 qm0Var, float f7, int[] iArr) {
        int measuredHeight = qm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (qm0Var.getMeasuredHeight() - qm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(qm0 qm0Var) {
        if (this.f29581e) {
            this.f29581e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < qm0Var.getChildCount() && (i10 = bw0.p(qm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f29582f.S(this.d, qm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f29581e = true;
        uu0 W = this.f29582f.W(this.d);
        if (W != null) {
            bw0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        qv0[] qv0VarArr = this.f29582f.f25162t1;
        int i12 = this.d;
        qv0 qv0Var = qv0VarArr[i12];
        if (qv0Var.f30286o) {
            return qv0Var.e();
        }
        if (qv0Var.f30274a.size() == 0 && !qv0VarArr[i12].f30279g) {
            return 1;
        }
        if (qv0VarArr[i12].f30274a.size() == 0) {
            qv0 qv0Var2 = qv0VarArr[i12];
            boolean[] zArr = qv0Var2.f30280i;
            if ((!zArr[0] || !zArr[1]) && qv0Var2.f30283l) {
                return 0;
            }
        }
        if (qv0VarArr[i12].e() == 0) {
            int size = qv0VarArr[i12].c().size() + qv0VarArr[i12].d();
            if (size != 0) {
                qv0 qv0Var3 = qv0VarArr[i12];
                boolean[] zArr2 = qv0Var3.f30280i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = qv0Var3.f30289r;
                    if (z10) {
                        i10 = qv0Var3.f30292u;
                    } else {
                        i10 = qv0Var3.f30285n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = qv0Var3.f30292u;
                        } else {
                            i11 = qv0Var3.f30285n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(qv0VarArr[i12].e(), qv0VarArr[i12].c().size() + qv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        qv0[] qv0VarArr = this.f29582f.f25162t1;
        int i11 = this.d;
        if (qv0VarArr[i11].f30276c.size() == 0 && !qv0VarArr[i11].f30279g) {
            return 9;
        }
        qv0 qv0Var = qv0VarArr[i11];
        int i12 = qv0Var.f30284m;
        if (i10 >= i12 && i10 < qv0Var.f30274a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f29582f.f25162t1[this.d].e();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        bw0 bw0Var = this.f29582f;
        long j3 = bw0Var.f25141j1;
        SparseArray[] sparseArrayArr = bw0Var.Z0;
        qv0 qv0Var = bw0Var.f25162t1[this.d];
        ArrayList arrayList = qv0Var.f30274a;
        int i11 = d1Var.f47660f;
        View view = d1Var.f47656a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - qv0Var.f30284m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.f(messageObject, z11);
                if (bw0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    j7Var.e(z12, !bw0Var.f25120b1);
                    return;
                }
                j7Var.e(false, !bw0Var.f25120b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.k7)) {
        } else {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - qv0Var.f30284m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.c(messageObject2, z10);
            if (bw0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                k7Var.b(z12, !bw0Var.f25120b1);
                return;
            }
            k7Var.b(false, !bw0Var.f25120b1);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        bw0 bw0Var = this.f29582f;
        j10 j10Var = bw0Var.f25173y;
        ArrayList arrayList = bw0Var.G0;
        org.telegram.ui.ActionBar.e6 e6Var = bw0Var.F1;
        Context context = this.f29580c;
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
                        view2 = new wu0(this, context, e6Var, 1);
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view2;
                    j7Var.setGlobalGradientView(j10Var);
                    view = view2;
                    if (i11 == 4) {
                        bw0Var.H0.add(j7Var);
                        view = view2;
                    }
                } else {
                    ou0 M = bw0.M(i11, bw0Var.f25141j1, context, e6Var);
                    M.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.d1(M);
                }
            } else {
                j10 j10Var2 = new j10(context, e6Var);
                if (i11 == 2) {
                    j10Var2.setViewType(4);
                } else {
                    j10Var2.setViewType(3);
                }
                j10Var2.f27555w = false;
                j10Var2.setIsSingleCell(true);
                j10Var2.setGlobalGradientView(j10Var);
                view = j10Var2;
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, e6Var);
            k7Var.setGlobalGradientView(j10Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
