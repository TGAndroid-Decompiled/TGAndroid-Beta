package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o0 extends w7.i0 {
    public final h4 f36179a;

    public o0(h4 h4Var) {
        this.f36179a = h4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f36179a.f34118h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.rk.o(R.string.TextCopied, new org.telegram.ui.Components.xc(this.f36179a.f34117g0, null));
        }
    }
}
