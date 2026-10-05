package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class kv0 extends gl0 {
    public final Context f28296c;
    public boolean d;
    public org.telegram.ui.Cells.s7 f28297e;
    public final qv0 f28298f;

    public kv0(qv0 qv0Var, Context context) {
        this.f28298f = qv0Var;
        this.f28296c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(zl0 zl0Var) {
        int i10;
        qv0 qv0Var = this.f28298f;
        if (!qv0Var.t0()) {
            if (this != qv0Var.H && qv0.u(qv0Var, this) == -1) {
                i10 = qv0Var.f30251q1;
            } else {
                i10 = qv0Var.f30242m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (zl0Var.getChildCount() != 0 && zl0Var.getChildAt(0).getMeasuredHeight() * ceil > zl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f28298f.f30259t1[0].f26594e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((ou0) arrayList.get(i11)).f29551b) {
                return ((ou0) arrayList.get(i11)).f29550a;
            }
        }
        return ((ou0) hg.c.g(1, arrayList)).f29550a;
    }

    @Override
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
        qv0 qv0Var = this.f28298f;
        int[] iArr2 = qv0Var.f30242m1;
        if (qv0.v(qv0Var, this) == -1 && this != qv0Var.I) {
            if (qv0.u(qv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = qv0Var.f30251q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop();
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
    public final float H(zl0 zl0Var) {
        int i10;
        qv0 qv0Var = this.f28298f;
        int[] iArr = qv0Var.f30242m1;
        if (this != qv0Var.I && qv0.v(qv0Var, this) == -1) {
            if (qv0.u(qv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = qv0Var.f30251q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (zl0Var.getChildCount() != 0) {
            int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = zl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - zl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f28298f.c1(0, true);
    }

    @Override
    public final void J(zl0 zl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
                View childAt = zl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f28298f.S(0, zl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        ju0 W = this.f28298f.W(0);
        if (W != null) {
            qv0.q(W, null, false);
        }
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kv0.h():int");
    }

    @Override
    public int j(int i10) {
        fv0[] fv0VarArr = this.f28298f.f30259t1;
        if (!this.d && fv0VarArr[0].c().size() == 0) {
            fv0 fv0Var = fv0VarArr[0];
            if (!fv0Var.f26596g && fv0Var.f26600l) {
                return 2;
            }
        }
        fv0VarArr[0].getClass();
        fv0VarArr[0].c().size();
        fv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f28298f.f30259t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        qv0 qv0Var = this.f28298f;
        int[] iArr = qv0Var.f30242m1;
        fv0[] fv0VarArr = qv0Var.f30259t1;
        if (c1Var.f46542f == 0) {
            ArrayList c11 = fv0VarArr[0].c();
            int d = i10 - fv0VarArr[0].d();
            View view = c1Var.f46538a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == qv0Var.H) {
                    i11 = iArr[0];
                } else if (qv0.u(qv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = qv0Var.f30251q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (qv0Var.C1) {
                        SparseArray[] sparseArrayArr = qv0Var.Z0;
                        if (messageObject.getDialogId() == qv0Var.f30238j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                            z11 = false;
                        }
                        t7Var.i(z11, z10);
                    } else {
                        t7Var.i(false, z10);
                    }
                    t7Var.k(messageObject, i11, false);
                    return;
                }
                t7Var.k(null, i11, false);
                t7Var.i(false, false);
            }
        }
    }

    @Override
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        qv0 qv0Var = this.f28298f;
        org.telegram.ui.ActionBar.d6 d6Var = qv0Var.F1;
        Context context = this.f28296c;
        if (i10 != 0 && i10 != 19) {
            du0 M = qv0.M(0, qv0Var.f30238j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.f28297e == null) {
            this.f28297e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f28297e, qv0Var.f30263v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f23105w0 = true;
        }
        t7Var.setGradientView(qv0Var.f30270y);
        if (qv0.u(qv0Var, this) != -1) {
            t7Var.f23081d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t7Var);
    }
}
