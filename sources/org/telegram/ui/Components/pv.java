package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class pv implements Runnable {
    public final int f27450a;
    public final qv f27451b;

    public pv(qv qvVar, int i10) {
        this.f27450a = i10;
        this.f27451b = qvVar;
    }

    @Override
    public final void run() {
        switch (this.f27450a) {
            case 0:
                this.f27451b.f27672f.dismiss();
                return;
            default:
                tv tvVar = this.f27451b.f27672f;
                tvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = tvVar.f28451c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.rk.p(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
