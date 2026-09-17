package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class nv implements Runnable {
    public final int f28880a;
    public final ov f28881b;

    public nv(ov ovVar, int i10) {
        this.f28880a = i10;
        this.f28881b = ovVar;
    }

    @Override
    public final void run() {
        switch (this.f28880a) {
            case 0:
                this.f28881b.f29195f.dismiss();
                return;
            default:
                rv rvVar = this.f28881b.f29195f;
                rvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = rvVar.f30095c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.w1.p(R.string.AddEmojiNotFound, yc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
