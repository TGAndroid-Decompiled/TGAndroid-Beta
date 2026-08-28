package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class wm0 extends f2.d1 {
    public final int f34293a;
    public final org.telegram.ui.dy f34294b;
    public final org.telegram.ui.mx f34295c;

    public wm0(org.telegram.ui.mx mxVar, org.telegram.ui.dy dyVar, int i9) {
        this.f34293a = i9;
        this.f34295c = mxVar;
        this.f34294b = dyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        switch (this.f34293a) {
            case 0:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(this.f34294b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(this.f34294b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(this.f34294b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(this.f34294b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        org.telegram.ui.ox oxVar;
        int i11;
        wk0 wk0Var;
        switch (this.f34293a) {
            case 0:
                org.telegram.ui.mx mxVar = this.f34295c;
                mxVar.f29145k0.V();
                mxVar.S(i9, i10);
                return;
            case 1:
                org.telegram.ui.mx mxVar2 = this.f34295c;
                mxVar2.f29151r0.W();
                mxVar2.S(i9, i10);
                return;
            case 2:
                org.telegram.ui.mx mxVar3 = this.f34295c;
                an0 an0Var = mxVar3.U;
                f2.m0 m0Var = mxVar3.V;
                int L0 = m0Var.L0();
                int N0 = m0Var.N0();
                int abs = Math.abs(m0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((an0Var.Q.a() != 0 && !an0Var.T) || !an0Var.S) && (N0 == h - 1 || ((oxVar = an0Var.Q) != null && oxVar.a() != 0 && (i11 = an0Var.U) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    an0Var.Q();
                }
                mxVar3.S(i9, i10);
                return;
            default:
                org.telegram.ui.mx mxVar4 = this.f34295c;
                cn0 cn0Var = mxVar4.f29140f0;
                if (cn0Var.U && !cn0Var.S && !TextUtils.isEmpty(cn0Var.X) && (wk0Var = cn0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < wk0Var.getChildCount()) {
                            if (wk0Var.getChildAt(i12) instanceof e00) {
                                if (cn0Var.U && !cn0Var.S && !TextUtils.isEmpty(cn0Var.X)) {
                                    cn0Var.V(true);
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                mxVar4.S(i9, i10);
                return;
        }
    }
}
