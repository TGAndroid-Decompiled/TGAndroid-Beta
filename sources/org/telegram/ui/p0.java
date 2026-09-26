package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class p0 extends w7.i0 {
    public final i4 f36371a;

    public p0(i4 i4Var) {
        this.f36371a = i4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f36371a.f34395h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.ok.o(R.string.TextCopied, new org.telegram.ui.Components.xc(this.f36371a.f34394g0, null));
        }
    }
}
