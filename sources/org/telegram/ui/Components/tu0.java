package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class tu0 extends uk0 {
    public final Context f28210c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final zu0 f28211f;

    public tu0(zu0 zu0Var, Context context) {
        this.f28211f = zu0Var;
        this.f28210c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(ml0 ml0Var) {
        int i10;
        zu0 zu0Var = this.f28211f;
        if (!zu0Var.t0()) {
            if (this != zu0Var.H && zu0.u(zu0Var, this) == -1) {
                i10 = zu0Var.f30647q1;
            } else {
                i10 = zu0Var.f30638m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (ml0Var.getChildCount() != 0 && ml0Var.getChildAt(0).getMeasuredHeight() * ceil > ml0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f28211f.f30655t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((xt0) arrayList.get(i11)).f29990b) {
                return ((xt0) arrayList.get(i11)).f29989a;
            }
        }
        return ((xt0) hg.k0.h(1, arrayList)).f29989a;
    }

    @Override
    public final void G(ml0 ml0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = ml0Var.getChildAt(0).getMeasuredHeight();
        zu0 zu0Var = this.f28211f;
        int[] iArr2 = zu0Var.f30638m1;
        if (zu0.v(zu0Var, this) == -1 && this != zu0Var.I) {
            if (zu0.u(zu0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = zu0Var.f30647q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = ml0Var.getMeasuredHeight() - ml0Var.getPaddingTop();
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
    public final float H(ml0 ml0Var) {
        int i10;
        zu0 zu0Var = this.f28211f;
        int[] iArr = zu0Var.f30638m1;
        if (this != zu0Var.I && zu0.v(zu0Var, this) == -1) {
            if (zu0.u(zu0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = zu0Var.f30647q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (ml0Var.getChildCount() != 0) {
            int measuredHeight = ml0Var.getChildAt(0).getMeasuredHeight();
            View childAt = ml0Var.getChildAt(0);
            int S = RecyclerView.S(childAt);
            if (S < 0) {
                return 0.0f;
            }
            return (((S / i10) * measuredHeight) - (childAt.getTop() - ml0Var.getPaddingTop())) / ((ceil * measuredHeight) - (ml0Var.getMeasuredHeight() - ml0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f28211f.c1(0, true);
    }

    @Override
    public final void J(ml0 ml0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < ml0Var.getChildCount(); i11++) {
                View childAt = ml0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f28211f.S(0, ml0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        st0 W = this.f28211f.W(0);
        if (W != null) {
            zu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f28211f.f30655t1[0].f26861m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tu0.h():int");
    }

    @Override
    public int j(int i10) {
        ou0[] ou0VarArr = this.f28211f.f30655t1;
        if (!this.d && ou0VarArr[0].c().size() == 0) {
            ou0 ou0Var = ou0VarArr[0];
            if (!ou0Var.f26856g && ou0Var.f26860l) {
                return 2;
            }
        }
        ou0VarArr[0].getClass();
        ou0VarArr[0].c().size();
        ou0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f28211f.f30655t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        zu0 zu0Var = this.f28211f;
        int[] iArr = zu0Var.f30638m1;
        ou0[] ou0VarArr = zu0Var.f30655t1;
        if (c1Var.f42705f == 0) {
            ArrayList c11 = ou0VarArr[0].c();
            int d = i10 - ou0VarArr[0].d();
            View view = c1Var.f42702a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == zu0Var.H) {
                    i11 = iArr[0];
                } else if (zu0.u(zu0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = zu0Var.f30647q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (zu0Var.C1) {
                        SparseArray[] sparseArrayArr = zu0Var.Z0;
                        if (messageObject.getDialogId() == zu0Var.f30634j1) {
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
        zu0 zu0Var = this.f28211f;
        org.telegram.ui.ActionBar.f6 f6Var = zu0Var.F1;
        Context context = this.f28210c;
        if (i10 != 0 && i10 != 19) {
            mt0 M = zu0.M(0, zu0Var.f30634j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, zu0Var.f30659v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f21411w0 = true;
        }
        t7Var.setGradientView(zu0Var.f30666y);
        if (zu0.u(zu0Var, this) != -1) {
            t7Var.f21388d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t7Var);
    }
}
