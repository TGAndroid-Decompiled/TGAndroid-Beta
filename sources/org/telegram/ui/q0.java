package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q0 extends w7.w5 {
    public final k4 f39318a;

    public q0(k4 k4Var) {
        this.f39318a = k4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f39318a.f37545h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.yh.o(R.string.TextCopied, new org.telegram.ui.Components.zc(this.f39318a.f37544g0, null));
        }
    }
}
