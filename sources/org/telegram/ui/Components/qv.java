package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class qv implements Runnable {
    public final int f27839a;
    public final rv f27840b;

    public qv(rv rvVar, int i10) {
        this.f27839a = i10;
        this.f27840b = rvVar;
    }

    @Override
    public final void run() {
        switch (this.f27839a) {
            case 0:
                this.f27840b.f28061f.dismiss();
                return;
            default:
                uv uvVar = this.f27840b.f28061f;
                uvVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = uvVar.f28890c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ok.p(R.string.AddEmojiNotFound, xc.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
