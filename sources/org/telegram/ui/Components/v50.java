package org.telegram.ui.Components;

import android.view.View;
public final class v50 implements View.OnLayoutChangeListener {
    public final int f39012a;
    public final Object f39013b;

    public v50(Object obj, int i3) {
        this.f39012a = i3;
        this.f39013b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f39012a) {
            case 0:
                f60 f60Var = (f60) this.f39013b;
                if (f60Var.D()) {
                    f60Var.O();
                    return;
                }
                return;
            default:
                ev0 ev0Var = (ev0) this.f39013b;
                ci.ec ecVar = ev0Var.h;
                if (ecVar != null && ecVar.getLayout() != null) {
                    ev0Var.G = ecVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
