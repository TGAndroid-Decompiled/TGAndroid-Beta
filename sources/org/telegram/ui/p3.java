package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class p3 extends URLSpan {
    public final int f39967a;
    public final q3 f39968b;

    public p3(q3 q3Var, String str, int i10) {
        super(str);
        this.f39967a = i10;
        this.f39968b = q3Var;
    }

    @Override
    public final void onClick(View view) {
        l0 l0Var;
        int i10 = this.f39967a;
        q3 q3Var = this.f39968b;
        switch (i10) {
            case 0:
                l4 l4Var = q3Var.f40310c;
                String url = getURL();
                org.telegram.ui.Components.y90 y90Var = l4Var.f36106b;
                d3 d3Var = l4Var.d;
                HashSet hashSet = l4.f38726b1;
                if (y90Var == null) {
                    l0Var = null;
                } else {
                    l0Var = new l0(l4Var, d3Var, y90Var);
                }
                l4Var.Q(url, null, l0Var);
                return;
            default:
                q3Var.f40310c.Q(getURL(), null, null);
                return;
        }
    }
}
