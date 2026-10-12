package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class bw0 extends em0 {
    public final Context f24761c;
    public boolean d;
    public org.telegram.ui.Cells.s7 f24762e;
    public final hw0 f24763f;

    public bw0(hw0 hw0Var, Context context) {
        this.f24763f = hw0Var;
        this.f24761c = context;
    }

    @Override
    public boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final boolean E(wm0 wm0Var) {
        int i10;
        hw0 hw0Var = this.f24763f;
        if (!hw0Var.t0()) {
            if (this != hw0Var.H && hw0.u(hw0Var, this) == -1) {
                i10 = hw0Var.f26945q1;
            } else {
                i10 = hw0Var.f26936m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (wm0Var.getChildCount() != 0 && wm0Var.getChildAt(0).getMeasuredHeight() * ceil > wm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f24763f.f26953t1[0].f32555e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((fv0) arrayList.get(i11)).f26177b) {
                return ((fv0) arrayList.get(i11)).f26176a;
            }
        }
        return ((fv0) hg.c.h(1, arrayList)).f26176a;
    }

    @Override
    public final void G(wm0 wm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = wm0Var.getChildAt(0).getMeasuredHeight();
        hw0 hw0Var = this.f24763f;
        int[] iArr2 = hw0Var.f26936m1;
        if (hw0.v(hw0Var, this) == -1 && this != hw0Var.I) {
            if (hw0.u(hw0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = hw0Var.f26945q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = wm0Var.getMeasuredHeight() - wm0Var.getPaddingTop();
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
    public final float H(wm0 wm0Var) {
        int i10;
        hw0 hw0Var = this.f24763f;
        int[] iArr = hw0Var.f26936m1;
        if (this != hw0Var.I && hw0.v(hw0Var, this) == -1) {
            if (hw0.u(hw0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = hw0Var.f26945q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (wm0Var.getChildCount() != 0) {
            int measuredHeight = wm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = wm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - wm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (wm0Var.getMeasuredHeight() - wm0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f24763f.c1(0, true);
    }

    @Override
    public final void J(wm0 wm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < wm0Var.getChildCount(); i11++) {
                View childAt = wm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f24763f.S(0, wm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        av0 W = this.f24763f.W(0);
        if (W != null) {
            hw0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f24763f.f26953t1[0].f32562m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.h():int");
    }

    @Override
    public int j(int i10) {
        wv0[] wv0VarArr = this.f24763f.f26953t1;
        if (!this.d && wv0VarArr[0].c().size() == 0) {
            wv0 wv0Var = wv0VarArr[0];
            if (!wv0Var.f32557g && wv0Var.f32561l) {
                return 2;
            }
        }
        wv0VarArr[0].getClass();
        wv0VarArr[0].c().size();
        wv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f24763f.f26953t1[0].e();
    }

    @Override
    public void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        hw0 hw0Var = this.f24763f;
        int[] iArr = hw0Var.f26936m1;
        wv0[] wv0VarArr = hw0Var.f26953t1;
        if (d1Var.f47901f == 0) {
            ArrayList c11 = wv0VarArr[0].c();
            int d = i10 - wv0VarArr[0].d();
            View view = d1Var.f47897a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == hw0Var.H) {
                    i11 = iArr[0];
                } else if (hw0.u(hw0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = hw0Var.f26945q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (hw0Var.C1) {
                        SparseArray[] sparseArrayArr = hw0Var.Z0;
                        if (messageObject.getDialogId() == hw0Var.f26932j1) {
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
    public s4.d1 x(ViewGroup viewGroup, int i10) {
        hw0 hw0Var = this.f24763f;
        org.telegram.ui.ActionBar.c6 c6Var = hw0Var.F1;
        Context context = this.f24761c;
        if (i10 != 0 && i10 != 19) {
            uu0 M = hw0.M(0, hw0Var.f26932j1, context, c6Var);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new s4.d1(M);
        }
        if (this.f24762e == null) {
            this.f24762e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), c6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f24762e, hw0Var.f26957v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f22864w0 = true;
        }
        t7Var.setGradientView(hw0Var.f26964y);
        if (hw0.u(hw0Var, this) != -1) {
            t7Var.f22840d0 = true;
        }
        t7Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(t7Var);
    }
}
