package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ao0 extends s4.s0 {
    public final int f22722a;
    public final org.telegram.ui.qy f22723b;
    public final org.telegram.ui.zx f22724c;

    public ao0(org.telegram.ui.zx zxVar, org.telegram.ui.qy qyVar, int i10) {
        this.f22722a = i10;
        this.f22724c = zxVar;
        this.f22723b = qyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f22722a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f22723b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f22723b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f22723b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f22723b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.cy cyVar;
        int i12;
        wl0 wl0Var;
        switch (this.f22722a) {
            case 0:
                org.telegram.ui.zx zxVar = this.f22724c;
                zxVar.f26156o0.V();
                zxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.zx zxVar2 = this.f22724c;
                zxVar2.f26163v0.W();
                zxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.zx zxVar3 = this.f22724c;
                eo0 eo0Var = zxVar3.f26144b0;
                s4.c0 c0Var = zxVar3.f26145c0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((eo0Var.U.a() != 0 && !eo0Var.X) || !eo0Var.W) && (N0 == h - 1 || ((cyVar = eo0Var.U) != null && cyVar.a() != 0 && (i12 = eo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    eo0Var.Q();
                }
                zxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.zx zxVar4 = this.f22724c;
                go0 go0Var = zxVar4.f26152j0;
                if (go0Var.Y && !go0Var.W && !TextUtils.isEmpty(go0Var.f28900b0) && (wl0Var = go0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < wl0Var.getChildCount()) {
                            if (wl0Var.getChildAt(i13) instanceof u00) {
                                if (go0Var.Y && !go0Var.W && !TextUtils.isEmpty(go0Var.f28900b0)) {
                                    go0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                zxVar4.S(i10, i11);
                return;
        }
    }
}
