package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class qs0 extends zi0 {
    public final Context f37521c;
    public boolean d;
    public m.o3 f37522e;
    public final ws0 f37523f;

    public qs0(ws0 ws0Var, Context context) {
        this.f37523f = ws0Var;
        this.f37521c = context;
    }

    @Override
    public boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(tj0 tj0Var) {
        int i3;
        ws0 ws0Var = this.f37523f;
        if (!ws0Var.F0()) {
            if (this != ws0Var.K && ws0.x(ws0Var, this) == -1) {
                i3 = ws0Var.f40129t1;
            } else {
                i3 = ws0Var.f40115p1[0];
            }
            int ceil = (int) Math.ceil(e() / i3);
            if (tj0Var.getChildCount() != 0 && tj0Var.getChildAt(0).getMeasuredHeight() * ceil > tj0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i3) {
        ArrayList arrayList = this.f37523f.f40136w1[0].f35857e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i3 <= ((wr0) arrayList.get(i10)).f40061b) {
                return ((wr0) arrayList.get(i10)).f40060a;
            }
        }
        return ((wr0) k2.p1.h(1, arrayList)).f40060a;
    }

    @Override
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        int i3;
        int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
        ws0 ws0Var = this.f37523f;
        int[] iArr2 = ws0Var.f40115p1;
        if (ws0.y(ws0Var, this) == -1 && this != ws0Var.L) {
            if (ws0.x(ws0Var, this) != -1) {
                i3 = iArr2[1];
            } else {
                i3 = iArr2[0];
            }
        } else {
            i3 = ws0Var.f40129t1;
        }
        int ceil = (int) (Math.ceil(e() / i3) * measuredHeight);
        int measuredHeight2 = tj0Var.getMeasuredHeight() - tj0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f11 = f10 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f11 / measuredHeight)) * i3;
        iArr[1] = ((int) f11) % measuredHeight;
    }

    @Override
    public final float H(tj0 tj0Var) {
        int i3;
        ws0 ws0Var = this.f37523f;
        int[] iArr = ws0Var.f40115p1;
        if (this != ws0Var.L && ws0.y(ws0Var, this) == -1) {
            if (ws0.x(ws0Var, this) != -1) {
                i3 = iArr[1];
            } else {
                i3 = iArr[0];
            }
        } else {
            i3 = ws0Var.f40129t1;
        }
        int ceil = (int) Math.ceil(e() / i3);
        if (tj0Var.getChildCount() != 0) {
            int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
            View childAt = tj0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i3) * measuredHeight) - (childAt.getTop() - tj0Var.getPaddingTop())) / ((ceil * measuredHeight) - (tj0Var.getMeasuredHeight() - tj0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f37523f.p1(0, true);
    }

    @Override
    public final void J(tj0 tj0Var) {
        if (this.d) {
            this.d = false;
            int i3 = 0;
            for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
                View childAt = tj0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.n7) {
                    i3 = ((org.telegram.ui.Cells.n7) childAt).getMessageId();
                }
                if (i3 != 0) {
                    break;
                }
            }
            if (i3 == 0) {
                this.f37523f.c0(0, tj0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        rr0 g02 = this.f37523f.g0(0);
        if (g02 != null) {
            ws0.s(g02, null, false);
        }
    }

    public int L(int i3) {
        return this.f37523f.f40136w1[0].f35864m + i3;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qs0.b():int");
    }

    @Override
    public int d(int i3) {
        ls0[] ls0VarArr = this.f37523f.f40136w1;
        if (!this.d && ls0VarArr[0].c().size() == 0) {
            ls0 ls0Var = ls0VarArr[0];
            if (!ls0Var.f35859g && ls0Var.f35863l) {
                return 2;
            }
        }
        ls0VarArr[0].getClass();
        ls0VarArr[0].c().size();
        ls0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f37523f.f40136w1[0].e();
    }

    @Override
    public void t(u4.d1 d1Var, int i3) {
        int i10;
        boolean z10;
        char c2;
        ws0 ws0Var = this.f37523f;
        int[] iArr = ws0Var.f40115p1;
        ls0[] ls0VarArr = ws0Var.f40136w1;
        if (d1Var.f55544f == 0) {
            ArrayList c10 = ls0VarArr[0].c();
            int d = i3 - ls0VarArr[0].d();
            View view = d1Var.f55540a;
            if (view instanceof org.telegram.ui.Cells.n7) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                int messageId = n7Var.getMessageId();
                boolean z11 = true;
                if (this == ws0Var.K) {
                    i10 = iArr[0];
                } else if (ws0.x(ws0Var, this) != -1) {
                    i10 = iArr[1];
                } else {
                    i10 = ws0Var.f40129t1;
                }
                if (d >= 0 && d < c10.size()) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) c10.get(d);
                    if (ziVar.f1() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (ws0Var.F1) {
                        SparseArray[] sparseArrayArr = ws0Var.f40077c1;
                        if (org.telegram.messenger.zi.B0(ziVar.f26868k) == ws0Var.m1) {
                            c2 = 0;
                        } else {
                            c2 = 1;
                        }
                        if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) < 0) {
                            z11 = false;
                        }
                        n7Var.i(z11, z10);
                    } else {
                        n7Var.i(false, z10);
                    }
                    n7Var.k(ziVar, i10, false);
                    return;
                }
                n7Var.k(null, i10, false);
                n7Var.i(false, false);
            }
        }
    }

    @Override
    public u4.d1 x(ViewGroup viewGroup, int i3) {
        ws0 ws0Var = this.f37523f;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.f37521c;
        if (i3 != 0 && i3 != 19) {
            p3 X = ws0.X(0, ws0Var.m1, context, e6Var);
            X.setLayoutParams(new u4.p0(-1, -1));
            return new u4.d1(X);
        }
        if (this.f37522e == null) {
            this.f37522e = new m.o3(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, this.f37522e, ws0Var.f40142y1.getCurrentAccount());
        if (i3 == 19) {
            n7Var.f29711x0 = true;
        }
        n7Var.setGradientView(ws0Var.E);
        if (ws0.x(ws0Var, this) != -1) {
            n7Var.f29687e0 = true;
        }
        n7Var.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(n7Var);
    }
}
