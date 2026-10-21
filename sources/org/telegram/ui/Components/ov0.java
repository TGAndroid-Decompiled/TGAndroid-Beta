package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class ov0 extends rl0 {
    public final Context f29147c;
    public boolean d;
    public org.telegram.ui.Cells.r7 e;
    public final uv0 f29148f;

    public ov0(uv0 uv0Var, Context context) {
        this.f29148f = uv0Var;
        this.f29147c = context;
    }

    @Override
    public boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final boolean E(jm0 jm0Var) {
        int i10;
        uv0 uv0Var = this.f29148f;
        if (!uv0Var.v0()) {
            if (this != uv0Var.H && uv0.v(uv0Var, this) == -1) {
                i10 = uv0Var.f31059q1;
            } else {
                i10 = uv0Var.f31050m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (jm0Var.getChildCount() != 0 && jm0Var.getChildAt(0).getMeasuredHeight() * ceil > jm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f29148f.f31067t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((su0) arrayList.get(i11)).f30361b) {
                return ((su0) arrayList.get(i11)).f30360a;
            }
        }
        return ((su0) i2.e.h(1, arrayList)).f30360a;
    }

    @Override
    public final void G(jm0 jm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = jm0Var.getChildAt(0).getMeasuredHeight();
        uv0 uv0Var = this.f29148f;
        int[] iArr2 = uv0Var.f31050m1;
        if (uv0.p(uv0Var, this) == -1 && this != uv0Var.I) {
            if (uv0.v(uv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = uv0Var.f31059q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = jm0Var.getMeasuredHeight() - jm0Var.getPaddingTop();
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
    public final float H(jm0 jm0Var) {
        int i10;
        uv0 uv0Var = this.f29148f;
        int[] iArr = uv0Var.f31050m1;
        if (this != uv0Var.I && uv0.p(uv0Var, this) == -1) {
            if (uv0.v(uv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = uv0Var.f31059q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (jm0Var.getChildCount() != 0) {
            int measuredHeight = jm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = jm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - jm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (jm0Var.getMeasuredHeight() - jm0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f29148f.e1(0, true);
    }

    @Override
    public final void J(jm0 jm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < jm0Var.getChildCount(); i11++) {
                View childAt = jm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    i10 = ((org.telegram.ui.Cells.s7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f29148f.S(0, jm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        nu0 W = this.f29148f.W(0);
        if (W != null) {
            uv0.r(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f29148f.f31067t1[0].f27650m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ov0.h():int");
    }

    @Override
    public int j(int i10) {
        jv0[] jv0VarArr = this.f29148f.f31067t1;
        if (!this.d && jv0VarArr[0].c().size() == 0) {
            jv0 jv0Var = jv0VarArr[0];
            if (!jv0Var.f27645g && jv0Var.f27649l) {
                return 2;
            }
        }
        jv0VarArr[0].getClass();
        jv0VarArr[0].c().size();
        jv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f29148f.f31067t1[0].e();
    }

    @Override
    public void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        uv0 uv0Var = this.f29148f;
        int[] iArr = uv0Var.f31050m1;
        jv0[] jv0VarArr = uv0Var.f31067t1;
        if (b1Var.f45920f == 0) {
            ArrayList c11 = jv0VarArr[0].c();
            int d = i10 - jv0VarArr[0].d();
            View view = b1Var.f45917a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                int messageId = s7Var.getMessageId();
                boolean z11 = true;
                if (this == uv0Var.H) {
                    i11 = iArr[0];
                } else if (uv0.v(uv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = uv0Var.f31059q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (uv0Var.C1) {
                        SparseArray[] sparseArrayArr = uv0Var.Z0;
                        if (messageObject.getDialogId() == uv0Var.f31046j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                            z11 = false;
                        }
                        s7Var.i(z11, z10);
                    } else {
                        s7Var.i(false, z10);
                    }
                    s7Var.k(messageObject, i11, false);
                    return;
                }
                s7Var.k(null, i11, false);
                s7Var.i(false, false);
            }
        }
    }

    @Override
    public s4.b1 x(ViewGroup viewGroup, int i10) {
        uv0 uv0Var = this.f29148f;
        org.telegram.ui.ActionBar.d6 d6Var = uv0Var.F1;
        Context context = this.f29147c;
        if (i10 != 0 && i10 != 19) {
            hu0 M = uv0.M(0, uv0Var.f31046j1, context, d6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.r7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.e, uv0Var.f31071v1.getCurrentAccount());
        if (i10 == 19) {
            s7Var.f23052w0 = true;
        }
        s7Var.setGradientView(uv0Var.f31078y);
        if (uv0.v(uv0Var, this) != -1) {
            s7Var.f23029d0 = true;
        }
        s7Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(s7Var);
    }
}
