package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class vv0 extends yl0 {
    public final Context f32463c;
    public boolean d;
    public org.telegram.ui.Cells.s7 f32464e;
    public final bw0 f32465f;

    public vv0(bw0 bw0Var, Context context) {
        this.f32465f = bw0Var;
        this.f32463c = context;
    }

    @Override
    public boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(qm0 qm0Var) {
        int i10;
        bw0 bw0Var = this.f32465f;
        if (!bw0Var.t0()) {
            if (this != bw0Var.H && bw0.u(bw0Var, this) == -1) {
                i10 = bw0Var.f25154q1;
            } else {
                i10 = bw0Var.f25145m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (qm0Var.getChildCount() != 0 && qm0Var.getChildAt(0).getMeasuredHeight() * ceil > qm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f32465f.f25162t1[0].f30277e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((zu0) arrayList.get(i11)).f33661b) {
                return ((zu0) arrayList.get(i11)).f33660a;
            }
        }
        return ((zu0) hg.c.g(1, arrayList)).f33660a;
    }

    @Override
    public final void G(qm0 qm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = qm0Var.getChildAt(0).getMeasuredHeight();
        bw0 bw0Var = this.f32465f;
        int[] iArr2 = bw0Var.f25145m1;
        if (bw0.v(bw0Var, this) == -1 && this != bw0Var.I) {
            if (bw0.u(bw0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = bw0Var.f25154q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = qm0Var.getMeasuredHeight() - qm0Var.getPaddingTop();
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
    public final float H(qm0 qm0Var) {
        int i10;
        bw0 bw0Var = this.f32465f;
        int[] iArr = bw0Var.f25145m1;
        if (this != bw0Var.I && bw0.v(bw0Var, this) == -1) {
            if (bw0.u(bw0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = bw0Var.f25154q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (qm0Var.getChildCount() != 0) {
            int measuredHeight = qm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = qm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - qm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (qm0Var.getMeasuredHeight() - qm0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f32465f.c1(0, true);
    }

    @Override
    public final void J(qm0 qm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < qm0Var.getChildCount(); i11++) {
                View childAt = qm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f32465f.S(0, qm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        uu0 W = this.f32465f.W(0);
        if (W != null) {
            bw0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f32465f.f25162t1[0].f30284m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vv0.h():int");
    }

    @Override
    public int j(int i10) {
        qv0[] qv0VarArr = this.f32465f.f25162t1;
        if (!this.d && qv0VarArr[0].c().size() == 0) {
            qv0 qv0Var = qv0VarArr[0];
            if (!qv0Var.f30279g && qv0Var.f30283l) {
                return 2;
            }
        }
        qv0VarArr[0].getClass();
        qv0VarArr[0].c().size();
        qv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f32465f.f25162t1[0].e();
    }

    @Override
    public void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        bw0 bw0Var = this.f32465f;
        int[] iArr = bw0Var.f25145m1;
        qv0[] qv0VarArr = bw0Var.f25162t1;
        if (d1Var.f47662f == 0) {
            ArrayList c11 = qv0VarArr[0].c();
            int d = i10 - qv0VarArr[0].d();
            View view = d1Var.f47658a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == bw0Var.H) {
                    i11 = iArr[0];
                } else if (bw0.u(bw0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = bw0Var.f25154q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (bw0Var.C1) {
                        SparseArray[] sparseArrayArr = bw0Var.Z0;
                        if (messageObject.getDialogId() == bw0Var.f25141j1) {
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
    public s4.d1 x(ViewGroup viewGroup, int i10) {
        bw0 bw0Var = this.f32465f;
        org.telegram.ui.ActionBar.e6 e6Var = bw0Var.F1;
        Context context = this.f32463c;
        if (i10 != 0 && i10 != 19) {
            ou0 M = bw0.M(0, bw0Var.f25141j1, context, e6Var);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new s4.d1(M);
        }
        if (this.f32464e == null) {
            this.f32464e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f32464e, bw0Var.f25166v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f23091w0 = true;
        }
        t7Var.setGradientView(bw0Var.f25173y);
        if (bw0.u(bw0Var, this) != -1) {
            t7Var.f23067d0 = true;
        }
        t7Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(t7Var);
    }
}
