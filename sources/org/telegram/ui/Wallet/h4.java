package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.j71;
public final class h4 extends j71 {
    @Override
    public final boolean x1(View view) {
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
