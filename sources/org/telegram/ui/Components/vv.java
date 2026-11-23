package org.telegram.ui.Components;

import android.view.View;
public final class vv implements View.OnFocusChangeListener {
    public final ty f41536a;

    public vv(ty tyVar) {
        this.f41536a = tyVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        if (z10) {
            String[] G0 = org.telegram.messenger.g0.G0();
            ty tyVar = this.f41536a;
            tyVar.X0 = G0;
            org.telegram.messenger.si.d0(tyVar.f40074d1).O(tyVar.X0, false);
        }
    }
}
