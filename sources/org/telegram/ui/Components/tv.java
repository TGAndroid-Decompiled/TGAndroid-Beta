package org.telegram.ui.Components;

import android.view.View;
public final class tv implements View.OnFocusChangeListener {
    public final qy f40170a;

    public tv(qy qyVar) {
        this.f40170a = qyVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            qy qyVar = this.f40170a;
            qyVar.X0 = G0;
            org.telegram.messenger.ri.d0(qyVar.f39047d1).O(qyVar.X0, false);
        }
    }
}
