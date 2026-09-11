package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class nv implements Runnable {
    public final int f28879a;
    public final ov f28880b;

    public nv(ov ovVar, int i10) {
        this.f28879a = i10;
        this.f28880b = ovVar;
    }

    @Override
    public final void run() {
        switch (this.f28879a) {
            case 0:
                this.f28880b.f29194f.dismiss();
                return;
            default:
                rv rvVar = this.f28880b.f29194f;
                rvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = rvVar.f30094c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.w1.p(R.string.AddEmojiNotFound, yc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
