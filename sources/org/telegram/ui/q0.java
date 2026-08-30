package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q0 extends k7.x5 {
    public final l4 f37563a;

    public q0(l4 l4Var) {
        this.f37563a = l4Var;
    }

    @Override
    public final void a(boolean z4) {
        if (z4) {
            this.f37563a.f35933e0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(this.f37563a.f35932d0, null));
        }
    }
}
