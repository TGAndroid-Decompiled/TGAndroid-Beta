package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class aw implements Runnable {
    public final int f23630a;
    public final bw f23631b;

    public aw(bw bwVar, int i10) {
        this.f23630a = i10;
        this.f23631b = bwVar;
    }

    @Override
    public final void run() {
        switch (this.f23630a) {
            case 0:
                this.f23631b.f23865f.dismiss();
                return;
            default:
                ew ewVar = this.f23631b.f23865f;
                ewVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = ewVar.f24803c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.yh.p(R.string.AddEmojiNotFound, zc.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
