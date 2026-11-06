package org.telegram.ui.Components;

import android.view.View;
public final class iv implements View.OnFocusChangeListener {
    public final gy f34803a;

    public iv(gy gyVar) {
        this.f34803a = gyVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z9) {
        if (z9) {
            String[] G0 = org.telegram.messenger.g0.G0();
            gy gyVar = this.f34803a;
            gyVar.W0 = G0;
            org.telegram.messenger.ui.b0(gyVar.f34076c1).M(gyVar.W0, false);
        }
    }
}
