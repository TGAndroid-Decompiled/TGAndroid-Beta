package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ga0 extends v4.t0 {
    public final int f47967a;
    public final qa0 f47968b;

    public ga0(qa0 qa0Var, int i7) {
        this.f47967a = i7;
        this.f47968b = qa0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        switch (this.f47967a) {
            case 0:
                if (i7 == 1) {
                    qa0 qa0Var = this.f47968b;
                    if (qa0Var.f51114u0 && qa0Var.f51115v0) {
                        org.telegram.messenger.g0.v1(qa0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qa0 qa0Var2 = this.f47968b;
                qa0Var2.N = z10;
                if (!z10 && qa0Var2.I != null) {
                    qa0Var2.I = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f47967a) {
            case 1:
                qa0 qa0Var = this.f47968b;
                qa0Var.N0(false);
                if (qa0Var.I != null) {
                    qa0Var.K += i10;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
