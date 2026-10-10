package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class fw implements Runnable {
    public final int f26528a;
    public final gw f26529b;

    public fw(gw gwVar, int i10) {
        this.f26528a = i10;
        this.f26529b = gwVar;
    }

    @Override
    public final void run() {
        switch (this.f26528a) {
            case 0:
                this.f26529b.f26857f.dismiss();
                return;
            default:
                jw jwVar = this.f26529b.f26857f;
                jwVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = jwVar.f27799c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.bi.q(R.string.AddEmojiNotFound, ad.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
