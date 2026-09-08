package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class ru0 extends tk0 {
    public final Context f30117c;
    public boolean d;
    public org.telegram.ui.Cells.s7 f30118e;
    public final xu0 f30119f;

    public ru0(xu0 xu0Var, Context context) {
        this.f30119f = xu0Var;
        this.f30117c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(ll0 ll0Var) {
        int i10;
        xu0 xu0Var = this.f30119f;
        if (!xu0Var.t0()) {
            if (this != xu0Var.H && xu0.u(xu0Var, this) == -1) {
                i10 = xu0Var.f32741q1;
            } else {
                i10 = xu0Var.f32732m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (ll0Var.getChildCount() != 0 && ll0Var.getChildAt(0).getMeasuredHeight() * ceil > ll0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f30119f.f32749t1[0].f28546e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((vt0) arrayList.get(i11)).f32006b) {
                return ((vt0) arrayList.get(i11)).f32005a;
            }
        }
        return ((vt0) i2.g.h(1, arrayList)).f32005a;
    }

    @Override
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        xu0 xu0Var = this.f30119f;
        int[] iArr2 = xu0Var.f32732m1;
        if (xu0.v(xu0Var, this) == -1 && this != xu0Var.I) {
            if (xu0.u(xu0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = xu0Var.f32741q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = ll0Var.getMeasuredHeight() - ll0Var.getPaddingTop();
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
    public final float H(ll0 ll0Var) {
        int i10;
        xu0 xu0Var = this.f30119f;
        int[] iArr = xu0Var.f32732m1;
        if (this != xu0Var.I && xu0.v(xu0Var, this) == -1) {
            if (xu0.u(xu0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = xu0Var.f32741q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (ll0Var.getChildCount() != 0) {
            int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
            View childAt = ll0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - ll0Var.getPaddingTop())) / ((ceil * measuredHeight) - (ll0Var.getMeasuredHeight() - ll0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f30119f.c1(0, true);
    }

    @Override
    public final void J(ll0 ll0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
                View childAt = ll0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f30119f.S(0, ll0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        qt0 W = this.f30119f.W(0);
        if (W != null) {
            xu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f30119f.f32749t1[0].f28553m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ru0.h():int");
    }

    @Override
    public int j(int i10) {
        mu0[] mu0VarArr = this.f30119f.f32749t1;
        if (!this.d && mu0VarArr[0].c().size() == 0) {
            mu0 mu0Var = mu0VarArr[0];
            if (!mu0Var.f28548g && mu0Var.f28552l) {
                return 2;
            }
        }
        mu0VarArr[0].getClass();
        mu0VarArr[0].c().size();
        mu0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f30119f.f32749t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        xu0 xu0Var = this.f30119f;
        int[] iArr = xu0Var.f32732m1;
        mu0[] mu0VarArr = xu0Var.f32749t1;
        if (c1Var.f45770f == 0) {
            ArrayList c11 = mu0VarArr[0].c();
            int d = i10 - mu0VarArr[0].d();
            View view = c1Var.f45766a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == xu0Var.H) {
                    i11 = iArr[0];
                } else if (xu0.u(xu0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = xu0Var.f32741q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (xu0Var.C1) {
                        SparseArray[] sparseArrayArr = xu0Var.Z0;
                        if (messageObject.getDialogId() == xu0Var.f32728j1) {
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
        xu0 xu0Var = this.f30119f;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.f30117c;
        if (i10 != 0 && i10 != 19) {
            kt0 M = xu0.M(0, xu0Var.f32728j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.f30118e == null) {
            this.f30118e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f30118e, xu0Var.f32753v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f23315w0 = true;
        }
        t7Var.setGradientView(xu0Var.f32760y);
        if (xu0.u(xu0Var, this) != -1) {
            t7Var.f23291d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t7Var);
    }
}
