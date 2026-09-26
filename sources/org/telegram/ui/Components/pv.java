package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class pv implements Runnable {
    public final int f27435a;
    public final qv f27436b;

    public pv(qv qvVar, int i10) {
        this.f27435a = i10;
        this.f27436b = qvVar;
    }

    @Override
    public final void run() {
        switch (this.f27435a) {
            case 0:
                this.f27436b.f27773f.dismiss();
                return;
            default:
                tv tvVar = this.f27436b.f27773f;
                tvVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = tvVar.f28624c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, xc.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
