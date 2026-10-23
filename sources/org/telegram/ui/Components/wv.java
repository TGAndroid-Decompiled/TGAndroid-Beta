package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f32353a;
    public final xv f32354b;

    public wv(xv xvVar, int i10) {
        this.f32353a = i10;
        this.f32354b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f32353a) {
            case 0:
                this.f32354b.f32655f.dismiss();
                return;
            default:
                aw awVar = this.f32354b.f32655f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.o2 o2Var = awVar.f24855c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.sl.q(R.string.AddEmojiNotFound, xc.a0(o2Var), null);
                    return;
                }
                return;
        }
    }
}
