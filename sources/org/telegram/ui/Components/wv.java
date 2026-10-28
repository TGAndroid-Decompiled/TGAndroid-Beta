package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f34577a;
    public final xv f34578b;

    public wv(xv xvVar, int i10) {
        this.f34577a = i10;
        this.f34578b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f34577a) {
            case 0:
                this.f34578b.f34858f.dismiss();
                return;
            default:
                aw awVar = this.f34578b.f34858f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.r2 r2Var = awVar.f26674c;
                if (r2Var != null && r2Var.getParentActivity() != null) {
                    org.telegram.messenger.wh.n(R.string.AddEmojiNotFound, wc.b0(r2Var), null);
                    return;
                }
                return;
        }
    }
}
