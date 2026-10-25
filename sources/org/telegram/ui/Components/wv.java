package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f34538a;
    public final xv f34539b;

    public wv(xv xvVar, int i10) {
        this.f34538a = i10;
        this.f34539b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f34538a) {
            case 0:
                this.f34539b.f34827f.dismiss();
                return;
            default:
                aw awVar = this.f34539b.f34827f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.r2 r2Var = awVar.f26624c;
                if (r2Var != null && r2Var.getParentActivity() != null) {
                    org.telegram.messenger.vh.n(R.string.AddEmojiNotFound, wc.b0(r2Var), null);
                    return;
                }
                return;
        }
    }
}
