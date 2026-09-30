package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class rv implements Runnable {
    public final int f28057a;
    public final sv f28058b;

    public rv(sv svVar, int i10) {
        this.f28057a = i10;
        this.f28058b = svVar;
    }

    @Override
    public final void run() {
        switch (this.f28057a) {
            case 0:
                this.f28058b.f28376f.dismiss();
                return;
            default:
                vv vvVar = this.f28058b.f28376f;
                vvVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = vvVar.f29735c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, yc.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
