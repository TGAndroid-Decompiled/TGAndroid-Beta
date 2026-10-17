package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.a71;
public final class g4 extends a71 {
    @Override
    public final boolean t1(View view) {
        if (view instanceof d3) {
            d3 d3Var = (d3) view;
            if (d3Var.F > 0.0f || d3Var.I.d()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
