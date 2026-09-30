package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class gv0 extends hl0 {
    public final Context f24678c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final mv0 f24679f;

    public gv0(mv0 mv0Var, Context context) {
        this.f24679f = mv0Var;
        this.f24678c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(zl0 zl0Var) {
        int i10;
        mv0 mv0Var = this.f24679f;
        if (!mv0Var.t0()) {
            if (this != mv0Var.H && mv0.u(mv0Var, this) == -1) {
                i10 = mv0Var.f26437q1;
            } else {
                i10 = mv0Var.f26428m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (zl0Var.getChildCount() != 0 && zl0Var.getChildAt(0).getMeasuredHeight() * ceil > zl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f24679f.f26445t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((ku0) arrayList.get(i11)).f25827b) {
                return ((ku0) arrayList.get(i11)).f25826a;
            }
        }
        return ((ku0) hg.c.g(1, arrayList)).f25826a;
    }

    @Override
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
        mv0 mv0Var = this.f24679f;
        int[] iArr2 = mv0Var.f26428m1;
        if (mv0.v(mv0Var, this) == -1 && this != mv0Var.I) {
            if (mv0.u(mv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = mv0Var.f26437q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop();
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
    public final float H(zl0 zl0Var) {
        int i10;
        mv0 mv0Var = this.f24679f;
        int[] iArr = mv0Var.f26428m1;
        if (this != mv0Var.I && mv0.v(mv0Var, this) == -1) {
            if (mv0.u(mv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = mv0Var.f26437q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (zl0Var.getChildCount() != 0) {
            int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = zl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - zl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f24679f.c1(0, true);
    }

    @Override
    public final void J(zl0 zl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
                View childAt = zl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f24679f.S(0, zl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        fu0 W = this.f24679f.W(0);
        if (W != null) {
            mv0.q(W, null, false);
        }
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gv0.h():int");
    }

    @Override
    public int j(int i10) {
        bv0[] bv0VarArr = this.f24679f.f26445t1;
        if (!this.d && bv0VarArr[0].c().size() == 0) {
            bv0 bv0Var = bv0VarArr[0];
            if (!bv0Var.f23019g && bv0Var.f23023l) {
                return 2;
            }
        }
        bv0VarArr[0].getClass();
        bv0VarArr[0].c().size();
        bv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f24679f.f26445t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        mv0 mv0Var = this.f24679f;
        int[] iArr = mv0Var.f26428m1;
        bv0[] bv0VarArr = mv0Var.f26445t1;
        if (c1Var.f43071f == 0) {
            ArrayList c11 = bv0VarArr[0].c();
            int d = i10 - bv0VarArr[0].d();
            View view = c1Var.f43068a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == mv0Var.H) {
                    i11 = iArr[0];
                } else if (mv0.u(mv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = mv0Var.f26437q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mv0Var.C1) {
                        SparseArray[] sparseArrayArr = mv0Var.Z0;
                        if (messageObject.getDialogId() == mv0Var.f26424j1) {
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
        mv0 mv0Var = this.f24679f;
        org.telegram.ui.ActionBar.d6 d6Var = mv0Var.F1;
        Context context = this.f24678c;
        if (i10 != 0 && i10 != 19) {
            zt0 M = mv0.M(0, mv0Var.f26424j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, mv0Var.f26449v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f21261w0 = true;
        }
        t7Var.setGradientView(mv0Var.f26456y);
        if (mv0.u(mv0Var, this) != -1) {
            t7Var.f21238d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t7Var);
    }
}
