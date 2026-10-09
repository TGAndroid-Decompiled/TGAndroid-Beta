package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.k71;
public final class u3 extends k71 {
    @Override
    public final boolean t1(View view) {
        if (view instanceof x2) {
            x2 x2Var = (x2) view;
            if (x2Var.F > 0.0f || x2Var.I.d()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
