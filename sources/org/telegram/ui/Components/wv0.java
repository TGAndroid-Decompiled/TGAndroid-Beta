package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class wv0 extends zl0 {
    public final Context f32767c;
    public boolean d;
    public org.telegram.ui.Cells.s7 f32768e;
    public final cw0 f32769f;

    public wv0(cw0 cw0Var, Context context) {
        this.f32769f = cw0Var;
        this.f32767c = context;
    }

    @Override
    public boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(rm0 rm0Var) {
        int i10;
        cw0 cw0Var = this.f32769f;
        if (!cw0Var.t0()) {
            if (this != cw0Var.H && cw0.u(cw0Var, this) == -1) {
                i10 = cw0Var.f25462q1;
            } else {
                i10 = cw0Var.f25453m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (rm0Var.getChildCount() != 0 && rm0Var.getChildAt(0).getMeasuredHeight() * ceil > rm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f32769f.f25470t1[0].f30581e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((av0) arrayList.get(i11)).f24649b) {
                return ((av0) arrayList.get(i11)).f24648a;
            }
        }
        return ((av0) hg.c.g(1, arrayList)).f24648a;
    }

    @Override
    public final void G(rm0 rm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = rm0Var.getChildAt(0).getMeasuredHeight();
        cw0 cw0Var = this.f32769f;
        int[] iArr2 = cw0Var.f25453m1;
        if (cw0.v(cw0Var, this) == -1 && this != cw0Var.I) {
            if (cw0.u(cw0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = cw0Var.f25462q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = rm0Var.getMeasuredHeight() - rm0Var.getPaddingTop();
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
    public final float H(rm0 rm0Var) {
        int i10;
        cw0 cw0Var = this.f32769f;
        int[] iArr = cw0Var.f25453m1;
        if (this != cw0Var.I && cw0.v(cw0Var, this) == -1) {
            if (cw0.u(cw0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = cw0Var.f25462q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (rm0Var.getChildCount() != 0) {
            int measuredHeight = rm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = rm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - rm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (rm0Var.getMeasuredHeight() - rm0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f32769f.c1(0, true);
    }

    @Override
    public final void J(rm0 rm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < rm0Var.getChildCount(); i11++) {
                View childAt = rm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f32769f.S(0, rm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        vu0 W = this.f32769f.W(0);
        if (W != null) {
            cw0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f32769f.f25470t1[0].f30588m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wv0.h():int");
    }

    @Override
    public int j(int i10) {
        rv0[] rv0VarArr = this.f32769f.f25470t1;
        if (!this.d && rv0VarArr[0].c().size() == 0) {
            rv0 rv0Var = rv0VarArr[0];
            if (!rv0Var.f30583g && rv0Var.f30587l) {
                return 2;
            }
        }
        rv0VarArr[0].getClass();
        rv0VarArr[0].c().size();
        rv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f32769f.f25470t1[0].e();
    }

    @Override
    public void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        cw0 cw0Var = this.f32769f;
        int[] iArr = cw0Var.f25453m1;
        rv0[] rv0VarArr = cw0Var.f25470t1;
        if (d1Var.f47706f == 0) {
            ArrayList c11 = rv0VarArr[0].c();
            int d = i10 - rv0VarArr[0].d();
            View view = d1Var.f47702a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == cw0Var.H) {
                    i11 = iArr[0];
                } else if (cw0.u(cw0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = cw0Var.f25462q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (cw0Var.C1) {
                        SparseArray[] sparseArrayArr = cw0Var.Z0;
                        if (messageObject.getDialogId() == cw0Var.f25449j1) {
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
        cw0 cw0Var = this.f32769f;
        org.telegram.ui.ActionBar.e6 e6Var = cw0Var.F1;
        Context context = this.f32767c;
        if (i10 != 0 && i10 != 19) {
            pu0 M = cw0.M(0, cw0Var.f25449j1, context, e6Var);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new s4.d1(M);
        }
        if (this.f32768e == null) {
            this.f32768e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f32768e, cw0Var.f25474v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f23095w0 = true;
        }
        t7Var.setGradientView(cw0Var.f25481y);
        if (cw0.u(cw0Var, this) != -1) {
            t7Var.f23071d0 = true;
        }
        t7Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(t7Var);
    }
}
