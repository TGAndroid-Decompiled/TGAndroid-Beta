package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f32257a;
    public final xv f32258b;

    public wv(xv xvVar, int i10) {
        this.f32257a = i10;
        this.f32258b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f32257a) {
            case 0:
                this.f32258b.f32493f.dismiss();
                return;
            default:
                aw awVar = this.f32258b.f32493f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = awVar.f24730c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.nk.q(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
