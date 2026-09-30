package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class p0 extends w7.i0 {
    public final i4 f36373a;

    public p0(i4 i4Var) {
        this.f36373a = i4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f36373a.f34398h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.ok.o(R.string.TextCopied, new org.telegram.ui.Components.yc(this.f36373a.f34397g0, null));
        }
    }
}
