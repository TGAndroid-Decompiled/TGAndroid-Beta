package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class qv implements Runnable {
    public final int f27837a;
    public final rv f27838b;

    public qv(rv rvVar, int i10) {
        this.f27837a = i10;
        this.f27838b = rvVar;
    }

    @Override
    public final void run() {
        switch (this.f27837a) {
            case 0:
                this.f27838b.f28098f.dismiss();
                return;
            default:
                uv uvVar = this.f27838b.f28098f;
                uvVar.dismiss();
                org.telegram.ui.ActionBar.o2 o2Var = uvVar.f28944c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.qk.p(R.string.AddEmojiNotFound, xc.a0(o2Var), null);
                    return;
                }
                return;
        }
    }
}
