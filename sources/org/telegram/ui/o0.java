package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o0 extends w7.h0 {
    public final i4 f39094a;

    public o0(i4 i4Var) {
        this.f39094a = i4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f39094a.f37247h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.wl.o(R.string.TextCopied, new org.telegram.ui.Components.yc(this.f39094a.f37246g0, null));
        }
    }
}
