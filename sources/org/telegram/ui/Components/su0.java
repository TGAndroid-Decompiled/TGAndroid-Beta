package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class su0 extends bl0 {
    public final Context f28814c;
    public boolean d;
    public org.telegram.ui.Cells.p7 e;
    public final yu0 f28815f;

    public su0(yu0 yu0Var, Context context) {
        this.f28815f = yu0Var;
        this.f28814c = context;
    }

    @Override
    public boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final boolean E(rl0 rl0Var) {
        int i10;
        yu0 yu0Var = this.f28815f;
        if (!yu0Var.t0()) {
            if (this != yu0Var.E && yu0.u(yu0Var, this) == -1) {
                i10 = yu0Var.f31143n1;
            } else {
                i10 = yu0Var.f31136j1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (rl0Var.getChildCount() != 0 && rl0Var.getChildAt(0).getMeasuredHeight() * ceil > rl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f28815f.f31149q1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((vt0) arrayList.get(i11)).f30051b) {
                return ((vt0) arrayList.get(i11)).f30050a;
            }
        }
        return ((vt0) kf.k0.i(1, arrayList)).f30050a;
    }

    @Override
    public final void G(rl0 rl0Var, float f10, int[] iArr) {
        int i10;
        int measuredHeight = rl0Var.getChildAt(0).getMeasuredHeight();
        yu0 yu0Var = this.f28815f;
        int[] iArr2 = yu0Var.f31136j1;
        if (yu0.v(yu0Var, this) == -1 && this != yu0Var.F) {
            if (yu0.u(yu0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = yu0Var.f31143n1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = rl0Var.getMeasuredHeight() - rl0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f11 = f10 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f11 / measuredHeight)) * i10;
        iArr[1] = ((int) f11) % measuredHeight;
    }

    @Override
    public final float H(rl0 rl0Var) {
        int i10;
        yu0 yu0Var = this.f28815f;
        int[] iArr = yu0Var.f31136j1;
        if (this != yu0Var.F && yu0.v(yu0Var, this) == -1) {
            if (yu0.u(yu0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = yu0Var.f31143n1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (rl0Var.getChildCount() != 0) {
            int measuredHeight = rl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = rl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - rl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (rl0Var.getMeasuredHeight() - rl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f28815f.c1(0, true);
    }

    @Override
    public final void J(rl0 rl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < rl0Var.getChildCount(); i11++) {
                View childAt = rl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q7) {
                    i10 = ((org.telegram.ui.Cells.q7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f28815f.S(0, rl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        qt0 W = this.f28815f.W(0);
        if (W != null) {
            yu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f28815f.f31149q1[0].f27377m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.su0.h():int");
    }

    @Override
    public int j(int i10) {
        nu0[] nu0VarArr = this.f28815f.f31149q1;
        if (!this.d && nu0VarArr[0].c().size() == 0) {
            nu0 nu0Var = nu0VarArr[0];
            if (!nu0Var.f27372g && nu0Var.f27376l) {
                return 2;
            }
        }
        nu0VarArr[0].getClass();
        nu0VarArr[0].c().size();
        nu0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f28815f.f31149q1[0].e();
    }

    @Override
    public void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        char c3;
        yu0 yu0Var = this.f28815f;
        int[] iArr = yu0Var.f31136j1;
        nu0[] nu0VarArr = yu0Var.f31149q1;
        if (l1Var.f5777f == 0) {
            ArrayList c10 = nu0VarArr[0].c();
            int d = i10 - nu0VarArr[0].d();
            View view = l1Var.f5774a;
            if (view instanceof org.telegram.ui.Cells.q7) {
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                int messageId = q7Var.getMessageId();
                boolean z10 = true;
                if (this == yu0Var.E) {
                    i11 = iArr[0];
                } else if (yu0.u(yu0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = yu0Var.f31143n1;
                }
                if (d >= 0 && d < c10.size()) {
                    MessageObject messageObject = (MessageObject) c10.get(d);
                    if (messageObject.getId() == messageId) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (yu0Var.f31172z1) {
                        SparseArray[] sparseArrayArr = yu0Var.W0;
                        if (messageObject.getDialogId() == yu0Var.f31130g1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) < 0) {
                            z10 = false;
                        }
                        q7Var.i(z10, z4);
                    } else {
                        q7Var.i(false, z4);
                    }
                    q7Var.k(messageObject, i11, false);
                    return;
                }
                q7Var.k(null, i11, false);
                q7Var.i(false, false);
            }
        }
    }

    @Override
    public f2.l1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.f28815f;
        org.telegram.ui.ActionBar.f6 f6Var = yu0Var.C1;
        Context context = this.f28814c;
        if (i10 != 0 && i10 != 19) {
            kt0 M = yu0.M(0, yu0Var.f31130g1, context, f6Var);
            M.setLayoutParams(new f2.w0(-1, -1));
            return new f2.l1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.p7(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.q7 q7Var = new org.telegram.ui.Cells.q7(context, this.e, yu0Var.f31155s1.getCurrentAccount());
        if (i10 == 19) {
            q7Var.f21723t0 = true;
        }
        q7Var.setGradientView(yu0Var.f31168y);
        if (yu0.u(yu0Var, this) != -1) {
            q7Var.f21699a0 = true;
        }
        q7Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(q7Var);
    }
}
