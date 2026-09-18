package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o0 extends w7.h0 {
    public final h4 f36193a;

    public o0(h4 h4Var) {
        this.f36193a = h4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f36193a.f34161h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.vc(this.f36193a.f34160g0, null));
        }
    }
}
