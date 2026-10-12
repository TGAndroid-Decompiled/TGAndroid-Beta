package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class rv0 extends ul0 {
    public final Context f28951c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final xv0 f28952f;

    public rv0(xv0 xv0Var, Context context) {
        this.f28952f = xv0Var;
        this.f28951c = context;
    }

    @Override
    public boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final boolean E(mm0 mm0Var) {
        int i10;
        xv0 xv0Var = this.f28952f;
        if (!xv0Var.t0()) {
            if (this != xv0Var.H && xv0.u(xv0Var, this) == -1) {
                i10 = xv0Var.f31376q1;
            } else {
                i10 = xv0Var.f31367m1[0];
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
        ArrayList arrayList = this.f28952f.f31384t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((vu0) arrayList.get(i11)).f30660b) {
                return ((vu0) arrayList.get(i11)).f30659a;
            }
        }
        return ((vu0) i2.d.g(1, arrayList)).f30659a;
    }

    @Override
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        xv0 xv0Var = this.f28952f;
        int[] iArr2 = xv0Var.f31367m1;
        if (xv0.v(xv0Var, this) == -1 && this != xv0Var.I) {
            if (xv0.u(xv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = xv0Var.f31376q1;
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
        xv0 xv0Var = this.f28952f;
        int[] iArr = xv0Var.f31367m1;
        if (this != xv0Var.I && xv0.v(xv0Var, this) == -1) {
            if (xv0.u(xv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = xv0Var.f31376q1;
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
        this.f28952f.c1(0, true);
    }

    @Override
    public final void J(mm0 mm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                View childAt = mm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f28952f.S(0, mm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        qu0 W = this.f28952f.W(0);
        if (W != null) {
            xv0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f28952f.f31384t1[0].f27517m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rv0.h():int");
    }

    @Override
    public int j(int i10) {
        mv0[] mv0VarArr = this.f28952f.f31384t1;
        if (!this.d && mv0VarArr[0].c().size() == 0) {
            mv0 mv0Var = mv0VarArr[0];
            if (!mv0Var.f27512g && mv0Var.f27516l) {
                return 2;
            }
        }
        mv0VarArr[0].getClass();
        mv0VarArr[0].c().size();
        mv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f28952f.f31384t1[0].e();
    }

    @Override
    public void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        xv0 xv0Var = this.f28952f;
        int[] iArr = xv0Var.f31367m1;
        mv0[] mv0VarArr = xv0Var.f31384t1;
        if (b1Var.f44841f == 0) {
            ArrayList c11 = mv0VarArr[0].c();
            int d = i10 - mv0VarArr[0].d();
            View view = b1Var.f44838a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == xv0Var.H) {
                    i11 = iArr[0];
                } else if (xv0.u(xv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = xv0Var.f31376q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (xv0Var.C1) {
                        SparseArray[] sparseArrayArr = xv0Var.Z0;
                        if (messageObject.getDialogId() == xv0Var.f31363j1) {
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
    public s4.b1 x(ViewGroup viewGroup, int i10) {
        xv0 xv0Var = this.f28952f;
        org.telegram.ui.ActionBar.c6 c6Var = xv0Var.F1;
        Context context = this.f28951c;
        if (i10 != 0 && i10 != 19) {
            ku0 M = xv0.M(0, xv0Var.f31363j1, context, c6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), c6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, xv0Var.f31388v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f22126w0 = true;
        }
        t7Var.setGradientView(xv0Var.f31395y);
        if (xv0.u(xv0Var, this) != -1) {
            t7Var.f22103d0 = true;
        }
        t7Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(t7Var);
    }
}
