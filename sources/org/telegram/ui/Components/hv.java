package org.telegram.ui.Components;

import android.view.View;
public final class hv implements View.OnFocusChangeListener {
    public final ey f34518a;

    public hv(ey eyVar) {
        this.f34518a = eyVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            ey eyVar = this.f34518a;
            eyVar.X0 = G0;
            org.telegram.messenger.li.b0(eyVar.f33529d1).M(eyVar.X0, false);
        }
    }
}
