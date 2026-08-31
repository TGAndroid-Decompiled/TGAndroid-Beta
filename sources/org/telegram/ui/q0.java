package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q0 extends k7.y5 {
    public final l4 f40314a;

    public q0(l4 l4Var) {
        this.f40314a = l4Var;
    }

    @Override
    public final void a(boolean z4) {
        if (z4) {
            this.f40314a.f38607e0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(this.f40314a.f38606d0, null));
        }
    }
}
