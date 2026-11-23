package org.telegram.ui.Components;

import android.view.View;
public final class o60 implements View.OnLayoutChangeListener {
    public final int f38121a;
    public final Object f38122b;

    public o60(Object obj, int i7) {
        this.f38121a = i7;
        this.f38122b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f38121a) {
            case 0:
                a70 a70Var = (a70) this.f38122b;
                if (a70Var.E()) {
                    a70Var.P();
                    return;
                }
                return;
            default:
                sv0 sv0Var = (sv0) this.f38122b;
                di.xb xbVar = sv0Var.h;
                if (xbVar != null && xbVar.getLayout() != null) {
                    sv0Var.G = xbVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
