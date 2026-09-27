package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q0 extends w7.i0 {
    public final j4 f36591a;

    public q0(j4 j4Var) {
        this.f36591a = j4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f36591a.f34615h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.qk.o(R.string.TextCopied, new org.telegram.ui.Components.xc(this.f36591a.f34614g0, null));
        }
    }
}
