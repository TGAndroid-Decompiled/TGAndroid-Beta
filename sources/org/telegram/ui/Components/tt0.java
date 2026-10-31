package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class tt0 extends ak0 {
    public final Context f30690c;
    public boolean d;
    public m.p3 e;
    public final zt0 f30691f;

    public tt0(zt0 zt0Var, Context context) {
        this.f30691f = zt0Var;
        this.f30690c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(tk0 tk0Var) {
        int i10;
        zt0 zt0Var = this.f30691f;
        if (!zt0Var.C0()) {
            if (this != zt0Var.J && zt0.v(zt0Var, this) == -1) {
                i10 = zt0Var.f33228s1;
            } else {
                i10 = zt0Var.f33214o1[0];
            }
            int ceil = (int) Math.ceil(e() / i10);
            if (tk0Var.getChildCount() != 0 && tk0Var.getChildAt(0).getMeasuredHeight() * ceil > tk0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f30691f.f33234v1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((xs0) arrayList.get(i11)).f32543b) {
                return ((xs0) arrayList.get(i11)).f32542a;
            }
        }
        return ((xs0) i0.a.g(1, arrayList)).f32542a;
    }

    @Override
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = tk0Var.getChildAt(0).getMeasuredHeight();
        zt0 zt0Var = this.f30691f;
        int[] iArr2 = zt0Var.f33214o1;
        if (zt0.w(zt0Var, this) == -1 && this != zt0Var.K) {
            if (zt0.v(zt0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = zt0Var.f33228s1;
        }
        int ceil = (int) (Math.ceil(e() / i10) * measuredHeight);
        int measuredHeight2 = tk0Var.getMeasuredHeight() - tk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f10 = f7 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f10 / measuredHeight)) * i10;
        iArr[1] = ((int) f10) % measuredHeight;
    }

    @Override
    public final float H(tk0 tk0Var) {
        int i10;
        zt0 zt0Var = this.f30691f;
        int[] iArr = zt0Var.f33214o1;
        if (this != zt0Var.K && zt0.w(zt0Var, this) == -1) {
            if (zt0.v(zt0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = zt0Var.f33228s1;
        }
        int ceil = (int) Math.ceil(e() / i10);
        if (tk0Var.getChildCount() != 0) {
            int measuredHeight = tk0Var.getChildAt(0).getMeasuredHeight();
            View childAt = tk0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - tk0Var.getPaddingTop())) / ((ceil * measuredHeight) - (tk0Var.getMeasuredHeight() - tk0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f30691f.m1(0, true);
    }

    @Override
    public final void J(tk0 tk0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < tk0Var.getChildCount(); i11++) {
                View childAt = tk0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    i10 = ((org.telegram.ui.Cells.s7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f30691f.a0(0, tk0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        ss0 e02 = this.f30691f.e0(0);
        if (e02 != null) {
            zt0.p(e02, null, false);
        }
    }

    public int L(int i10) {
        return this.f30691f.f33234v1[0].f29186m + i10;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tt0.b():int");
    }

    @Override
    public int d(int i10) {
        ot0[] ot0VarArr = this.f30691f.f33234v1;
        if (!this.d && ot0VarArr[0].c().size() == 0) {
            ot0 ot0Var = ot0VarArr[0];
            if (!ot0Var.f29181g && ot0Var.f29185l) {
                return 2;
            }
        }
        ot0VarArr[0].getClass();
        ot0VarArr[0].c().size();
        ot0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f30691f.f33234v1[0].e();
    }

    @Override
    public void t(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        zt0 zt0Var = this.f30691f;
        int[] iArr = zt0Var.f33214o1;
        ot0[] ot0VarArr = zt0Var.f33234v1;
        if (c1Var.f47901f == 0) {
            ArrayList c11 = ot0VarArr[0].c();
            int d = i10 - ot0VarArr[0].d();
            View view = c1Var.f47898a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                int messageId = s7Var.getMessageId();
                boolean z11 = true;
                if (this == zt0Var.J) {
                    i11 = iArr[0];
                } else if (zt0.v(zt0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = zt0Var.f33228s1;
                }
                if (d >= 0 && d < c11.size()) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) c11.get(d);
                    if (jjVar.f1() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (zt0Var.E1) {
                        SparseArray[] sparseArrayArr = zt0Var.f33174b1;
                        if (org.telegram.messenger.jj.B0(jjVar.f16337k) == zt0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) < 0) {
                            z11 = false;
                        }
                        s7Var.i(z11, z10);
                    } else {
                        s7Var.i(false, z10);
                    }
                    s7Var.k(jjVar, i11, false);
                    return;
                }
                s7Var.k(null, i11, false);
                s7Var.i(false, false);
            }
        }
    }

    @Override
    public s4.c1 w(ViewGroup viewGroup, int i10) {
        zt0 zt0Var = this.f30691f;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.f30690c;
        if (i10 != 0 && i10 != 19) {
            p3 V = zt0.V(0, zt0Var.l1, context, p6Var);
            V.setLayoutParams(new s4.o0(-1, -1));
            return new s4.c1(V);
        }
        if (this.e == null) {
            this.e = new m.p3(viewGroup.getContext(), p6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.e, zt0Var.f33240x1.getCurrentAccount());
        if (i10 == 19) {
            s7Var.f23046w0 = true;
        }
        s7Var.setGradientView(zt0Var.D);
        if (zt0.v(zt0Var, this) != -1) {
            s7Var.f23023d0 = true;
        }
        s7Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(s7Var);
    }
}
