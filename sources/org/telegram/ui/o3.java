package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class o3 extends URLSpan {
    public final int f40066a;
    public final p3 f40067b;

    public o3(p3 p3Var, String str, int i10) {
        super(str);
        this.f40066a = i10;
        this.f40067b = p3Var;
    }

    @Override
    public final void onClick(View view) {
        k0 k0Var;
        int i10 = this.f40066a;
        p3 p3Var = this.f40067b;
        switch (i10) {
            case 0:
                k4 k4Var = p3Var.f40320c;
                String url = getURL();
                org.telegram.ui.Components.x90 x90Var = k4Var.f37215b;
                c3 c3Var = k4Var.d;
                HashSet hashSet = k4.f38730c1;
                if (x90Var == null) {
                    k0Var = null;
                } else {
                    k0Var = new k0(k4Var, c3Var, x90Var);
                }
                k4Var.Q(url, null, k0Var);
                return;
            default:
                p3Var.f40320c.Q(getURL(), null, null);
                return;
        }
    }
}
