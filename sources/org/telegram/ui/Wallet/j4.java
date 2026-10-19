package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.b71;
public final class j4 extends b71 {
    @Override
    public final boolean t1(View view) {
        if (view instanceof g3) {
            g3 g3Var = (g3) view;
            if (g3Var.F > 0.0f || g3Var.I.d()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
