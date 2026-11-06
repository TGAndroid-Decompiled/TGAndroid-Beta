package org.telegram.ui.Components;

import android.view.View;
public final class iv implements View.OnFocusChangeListener {
    public final gy f34796a;

    public iv(gy gyVar) {
        this.f34796a = gyVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z9) {
        if (z9) {
            String[] G0 = org.telegram.messenger.g0.G0();
            gy gyVar = this.f34796a;
            gyVar.W0 = G0;
            org.telegram.messenger.ui.b0(gyVar.f34032c1).M(gyVar.W0, false);
        }
    }
}
