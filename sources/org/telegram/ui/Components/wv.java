package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f34541a;
    public final xv f34542b;

    public wv(xv xvVar, int i10) {
        this.f34541a = i10;
        this.f34542b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f34541a) {
            case 0:
                this.f34542b.f34830f.dismiss();
                return;
            default:
                aw awVar = this.f34542b.f34830f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.r2 r2Var = awVar.f26626c;
                if (r2Var != null && r2Var.getParentActivity() != null) {
                    org.telegram.messenger.vh.n(R.string.AddEmojiNotFound, wc.b0(r2Var), null);
                    return;
                }
                return;
        }
    }
}
