package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f32227a;
    public final xv f32228b;

    public wv(xv xvVar, int i10) {
        this.f32227a = i10;
        this.f32228b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f32227a) {
            case 0:
                this.f32228b.f32466f.dismiss();
                return;
            default:
                aw awVar = this.f32228b.f32466f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = awVar.f24727c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.kk.q(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
