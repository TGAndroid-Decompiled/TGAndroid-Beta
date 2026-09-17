package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o0 extends w7.h0 {
    public final i4 f39095a;

    public o0(i4 i4Var) {
        this.f39095a = i4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f39095a.f37248h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.vl.o(R.string.TextCopied, new org.telegram.ui.Components.yc(this.f39095a.f37247g0, null));
        }
    }
}
