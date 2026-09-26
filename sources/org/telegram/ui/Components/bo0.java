package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bo0 extends s4.s0 {
    public final int f23073a;
    public final org.telegram.ui.qy f23074b;
    public final org.telegram.ui.zx f23075c;

    public bo0(org.telegram.ui.zx zxVar, org.telegram.ui.qy qyVar, int i10) {
        this.f23073a = i10;
        this.f23075c = zxVar;
        this.f23074b = qyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f23073a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23074b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23074b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23074b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23074b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.cy cyVar;
        int i12;
        xl0 xl0Var;
        switch (this.f23073a) {
            case 0:
                org.telegram.ui.zx zxVar = this.f23075c;
                zxVar.f26475o0.V();
                zxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.zx zxVar2 = this.f23075c;
                zxVar2.f26482v0.W();
                zxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.zx zxVar3 = this.f23075c;
                fo0 fo0Var = zxVar3.f26463b0;
                s4.c0 c0Var = zxVar3.f26464c0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((fo0Var.U.a() != 0 && !fo0Var.X) || !fo0Var.W) && (N0 == h - 1 || ((cyVar = fo0Var.U) != null && cyVar.a() != 0 && (i12 = fo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    fo0Var.Q();
                }
                zxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.zx zxVar4 = this.f23075c;
                ho0 ho0Var = zxVar4.f26471j0;
                if (ho0Var.Y && !ho0Var.W && !TextUtils.isEmpty(ho0Var.f29754b0) && (xl0Var = ho0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < xl0Var.getChildCount()) {
                            if (xl0Var.getChildAt(i13) instanceof v00) {
                                if (ho0Var.Y && !ho0Var.W && !TextUtils.isEmpty(ho0Var.f29754b0)) {
                                    ho0Var.V(true);
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
