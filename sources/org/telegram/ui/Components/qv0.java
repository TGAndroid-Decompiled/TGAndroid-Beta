package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class qv0 extends tl0 {
    public final Context f30003c;
    public boolean d;
    public org.telegram.ui.Cells.r7 e;
    public final wv0 f30004f;

    public qv0(wv0 wv0Var, Context context) {
        this.f30004f = wv0Var;
        this.f30003c = context;
    }

    @Override
    public boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final boolean E(lm0 lm0Var) {
        int i10;
        wv0 wv0Var = this.f30004f;
        if (!wv0Var.w0()) {
            if (this != wv0Var.H && wv0.v(wv0Var, this) == -1) {
                i10 = wv0Var.f32398q1;
            } else {
                i10 = wv0Var.f32389m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (lm0Var.getChildCount() != 0 && lm0Var.getChildAt(0).getMeasuredHeight() * ceil > lm0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f30004f.f32406t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((uu0) arrayList.get(i11)).f31227b) {
                return ((uu0) arrayList.get(i11)).f31226a;
            }
        }
        return ((uu0) i2.o1.i(1, arrayList)).f31226a;
    }

    @Override
    public final void G(lm0 lm0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = lm0Var.getChildAt(0).getMeasuredHeight();
        wv0 wv0Var = this.f30004f;
        int[] iArr2 = wv0Var.f32389m1;
        if (wv0.p(wv0Var, this) == -1 && this != wv0Var.I) {
            if (wv0.v(wv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = wv0Var.f32398q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = lm0Var.getMeasuredHeight() - lm0Var.getPaddingTop();
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
    public final float H(lm0 lm0Var) {
        int i10;
        wv0 wv0Var = this.f30004f;
        int[] iArr = wv0Var.f32389m1;
        if (this != wv0Var.I && wv0.p(wv0Var, this) == -1) {
            if (wv0.v(wv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = wv0Var.f32398q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (lm0Var.getChildCount() != 0) {
            int measuredHeight = lm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = lm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - lm0Var.getPaddingTop())) / ((ceil * measuredHeight) - (lm0Var.getMeasuredHeight() - lm0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f30004f.f1(0, true);
    }

    @Override
    public final void J(lm0 lm0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < lm0Var.getChildCount(); i11++) {
                View childAt = lm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    i10 = ((org.telegram.ui.Cells.s7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f30004f.T(0, lm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        pu0 X = this.f30004f.X(0);
        if (X != null) {
            wv0.r(X, null, false);
        }
    }

    public int L(int i10) {
        return this.f30004f.f32406t1[0].f28448m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qv0.h():int");
    }

    @Override
    public int j(int i10) {
        lv0[] lv0VarArr = this.f30004f.f32406t1;
        if (!this.d && lv0VarArr[0].c().size() == 0) {
            lv0 lv0Var = lv0VarArr[0];
            if (!lv0Var.f28443g && lv0Var.f28447l) {
                return 2;
            }
        }
        lv0VarArr[0].getClass();
        lv0VarArr[0].c().size();
        lv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f30004f.f32406t1[0].e();
    }

    @Override
    public void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        wv0 wv0Var = this.f30004f;
        int[] iArr = wv0Var.f32389m1;
        lv0[] lv0VarArr = wv0Var.f32406t1;
        if (b1Var.f46345f == 0) {
            ArrayList c11 = lv0VarArr[0].c();
            int d = i10 - lv0VarArr[0].d();
            View view = b1Var.f46342a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                int messageId = s7Var.getMessageId();
                boolean z11 = true;
                if (this == wv0Var.H) {
                    i11 = iArr[0];
                } else if (wv0.v(wv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = wv0Var.f32398q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (wv0Var.C1) {
                        SparseArray[] sparseArrayArr = wv0Var.Z0;
                        if (messageObject.getDialogId() == wv0Var.f32385j1) {
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
        wv0 wv0Var = this.f30004f;
        org.telegram.ui.ActionBar.g6 g6Var = wv0Var.F1;
        Context context = this.f30003c;
        if (i10 != 0 && i10 != 19) {
            ju0 N = wv0.N(0, wv0Var.f32385j1, context, g6Var);
            N.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(N);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.r7(viewGroup.getContext(), g6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.e, wv0Var.f32410v1.getCurrentAccount());
        if (i10 == 19) {
            s7Var.f23289w0 = true;
        }
        s7Var.setGradientView(wv0Var.f32417y);
        if (wv0.v(wv0Var, this) != -1) {
            s7Var.f23266d0 = true;
        }
        s7Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(s7Var);
    }
}
