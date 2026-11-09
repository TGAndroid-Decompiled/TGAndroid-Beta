package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class ts0 extends wi0 {
    public final Context f38484c;
    public boolean d;
    public m.q3 f38485e;
    public final zs0 f38486f;

    public ts0(zs0 zs0Var, Context context) {
        this.f38486f = zs0Var;
        this.f38484c = context;
    }

    @Override
    public boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(qj0 qj0Var) {
        int i7;
        zs0 zs0Var = this.f38486f;
        if (!zs0Var.G0()) {
            if (this != zs0Var.J && zs0.x(zs0Var, this) == -1) {
                i7 = zs0Var.f41115s1;
            } else {
                i7 = zs0Var.f41101o1[0];
            }
            int ceil = (int) Math.ceil(e() / i7);
            if (qj0Var.getChildCount() != 0 && qj0Var.getChildAt(0).getMeasuredHeight() * ceil > qj0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i7) {
        ArrayList arrayList = this.f38486f.f41121v1[0].f36781e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((zr0) arrayList.get(i10)).f41050b) {
                return ((zr0) arrayList.get(i10)).f41049a;
            }
        }
        return ((zr0) jg.g.i(1, arrayList)).f41049a;
    }

    @Override
    public final void G(qj0 qj0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = qj0Var.getChildAt(0).getMeasuredHeight();
        zs0 zs0Var = this.f38486f;
        int[] iArr2 = zs0Var.f41101o1;
        if (zs0.y(zs0Var, this) == -1 && this != zs0Var.K) {
            if (zs0.x(zs0Var, this) != -1) {
                i7 = iArr2[1];
            } else {
                i7 = iArr2[0];
            }
        } else {
            i7 = zs0Var.f41115s1;
        }
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = qj0Var.getMeasuredHeight() - qj0Var.getPaddingTop();
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
    public final float H(qj0 qj0Var) {
        int i7;
        zs0 zs0Var = this.f38486f;
        int[] iArr = zs0Var.f41101o1;
        if (this != zs0Var.K && zs0.y(zs0Var, this) == -1) {
            if (zs0.x(zs0Var, this) != -1) {
                i7 = iArr[1];
            } else {
                i7 = iArr[0];
            }
        } else {
            i7 = zs0Var.f41115s1;
        }
        int ceil = (int) Math.ceil(e() / i7);
        if (qj0Var.getChildCount() != 0) {
            int measuredHeight = qj0Var.getChildAt(0).getMeasuredHeight();
            View childAt = qj0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i7) * measuredHeight) - (childAt.getTop() - qj0Var.getPaddingTop())) / ((ceil * measuredHeight) - (qj0Var.getMeasuredHeight() - qj0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f38486f.r1(0, true);
    }

    @Override
    public final void J(qj0 qj0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < qj0Var.getChildCount(); i10++) {
                View childAt = qj0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    i7 = ((org.telegram.ui.Cells.o7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f38486f.c0(0, qj0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        ur0 g02 = this.f38486f.g0(0);
        if (g02 != null) {
            zs0.s(g02, null, false);
        }
    }

    public int L(int i7) {
        return this.f38486f.f41121v1[0].f36788m + i7;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ts0.b():int");
    }

    @Override
    public int d(int i7) {
        os0[] os0VarArr = this.f38486f.f41121v1;
        if (!this.d && os0VarArr[0].c().size() == 0) {
            os0 os0Var = os0VarArr[0];
            if (!os0Var.f36783g && os0Var.f36787l) {
                return 2;
            }
        }
        os0VarArr[0].getClass();
        os0VarArr[0].c().size();
        os0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f38486f.f41121v1[0].e();
    }

    @Override
    public void t(v4.d1 d1Var, int i7) {
        int i10;
        boolean z9;
        char c10;
        zs0 zs0Var = this.f38486f;
        int[] iArr = zs0Var.f41101o1;
        os0[] os0VarArr = zs0Var.f41121v1;
        if (d1Var.f57060f == 0) {
            ArrayList c11 = os0VarArr[0].c();
            int d = i7 - os0VarArr[0].d();
            View view = d1Var.f57056a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                int messageId = o7Var.getMessageId();
                boolean z10 = true;
                if (this == zs0Var.J) {
                    i10 = iArr[0];
                } else if (zs0.x(zs0Var, this) != -1) {
                    i10 = iArr[1];
                } else {
                    i10 = zs0Var.f41115s1;
                }
                if (d >= 0 && d < c11.size()) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c11.get(d);
                    if (ijVar.e1() == messageId) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (zs0Var.E1) {
                        SparseArray[] sparseArrayArr = zs0Var.f41062b1;
                        if (org.telegram.messenger.ij.B0(ijVar.f23262k) == zs0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) < 0) {
                            z10 = false;
                        }
                        o7Var.i(z10, z9);
                    } else {
                        o7Var.i(false, z9);
                    }
                    o7Var.k(ijVar, i10, false);
                    return;
                }
                o7Var.k(null, i10, false);
                o7Var.i(false, false);
            }
        }
    }

    @Override
    public v4.d1 x(ViewGroup viewGroup, int i7) {
        zs0 zs0Var = this.f38486f;
        org.telegram.ui.ActionBar.g6 g6Var = zs0Var.H1;
        Context context = this.f38484c;
        if (i7 != 0 && i7 != 19) {
            r3 X = zs0.X(0, zs0Var.l1, context, g6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new v4.d1(X);
        }
        if (this.f38485e == null) {
            this.f38485e = new m.q3(viewGroup.getContext(), g6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f38485e, zs0Var.f41127x1.getCurrentAccount());
        if (i7 == 19) {
            o7Var.f29694w0 = true;
        }
        o7Var.setGradientView(zs0Var.D);
        if (zs0.x(zs0Var, this) != -1) {
            o7Var.f29670d0 = true;
        }
        o7Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(o7Var);
    }
}
