package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.l71;
public final class x3 extends l71 {
    @Override
    public final boolean t1(View view) {
        if (view instanceof z2) {
            z2 z2Var = (z2) view;
            if (z2Var.F > 0.0f || z2Var.I.d()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
