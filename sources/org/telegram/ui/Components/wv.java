package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f32252a;
    public final xv f32253b;

    public wv(xv xvVar, int i10) {
        this.f32252a = i10;
        this.f32253b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f32252a) {
            case 0:
                this.f32253b.f32488f.dismiss();
                return;
            default:
                aw awVar = this.f32253b.f32488f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = awVar.f24726c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.mk.q(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
