package org.telegram.ui.Components;

import android.view.View;
public final class tv implements View.OnFocusChangeListener {
    public final ry f40109a;

    public tv(ry ryVar) {
        this.f40109a = ryVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            ry ryVar = this.f40109a;
            ryVar.X0 = G0;
            org.telegram.messenger.ri.d0(ryVar.f39345d1).O(ryVar.X0, false);
        }
    }
}
