package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class qv implements Runnable {
    public final int f27764a;
    public final rv f27765b;

    public qv(rv rvVar, int i10) {
        this.f27764a = i10;
        this.f27765b = rvVar;
    }

    @Override
    public final void run() {
        switch (this.f27764a) {
            case 0:
                this.f27765b.f28046f.dismiss();
                return;
            default:
                uv uvVar = this.f27765b.f28046f;
                uvVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = uvVar.f28918c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, yc.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
