package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class yt0 extends gk0 {
    public final Context f35066c;
    public boolean d;
    public org.telegram.ui.Cells.q7 f35067e;
    public final eu0 f35068f;

    public yt0(eu0 eu0Var, Context context) {
        this.f35068f = eu0Var;
        this.f35066c = context;
    }

    @Override
    public boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final boolean E(wk0 wk0Var) {
        int i9;
        eu0 eu0Var = this.f35068f;
        if (!eu0Var.t0()) {
            if (this != eu0Var.D && eu0.u(eu0Var, this) == -1) {
                i9 = eu0Var.f28148m1;
            } else {
                i9 = eu0Var.f28142i1[0];
            }
            int ceil = (int) Math.ceil(k() / i9);
            if (wk0Var.getChildCount() != 0 && wk0Var.getChildAt(0).getMeasuredHeight() * ceil > wk0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i9) {
        ArrayList arrayList = this.f35068f.f28155p1[0].f32791e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i9 <= ((ct0) arrayList.get(i10)).f27566b) {
                return ((ct0) arrayList.get(i10)).f27565a;
            }
        }
        return ((ct0) j3.r0.j(1, arrayList)).f27565a;
    }

    @Override
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        int i9;
        int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
        eu0 eu0Var = this.f35068f;
        int[] iArr2 = eu0Var.f28142i1;
        if (eu0.v(eu0Var, this) == -1 && this != eu0Var.E) {
            if (eu0.u(eu0Var, this) != -1) {
                i9 = iArr2[1];
            } else {
                i9 = iArr2[0];
            }
        } else {
            i9 = eu0Var.f28148m1;
        }
        int ceil = (int) (Math.ceil(k() / i9) * measuredHeight);
        int measuredHeight2 = wk0Var.getMeasuredHeight() - wk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f11 = f10 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f11 / measuredHeight)) * i9;
        iArr[1] = ((int) f11) % measuredHeight;
    }

    @Override
    public final float H(wk0 wk0Var) {
        int i9;
        eu0 eu0Var = this.f35068f;
        int[] iArr = eu0Var.f28142i1;
        if (this != eu0Var.E && eu0.v(eu0Var, this) == -1) {
            if (eu0.u(eu0Var, this) != -1) {
                i9 = iArr[1];
            } else {
                i9 = iArr[0];
            }
        } else {
            i9 = eu0Var.f28148m1;
        }
        int ceil = (int) Math.ceil(k() / i9);
        if (wk0Var.getChildCount() != 0) {
            int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
            View childAt = wk0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i9) * measuredHeight) - (childAt.getTop() - wk0Var.getPaddingTop())) / ((ceil * measuredHeight) - (wk0Var.getMeasuredHeight() - wk0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f35068f.c1(0, true);
    }

    @Override
    public final void J(wk0 wk0Var) {
        if (this.d) {
            this.d = false;
            int i9 = 0;
            for (int i10 = 0; i10 < wk0Var.getChildCount(); i10++) {
                View childAt = wk0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r7) {
                    i9 = ((org.telegram.ui.Cells.r7) childAt).getMessageId();
                }
                if (i9 != 0) {
                    break;
                }
            }
            if (i9 == 0) {
                this.f35068f.S(0, wk0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        xs0 W = this.f35068f.W(0);
        if (W != null) {
            eu0.q(W, null, false);
        }
    }

    public int L(int i9) {
        return this.f35068f.f28155p1[0].f32798m + i9;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yt0.h():int");
    }

    @Override
    public int j(int i9) {
        tt0[] tt0VarArr = this.f35068f.f28155p1;
        if (!this.d && tt0VarArr[0].c().size() == 0) {
            tt0 tt0Var = tt0VarArr[0];
            if (!tt0Var.f32793g && tt0Var.f32797l) {
                return 2;
            }
        }
        tt0VarArr[0].getClass();
        tt0VarArr[0].c().size();
        tt0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f35068f.f28155p1[0].e();
    }

    @Override
    public void v(f2.q1 q1Var, int i9) {
        int i10;
        boolean z10;
        char c10;
        eu0 eu0Var = this.f35068f;
        int[] iArr = eu0Var.f28142i1;
        tt0[] tt0VarArr = eu0Var.f28155p1;
        if (q1Var.f5505f == 0) {
            ArrayList c11 = tt0VarArr[0].c();
            int d = i9 - tt0VarArr[0].d();
            View view = q1Var.f5501a;
            if (view instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                int messageId = r7Var.getMessageId();
                boolean z11 = true;
                if (this == eu0Var.D) {
                    i10 = iArr[0];
                } else if (eu0.u(eu0Var, this) != -1) {
                    i10 = iArr[1];
                } else {
                    i10 = eu0Var.f28148m1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (eu0Var.f28178y1) {
                        SparseArray[] sparseArrayArr = eu0Var.V0;
                        if (messageObject.getDialogId() == eu0Var.f28136f1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                            z11 = false;
                        }
                        r7Var.i(z11, z10);
                    } else {
                        r7Var.i(false, z10);
                    }
                    r7Var.k(messageObject, i10, false);
                    return;
                }
                r7Var.k(null, i10, false);
                r7Var.i(false, false);
            }
        }
    }

    @Override
    public f2.q1 x(ViewGroup viewGroup, int i9) {
        eu0 eu0Var = this.f35068f;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.f35066c;
        if (i9 != 0 && i9 != 19) {
            rs0 M = eu0.M(0, eu0Var.f28136f1, context, b6Var);
            M.setLayoutParams(new f2.a1(-1, -1));
            return new f2.q1(M);
        }
        if (this.f35067e == null) {
            this.f35067e = new org.telegram.ui.Cells.q7(viewGroup.getContext(), b6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.f35067e, eu0Var.f28160r1.getCurrentAccount());
        if (i9 == 19) {
            r7Var.f25115s0 = true;
        }
        r7Var.setGradientView(eu0Var.f28176y);
        if (eu0.u(eu0Var, this) != -1) {
            r7Var.W = true;
        }
        r7Var.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(r7Var);
    }
}
