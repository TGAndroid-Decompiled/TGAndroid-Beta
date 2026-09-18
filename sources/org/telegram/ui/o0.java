package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o0 extends w7.i0 {
    public final h4 f36084a;

    public o0(h4 h4Var) {
        this.f36084a = h4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f36084a.f34062h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.wh.n(R.string.TextCopied, new org.telegram.ui.Components.xc(this.f36084a.f34061g0, null));
        }
    }
}
