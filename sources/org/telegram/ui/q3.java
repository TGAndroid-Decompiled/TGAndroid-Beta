package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class q3 extends URLSpan {
    public final int f37580a;
    public final r3 f37581b;

    public q3(r3 r3Var, String str, int i10) {
        super(str);
        this.f37580a = i10;
        this.f37581b = r3Var;
    }

    @Override
    public final void onClick(View view) {
        k0 k0Var;
        int i10 = this.f37580a;
        r3 r3Var = this.f37581b;
        switch (i10) {
            case 0:
                l4 l4Var = r3Var.f37912c;
                String url = getURL();
                org.telegram.ui.Components.f90 f90Var = l4Var.f36476b;
                d3 d3Var = l4Var.d;
                HashSet hashSet = l4.Y0;
                if (f90Var == null) {
                    k0Var = null;
                } else {
                    k0Var = new k0(l4Var, d3Var, f90Var);
                }
                l4Var.Q(url, null, k0Var);
                return;
            default:
                r3Var.f37912c.Q(getURL(), null, null);
                return;
        }
    }
}
