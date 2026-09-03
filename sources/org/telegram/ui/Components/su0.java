package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class su0 extends cl0 {
    public final Context f31188c;
    public boolean d;
    public org.telegram.ui.Cells.q7 f31189e;
    public final yu0 f31190f;

    public su0(yu0 yu0Var, Context context) {
        this.f31190f = yu0Var;
        this.f31188c = context;
    }

    @Override
    public boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final boolean E(sl0 sl0Var) {
        int i10;
        yu0 yu0Var = this.f31190f;
        if (!yu0Var.t0()) {
            if (this != yu0Var.E && yu0.u(yu0Var, this) == -1) {
                i10 = yu0Var.f33637n1;
            } else {
                i10 = yu0Var.f33630j1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (sl0Var.getChildCount() != 0 && sl0Var.getChildAt(0).getMeasuredHeight() * ceil > sl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f31190f.f33643q1[0].f29583e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((vt0) arrayList.get(i11)).f32539b) {
                return ((vt0) arrayList.get(i11)).f32538a;
            }
        }
        return ((vt0) l.d.i(1, arrayList)).f32538a;
    }

    @Override
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        int i10;
        int measuredHeight = sl0Var.getChildAt(0).getMeasuredHeight();
        yu0 yu0Var = this.f31190f;
        int[] iArr2 = yu0Var.f33630j1;
        if (yu0.v(yu0Var, this) == -1 && this != yu0Var.F) {
            if (yu0.u(yu0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = yu0Var.f33637n1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = sl0Var.getMeasuredHeight() - sl0Var.getPaddingTop();
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
    public final float H(sl0 sl0Var) {
        int i10;
        yu0 yu0Var = this.f31190f;
        int[] iArr = yu0Var.f33630j1;
        if (this != yu0Var.F && yu0.v(yu0Var, this) == -1) {
            if (yu0.u(yu0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = yu0Var.f33637n1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (sl0Var.getChildCount() != 0) {
            int measuredHeight = sl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = sl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - sl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (sl0Var.getMeasuredHeight() - sl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f31190f.c1(0, true);
    }

    @Override
    public final void J(sl0 sl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < sl0Var.getChildCount(); i11++) {
                View childAt = sl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.r7) {
                    i10 = ((org.telegram.ui.Cells.r7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f31190f.S(0, sl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        qt0 W = this.f31190f.W(0);
        if (W != null) {
            yu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f31190f.f33643q1[0].f29590m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.su0.h():int");
    }

    @Override
    public int j(int i10) {
        nu0[] nu0VarArr = this.f31190f.f33643q1;
        if (!this.d && nu0VarArr[0].c().size() == 0) {
            nu0 nu0Var = nu0VarArr[0];
            if (!nu0Var.f29585g && nu0Var.f29589l) {
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
        return this.f31190f.f33643q1[0].e();
    }

    @Override
    public void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        char c3;
        yu0 yu0Var = this.f31190f;
        int[] iArr = yu0Var.f33630j1;
        nu0[] nu0VarArr = yu0Var.f33643q1;
        if (m1Var.f5879f == 0) {
            ArrayList c10 = nu0VarArr[0].c();
            int d = i10 - nu0VarArr[0].d();
            View view = m1Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                int messageId = r7Var.getMessageId();
                boolean z10 = true;
                if (this == yu0Var.E) {
                    i11 = iArr[0];
                } else if (yu0.u(yu0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = yu0Var.f33637n1;
                }
                if (d >= 0 && d < c10.size()) {
                    MessageObject messageObject = (MessageObject) c10.get(d);
                    if (messageObject.getId() == messageId) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (yu0Var.f33666z1) {
                        SparseArray[] sparseArrayArr = yu0Var.W0;
                        if (messageObject.getDialogId() == yu0Var.f33624g1) {
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
        yu0 yu0Var = this.f31190f;
        org.telegram.ui.ActionBar.g6 g6Var = yu0Var.C1;
        Context context = this.f31188c;
        if (i10 != 0 && i10 != 19) {
            kt0 M = yu0.M(0, yu0Var.f33624g1, context, g6Var);
            M.setLayoutParams(new f2.x0(-1, -1));
            return new f2.m1(M);
        }
        if (this.f31189e == null) {
            this.f31189e = new org.telegram.ui.Cells.q7(viewGroup.getContext(), g6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.f31189e, yu0Var.f33649s1.getCurrentAccount());
        if (i10 == 19) {
            r7Var.f23585t0 = true;
        }
        r7Var.setGradientView(yu0Var.f33662y);
        if (yu0.u(yu0Var, this) != -1) {
            r7Var.f23560a0 = true;
        }
        r7Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(r7Var);
    }
}
