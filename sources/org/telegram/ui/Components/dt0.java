package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class dt0 extends kj0 {
    public final Context f34569c;
    public boolean d;
    public m.o3 f34570e;
    public final jt0 f34571f;

    public dt0(jt0 jt0Var, Context context) {
        this.f34571f = jt0Var;
        this.f34569c = context;
    }

    @Override
    public boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final boolean E(ek0 ek0Var) {
        int i7;
        jt0 jt0Var = this.f34571f;
        if (!jt0Var.G0()) {
            if (this != jt0Var.K && jt0.x(jt0Var, this) == -1) {
                i7 = jt0Var.f36671t1;
            } else {
                i7 = jt0Var.f36657p1[0];
            }
            int ceil = (int) Math.ceil(e() / i7);
            if (ek0Var.getChildCount() != 0 && ek0Var.getChildAt(0).getMeasuredHeight() * ceil > ek0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i7) {
        ArrayList arrayList = this.f34571f.f36678w1[0].f42517e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((js0) arrayList.get(i10)).f36600b) {
                return ((js0) arrayList.get(i10)).f36599a;
            }
        }
        return ((js0) i5.c.h(1, arrayList)).f36599a;
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        jt0 jt0Var = this.f34571f;
        int[] iArr2 = jt0Var.f36657p1;
        if (jt0.y(jt0Var, this) == -1 && this != jt0Var.L) {
            if (jt0.x(jt0Var, this) != -1) {
                i7 = iArr2[1];
            } else {
                i7 = iArr2[0];
            }
        } else {
            i7 = jt0Var.f36671t1;
        }
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop();
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
    public final float H(ek0 ek0Var) {
        int i7;
        jt0 jt0Var = this.f34571f;
        int[] iArr = jt0Var.f36657p1;
        if (this != jt0Var.L && jt0.y(jt0Var, this) == -1) {
            if (jt0.x(jt0Var, this) != -1) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        } else {
            i7 = jt0Var.f36671t1;
        }
        int ceil = (int) Math.ceil(e() / i7);
        if (ek0Var.getChildCount() != 0) {
            int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
            View childAt = ek0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i7) * measuredHeight) - (childAt.getTop() - ek0Var.getPaddingTop())) / ((ceil * measuredHeight) - (ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f34571f.r1(0, true);
    }

    @Override
    public final void J(ek0 ek0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
                View childAt = ek0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    i7 = ((org.telegram.ui.Cells.p7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f34571f.c0(0, ek0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        ds0 g02 = this.f34571f.g0(0);
        if (g02 != null) {
            jt0.s(g02, null, false);
        }
    }

    public int L(int i7) {
        return this.f34571f.f36678w1[0].f42524m + i7;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dt0.b():int");
    }

    @Override
    public int d(int i7) {
        ys0[] ys0VarArr = this.f34571f.f36678w1;
        if (!this.d && ys0VarArr[0].c().size() == 0) {
            ys0 ys0Var = ys0VarArr[0];
            if (!ys0Var.f42519g && ys0Var.f42523l) {
                return 2;
            }
        }
        ys0VarArr[0].getClass();
        ys0VarArr[0].c().size();
        ys0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f34571f.f36678w1[0].e();
    }

    @Override
    public void t(v4.f1 f1Var, int i7) {
        int i10;
        boolean z10;
        char c10;
        jt0 jt0Var = this.f34571f;
        int[] iArr = jt0Var.f36657p1;
        ys0[] ys0VarArr = jt0Var.f36678w1;
        if (f1Var.f59169f == 0) {
            ArrayList c11 = ys0VarArr[0].c();
            int d = i7 - ys0VarArr[0].d();
            View view = f1Var.f59165a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                int messageId = p7Var.getMessageId();
                boolean z11 = true;
                if (this == jt0Var.K) {
                    i10 = iArr[0];
                } else if (jt0.x(jt0Var, this) != -1) {
                    i10 = iArr[1];
                } else {
                    i10 = jt0Var.f36671t1;
                }
                if (d >= 0 && d < c11.size()) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) c11.get(d);
                    if (gjVar.e1() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (jt0Var.F1) {
                        SparseArray[] sparseArrayArr = jt0Var.f36619c1;
                        if (org.telegram.messenger.gj.B0(gjVar.f24213k) == jt0Var.f36648m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) < 0) {
                            z11 = false;
                        }
                        p7Var.i(z11, z10);
                    } else {
                        p7Var.i(false, z10);
                    }
                    p7Var.k(gjVar, i10, false);
                    return;
                }
                p7Var.k(null, i10, false);
                p7Var.i(false, false);
            }
        }
    }

    @Override
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        jt0 jt0Var = this.f34571f;
        org.telegram.ui.ActionBar.h6 h6Var = jt0Var.I1;
        Context context = this.f34569c;
        if (i7 != 0 && i7 != 19) {
            y3 X = jt0.X(0, jt0Var.f36648m1, context, h6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new v4.f1(X);
        }
        if (this.f34570e == null) {
            this.f34570e = new m.o3(viewGroup.getContext(), h6Var);
        }
        org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context, this.f34570e, jt0Var.f36684y1.getCurrentAccount());
        if (i7 == 19) {
            p7Var.f31285x0 = true;
        }
        p7Var.setGradientView(jt0Var.E);
        if (jt0.x(jt0Var, this) != -1) {
            p7Var.f31261e0 = true;
        }
        p7Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(p7Var);
    }
}
