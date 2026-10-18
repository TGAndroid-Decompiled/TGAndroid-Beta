package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f32220a;
    public final xv f32221b;

    public wv(xv xvVar, int i10) {
        this.f32220a = i10;
        this.f32221b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f32220a) {
            case 0:
                this.f32221b.f32459f.dismiss();
                return;
            default:
                aw awVar = this.f32221b.f32459f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = awVar.f24720c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.lk.q(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
