package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class jv0 extends gl0 {
    public final Context f27899c;
    public boolean d;
    public org.telegram.ui.Cells.s7 f27900e;
    public final pv0 f27901f;

    public jv0(pv0 pv0Var, Context context) {
        this.f27901f = pv0Var;
        this.f27899c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(zl0 zl0Var) {
        int i10;
        pv0 pv0Var = this.f27901f;
        if (!pv0Var.t0()) {
            if (this != pv0Var.H && pv0.u(pv0Var, this) == -1) {
                i10 = pv0Var.f29788q1;
            } else {
                i10 = pv0Var.f29779m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (zl0Var.getChildCount() != 0 && zl0Var.getChildAt(0).getMeasuredHeight() * ceil > zl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f27901f.f29796t1[0].f26141e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((nu0) arrayList.get(i11)).f29064b) {
                return ((nu0) arrayList.get(i11)).f29063a;
            }
        }
        return ((nu0) hg.k0.g(1, arrayList)).f29063a;
    }

    @Override
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
        pv0 pv0Var = this.f27901f;
        int[] iArr2 = pv0Var.f29779m1;
        if (pv0.v(pv0Var, this) == -1 && this != pv0Var.I) {
            if (pv0.u(pv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = pv0Var.f29788q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop();
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
    public final float H(zl0 zl0Var) {
        int i10;
        pv0 pv0Var = this.f27901f;
        int[] iArr = pv0Var.f29779m1;
        if (this != pv0Var.I && pv0.v(pv0Var, this) == -1) {
            if (pv0.u(pv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = pv0Var.f29788q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (zl0Var.getChildCount() != 0) {
            int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = zl0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - zl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f27901f.c1(0, true);
    }

    @Override
    public final void J(zl0 zl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
                View childAt = zl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f27901f.S(0, zl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        iu0 W = this.f27901f.W(0);
        if (W != null) {
            pv0.q(W, null, false);
        }
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jv0.h():int");
    }

    @Override
    public int j(int i10) {
        ev0[] ev0VarArr = this.f27901f.f29796t1;
        if (!this.d && ev0VarArr[0].c().size() == 0) {
            ev0 ev0Var = ev0VarArr[0];
            if (!ev0Var.f26143g && ev0Var.f26147l) {
                return 2;
            }
        }
        ev0VarArr[0].getClass();
        ev0VarArr[0].c().size();
        ev0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f27901f.f29796t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        pv0 pv0Var = this.f27901f;
        int[] iArr = pv0Var.f29779m1;
        ev0[] ev0VarArr = pv0Var.f29796t1;
        if (c1Var.f46527f == 0) {
            ArrayList c11 = ev0VarArr[0].c();
            int d = i10 - ev0VarArr[0].d();
            View view = c1Var.f46523a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == pv0Var.H) {
                    i11 = iArr[0];
                } else if (pv0.u(pv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = pv0Var.f29788q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (pv0Var.C1) {
                        SparseArray[] sparseArrayArr = pv0Var.Z0;
                        if (messageObject.getDialogId() == pv0Var.f29775j1) {
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
        pv0 pv0Var = this.f27901f;
        org.telegram.ui.ActionBar.d6 d6Var = pv0Var.F1;
        Context context = this.f27899c;
        if (i10 != 0 && i10 != 19) {
            cu0 M = pv0.M(0, pv0Var.f29775j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.f27900e == null) {
            this.f27900e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f27900e, pv0Var.f29800v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f23097w0 = true;
        }
        t7Var.setGradientView(pv0Var.f29807y);
        if (pv0.u(pv0Var, this) != -1) {
            t7Var.f23073d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t7Var);
    }
}
