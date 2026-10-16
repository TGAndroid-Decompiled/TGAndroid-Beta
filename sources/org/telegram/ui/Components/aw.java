package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class aw implements Runnable {
    public final int f23309a;
    public final bw f23310b;

    public aw(bw bwVar, int i10) {
        this.f23309a = i10;
        this.f23310b = bwVar;
    }

    @Override
    public final void run() {
        switch (this.f23309a) {
            case 0:
                this.f23310b.f23560f.dismiss();
                return;
            default:
                ew ewVar = this.f23310b.f23560f;
                ewVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = ewVar.f24497c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.sk.q(R.string.AddEmojiNotFound, zc.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
