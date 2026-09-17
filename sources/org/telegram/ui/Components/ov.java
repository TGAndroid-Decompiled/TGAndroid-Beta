package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ov implements Runnable {
    public final int f26869a;
    public final pv f26870b;

    public ov(pv pvVar, int i10) {
        this.f26869a = i10;
        this.f26870b = pvVar;
    }

    @Override
    public final void run() {
        switch (this.f26869a) {
            case 0:
                this.f26870b.f27147f.dismiss();
                return;
            default:
                sv svVar = this.f26870b.f27147f;
                svVar.dismiss();
                org.telegram.ui.ActionBar.o2 o2Var = svVar.f27929c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.w1.p(R.string.AddEmojiNotFound, vc.a0(o2Var), null);
                    return;
                }
                return;
        }
    }
}
