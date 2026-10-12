package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class p0 extends w7.g0 {
    public final i4 f40822a;

    public p0(i4 i4Var) {
        this.f40822a = i4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f40822a.f38649h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.am.p(R.string.TextCopied, new org.telegram.ui.Components.zc(this.f40822a.f38648g0, null));
        }
    }
}
