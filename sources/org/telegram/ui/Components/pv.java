package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class pv implements Runnable {
    public final int f27436a;
    public final qv f27437b;

    public pv(qv qvVar, int i10) {
        this.f27436a = i10;
        this.f27437b = qvVar;
    }

    @Override
    public final void run() {
        switch (this.f27436a) {
            case 0:
                this.f27437b.f27774f.dismiss();
                return;
            default:
                tv tvVar = this.f27437b.f27774f;
                tvVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = tvVar.f28625c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, xc.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
