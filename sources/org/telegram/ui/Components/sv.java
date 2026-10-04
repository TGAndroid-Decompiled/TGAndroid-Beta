package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class sv implements Runnable {
    public final int f30879a;
    public final tv f30880b;

    public sv(tv tvVar, int i10) {
        this.f30879a = i10;
        this.f30880b = tvVar;
    }

    @Override
    public final void run() {
        switch (this.f30879a) {
            case 0:
                this.f30880b.f31174f.dismiss();
                return;
            default:
                wv wvVar = this.f30880b.f31174f;
                wvVar.dismiss();
                org.telegram.ui.ActionBar.n2 n2Var = wvVar.f32630c;
                if (n2Var != null && n2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, yc.a0(n2Var), null);
                    return;
                }
                return;
        }
    }
}
