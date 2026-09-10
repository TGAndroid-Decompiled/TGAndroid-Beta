package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class cv0 extends dl0 {
    public final Context f22230c;
    public boolean d;
    public org.telegram.ui.Cells.t7 e;
    public final iv0 f22231f;

    public cv0(iv0 iv0Var, Context context) {
        this.f22231f = iv0Var;
        this.f22230c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(vl0 vl0Var) {
        int i10;
        iv0 iv0Var = this.f22231f;
        if (!iv0Var.t0()) {
            if (this != iv0Var.H && iv0.u(iv0Var, this) == -1) {
                i10 = iv0Var.f24119q1;
            } else {
                i10 = iv0Var.f24110m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (vl0Var.getChildCount() != 0 && vl0Var.getChildAt(0).getMeasuredHeight() * ceil > vl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f22231f.f24127t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((fu0) arrayList.get(i11)).f23084b) {
                return ((fu0) arrayList.get(i11)).f23083a;
            }
        }
        return ((fu0) hc.b.i(1, arrayList)).f23083a;
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        iv0 iv0Var = this.f22231f;
        int[] iArr2 = iv0Var.f24110m1;
        if (iv0.v(iv0Var, this) == -1 && this != iv0Var.I) {
            if (iv0.u(iv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = iv0Var.f24119q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop();
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
    public final float H(vl0 vl0Var) {
        int i10;
        iv0 iv0Var = this.f22231f;
        int[] iArr = iv0Var.f24110m1;
        if (this != iv0Var.I && iv0.v(iv0Var, this) == -1) {
            if (iv0.u(iv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = iv0Var.f24119q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (vl0Var.getChildCount() != 0) {
            int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = vl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - vl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f22231f.c1(0, true);
    }

    @Override
    public final void J(vl0 vl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
                View childAt = vl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    i10 = ((org.telegram.ui.Cells.u7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f22231f.S(0, vl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        au0 W = this.f22231f.W(0);
        if (W != null) {
            iv0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f22231f.f24127t1[0].f29165m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cv0.h():int");
    }

    @Override
    public int j(int i10) {
        xu0[] xu0VarArr = this.f22231f.f24127t1;
        if (!this.d && xu0VarArr[0].c().size() == 0) {
            xu0 xu0Var = xu0VarArr[0];
            if (!xu0Var.f29160g && xu0Var.f29164l) {
                return 2;
            }
        }
        xu0VarArr[0].getClass();
        xu0VarArr[0].c().size();
        xu0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f22231f.f24127t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        iv0 iv0Var = this.f22231f;
        int[] iArr = iv0Var.f24110m1;
        xu0[] xu0VarArr = iv0Var.f24127t1;
        if (c1Var.f41613f == 0) {
            ArrayList c11 = xu0VarArr[0].c();
            int d = i10 - xu0VarArr[0].d();
            View view = c1Var.f41610a;
            if (view instanceof org.telegram.ui.Cells.u7) {
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                int messageId = u7Var.getMessageId();
                boolean z11 = true;
                if (this == iv0Var.H) {
                    i11 = iArr[0];
                } else if (iv0.u(iv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = iv0Var.f24119q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (iv0Var.C1) {
                        SparseArray[] sparseArrayArr = iv0Var.Z0;
                        if (messageObject.getDialogId() == iv0Var.f24106j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                            z11 = false;
                        }
                        u7Var.i(z11, z10);
                    } else {
                        u7Var.i(false, z10);
                    }
                    u7Var.k(messageObject, i11, false);
                    return;
                }
                u7Var.k(null, i11, false);
                u7Var.i(false, false);
            }
        }
    }

    @Override
    public s4.c1 x(ViewGroup viewGroup, int i10) {
        iv0 iv0Var = this.f22231f;
        org.telegram.ui.ActionBar.f6 f6Var = iv0Var.F1;
        Context context = this.f22230c;
        if (i10 != 0 && i10 != 19) {
            ut0 M = iv0.M(0, iv0Var.f24106j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.t7(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.e, iv0Var.f24131v1.getCurrentAccount());
        if (i10 == 19) {
            u7Var.f20522w0 = true;
        }
        u7Var.setGradientView(iv0Var.f24138y);
        if (iv0.u(iv0Var, this) != -1) {
            u7Var.f20499d0 = true;
        }
        u7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(u7Var);
    }
}
