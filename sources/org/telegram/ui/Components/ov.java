package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ov implements Runnable {
    public final int f26872a;
    public final pv f26873b;

    public ov(pv pvVar, int i10) {
        this.f26872a = i10;
        this.f26873b = pvVar;
    }

    @Override
    public final void run() {
        switch (this.f26872a) {
            case 0:
                this.f26873b.f27150f.dismiss();
                return;
            default:
                sv svVar = this.f26873b.f27150f;
                svVar.dismiss();
                org.telegram.ui.ActionBar.o2 o2Var = svVar.f27932c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.w1.p(R.string.AddEmojiNotFound, vc.a0(o2Var), null);
                    return;
                }
                return;
        }
    }
}
