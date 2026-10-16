package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q0 extends w7.j0 {
    public final k4 f39039a;

    public q0(k4 k4Var) {
        this.f39039a = k4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f39039a.f37266h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.sk.p(R.string.TextCopied, new org.telegram.ui.Components.zc(this.f39039a.f37265g0, null));
        }
    }
}
