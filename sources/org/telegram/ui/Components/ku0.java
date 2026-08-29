package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class ku0 extends tk0 {
    public final Context f30150c;
    public boolean d;
    public org.telegram.ui.Cells.o7 f30151e;
    public final qu0 f30152f;

    public ku0(qu0 qu0Var, Context context) {
        this.f30152f = qu0Var;
        this.f30150c = context;
    }

    @Override
    public boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final boolean E(jl0 jl0Var) {
        int i10;
        qu0 qu0Var = this.f30152f;
        if (!qu0Var.t0()) {
            if (this != qu0Var.D && qu0.u(qu0Var, this) == -1) {
                i10 = qu0Var.f32081m1;
            } else {
                i10 = qu0Var.f32075i1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (jl0Var.getChildCount() != 0 && jl0Var.getChildAt(0).getMeasuredHeight() * ceil > jl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f30152f.f32088p1[0].f28537e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((nt0) arrayList.get(i11)).f31136b) {
                return ((nt0) arrayList.get(i11)).f31135a;
            }
        }
        return ((nt0) j7.l1.i(1, arrayList)).f31135a;
    }

    @Override
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        int i10;
        int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
        qu0 qu0Var = this.f30152f;
        int[] iArr2 = qu0Var.f32075i1;
        if (qu0.v(qu0Var, this) == -1 && this != qu0Var.E) {
            if (qu0.u(qu0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = qu0Var.f32081m1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = jl0Var.getMeasuredHeight() - jl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f10 = f9 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f10 / measuredHeight)) * i10;
        iArr[1] = ((int) f10) % measuredHeight;
    }

    @Override
    public final float H(jl0 jl0Var) {
        int i10;
        qu0 qu0Var = this.f30152f;
        int[] iArr = qu0Var.f32075i1;
        if (this != qu0Var.E && qu0.v(qu0Var, this) == -1) {
            if (qu0.u(qu0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = qu0Var.f32081m1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (jl0Var.getChildCount() != 0) {
            int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = jl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - jl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (jl0Var.getMeasuredHeight() - jl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f30152f.c1(0, true);
    }

    @Override
    public final void J(jl0 jl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < jl0Var.getChildCount(); i11++) {
                View childAt = jl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    i10 = ((org.telegram.ui.Cells.p7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f30152f.S(0, jl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        it0 W = this.f30152f.W(0);
        if (W != null) {
            qu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f30152f.f32088p1[0].f28544m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ku0.h():int");
    }

    @Override
    public int j(int i10) {
        fu0[] fu0VarArr = this.f30152f.f32088p1;
        if (!this.d && fu0VarArr[0].c().size() == 0) {
            fu0 fu0Var = fu0VarArr[0];
            if (!fu0Var.f28539g && fu0Var.f28543l) {
                return 2;
            }
        }
        fu0VarArr[0].getClass();
        fu0VarArr[0].c().size();
        fu0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f30152f.f32088p1[0].e();
    }

    @Override
    public void v(f2.n1 n1Var, int i10) {
        int i11;
        boolean z10;
        char c3;
        qu0 qu0Var = this.f30152f;
        int[] iArr = qu0Var.f32075i1;
        fu0[] fu0VarArr = qu0Var.f32088p1;
        if (n1Var.f6436f == 0) {
            ArrayList c6 = fu0VarArr[0].c();
            int d = i10 - fu0VarArr[0].d();
            View view = n1Var.f6432a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                int messageId = p7Var.getMessageId();
                boolean z11 = true;
                if (this == qu0Var.D) {
                    i11 = iArr[0];
                } else if (qu0.u(qu0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = qu0Var.f32081m1;
                }
                if (d >= 0 && d < c6.size()) {
                    MessageObject messageObject = (MessageObject) c6.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (qu0Var.f32111y1) {
                        SparseArray[] sparseArrayArr = qu0Var.V0;
                        if (messageObject.getDialogId() == qu0Var.f32069f1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) < 0) {
                            z11 = false;
                        }
                        p7Var.i(z11, z10);
                    } else {
                        p7Var.i(false, z10);
                    }
                    p7Var.k(messageObject, i11, false);
                    return;
                }
                p7Var.k(null, i11, false);
                p7Var.i(false, false);
            }
        }
    }

    @Override
    public f2.n1 x(ViewGroup viewGroup, int i10) {
        qu0 qu0Var = this.f30152f;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.f30150c;
        if (i10 != 0 && i10 != 19) {
            ct0 M = qu0.M(0, qu0Var.f32069f1, context, c6Var);
            M.setLayoutParams(new f2.x0(-1, -1));
            return new f2.n1(M);
        }
        if (this.f30151e == null) {
            this.f30151e = new org.telegram.ui.Cells.o7(viewGroup.getContext(), c6Var);
        }
        org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context, this.f30151e, qu0Var.f32093r1.getCurrentAccount());
        if (i10 == 19) {
            p7Var.f24999s0 = true;
        }
        p7Var.setGradientView(qu0Var.f32109y);
        if (qu0.u(qu0Var, this) != -1) {
            p7Var.W = true;
        }
        p7Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(p7Var);
    }
}
