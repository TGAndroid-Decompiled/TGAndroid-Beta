package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.l71;
public final class w3 extends l71 {
    @Override
    public final boolean t1(View view) {
        if (view instanceof y2) {
            y2 y2Var = (y2) view;
            if (y2Var.F > 0.0f || y2Var.I.d()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
