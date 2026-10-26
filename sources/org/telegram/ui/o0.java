package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o0 extends a8.ye {
    public final j4 f42053a;

    public o0(j4 j4Var) {
        this.f42053a = j4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f42053a.f40437h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.vh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(this.f42053a.f40436g0, null));
        }
    }
}
