package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class nv implements Runnable {
    public final int f28906a;
    public final ov f28907b;

    public nv(ov ovVar, int i10) {
        this.f28906a = i10;
        this.f28907b = ovVar;
    }

    @Override
    public final void run() {
        switch (this.f28906a) {
            case 0:
                this.f28907b.f29221f.dismiss();
                return;
            default:
                rv rvVar = this.f28907b.f29221f;
                rvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = rvVar.f30121c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.w1.p(R.string.AddEmojiNotFound, yc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
