package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ov implements Runnable {
    public final int f26899a;
    public final pv f26900b;

    public ov(pv pvVar, int i10) {
        this.f26899a = i10;
        this.f26900b = pvVar;
    }

    @Override
    public final void run() {
        switch (this.f26899a) {
            case 0:
                this.f26900b.f27155f.dismiss();
                return;
            default:
                sv svVar = this.f26900b.f27155f;
                svVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = svVar.f27975c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.w1.p(R.string.AddEmojiNotFound, vc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
