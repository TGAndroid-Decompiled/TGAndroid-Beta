package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q0 extends w7.j0 {
    public final k4 f40670a;

    public q0(k4 k4Var) {
        this.f40670a = k4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f40670a.f38762h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.tl.p(R.string.TextCopied, new org.telegram.ui.Components.vc(this.f40670a.f38761g0, null));
        }
    }
}
