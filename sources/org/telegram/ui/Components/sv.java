package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class sv implements Runnable {
    public final int f30951a;
    public final tv f30952b;

    public sv(tv tvVar, int i10) {
        this.f30951a = i10;
        this.f30952b = tvVar;
    }

    @Override
    public final void run() {
        switch (this.f30951a) {
            case 0:
                this.f30952b.f31246f.dismiss();
                return;
            default:
                wv wvVar = this.f30952b.f31246f;
                wvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = wvVar.f32711c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.bi.o(R.string.AddEmojiNotFound, yc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
