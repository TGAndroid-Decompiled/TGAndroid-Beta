package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class sv implements Runnable {
    public final int f27220a;
    public final tv f27221b;

    public sv(tv tvVar, int i10) {
        this.f27220a = i10;
        this.f27221b = tvVar;
    }

    @Override
    public final void run() {
        switch (this.f27220a) {
            case 0:
                this.f27221b.f27498f.dismiss();
                return;
            default:
                wv wvVar = this.f27221b.f27498f;
                wvVar.dismiss();
                org.telegram.ui.ActionBar.p2 p2Var = wvVar.f28842c;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    org.telegram.messenger.a2.p(R.string.AddEmojiNotFound, wc.a0(p2Var), null);
                    return;
                }
                return;
        }
    }
}
