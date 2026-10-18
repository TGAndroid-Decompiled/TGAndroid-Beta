package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class mv0 extends ql0 {
    public final Context f28594c;
    public boolean d;
    public org.telegram.ui.Cells.r7 e;
    public final sv0 f28595f;

    public mv0(sv0 sv0Var, Context context) {
        this.f28595f = sv0Var;
        this.f28594c = context;
    }

    @Override
    public boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final boolean E(im0 im0Var) {
        int i10;
        sv0 sv0Var = this.f28595f;
        if (!sv0Var.v0()) {
            if (this != sv0Var.H && sv0.v(sv0Var, this) == -1) {
                i10 = sv0Var.f30376q1;
            } else {
                i10 = sv0Var.f30367m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (im0Var.getChildCount() != 0 && im0Var.getChildAt(0).getMeasuredHeight() * ceil > im0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f28595f.f30384t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((qu0) arrayList.get(i11)).f29753b) {
                return ((qu0) arrayList.get(i11)).f29752a;
            }
        }
        return ((qu0) i2.d.h(1, arrayList)).f29752a;
    }

    @Override
    public final void G(im0 im0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = im0Var.getChildAt(0).getMeasuredHeight();
        sv0 sv0Var = this.f28595f;
        int[] iArr2 = sv0Var.f30367m1;
        if (sv0.p(sv0Var, this) == -1 && this != sv0Var.I) {
            if (sv0.v(sv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = sv0Var.f30376q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = im0Var.getMeasuredHeight() - im0Var.getPaddingTop();
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
    public final float H(im0 im0Var) {
        int i10;
        sv0 sv0Var = this.f28595f;
        int[] iArr = sv0Var.f30367m1;
        if (this != sv0Var.I && sv0.p(sv0Var, this) == -1) {
            if (sv0.v(sv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = sv0Var.f30376q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (im0Var.getChildCount() != 0) {
            int measuredHeight = im0Var.getChildAt(0).getMeasuredHeight();
            View childAt = im0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - im0Var.getPaddingTop())) / ((ceil * measuredHeight) - (im0Var.getMeasuredHeight() - im0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f28595f.e1(0, true);
    }

    @Override
    public final void J(im0 im0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < im0Var.getChildCount(); i11++) {
                View childAt = im0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    i10 = ((org.telegram.ui.Cells.s7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f28595f.S(0, im0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        lu0 W = this.f28595f.W(0);
        if (W != null) {
            sv0.r(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f28595f.f30384t1[0].f26951m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.h():int");
    }

    @Override
    public int j(int i10) {
        hv0[] hv0VarArr = this.f28595f.f30384t1;
        if (!this.d && hv0VarArr[0].c().size() == 0) {
            hv0 hv0Var = hv0VarArr[0];
            if (!hv0Var.f26946g && hv0Var.f26950l) {
                return 2;
            }
        }
        hv0VarArr[0].getClass();
        hv0VarArr[0].c().size();
        hv0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f28595f.f30384t1[0].e();
    }

    @Override
    public void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        sv0 sv0Var = this.f28595f;
        int[] iArr = sv0Var.f30367m1;
        hv0[] hv0VarArr = sv0Var.f30384t1;
        if (b1Var.f45913f == 0) {
            ArrayList c11 = hv0VarArr[0].c();
            int d = i10 - hv0VarArr[0].d();
            View view = b1Var.f45910a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                int messageId = s7Var.getMessageId();
                boolean z11 = true;
                if (this == sv0Var.H) {
                    i11 = iArr[0];
                } else if (sv0.v(sv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = sv0Var.f30376q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (sv0Var.C1) {
                        SparseArray[] sparseArrayArr = sv0Var.Z0;
                        if (messageObject.getDialogId() == sv0Var.f30363j1) {
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
        sv0 sv0Var = this.f28595f;
        org.telegram.ui.ActionBar.d6 d6Var = sv0Var.F1;
        Context context = this.f28594c;
        if (i10 != 0 && i10 != 19) {
            fu0 M = sv0.M(0, sv0Var.f30363j1, context, d6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.r7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.e, sv0Var.f30388v1.getCurrentAccount());
        if (i10 == 19) {
            s7Var.f23048w0 = true;
        }
        s7Var.setGradientView(sv0Var.f30395y);
        if (sv0.v(sv0Var, this) != -1) {
            s7Var.f23025d0 = true;
        }
        s7Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(s7Var);
    }
}
