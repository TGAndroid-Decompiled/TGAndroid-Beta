package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class rv implements Runnable {
    public final int f28135a;
    public final sv f28136b;

    public rv(sv svVar, int i10) {
        this.f28135a = i10;
        this.f28136b = svVar;
    }

    @Override
    public final void run() {
        switch (this.f28135a) {
            case 0:
                this.f28136b.f28355f.dismiss();
                return;
            default:
                vv vvVar = this.f28136b.f28355f;
                vvVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = vvVar.f29726c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, yc.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
