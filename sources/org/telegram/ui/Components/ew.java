package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ew implements Runnable {
    public final int f26172a;
    public final fw f26173b;

    public ew(fw fwVar, int i10) {
        this.f26172a = i10;
        this.f26173b = fwVar;
    }

    @Override
    public final void run() {
        switch (this.f26172a) {
            case 0:
                this.f26173b.f26498f.dismiss();
                return;
            default:
                iw iwVar = this.f26173b.f26498f;
                iwVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = iwVar.f27496c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.bi.q(R.string.AddEmojiNotFound, ad.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
