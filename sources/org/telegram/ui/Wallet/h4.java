package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.a71;
public final class h4 extends a71 {
    @Override
    public final boolean t1(View view) {
        if (view instanceof e3) {
            e3 e3Var = (e3) view;
            if (e3Var.F > 0.0f || e3Var.I.d()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
