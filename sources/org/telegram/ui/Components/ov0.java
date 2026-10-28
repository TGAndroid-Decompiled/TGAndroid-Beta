package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ov0 extends ul0 {
    public final Context f31391c;
    public final int d;
    public boolean e;
    public final bw0 f31392f;

    public ov0(bw0 bw0Var, Context context, int i10) {
        this.f31392f = bw0Var;
        this.f31391c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f31392f.f26986v1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((av0) arrayList.get(i11)).f26671b) {
                    return ((av0) arrayList.get(i11)).f26670a;
                }
            }
            return ((av0) ic.a.g(1, arrayList)).f26670a;
        }
        return "";
    }

    @Override
    public final void G(nm0 nm0Var, float f7, int[] iArr) {
        int measuredHeight = nm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (nm0Var.getMeasuredHeight() - nm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(nm0 nm0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < nm0Var.getChildCount() && (i10 = bw0.r(nm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f31392f.Z(this.d, nm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        uu0 d02 = this.f31392f.d0(this.d);
        if (d02 != null) {
            bw0.t(d02, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        qv0[] qv0VarArr = this.f31392f.f26986v1;
        int i12 = this.d;
        qv0 qv0Var = qv0VarArr[i12];
        if (qv0Var.f32044o) {
            return qv0Var.e();
        }
        if (qv0Var.f32033a.size() == 0 && !qv0VarArr[i12].f32037g) {
            return 1;
        }
        if (qv0VarArr[i12].f32033a.size() == 0) {
            qv0 qv0Var2 = qv0VarArr[i12];
            boolean[] zArr = qv0Var2.f32038i;
            if ((!zArr[0] || !zArr[1]) && qv0Var2.f32041l) {
                return 0;
            }
        }
        if (qv0VarArr[i12].e() == 0) {
            int size = qv0VarArr[i12].c().size() + qv0VarArr[i12].d();
            if (size != 0) {
                qv0 qv0Var3 = qv0VarArr[i12];
                boolean[] zArr2 = qv0Var3.f32038i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = qv0Var3.f32047r;
                    if (z10) {
                        i10 = qv0Var3.f32050u;
                    } else {
                        i10 = qv0Var3.f32043n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = qv0Var3.f32050u;
                        } else {
                            i11 = qv0Var3.f32043n;
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
        qv0[] qv0VarArr = this.f31392f.f26986v1;
        int i11 = this.d;
        if (qv0VarArr[i11].f32035c.size() == 0 && !qv0VarArr[i11].f32037g) {
            return 9;
        }
        qv0 qv0Var = qv0VarArr[i11];
        int i12 = qv0Var.f32042m;
        if (i10 >= i12 && i10 < qv0Var.f32033a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f31392f.f26986v1[this.d].e();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        bw0 bw0Var = this.f31392f;
        long j10 = bw0Var.l1;
        SparseArray[] sparseArrayArr = bw0Var.f26929b1;
        qv0 qv0Var = bw0Var.f26986v1[this.d];
        ArrayList arrayList = qv0Var.f32033a;
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.n7)) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - qv0Var.f32042m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n7Var.f(messageObject, z11);
                if (bw0Var.E1) {
                    if (messageObject.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    n7Var.e(z12, !bw0Var.f26936d1);
                    return;
                }
                n7Var.e(false, !bw0Var.f26936d1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.o7)) {
        } else {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - qv0Var.f32042m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            o7Var.c(messageObject2, z10);
            if (bw0Var.E1) {
                if (messageObject2.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                o7Var.b(z12, !bw0Var.f26936d1);
                return;
            }
            o7Var.b(false, !bw0Var.f26936d1);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        bw0 bw0Var = this.f31392f;
        c10 c10Var = bw0Var.f26993y;
        ArrayList arrayList = bw0Var.I0;
        org.telegram.ui.ActionBar.u6 u6Var = bw0Var.H1;
        Context context = this.f31391c;
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
                        view2 = new wu0(this, context, u6Var, 1);
                    }
                    org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view2;
                    n7Var.setGlobalGradientView(c10Var);
                    view = view2;
                    if (i11 == 4) {
                        bw0Var.J0.add(n7Var);
                        view = view2;
                    }
                } else {
                    ou0 U = bw0.U(i11, bw0Var.l1, context, u6Var);
                    U.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.e1(U);
                }
            } else {
                c10 c10Var2 = new c10(context, u6Var);
                if (i11 == 2) {
                    c10Var2.setViewType(4);
                } else {
                    c10Var2.setViewType(3);
                }
                c10Var2.f27026w = false;
                c10Var2.setIsSingleCell(true);
                c10Var2.setGlobalGradientView(c10Var);
                view = c10Var2;
            }
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 0, u6Var);
            o7Var.setGlobalGradientView(c10Var);
            view = o7Var;
        }
        return ic.a.n(view, view, -1, -2);
    }
}
