package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class dv0 extends el0 {
    public final Context f23717c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final jv0 f23718f;

    public dv0(jv0 jv0Var, Context context) {
        this.f23718f = jv0Var;
        this.f23717c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(wl0 wl0Var) {
        int i10;
        jv0 jv0Var = this.f23718f;
        if (!jv0Var.t0()) {
            if (this != jv0Var.H && jv0.u(jv0Var, this) == -1) {
                i10 = jv0Var.f25531q1;
            } else {
                i10 = jv0Var.f25522m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (wl0Var.getChildCount() != 0 && wl0Var.getChildAt(0).getMeasuredHeight() * ceil > wl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f23718f.f25539t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((hu0) arrayList.get(i11)).f24844b) {
                return ((hu0) arrayList.get(i11)).f24843a;
            }
        }
        return ((hu0) hg.c.g(1, arrayList)).f24843a;
    }

    @Override
    public final void G(wl0 wl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = wl0Var.getChildAt(0).getMeasuredHeight();
        jv0 jv0Var = this.f23718f;
        int[] iArr2 = jv0Var.f25522m1;
        if (jv0.v(jv0Var, this) == -1 && this != jv0Var.I) {
            if (jv0.u(jv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = jv0Var.f25531q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = wl0Var.getMeasuredHeight() - wl0Var.getPaddingTop();
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
    public final float H(wl0 wl0Var) {
        int i10;
        jv0 jv0Var = this.f23718f;
        int[] iArr = jv0Var.f25522m1;
        if (this != jv0Var.I && jv0.v(jv0Var, this) == -1) {
            if (jv0.u(jv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = jv0Var.f25531q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (wl0Var.getChildCount() != 0) {
            int measuredHeight = wl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = wl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - wl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (wl0Var.getMeasuredHeight() - wl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f23718f.c1(0, true);
    }

    @Override
    public final void J(wl0 wl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < wl0Var.getChildCount(); i11++) {
                View childAt = wl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f23718f.S(0, wl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        cu0 W = this.f23718f.W(0);
        if (W != null) {
            jv0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f23718f.f25539t1[0].f30691m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dv0.h():int");
    }

    @Override
    public int j(int i10) {
        yu0[] yu0VarArr = this.f23718f.f25539t1;
        if (!this.d && yu0VarArr[0].c().size() == 0) {
            yu0 yu0Var = yu0VarArr[0];
            if (!yu0Var.f30686g && yu0Var.f30690l) {
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
        return this.f23718f.f25539t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        jv0 jv0Var = this.f23718f;
        int[] iArr = jv0Var.f25522m1;
        yu0[] yu0VarArr = jv0Var.f25539t1;
        if (c1Var.f42949f == 0) {
            ArrayList c11 = yu0VarArr[0].c();
            int d = i10 - yu0VarArr[0].d();
            View view = c1Var.f42946a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == jv0Var.H) {
                    i11 = iArr[0];
                } else if (jv0.u(jv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = jv0Var.f25531q1;
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
                        if (messageObject.getDialogId() == jv0Var.f25518j1) {
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
        jv0 jv0Var = this.f23718f;
        org.telegram.ui.ActionBar.d6 d6Var = jv0Var.F1;
        Context context = this.f23717c;
        if (i10 != 0 && i10 != 19) {
            wt0 M = jv0.M(0, jv0Var.f25518j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, jv0Var.f25543v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f21225w0 = true;
        }
        t7Var.setGradientView(jv0Var.f25550y);
        if (jv0.u(jv0Var, this) != -1) {
            t7Var.f21202d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t7Var);
    }
}
