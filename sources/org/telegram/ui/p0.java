package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class p0 extends w7.h0 {
    public final i4 f35988a;

    public p0(i4 i4Var) {
        this.f35988a = i4Var;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f35988a.f34009h0.h(false);
        }
    }

    @Override
    public final void b() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.messenger.ul.p(R.string.TextCopied, new org.telegram.ui.Components.xc(this.f35988a.f34008g0, null));
        }
    }
}
