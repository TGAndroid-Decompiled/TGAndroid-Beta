package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class hw implements Runnable {
    public final int f26902a;
    public final iw f26903b;

    public hw(iw iwVar, int i10) {
        this.f26902a = i10;
        this.f26903b = iwVar;
    }

    @Override
    public final void run() {
        switch (this.f26902a) {
            case 0:
                this.f26903b.f27291f.dismiss();
                return;
            default:
                lw lwVar = this.f26903b.f27291f;
                lwVar.dismiss();
                org.telegram.ui.ActionBar.m2 m2Var = lwVar.f28288c;
                if (m2Var != null && m2Var.getParentActivity() != null) {
                    org.telegram.messenger.am.q(R.string.AddEmojiNotFound, zc.a0(m2Var), null);
                    return;
                }
                return;
        }
    }
}
