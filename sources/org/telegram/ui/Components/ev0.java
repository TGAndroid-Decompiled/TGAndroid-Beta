package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public class ev0 extends el0 {
    public final Context f23973c;
    public boolean d;
    public org.telegram.ui.Cells.s7 e;
    public final kv0 f23974f;

    public ev0(kv0 kv0Var, Context context) {
        this.f23974f = kv0Var;
        this.f23973c = context;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(wl0 wl0Var) {
        int i10;
        kv0 kv0Var = this.f23974f;
        if (!kv0Var.t0()) {
            if (this != kv0Var.H && kv0.u(kv0Var, this) == -1) {
                i10 = kv0Var.f25836q1;
            } else {
                i10 = kv0Var.f25827m1[0];
            }
            int ceil = (int) Math.ceil(k() / i10);
            if (wl0Var.getChildCount() != 0 && wl0Var.getChildAt(0).getMeasuredHeight() * ceil > wl0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i10) {
        ArrayList arrayList = this.f23974f.f25844t1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((iu0) arrayList.get(i11)).f25044b) {
                return ((iu0) arrayList.get(i11)).f25043a;
            }
        }
        return ((iu0) hg.k0.g(1, arrayList)).f25043a;
    }

    @Override
    public final void G(wl0 wl0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = wl0Var.getChildAt(0).getMeasuredHeight();
        kv0 kv0Var = this.f23974f;
        int[] iArr2 = kv0Var.f25827m1;
        if (kv0.v(kv0Var, this) == -1 && this != kv0Var.I) {
            if (kv0.u(kv0Var, this) != -1) {
                i10 = iArr2[1];
            } else {
                i10 = iArr2[0];
            }
        } else {
            i10 = kv0Var.f25836q1;
        }
        int ceil = (int) (Math.ceil(k() / i10) * measuredHeight);
        int measuredHeight2 = wl0Var.getMeasuredHeight() - wl0Var.getPaddingTop();
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
    public final float H(wl0 wl0Var) {
        int i10;
        kv0 kv0Var = this.f23974f;
        int[] iArr = kv0Var.f25827m1;
        if (this != kv0Var.I && kv0.v(kv0Var, this) == -1) {
            if (kv0.u(kv0Var, this) != -1) {
                i10 = iArr[1];
            } else {
                i10 = iArr[0];
            }
        } else {
            i10 = kv0Var.f25836q1;
        }
        int ceil = (int) Math.ceil(k() / i10);
        if (wl0Var.getChildCount() != 0) {
            int measuredHeight = wl0Var.getChildAt(0).getMeasuredHeight();
            View childAt = wl0Var.getChildAt(0);
            int S = RecyclerView.S(childAt);
            if (S < 0) {
                return 0.0f;
            }
            return (((S / i10) * measuredHeight) - (childAt.getTop() - wl0Var.getPaddingTop())) / ((ceil * measuredHeight) - (wl0Var.getMeasuredHeight() - wl0Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f23974f.c1(0, true);
    }

    @Override
    public final void J(wl0 wl0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < wl0Var.getChildCount(); i11++) {
                View childAt = wl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    i10 = ((org.telegram.ui.Cells.t7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f23974f.S(0, wl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        du0 W = this.f23974f.W(0);
        if (W != null) {
            kv0.q(W, null, false);
        }
    }

    public int L(int i10) {
        return this.f23974f.f25844t1[0].f30886m + i10;
    }

    @Override
    public int h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ev0.h():int");
    }

    @Override
    public int j(int i10) {
        zu0[] zu0VarArr = this.f23974f.f25844t1;
        if (!this.d && zu0VarArr[0].c().size() == 0) {
            zu0 zu0Var = zu0VarArr[0];
            if (!zu0Var.f30881g && zu0Var.f30885l) {
                return 2;
            }
        }
        zu0VarArr[0].getClass();
        zu0VarArr[0].c().size();
        zu0VarArr[0].getClass();
        return 0;
    }

    @Override
    public int k() {
        return this.f23974f.f25844t1[0].e();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        char c10;
        kv0 kv0Var = this.f23974f;
        int[] iArr = kv0Var.f25827m1;
        zu0[] zu0VarArr = kv0Var.f25844t1;
        if (c1Var.f42932f == 0) {
            ArrayList c11 = zu0VarArr[0].c();
            int d = i10 - zu0VarArr[0].d();
            View view = c1Var.f42929a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                int messageId = t7Var.getMessageId();
                boolean z11 = true;
                if (this == kv0Var.H) {
                    i11 = iArr[0];
                } else if (kv0.u(kv0Var, this) != -1) {
                    i11 = iArr[1];
                } else {
                    i11 = kv0Var.f25836q1;
                }
                if (d >= 0 && d < c11.size()) {
                    MessageObject messageObject = (MessageObject) c11.get(d);
                    if (messageObject.getId() == messageId) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (kv0Var.C1) {
                        SparseArray[] sparseArrayArr = kv0Var.Z0;
                        if (messageObject.getDialogId() == kv0Var.f25823j1) {
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
        kv0 kv0Var = this.f23974f;
        org.telegram.ui.ActionBar.e6 e6Var = kv0Var.F1;
        Context context = this.f23973c;
        if (i10 != 0 && i10 != 19) {
            xt0 M = kv0.M(0, kv0Var.f25823j1, context, e6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        if (this.e == null) {
            this.e = new org.telegram.ui.Cells.s7(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.e, kv0Var.f25848v1.getCurrentAccount());
        if (i10 == 19) {
            t7Var.f21203w0 = true;
        }
        t7Var.setGradientView(kv0Var.f25855y);
        if (kv0.u(kv0Var, this) != -1) {
            t7Var.f21180d0 = true;
        }
        t7Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t7Var);
    }
}
