package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f32216a;
    public final xv f32217b;

    public wv(xv xvVar, int i10) {
        this.f32216a = i10;
        this.f32217b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f32216a) {
            case 0:
                this.f32217b.f32461f.dismiss();
                return;
            default:
                aw awVar = this.f32217b.f32461f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = awVar.f24713c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.kk.q(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
