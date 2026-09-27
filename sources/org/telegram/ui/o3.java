package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class o3 extends URLSpan {
    public final int f36127a;
    public final p3 f36128b;

    public o3(p3 p3Var, String str, int i10) {
        super(str);
        this.f36127a = i10;
        this.f36128b = p3Var;
    }

    @Override
    public final void onClick(View view) {
        k0 k0Var;
        int i10 = this.f36127a;
        p3 p3Var = this.f36128b;
        switch (i10) {
            case 0:
                j4 j4Var = p3Var.f36317c;
                String url = getURL();
                org.telegram.ui.Components.q90 q90Var = j4Var.f37320b;
                c3 c3Var = j4Var.d;
                HashSet hashSet = j4.f34583b1;
                if (q90Var == null) {
                    k0Var = null;
                } else {
                    k0Var = new k0(j4Var, c3Var, q90Var);
                }
                j4Var.Q(url, null, k0Var);
                return;
            default:
                p3Var.f36317c.Q(getURL(), null, null);
                return;
        }
    }
}
