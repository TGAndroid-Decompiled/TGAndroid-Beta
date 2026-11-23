package org.telegram.ui.Components;

import android.view.View;
public final class l60 implements View.OnLayoutChangeListener {
    public final int f37047a;
    public final Object f37048b;

    public l60(Object obj, int i7) {
        this.f37047a = i7;
        this.f37048b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f37047a) {
            case 0:
                x60 x60Var = (x60) this.f37048b;
                if (x60Var.E()) {
                    x60Var.P();
                    return;
                }
                return;
            default:
                rv0 rv0Var = (rv0) this.f37048b;
                di.xb xbVar = rv0Var.h;
                if (xbVar != null && xbVar.getLayout() != null) {
                    rv0Var.G = xbVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
