package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class su0 extends tk0 {
    public final Context f27972c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final yu0 f27973f;

    public su0(yu0 yu0Var, Context context) {
        this.f27973f = yu0Var;
        this.f27972c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(ll0 ll0Var) {
        int i10;
        yu0 yu0Var = this.f27973f;
        if (!yu0Var.t0()) {
            if (this != yu0Var.H && yu0.u(yu0Var, this) == -1) {
                i10 = yu0Var.f30380q1;
            } else {
                i10 = yu0Var.f30371m1[0];
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
        ArrayList arrayList = this.f27973f.f30388t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((wt0) arrayList.get(i11)).f29783b) {
                return ((wt0) arrayList.get(i11)).f29782a;
            }
        }
        return ((wt0) hg.k0.h(1, arrayList)).f29782a;
    }

    @Override
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        yu0 yu0Var = this.f27973f;
        int[] iArr2 = yu0Var.f30371m1;
        if (yu0.v(yu0Var, this) == -1 && this != yu0Var.I) {
            if (yu0.u(yu0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = yu0Var.f30380q1;
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
        yu0 yu0Var = this.f27973f;
        int[] iArr = yu0Var.f30371m1;
        if (this != yu0Var.I && yu0.v(yu0Var, this) == -1) {
            if (yu0.u(yu0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = yu0Var.f30380q1;
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
        this.f27973f.c1(0, true);
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
                this.f27973f.S(0, ll0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        rt0 W = this.f27973f.W(0);
        if (W != null) {
            yu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f27973f.f30388t1[0].f26585m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.su0.h():int");
    }

    @Override
    public int j(int i10) {
        nu0[] nu0VarArr = this.f27973f.f30388t1;
        if (!this.d && nu0VarArr[0].c().size() == 0) {
            nu0 nu0Var = nu0VarArr[0];
            if (!nu0Var.f26580g && nu0Var.f26584l) {
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
        return this.f27973f.f30388t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        yu0 yu0Var = this.f27973f;
        int[] iArr = yu0Var.f30371m1;
        nu0[] nu0VarArr = yu0Var.f30388t1;
        if (c1Var.f42678f == 0) {
            ArrayList c11 = nu0VarArr[0].c();
            int d = i10 - nu0VarArr[0].d();
            View view = c1Var.f42675a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == yu0Var.H) {
                    i11 = iArr[0];
                } else if (yu0.u(yu0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = yu0Var.f30380q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (yu0Var.C1) {
                        SparseArray[] sparseArrayArr = yu0Var.Z0;
                        if (messageObject.getDialogId() == yu0Var.f30367j1) {
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
        yu0 yu0Var = this.f27973f;
        org.telegram.ui.ActionBar.e6 e6Var = yu0Var.F1;
        Context context = this.f27972c;
        if (i10 != 0 && i10 != 19) {
            lt0 M = yu0.M(0, yu0Var.f30367j1, context, e6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, yu0Var.f30392v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f21400w0 = true;
        }
        t7Var.setGradientView(yu0Var.f30399y);
        if (yu0.u(yu0Var, this) != -1) {
            t7Var.f21377d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t7Var);
    }
}
