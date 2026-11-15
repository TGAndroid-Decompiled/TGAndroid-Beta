package org.telegram.ui.Components;

import android.view.View;
public final class ov implements View.OnFocusChangeListener {
    public final ly f38089a;

    public ov(ly lyVar) {
        this.f38089a = lyVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            ly lyVar = this.f38089a;
            lyVar.X0 = G0;
            org.telegram.messenger.si.b0(lyVar.f36941d1).M(lyVar.X0, false);
        }
    }
}
