package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.a71;
public final class i4 extends a71 {
    @Override
    public final boolean t1(View view) {
        if (view instanceof f3) {
            f3 f3Var = (f3) view;
            if (f3Var.F > 0.0f || f3Var.I.d()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
