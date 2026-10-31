package org.telegram.ui.Components;

import android.view.View;
public final class uv implements View.OnFocusChangeListener {
    public final vy f31063a;

    public uv(vy vyVar) {
        this.f31063a = vyVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.i0.G0();
            vy vyVar = this.f31063a;
            vyVar.W0 = G0;
            org.telegram.messenger.ui.b0(vyVar.f31865c1).M(vyVar.W0, false);
        }
    }
}
