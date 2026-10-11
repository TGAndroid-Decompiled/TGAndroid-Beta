package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class fw implements Runnable {
    public final int f26577a;
    public final gw f26578b;

    public fw(gw gwVar, int i10) {
        this.f26577a = i10;
        this.f26578b = gwVar;
    }

    @Override
    public final void run() {
        switch (this.f26577a) {
            case 0:
                this.f26578b.f26886f.dismiss();
                return;
            default:
                jw jwVar = this.f26578b.f26886f;
                jwVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = jwVar.f27858c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.ai.q(R.string.AddEmojiNotFound, ad.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
