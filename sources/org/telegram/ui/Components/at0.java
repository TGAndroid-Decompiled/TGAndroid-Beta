package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class at0 extends ij0 {
    public final Context f33448c;
    public boolean d;
    public m.o3 f33449e;
    public final gt0 f33450f;

    public at0(gt0 gt0Var, Context context) {
        this.f33450f = gt0Var;
        this.f33448c = context;
    }

    @Override
    public boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final boolean E(ck0 ck0Var) {
        int i7;
        gt0 gt0Var = this.f33450f;
        if (!gt0Var.G0()) {
            if (this != gt0Var.K && gt0.x(gt0Var, this) == -1) {
                i7 = gt0Var.f35629t1;
            } else {
                i7 = gt0Var.f35615p1[0];
            }
            int ceil = (int) Math.ceil(e() / i7);
            if (ck0Var.getChildCount() != 0 && ck0Var.getChildAt(0).getMeasuredHeight() * ceil > ck0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i7) {
        ArrayList arrayList = this.f33450f.f35636w1[0].f41415e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((gs0) arrayList.get(i10)).f35558b) {
                return ((gs0) arrayList.get(i10)).f35557a;
            }
        }
        return ((gs0) i5.c.h(1, arrayList)).f35557a;
    }

    @Override
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = ck0Var.getChildAt(0).getMeasuredHeight();
        gt0 gt0Var = this.f33450f;
        int[] iArr2 = gt0Var.f35615p1;
        if (gt0.y(gt0Var, this) == -1 && this != gt0Var.L) {
            if (gt0.x(gt0Var, this) != -1) {
                i7 = iArr2[1];
            } else {
                i7 = iArr2[0];
            }
        } else {
            i7 = gt0Var.f35629t1;
        }
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = ck0Var.getMeasuredHeight() - ck0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f11 = f10 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f11 / measuredHeight)) * i7;
        iArr[1] = ((int) f11) % measuredHeight;
    }

    @Override
    public final float H(ck0 ck0Var) {
        int i7;
        gt0 gt0Var = this.f33450f;
        int[] iArr = gt0Var.f35615p1;
        if (this != gt0Var.L && gt0.y(gt0Var, this) == -1) {
            if (gt0.x(gt0Var, this) != -1) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        } else {
            i7 = gt0Var.f35629t1;
        }
        int ceil = (int) Math.ceil(e() / i7);
        if (ck0Var.getChildCount() != 0) {
            int measuredHeight = ck0Var.getChildAt(0).getMeasuredHeight();
            View childAt = ck0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i7) * measuredHeight) - (childAt.getTop() - ck0Var.getPaddingTop())) / ((ceil * measuredHeight) - (ck0Var.getMeasuredHeight() - ck0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f33450f.r1(0, true);
    }

    @Override
    public final void J(ck0 ck0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < ck0Var.getChildCount(); i10++) {
                View childAt = ck0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    i7 = ((org.telegram.ui.Cells.p7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f33450f.c0(0, ck0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        bs0 g02 = this.f33450f.g0(0);
        if (g02 != null) {
            gt0.s(g02, null, false);
        }
    }

    public int L(int i7) {
        return this.f33450f.f35636w1[0].f41422m + i7;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.at0.b():int");
    }

    @Override
    public int d(int i7) {
        vs0[] vs0VarArr = this.f33450f.f35636w1;
        if (!this.d && vs0VarArr[0].c().size() == 0) {
            vs0 vs0Var = vs0VarArr[0];
            if (!vs0Var.f41417g && vs0Var.f41421l) {
                return 2;
            }
        }
        vs0VarArr[0].getClass();
        vs0VarArr[0].c().size();
        vs0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f33450f.f35636w1[0].e();
    }

    @Override
    public void t(v4.f1 f1Var, int i7) {
        int i10;
        boolean z10;
        char c10;
        gt0 gt0Var = this.f33450f;
        int[] iArr = gt0Var.f35615p1;
        vs0[] vs0VarArr = gt0Var.f35636w1;
        if (f1Var.f59127f == 0) {
            ArrayList c11 = vs0VarArr[0].c();
            int d = i7 - vs0VarArr[0].d();
            View view = f1Var.f59123a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                int messageId = p7Var.getMessageId();
                boolean z11 = true;
                if (this == gt0Var.K) {
                    i10 = iArr[0];
                } else if (gt0.x(gt0Var, this) != -1) {
                    i10 = iArr[1];
                } else {
                    i10 = gt0Var.f35629t1;
                }
                if (d >= 0 && d < c11.size()) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) c11.get(d);
                    if (fjVar.e1() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (gt0Var.F1) {
                        SparseArray[] sparseArrayArr = gt0Var.f35577c1;
                        if (org.telegram.messenger.fj.B0(fjVar.f23965k) == gt0Var.f35606m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) < 0) {
                            z11 = false;
                        }
                        p7Var.i(z11, z10);
                    } else {
                        p7Var.i(false, z10);
                    }
                    p7Var.k(fjVar, i10, false);
                    return;
                }
                p7Var.k(null, i10, false);
                p7Var.i(false, false);
            }
        }
    }

    @Override
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        gt0 gt0Var = this.f33450f;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.f33448c;
        if (i7 != 0 && i7 != 19) {
            x3 X = gt0.X(0, gt0Var.f35606m1, context, i6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new v4.f1(X);
        }
        if (this.f33449e == null) {
            this.f33449e = new m.o3(viewGroup.getContext(), i6Var);
        }
        org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context, this.f33449e, gt0Var.f35642y1.getCurrentAccount());
        if (i7 == 19) {
            p7Var.f31254x0 = true;
        }
        p7Var.setGradientView(gt0Var.E);
        if (gt0.x(gt0Var, this) != -1) {
            p7Var.f31230e0 = true;
        }
        p7Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(p7Var);
    }
}
