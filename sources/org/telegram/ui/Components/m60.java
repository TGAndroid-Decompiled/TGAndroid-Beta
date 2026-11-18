package org.telegram.ui.Components;

import android.view.View;
public final class m60 implements View.OnLayoutChangeListener {
    public final int f37401a;
    public final Object f37402b;

    public m60(Object obj, int i7) {
        this.f37401a = i7;
        this.f37402b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f37401a) {
            case 0:
                y60 y60Var = (y60) this.f37402b;
                if (y60Var.E()) {
                    y60Var.P();
                    return;
                }
                return;
            default:
                pv0 pv0Var = (pv0) this.f37402b;
                di.xb xbVar = pv0Var.h;
                if (xbVar != null && xbVar.getLayout() != null) {
                    pv0Var.G = xbVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
