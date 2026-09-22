package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ov implements Runnable {
    public final int f26896a;
    public final pv f26897b;

    public ov(pv pvVar, int i10) {
        this.f26896a = i10;
        this.f26897b = pvVar;
    }

    @Override
    public final void run() {
        switch (this.f26896a) {
            case 0:
                this.f26897b.f27152f.dismiss();
                return;
            default:
                sv svVar = this.f26897b.f27152f;
                svVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = svVar.f27972c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.y0.p(R.string.AddEmojiNotFound, vc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
