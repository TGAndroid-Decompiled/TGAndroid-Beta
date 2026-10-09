package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class p0 extends w7.h0 {
    public final i4 f40623a;

    public p0(i4 i4Var) {
        this.f40623a = i4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f40623a.f38501h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.bi.p(R.string.TextCopied, new org.telegram.ui.Components.ad(this.f40623a.f38500g0, null));
        }
    }
}
