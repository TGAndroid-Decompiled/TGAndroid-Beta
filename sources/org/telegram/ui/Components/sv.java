package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class sv implements Runnable {
    public final int f30885a;
    public final tv f30886b;

    public sv(tv tvVar, int i10) {
        this.f30885a = i10;
        this.f30886b = tvVar;
    }

    @Override
    public final void run() {
        switch (this.f30885a) {
            case 0:
                this.f30886b.f31180f.dismiss();
                return;
            default:
                wv wvVar = this.f30886b.f31180f;
                wvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = wvVar.f32636c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.bi.o(R.string.AddEmojiNotFound, yc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
