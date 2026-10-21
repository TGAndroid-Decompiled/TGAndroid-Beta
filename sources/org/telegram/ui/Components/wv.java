package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f32253a;
    public final xv f32254b;

    public wv(xv xvVar, int i10) {
        this.f32253a = i10;
        this.f32254b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f32253a) {
            case 0:
                this.f32254b.f32489f.dismiss();
                return;
            default:
                aw awVar = this.f32254b.f32489f;
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
