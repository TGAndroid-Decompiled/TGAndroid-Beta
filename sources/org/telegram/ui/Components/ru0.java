package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class ru0 extends tk0 {
    public final Context f30090c;
    public boolean d;
    public org.telegram.ui.Cells.s7 f30091e;
    public final xu0 f30092f;

    public ru0(xu0 xu0Var, Context context) {
        this.f30092f = xu0Var;
        this.f30090c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(ll0 ll0Var) {
        int i10;
        xu0 xu0Var = this.f30092f;
        if (!xu0Var.t0()) {
            if (this != xu0Var.H && xu0.u(xu0Var, this) == -1) {
                i10 = xu0Var.f32714q1;
            } else {
                i10 = xu0Var.f32705m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (ll0Var.getChildCount() != 0 && ll0Var.getChildAt(0).getMeasuredHeight() * ceil > ll0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f30092f.f32722t1[0].f28519e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((vt0) arrayList.get(i11)).f31979b) {
                return ((vt0) arrayList.get(i11)).f31978a;
            }
        }
        return ((vt0) i2.g.h(1, arrayList)).f31978a;
    }

    @Override
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        xu0 xu0Var = this.f30092f;
        int[] iArr2 = xu0Var.f32705m1;
        if (xu0.v(xu0Var, this) == -1 && this != xu0Var.I) {
            if (xu0.u(xu0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = xu0Var.f32714q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = ll0Var.getMeasuredHeight() - ll0Var.getPaddingTop();
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
    public final float H(ll0 ll0Var) {
        int i10;
        xu0 xu0Var = this.f30092f;
        int[] iArr = xu0Var.f32705m1;
        if (this != xu0Var.I && xu0.v(xu0Var, this) == -1) {
            if (xu0.u(xu0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = xu0Var.f32714q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (ll0Var.getChildCount() != 0) {
            int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
            View childAt = ll0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i10) * measuredHeight) - (childAt.getTop() - ll0Var.getPaddingTop())) / ((ceil * measuredHeight) - (ll0Var.getMeasuredHeight() - ll0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f30092f.c1(0, true);
    }

    @Override
    public final void J(ll0 ll0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
                View childAt = ll0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f30092f.S(0, ll0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        qt0 W = this.f30092f.W(0);
        if (W != null) {
            xu0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f30092f.f32722t1[0].f28526m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ru0.h():int");
    }

    @Override
    public int j(int i10) {
        mu0[] mu0VarArr = this.f30092f.f32722t1;
        if (!this.d && mu0VarArr[0].c().size() == 0) {
            mu0 mu0Var = mu0VarArr[0];
            if (!mu0Var.f28521g && mu0Var.f28525l) {
                return 2;
            }
        }
        mu0VarArr[0].getClass();
        mu0VarArr[0].c().size();
        mu0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f30092f.f32722t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        xu0 xu0Var = this.f30092f;
        int[] iArr = xu0Var.f32705m1;
        mu0[] mu0VarArr = xu0Var.f32722t1;
        if (c1Var.f45742f == 0) {
            ArrayList c11 = mu0VarArr[0].c();
            int d = i10 - mu0VarArr[0].d();
            View view = c1Var.f45738a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == xu0Var.H) {
                    i11 = iArr[0];
                } else if (xu0.u(xu0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = xu0Var.f32714q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (xu0Var.C1) {
                        SparseArray[] sparseArrayArr = xu0Var.Z0;
                        if (messageObject.getDialogId() == xu0Var.f32701j1) {
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
        xu0 xu0Var = this.f30092f;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.f30090c;
        if (i10 != 0 && i10 != 19) {
            kt0 M = xu0.M(0, xu0Var.f32701j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.f30091e == null) {
            this.f30091e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f30091e, xu0Var.f32726v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f23288w0 = true;
        }
        t7Var.setGradientView(xu0Var.f32733y);
        if (xu0.u(xu0Var, this) != -1) {
            t7Var.f23264d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t7Var);
    }
}
