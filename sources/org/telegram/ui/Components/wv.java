package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wv implements Runnable {
    public final int f32256a;
    public final xv f32257b;

    public wv(xv xvVar, int i10) {
        this.f32256a = i10;
        this.f32257b = xvVar;
    }

    @Override
    public final void run() {
        switch (this.f32256a) {
            case 0:
                this.f32257b.f32492f.dismiss();
                return;
            default:
                aw awVar = this.f32257b.f32492f;
                awVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = awVar.f24729c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.q(R.string.AddEmojiNotFound, xc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
