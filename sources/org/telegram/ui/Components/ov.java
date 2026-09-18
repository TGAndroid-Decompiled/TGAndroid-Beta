package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ov implements Runnable {
    public final int f27056a;
    public final pv f27057b;

    public ov(pv pvVar, int i10) {
        this.f27056a = i10;
        this.f27057b = pvVar;
    }

    @Override
    public final void run() {
        switch (this.f27056a) {
            case 0:
                this.f27057b.f27329f.dismiss();
                return;
            default:
                sv svVar = this.f27057b.f27329f;
                svVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = svVar.f28232c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.wh.o(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
