package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f32218a;
    public final xv f32219b;

    public wv(xv xvVar, int i10) {
        this.f32218a = i10;
        this.f32219b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f32218a) {
            case 0:
                this.f32219b.f32463f.dismiss();
                return;
            default:
                aw awVar = this.f32219b.f32463f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = awVar.f24715c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.lk.q(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
