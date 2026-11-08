package org.telegram.ui.Components;

import android.view.View;
public final class jv implements View.OnFocusChangeListener {
    public final hy f35107a;

    public jv(hy hyVar) {
        this.f35107a = hyVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z9) {
        if (z9) {
            String[] G0 = org.telegram.messenger.g0.G0();
            hy hyVar = this.f35107a;
            hyVar.W0 = G0;
            org.telegram.messenger.ui.b0(hyVar.f34400c1).M(hyVar.W0, false);
        }
    }
}
