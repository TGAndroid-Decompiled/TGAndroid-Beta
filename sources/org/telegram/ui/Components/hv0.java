package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class hv0 extends rl0 {
    public final Context f27006c;
    public final int d;
    public boolean e;
    public final uv0 f27007f;

    public hv0(uv0 uv0Var, Context context, int i10) {
        this.f27007f = uv0Var;
        this.f27006c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f27007f.f31067t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((su0) arrayList.get(i11)).f30361b) {
                    return ((su0) arrayList.get(i11)).f30360a;
                }
            }
            return ((su0) i2.e.h(1, arrayList)).f30360a;
        }
        return "";
    }

    @Override
    public final void G(jm0 jm0Var, float f7, int[] iArr) {
        int measuredHeight = jm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (jm0Var.getMeasuredHeight() - jm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(jm0 jm0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < jm0Var.getChildCount() && (i10 = uv0.q(jm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f27007f.S(this.d, jm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        nu0 W = this.f27007f.W(this.d);
        if (W != null) {
            uv0.r(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        jv0[] jv0VarArr = this.f27007f.f31067t1;
        int i12 = this.d;
        jv0 jv0Var = jv0VarArr[i12];
        if (jv0Var.f27652o) {
            return jv0Var.e();
        }
        if (jv0Var.f27641a.size() == 0 && !jv0VarArr[i12].f27645g) {
            return 1;
        }
        if (jv0VarArr[i12].f27641a.size() == 0) {
            jv0 jv0Var2 = jv0VarArr[i12];
            boolean[] zArr = jv0Var2.f27646i;
            if ((!zArr[0] || !zArr[1]) && jv0Var2.f27649l) {
                return 0;
            }
        }
        if (jv0VarArr[i12].e() == 0) {
            int size = jv0VarArr[i12].c().size() + jv0VarArr[i12].d();
            if (size != 0) {
                jv0 jv0Var3 = jv0VarArr[i12];
                boolean[] zArr2 = jv0Var3.f27646i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = jv0Var3.f27655r;
                    if (z10) {
                        i10 = jv0Var3.f27658u;
                    } else {
                        i10 = jv0Var3.f27651n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = jv0Var3.f27658u;
                        } else {
                            i11 = jv0Var3.f27651n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(jv0VarArr[i12].e(), jv0VarArr[i12].c().size() + jv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        jv0[] jv0VarArr = this.f27007f.f31067t1;
        int i11 = this.d;
        if (jv0VarArr[i11].f27643c.size() == 0 && !jv0VarArr[i11].f27645g) {
            return 9;
        }
        jv0 jv0Var = jv0VarArr[i11];
        int i12 = jv0Var.f27650m;
        if (i10 >= i12 && i10 < jv0Var.f27641a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f27007f.f31067t1[this.d].e();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        uv0 uv0Var = this.f27007f;
        long j10 = uv0Var.f31046j1;
        SparseArray[] sparseArrayArr = uv0Var.Z0;
        jv0 jv0Var = uv0Var.f31067t1[this.d];
        ArrayList arrayList = jv0Var.f27641a;
        int i11 = b1Var.f45920f;
        View view = b1Var.f45917a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - jv0Var.f27650m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.f(messageObject, z11);
                if (uv0Var.C1) {
                    if (messageObject.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    h7Var.e(z12, !uv0Var.f31026b1);
                    return;
                }
                h7Var.e(false, !uv0Var.f31026b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.i7)) {
        } else {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - jv0Var.f27650m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i7Var.c(messageObject2, z10);
            if (uv0Var.C1) {
                if (messageObject2.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                i7Var.b(z12, !uv0Var.f31026b1);
                return;
            }
            i7Var.b(false, !uv0Var.f31026b1);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        uv0 uv0Var = this.f27007f;
        b10 b10Var = uv0Var.f31078y;
        ArrayList arrayList = uv0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = uv0Var.F1;
        Context context = this.f27006c;
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
                        view2 = new pu0(this, context, d6Var, 1);
                    }
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view2;
                    h7Var.setGlobalGradientView(b10Var);
                    view = view2;
                    if (i11 == 4) {
                        uv0Var.H0.add(h7Var);
                        view = view2;
                    }
                } else {
                    hu0 M = uv0.M(i11, uv0Var.f31046j1, context, d6Var);
                    M.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.b1(M);
                }
            } else {
                b10 b10Var2 = new b10(context, d6Var);
                if (i11 == 2) {
                    b10Var2.setViewType(4);
                } else {
                    b10Var2.setViewType(3);
                }
                b10Var2.f24774w = false;
                b10Var2.setIsSingleCell(true);
                b10Var2.setGlobalGradientView(b10Var);
                view = b10Var2;
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, d6Var);
            i7Var.setGlobalGradientView(b10Var);
            view = i7Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
