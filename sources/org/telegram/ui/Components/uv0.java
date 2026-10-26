package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class uv0 extends tl0 {
    public final Context f33500c;
    public boolean d;
    public org.telegram.ui.Cells.v7 e;
    public final aw0 f33501f;

    public uv0(aw0 aw0Var, Context context) {
        this.f33501f = aw0Var;
        this.f33500c = context;
    }

    @Override
    public boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final boolean E(mm0 mm0Var) {
        int i10;
        aw0 aw0Var = this.f33501f;
        if (!aw0Var.B0()) {
            if (this != aw0Var.J && aw0.w(aw0Var, this) == -1) {
                i10 = aw0Var.f26692s1;
            } else {
                i10 = aw0Var.f26681o1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (mm0Var.getChildCount() != 0 && mm0Var.getChildAt(0).getMeasuredHeight() * ceil > mm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f33501f.f26698v1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((zu0) arrayList.get(i11)).f35410b) {
                return ((zu0) arrayList.get(i11)).f35409a;
            }
        }
        return ((zu0) ic.a.g(1, arrayList)).f35409a;
    }

    @Override
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        aw0 aw0Var = this.f33501f;
        int[] iArr2 = aw0Var.f26681o1;
        if (aw0.x(aw0Var, this) == -1 && this != aw0Var.K) {
            if (aw0.w(aw0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = aw0Var.f26692s1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = mm0Var.getMeasuredHeight() - mm0Var.getPaddingTop();
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
    public final float H(mm0 mm0Var) {
        int i10;
        aw0 aw0Var = this.f33501f;
        int[] iArr = aw0Var.f26681o1;
        if (this != aw0Var.K && aw0.x(aw0Var, this) == -1) {
            if (aw0.w(aw0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = aw0Var.f26692s1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (mm0Var.getChildCount() != 0) {
            int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = mm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - mm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (mm0Var.getMeasuredHeight() - mm0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f33501f.l1(0, true);
    }

    @Override
    public final void J(mm0 mm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                View childAt = mm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.w7) {
                    i10 = ((org.telegram.ui.Cells.w7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f33501f.Z(0, mm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        tu0 d02 = this.f33501f.d0(0);
        if (d02 != null) {
            aw0.t(d02, null, false);
        }
    }

    public int L(int i10) {
        return this.f33501f.f26698v1[0].f31715m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uv0.h():int");
    }

    @Override
    public int j(int i10) {
        pv0[] pv0VarArr = this.f33501f.f26698v1;
        if (!this.d && pv0VarArr[0].c().size() == 0) {
            pv0 pv0Var = pv0VarArr[0];
            if (!pv0Var.f31710g && pv0Var.f31714l) {
                return 2;
            }
        }
        pv0VarArr[0].getClass();
        pv0VarArr[0].c().size();
        pv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f33501f.f26698v1[0].e();
    }

    @Override
    public void v(s4.e1 e1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        aw0 aw0Var = this.f33501f;
        int[] iArr = aw0Var.f26681o1;
        pv0[] pv0VarArr = aw0Var.f26698v1;
        if (e1Var.f47741f == 0) {
            ArrayList c11 = pv0VarArr[0].c();
            int d = i10 - pv0VarArr[0].d();
            View view = e1Var.f47738a;
            if (view instanceof org.telegram.ui.Cells.w7) {
                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                int messageId = w7Var.getMessageId();
                boolean z11 = true;
                if (this == aw0Var.J) {
                    i11 = iArr[0];
                } else if (aw0.w(aw0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = aw0Var.f26692s1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (aw0Var.E1) {
                        SparseArray[] sparseArrayArr = aw0Var.f26641b1;
                        if (messageObject.getDialogId() == aw0Var.l1) {
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
        aw0 aw0Var = this.f33501f;
        org.telegram.ui.ActionBar.u6 u6Var = aw0Var.H1;
        Context context = this.f33500c;
        if (i10 != 0 && i10 != 19) {
            nu0 U = aw0.U(0, aw0Var.l1, context, u6Var);
            U.setLayoutParams(new s4.q0(-1, -1));
            return new s4.e1(U);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.v7(viewGroup.getContext(), u6Var);
        }
        org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7(context, this.e, aw0Var.f26704x1.getCurrentAccount());
        if (i10 == 19) {
            w7Var.f25663w0 = true;
        }
        w7Var.setGradientView(aw0Var.f26705y);
        if (aw0.w(aw0Var, this) != -1) {
            w7Var.f25640d0 = true;
        }
        w7Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(w7Var);
    }
}
