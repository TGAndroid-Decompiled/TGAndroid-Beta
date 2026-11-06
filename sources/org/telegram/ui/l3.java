package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class l3 extends URLSpan {
    public final int f47393a;
    public final m3 f47394b;

    public l3(m3 m3Var, String str, int i7) {
        super(str);
        this.f47393a = i7;
        this.f47394b = m3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i7 = this.f47393a;
        m3 m3Var = this.f47394b;
        switch (i7) {
            case 0:
                g4 g4Var = m3Var.f47638c;
                String url = getURL();
                org.telegram.ui.Components.x70 x70Var = g4Var.f48267b;
                z2 z2Var = g4Var.d;
                HashSet hashSet = g4.f45799c1;
                if (x70Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(g4Var, z2Var, x70Var);
                }
                g4Var.O(url, null, j0Var);
                return;
            default:
                m3Var.f47638c.O(getURL(), null, null);
                return;
        }
    }
}
