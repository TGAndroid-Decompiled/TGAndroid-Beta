package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o0 extends a8.ye {
    public final j4 f42050a;

    public o0(j4 j4Var) {
        this.f42050a = j4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f42050a.f40434h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.vh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(this.f42050a.f40433g0, null));
        }
    }
}
