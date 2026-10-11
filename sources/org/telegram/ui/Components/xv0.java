package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class xv0 extends am0 {
    public final Context f33035c;
    public boolean d;
    public org.telegram.ui.Cells.s7 f33036e;
    public final dw0 f33037f;

    public xv0(dw0 dw0Var, Context context) {
        this.f33037f = dw0Var;
        this.f33035c = context;
    }

    @Override
    public boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(sm0 sm0Var) {
        int i10;
        dw0 dw0Var = this.f33037f;
        if (!dw0Var.t0()) {
            if (this != dw0Var.H && dw0.u(dw0Var, this) == -1) {
                i10 = dw0Var.f25723q1;
            } else {
                i10 = dw0Var.f25714m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (sm0Var.getChildCount() != 0 && sm0Var.getChildAt(0).getMeasuredHeight() * ceil > sm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f33037f.f25731t1[0].f30870e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((bv0) arrayList.get(i11)).f25029b) {
                return ((bv0) arrayList.get(i11)).f25028a;
            }
        }
        return ((bv0) hg.c.g(1, arrayList)).f25028a;
    }

    @Override
    public final void G(sm0 sm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = sm0Var.getChildAt(0).getMeasuredHeight();
        dw0 dw0Var = this.f33037f;
        int[] iArr2 = dw0Var.f25714m1;
        if (dw0.v(dw0Var, this) == -1 && this != dw0Var.I) {
            if (dw0.u(dw0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = dw0Var.f25723q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = sm0Var.getMeasuredHeight() - sm0Var.getPaddingTop();
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
    public final float H(sm0 sm0Var) {
        int i10;
        dw0 dw0Var = this.f33037f;
        int[] iArr = dw0Var.f25714m1;
        if (this != dw0Var.I && dw0.v(dw0Var, this) == -1) {
            if (dw0.u(dw0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = dw0Var.f25723q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (sm0Var.getChildCount() != 0) {
            int measuredHeight = sm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = sm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - sm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (sm0Var.getMeasuredHeight() - sm0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f33037f.c1(0, true);
    }

    @Override
    public final void J(sm0 sm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < sm0Var.getChildCount(); i11++) {
                View childAt = sm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f33037f.S(0, sm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        wu0 W = this.f33037f.W(0);
        if (W != null) {
            dw0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f33037f.f25731t1[0].f30877m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.h():int");
    }

    @Override
    public int j(int i10) {
        sv0[] sv0VarArr = this.f33037f.f25731t1;
        if (!this.d && sv0VarArr[0].c().size() == 0) {
            sv0 sv0Var = sv0VarArr[0];
            if (!sv0Var.f30872g && sv0Var.f30876l) {
                return 2;
            }
        }
        sv0VarArr[0].getClass();
        sv0VarArr[0].c().size();
        sv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f33037f.f25731t1[0].e();
    }

    @Override
    public void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        dw0 dw0Var = this.f33037f;
        int[] iArr = dw0Var.f25714m1;
        sv0[] sv0VarArr = dw0Var.f25731t1;
        if (d1Var.f47752f == 0) {
            ArrayList c11 = sv0VarArr[0].c();
            int d = i10 - sv0VarArr[0].d();
            View view = d1Var.f47748a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == dw0Var.H) {
                    i11 = iArr[0];
                } else if (dw0.u(dw0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = dw0Var.f25723q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dw0Var.C1) {
                        SparseArray[] sparseArrayArr = dw0Var.Z0;
                        if (messageObject.getDialogId() == dw0Var.f25710j1) {
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
        dw0 dw0Var = this.f33037f;
        org.telegram.ui.ActionBar.d6 d6Var = dw0Var.F1;
        Context context = this.f33035c;
        if (i10 != 0 && i10 != 19) {
            qu0 M = dw0.M(0, dw0Var.f25710j1, context, d6Var);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new s4.d1(M);
        }
        if (this.f33036e == null) {
            this.f33036e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f33036e, dw0Var.f25735v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f23083w0 = true;
        }
        t7Var.setGradientView(dw0Var.f25742y);
        if (dw0.u(dw0Var, this) != -1) {
            t7Var.f23059d0 = true;
        }
        t7Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(t7Var);
    }
}
