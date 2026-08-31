package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class tu0 extends dl0 {
    public final Context f31461c;
    public boolean d;
    public org.telegram.ui.Cells.q7 f31462e;
    public final zu0 f31463f;

    public tu0(zu0 zu0Var, Context context) {
        this.f31463f = zu0Var;
        this.f31461c = context;
    }

    @Override
    public boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final boolean E(tl0 tl0Var) {
        int i10;
        zu0 zu0Var = this.f31463f;
        if (!zu0Var.t0()) {
            if (this != zu0Var.E && zu0.u(zu0Var, this) == -1) {
                i10 = zu0Var.f33992n1;
            } else {
                i10 = zu0Var.f33985j1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (tl0Var.getChildCount() != 0 && tl0Var.getChildAt(0).getMeasuredHeight() * ceil > tl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f31463f.f33998q1[0].f29854e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((wt0) arrayList.get(i11)).f32847b) {
                return ((wt0) arrayList.get(i11)).f32846a;
            }
        }
        return ((wt0) l.d.i(1, arrayList)).f32846a;
    }

    @Override
    public final void G(tl0 tl0Var, float f10, int[] iArr) {
        int i10;
        int measuredHeight = tl0Var.getChildAt(0).getMeasuredHeight();
        zu0 zu0Var = this.f31463f;
        int[] iArr2 = zu0Var.f33985j1;
        if (zu0.v(zu0Var, this) == -1 && this != zu0Var.F) {
            if (zu0.u(zu0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = zu0Var.f33992n1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = tl0Var.getMeasuredHeight() - tl0Var.getPaddingTop();
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
    public final float H(tl0 tl0Var) {
        int i10;
        zu0 zu0Var = this.f31463f;
        int[] iArr = zu0Var.f33985j1;
        if (this != zu0Var.F && zu0.v(zu0Var, this) == -1) {
            if (zu0.u(zu0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = zu0Var.f33992n1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (tl0Var.getChildCount() != 0) {
            int measuredHeight = tl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = tl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - tl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (tl0Var.getMeasuredHeight() - tl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f31463f.c1(0, true);
    }

    @Override
    public final void J(tl0 tl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < tl0Var.getChildCount(); i11++) {
                View childAt = tl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.r7) {
                    i10 = ((org.telegram.ui.Cells.r7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f31463f.S(0, tl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        rt0 W = this.f31463f.W(0);
        if (W != null) {
            zu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f31463f.f33998q1[0].f29861m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tu0.h():int");
    }

    @Override
    public int j(int i10) {
        ou0[] ou0VarArr = this.f31463f.f33998q1;
        if (!this.d && ou0VarArr[0].c().size() == 0) {
            ou0 ou0Var = ou0VarArr[0];
            if (!ou0Var.f29856g && ou0Var.f29860l) {
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
        return this.f31463f.f33998q1[0].e();
    }

    @Override
    public void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        char c3;
        zu0 zu0Var = this.f31463f;
        int[] iArr = zu0Var.f33985j1;
        ou0[] ou0VarArr = zu0Var.f33998q1;
        if (m1Var.f5879f == 0) {
            ArrayList c10 = ou0VarArr[0].c();
            int d = i10 - ou0VarArr[0].d();
            View view = m1Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                int messageId = r7Var.getMessageId();
                boolean z10 = true;
                if (this == zu0Var.E) {
                    i11 = iArr[0];
                } else if (zu0.u(zu0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = zu0Var.f33992n1;
                }
                if (d >= 0 && d < c10.size()) {
                    MessageObject messageObject = (MessageObject) c10.get(d);
                    if (messageObject.getId() == messageId) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (zu0Var.f34021z1) {
                        SparseArray[] sparseArrayArr = zu0Var.W0;
                        if (messageObject.getDialogId() == zu0Var.f33979g1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) < 0) {
                            z10 = false;
                        }
                        r7Var.i(z10, z4);
                    } else {
                        r7Var.i(false, z4);
                    }
                    r7Var.k(messageObject, i11, false);
                    return;
                }
                r7Var.k(null, i11, false);
                r7Var.i(false, false);
            }
        }
    }

    @Override
    public f2.m1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.f31463f;
        org.telegram.ui.ActionBar.g6 g6Var = zu0Var.C1;
        Context context = this.f31461c;
        if (i10 != 0 && i10 != 19) {
            lt0 M = zu0.M(0, zu0Var.f33979g1, context, g6Var);
            M.setLayoutParams(new f2.x0(-1, -1));
            return new f2.m1(M);
        }
        if (this.f31462e == null) {
            this.f31462e = new org.telegram.ui.Cells.q7(viewGroup.getContext(), g6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.f31462e, zu0Var.f34004s1.getCurrentAccount());
        if (i10 == 19) {
            r7Var.f23583t0 = true;
        }
        r7Var.setGradientView(zu0Var.f34017y);
        if (zu0.u(zu0Var, this) != -1) {
            r7Var.f23558a0 = true;
        }
        r7Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(r7Var);
    }
}
