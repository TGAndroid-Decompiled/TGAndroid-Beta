package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class ss0 extends aj0 {
    public final Context f39403c;
    public boolean d;
    public m.o3 f39404e;
    public final ys0 f39405f;

    public ss0(ys0 ys0Var, Context context) {
        this.f39405f = ys0Var;
        this.f39403c = context;
    }

    @Override
    public boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final boolean E(uj0 uj0Var) {
        int i7;
        ys0 ys0Var = this.f39405f;
        if (!ys0Var.G0()) {
            if (this != ys0Var.K && ys0.x(ys0Var, this) == -1) {
                i7 = ys0Var.f42137t1;
            } else {
                i7 = ys0Var.f42123p1[0];
            }
            int ceil = (int) Math.ceil(e() / i7);
            if (uj0Var.getChildCount() != 0 && uj0Var.getChildAt(0).getMeasuredHeight() * ceil > uj0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i7) {
        ArrayList arrayList = this.f39405f.f42144w1[0].f37695e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((yr0) arrayList.get(i10)).f42067b) {
                return ((yr0) arrayList.get(i10)).f42066a;
            }
        }
        return ((yr0) i5.c.h(1, arrayList)).f42066a;
    }

    @Override
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
        ys0 ys0Var = this.f39405f;
        int[] iArr2 = ys0Var.f42123p1;
        if (ys0.y(ys0Var, this) == -1 && this != ys0Var.L) {
            if (ys0.x(ys0Var, this) != -1) {
                i7 = iArr2[1];
            } else {
                i7 = iArr2[0];
            }
        } else {
            i7 = ys0Var.f42137t1;
        }
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = uj0Var.getMeasuredHeight() - uj0Var.getPaddingTop();
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
    public final float H(uj0 uj0Var) {
        int i7;
        ys0 ys0Var = this.f39405f;
        int[] iArr = ys0Var.f42123p1;
        if (this != ys0Var.L && ys0.y(ys0Var, this) == -1) {
            if (ys0.x(ys0Var, this) != -1) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        } else {
            i7 = ys0Var.f42137t1;
        }
        int ceil = (int) Math.ceil(e() / i7);
        if (uj0Var.getChildCount() != 0) {
            int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
            View childAt = uj0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i7) * measuredHeight) - (childAt.getTop() - uj0Var.getPaddingTop())) / ((ceil * measuredHeight) - (uj0Var.getMeasuredHeight() - uj0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f39405f.r1(0, true);
    }

    @Override
    public final void J(uj0 uj0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < uj0Var.getChildCount(); i10++) {
                View childAt = uj0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.n7) {
                    i7 = ((org.telegram.ui.Cells.n7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f39405f.c0(0, uj0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        tr0 g02 = this.f39405f.g0(0);
        if (g02 != null) {
            ys0.s(g02, null, false);
        }
    }

    public int L(int i7) {
        return this.f39405f.f42144w1[0].f37702m + i7;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ss0.b():int");
    }

    @Override
    public int d(int i7) {
        ns0[] ns0VarArr = this.f39405f.f42144w1;
        if (!this.d && ns0VarArr[0].c().size() == 0) {
            ns0 ns0Var = ns0VarArr[0];
            if (!ns0Var.f37697g && ns0Var.f37701l) {
                return 2;
            }
        }
        ns0VarArr[0].getClass();
        ns0VarArr[0].c().size();
        ns0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f39405f.f42144w1[0].e();
    }

    @Override
    public void t(v4.e1 e1Var, int i7) {
        int i10;
        boolean z10;
        char c10;
        ys0 ys0Var = this.f39405f;
        int[] iArr = ys0Var.f42123p1;
        ns0[] ns0VarArr = ys0Var.f42144w1;
        if (e1Var.f58539f == 0) {
            ArrayList c11 = ns0VarArr[0].c();
            int d = i7 - ns0VarArr[0].d();
            View view = e1Var.f58535a;
            if (view instanceof org.telegram.ui.Cells.n7) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                int messageId = n7Var.getMessageId();
                boolean z11 = true;
                if (this == ys0Var.K) {
                    i10 = iArr[0];
                } else if (ys0.x(ys0Var, this) != -1) {
                    i10 = iArr[1];
                } else {
                    i10 = ys0Var.f42137t1;
                }
                if (d >= 0 && d < c11.size()) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) c11.get(d);
                    if (gjVar.e1() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (ys0Var.F1) {
                        SparseArray[] sparseArrayArr = ys0Var.f42085c1;
                        if (org.telegram.messenger.gj.B0(gjVar.f23817k) == ys0Var.f42114m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) < 0) {
                            z11 = false;
                        }
                        n7Var.i(z11, z10);
                    } else {
                        n7Var.i(false, z10);
                    }
                    n7Var.k(gjVar, i10, false);
                    return;
                }
                n7Var.k(null, i10, false);
                n7Var.i(false, false);
            }
        }
    }

    @Override
    public v4.e1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.f39405f;
        org.telegram.ui.ActionBar.e6 e6Var = ys0Var.I1;
        Context context = this.f39403c;
        if (i7 != 0 && i7 != 19) {
            p3 X = ys0.X(0, ys0Var.f42114m1, context, e6Var);
            X.setLayoutParams(new v4.p0(-1, -1));
            return new v4.e1(X);
        }
        if (this.f39404e == null) {
            this.f39404e = new m.o3(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, this.f39404e, ys0Var.f42150y1.getCurrentAccount());
        if (i7 == 19) {
            n7Var.f30772x0 = true;
        }
        n7Var.setGradientView(ys0Var.E);
        if (ys0.x(ys0Var, this) != -1) {
            n7Var.f30748e0 = true;
        }
        n7Var.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(n7Var);
    }
}
