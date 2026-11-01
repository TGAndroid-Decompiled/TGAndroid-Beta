package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class wm0 extends s4.s0 {
    public final int f32283a;
    public final org.telegram.ui.zx f32284b;
    public final org.telegram.ui.jx f32285c;

    public wm0(org.telegram.ui.jx jxVar, org.telegram.ui.zx zxVar, int i10) {
        this.f32283a = i10;
        this.f32285c = jxVar;
        this.f32284b = zxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f32283a) {
            case 0:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.f32284b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.f32284b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.f32284b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.f32284b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.lx lxVar;
        int i12;
        uk0 uk0Var;
        switch (this.f32283a) {
            case 0:
                org.telegram.ui.jx jxVar = this.f32285c;
                jxVar.f26884q0.W();
                jxVar.T();
                return;
            case 1:
                org.telegram.ui.jx jxVar2 = this.f32285c;
                jxVar2.f26891x0.X();
                jxVar2.T();
                return;
            case 2:
                org.telegram.ui.jx jxVar3 = this.f32285c;
                an0 an0Var = jxVar3.f26872d0;
                s4.a0 a0Var = jxVar3.f26873e0;
                int L0 = a0Var.L0();
                int N0 = a0Var.N0();
                int abs = Math.abs(a0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((an0Var.U.a() != 0 && !an0Var.X) || !an0Var.W) && (N0 == b10 - 1 || ((lxVar = an0Var.U) != null && lxVar.a() != 0 && (i12 = an0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    an0Var.P();
                }
                jxVar3.T();
                return;
            default:
                org.telegram.ui.jx jxVar4 = this.f32285c;
                cn0 cn0Var = jxVar4.f26880l0;
                if (cn0Var.f27161a0 && !cn0Var.Y && !TextUtils.isEmpty(cn0Var.f27164d0) && (uk0Var = cn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < uk0Var.getChildCount()) {
                            if (uk0Var.getChildAt(i13) instanceof zz) {
                                if (cn0Var.f27161a0 && !cn0Var.Y && !TextUtils.isEmpty(cn0Var.f27164d0)) {
                                    cn0Var.W(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                jxVar4.T();
                return;
        }
    }
}
