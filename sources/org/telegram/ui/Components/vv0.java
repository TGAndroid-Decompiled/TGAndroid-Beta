package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class vv0 extends ul0 {
    public final Context f34382c;
    public boolean d;
    public org.telegram.ui.Cells.v7 e;
    public final bw0 f34383f;

    public vv0(bw0 bw0Var, Context context) {
        this.f34383f = bw0Var;
        this.f34382c = context;
    }

    @Override
    public boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final boolean E(nm0 nm0Var) {
        int i10;
        bw0 bw0Var = this.f34383f;
        if (!bw0Var.B0()) {
            if (this != bw0Var.J && bw0.w(bw0Var, this) == -1) {
                i10 = bw0Var.f26980s1;
            } else {
                i10 = bw0Var.f26969o1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (nm0Var.getChildCount() != 0 && nm0Var.getChildAt(0).getMeasuredHeight() * ceil > nm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f34383f.f26986v1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((av0) arrayList.get(i11)).f26671b) {
                return ((av0) arrayList.get(i11)).f26670a;
            }
        }
        return ((av0) ic.a.g(1, arrayList)).f26670a;
    }

    @Override
    public final void G(nm0 nm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = nm0Var.getChildAt(0).getMeasuredHeight();
        bw0 bw0Var = this.f34383f;
        int[] iArr2 = bw0Var.f26969o1;
        if (bw0.x(bw0Var, this) == -1 && this != bw0Var.K) {
            if (bw0.w(bw0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = bw0Var.f26980s1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = nm0Var.getMeasuredHeight() - nm0Var.getPaddingTop();
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
    public final float H(nm0 nm0Var) {
        int i10;
        bw0 bw0Var = this.f34383f;
        int[] iArr = bw0Var.f26969o1;
        if (this != bw0Var.K && bw0.x(bw0Var, this) == -1) {
            if (bw0.w(bw0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = bw0Var.f26980s1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (nm0Var.getChildCount() != 0) {
            int measuredHeight = nm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = nm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - nm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (nm0Var.getMeasuredHeight() - nm0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f34383f.l1(0, true);
    }

    @Override
    public final void J(nm0 nm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < nm0Var.getChildCount(); i11++) {
                View childAt = nm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.w7) {
                    i10 = ((org.telegram.ui.Cells.w7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f34383f.Z(0, nm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        uu0 d02 = this.f34383f.d0(0);
        if (d02 != null) {
            bw0.t(d02, null, false);
        }
    }

    public int L(int i10) {
        return this.f34383f.f26986v1[0].f32042m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vv0.h():int");
    }

    @Override
    public int j(int i10) {
        qv0[] qv0VarArr = this.f34383f.f26986v1;
        if (!this.d && qv0VarArr[0].c().size() == 0) {
            qv0 qv0Var = qv0VarArr[0];
            if (!qv0Var.f32037g && qv0Var.f32041l) {
                return 2;
            }
        }
        qv0VarArr[0].getClass();
        qv0VarArr[0].c().size();
        qv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f34383f.f26986v1[0].e();
    }

    @Override
    public void v(s4.e1 e1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        bw0 bw0Var = this.f34383f;
        int[] iArr = bw0Var.f26969o1;
        qv0[] qv0VarArr = bw0Var.f26986v1;
        if (e1Var.f47776f == 0) {
            ArrayList c11 = qv0VarArr[0].c();
            int d = i10 - qv0VarArr[0].d();
            View view = e1Var.f47773a;
            if (view instanceof org.telegram.ui.Cells.w7) {
                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                int messageId = w7Var.getMessageId();
                boolean z11 = true;
                if (this == bw0Var.J) {
                    i11 = iArr[0];
                } else if (bw0.w(bw0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = bw0Var.f26980s1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (bw0Var.E1) {
                        SparseArray[] sparseArrayArr = bw0Var.f26929b1;
                        if (messageObject.getDialogId() == bw0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                            z11 = false;
                        }
                        w7Var.i(z11, z10);
                    } else {
                        w7Var.i(false, z10);
                    }
                    w7Var.k(messageObject, i11, false);
                    return;
                }
                w7Var.k(null, i11, false);
                w7Var.i(false, false);
            }
        }
    }

    @Override
    public s4.e1 x(ViewGroup viewGroup, int i10) {
        bw0 bw0Var = this.f34383f;
        org.telegram.ui.ActionBar.u6 u6Var = bw0Var.H1;
        Context context = this.f34382c;
        if (i10 != 0 && i10 != 19) {
            ou0 U = bw0.U(0, bw0Var.l1, context, u6Var);
            U.setLayoutParams(new s4.q0(-1, -1));
            return new s4.e1(U);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.v7(viewGroup.getContext(), u6Var);
        }
        org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7(context, this.e, bw0Var.f26992x1.getCurrentAccount());
        if (i10 == 19) {
            w7Var.f25665w0 = true;
        }
        w7Var.setGradientView(bw0Var.f26993y);
        if (bw0.w(bw0Var, this) != -1) {
            w7Var.f25642d0 = true;
        }
        w7Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(w7Var);
    }
}
