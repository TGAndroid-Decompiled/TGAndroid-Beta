package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class p0 extends w7.j0 {
    public final i4 f39310a;

    public p0(i4 i4Var) {
        this.f39310a = i4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f39310a.f37268h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.bi.n(R.string.TextCopied, new org.telegram.ui.Components.yc(this.f39310a.f37267g0, null));
        }
    }
}
