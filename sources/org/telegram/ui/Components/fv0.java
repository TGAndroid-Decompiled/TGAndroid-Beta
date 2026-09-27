package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class fv0 extends gl0 {
    public final Context f24388c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final lv0 f24389f;

    public fv0(lv0 lv0Var, Context context) {
        this.f24389f = lv0Var;
        this.f24388c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(yl0 yl0Var) {
        int i10;
        lv0 lv0Var = this.f24389f;
        if (!lv0Var.t0()) {
            if (this != lv0Var.H && lv0.u(lv0Var, this) == -1) {
                i10 = lv0Var.f26200q1;
            } else {
                i10 = lv0Var.f26191m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (yl0Var.getChildCount() != 0 && yl0Var.getChildAt(0).getMeasuredHeight() * ceil > yl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f24389f.f26208t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((ju0) arrayList.get(i11)).f25546b) {
                return ((ju0) arrayList.get(i11)).f25545a;
            }
        }
        return ((ju0) hg.k0.g(1, arrayList)).f25545a;
    }

    @Override
    public final void G(yl0 yl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = yl0Var.getChildAt(0).getMeasuredHeight();
        lv0 lv0Var = this.f24389f;
        int[] iArr2 = lv0Var.f26191m1;
        if (lv0.v(lv0Var, this) == -1 && this != lv0Var.I) {
            if (lv0.u(lv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = lv0Var.f26200q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = yl0Var.getMeasuredHeight() - yl0Var.getPaddingTop();
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
    public final float H(yl0 yl0Var) {
        int i10;
        lv0 lv0Var = this.f24389f;
        int[] iArr = lv0Var.f26191m1;
        if (this != lv0Var.I && lv0.v(lv0Var, this) == -1) {
            if (lv0.u(lv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = lv0Var.f26200q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (yl0Var.getChildCount() != 0) {
            int measuredHeight = yl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = yl0Var.getChildAt(0);
            int S = RecyclerView.S(childAt);
            if (S < 0) {
                return 0.0f;
            }
            return (((S / i10) * measuredHeight) - (childAt.getTop() - yl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (yl0Var.getMeasuredHeight() - yl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f24389f.c1(0, true);
    }

    @Override
    public final void J(yl0 yl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < yl0Var.getChildCount(); i11++) {
                View childAt = yl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f24389f.S(0, yl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        eu0 W = this.f24389f.W(0);
        if (W != null) {
            lv0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f24389f.f26208t1[0].f22776m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fv0.h():int");
    }

    @Override
    public int j(int i10) {
        av0[] av0VarArr = this.f24389f.f26208t1;
        if (!this.d && av0VarArr[0].c().size() == 0) {
            av0 av0Var = av0VarArr[0];
            if (!av0Var.f22771g && av0Var.f22775l) {
                return 2;
            }
        }
        av0VarArr[0].getClass();
        av0VarArr[0].c().size();
        av0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f24389f.f26208t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        lv0 lv0Var = this.f24389f;
        int[] iArr = lv0Var.f26191m1;
        av0[] av0VarArr = lv0Var.f26208t1;
        if (c1Var.f43008f == 0) {
            ArrayList c11 = av0VarArr[0].c();
            int d = i10 - av0VarArr[0].d();
            View view = c1Var.f43005a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == lv0Var.H) {
                    i11 = iArr[0];
                } else if (lv0.u(lv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = lv0Var.f26200q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (lv0Var.C1) {
                        SparseArray[] sparseArrayArr = lv0Var.Z0;
                        if (messageObject.getDialogId() == lv0Var.f26187j1) {
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
        lv0 lv0Var = this.f24389f;
        org.telegram.ui.ActionBar.e6 e6Var = lv0Var.F1;
        Context context = this.f24388c;
        if (i10 != 0 && i10 != 19) {
            yt0 M = lv0.M(0, lv0Var.f26187j1, context, e6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, lv0Var.f26212v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f21241w0 = true;
        }
        t7Var.setGradientView(lv0Var.f26219y);
        if (lv0.u(lv0Var, this) != -1) {
            t7Var.f21218d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t7Var);
    }
}
