package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class dv0 extends dl0 {
    public final Context f23646c;
    public boolean d;
    public org.telegram.ui.Cells.t7 e;
    public final jv0 f23647f;

    public dv0(jv0 jv0Var, Context context) {
        this.f23647f = jv0Var;
        this.f23646c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(vl0 vl0Var) {
        int i10;
        jv0 jv0Var = this.f23647f;
        if (!jv0Var.t0()) {
            if (this != jv0Var.H && jv0.u(jv0Var, this) == -1) {
                i10 = jv0Var.f25516q1;
            } else {
                i10 = jv0Var.f25507m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (vl0Var.getChildCount() != 0 && vl0Var.getChildAt(0).getMeasuredHeight() * ceil > vl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f23647f.f25524t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((hu0) arrayList.get(i11)).f24761b) {
                return ((hu0) arrayList.get(i11)).f24760a;
            }
        }
        return ((hu0) hg.k0.g(1, arrayList)).f24760a;
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        jv0 jv0Var = this.f23647f;
        int[] iArr2 = jv0Var.f25507m1;
        if (jv0.v(jv0Var, this) == -1 && this != jv0Var.I) {
            if (jv0.u(jv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = jv0Var.f25516q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop();
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
    public final float H(vl0 vl0Var) {
        int i10;
        jv0 jv0Var = this.f23647f;
        int[] iArr = jv0Var.f25507m1;
        if (this != jv0Var.I && jv0.v(jv0Var, this) == -1) {
            if (jv0.u(jv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = jv0Var.f25516q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (vl0Var.getChildCount() != 0) {
            int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = vl0Var.getChildAt(0);
            int S = RecyclerView.S(childAt);
            if (S < 0) {
                return 0.0f;
            }
            return (((S / i10) * measuredHeight) - (childAt.getTop() - vl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f23647f.c1(0, true);
    }

    @Override
    public final void J(vl0 vl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
                View childAt = vl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    i10 = ((org.telegram.ui.Cells.u7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f23647f.S(0, vl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        cu0 W = this.f23647f.W(0);
        if (W != null) {
            jv0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f23647f.f25524t1[0].f30621m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dv0.h():int");
    }

    @Override
    public int j(int i10) {
        yu0[] yu0VarArr = this.f23647f.f25524t1;
        if (!this.d && yu0VarArr[0].c().size() == 0) {
            yu0 yu0Var = yu0VarArr[0];
            if (!yu0Var.f30616g && yu0Var.f30620l) {
                return 2;
            }
        }
        yu0VarArr[0].getClass();
        yu0VarArr[0].c().size();
        yu0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f23647f.f25524t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        jv0 jv0Var = this.f23647f;
        int[] iArr = jv0Var.f25507m1;
        yu0[] yu0VarArr = jv0Var.f25524t1;
        if (c1Var.f42977f == 0) {
            ArrayList c11 = yu0VarArr[0].c();
            int d = i10 - yu0VarArr[0].d();
            View view = c1Var.f42974a;
            if (view instanceof org.telegram.ui.Cells.u7) {
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                int messageId = u7Var.getMessageId();
                boolean z11 = true;
                if (this == jv0Var.H) {
                    i11 = iArr[0];
                } else if (jv0.u(jv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = jv0Var.f25516q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (jv0Var.C1) {
                        SparseArray[] sparseArrayArr = jv0Var.Z0;
                        if (messageObject.getDialogId() == jv0Var.f25503j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                            z11 = false;
                        }
                        u7Var.i(z11, z10);
                    } else {
                        u7Var.i(false, z10);
                    }
                    u7Var.k(messageObject, i11, false);
                    return;
                }
                u7Var.k(null, i11, false);
                u7Var.i(false, false);
            }
        }
    }

    @Override
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        jv0 jv0Var = this.f23647f;
        org.telegram.ui.ActionBar.f6 f6Var = jv0Var.F1;
        Context context = this.f23646c;
        if (i10 != 0 && i10 != 19) {
            wt0 M = jv0.M(0, jv0Var.f25503j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.t7(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.e, jv0Var.f25528v1.getCurrentAccount());
        if (i10 == 19) {
            u7Var.f21648w0 = true;
        }
        u7Var.setGradientView(jv0Var.f25535y);
        if (jv0.u(jv0Var, this) != -1) {
            u7Var.f21625d0 = true;
        }
        u7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(u7Var);
    }
}
