package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class p0 extends w7.w5 {
    public final j4 f35652a;

    public p0(j4 j4Var) {
        this.f35652a = j4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f35652a.f33908h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.em.o(R.string.TextCopied, new org.telegram.ui.Components.wc(this.f35652a.f33907g0, null));
        }
    }
}
