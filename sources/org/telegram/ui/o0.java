package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class o0 extends w7.h0 {
    public final h4 f40377a;

    public o0(h4 h4Var) {
        this.f40377a = h4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f40377a.f38273h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.ai.p(R.string.TextCopied, new org.telegram.ui.Components.ad(this.f40377a.f38272g0, null));
        }
    }
}
