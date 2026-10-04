package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class sv implements Runnable {
    public final int f30878a;
    public final tv f30879b;

    public sv(tv tvVar, int i10) {
        this.f30878a = i10;
        this.f30879b = tvVar;
    }

    @Override
    public final void run() {
        switch (this.f30878a) {
            case 0:
                this.f30879b.f31173f.dismiss();
                return;
            default:
                wv wvVar = this.f30879b.f31173f;
                wvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = wvVar.f32629c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, yc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
