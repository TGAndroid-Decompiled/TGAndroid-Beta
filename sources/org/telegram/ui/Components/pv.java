package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class pv implements Runnable {
    public final int f27138a;
    public final qv f27139b;

    public pv(qv qvVar, int i10) {
        this.f27138a = i10;
        this.f27139b = qvVar;
    }

    @Override
    public final void run() {
        switch (this.f27138a) {
            case 0:
                this.f27139b.f27466f.dismiss();
                return;
            default:
                tv tvVar = this.f27139b.f27466f;
                tvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = tvVar.f28305c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.z0.p(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
