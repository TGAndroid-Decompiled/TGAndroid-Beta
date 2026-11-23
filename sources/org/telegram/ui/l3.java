package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class l3 extends URLSpan {
    public final int f49457a;
    public final m3 f49458b;

    public l3(m3 m3Var, String str, int i7) {
        super(str);
        this.f49457a = i7;
        this.f49458b = m3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i7 = this.f49457a;
        m3 m3Var = this.f49458b;
        switch (i7) {
            case 0:
                g4 g4Var = m3Var.f49755c;
                String url = getURL();
                org.telegram.ui.Components.n80 n80Var = g4Var.f50752b;
                z2 z2Var = g4Var.d;
                HashSet hashSet = g4.f47929d1;
                if (n80Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(g4Var, z2Var, n80Var);
                }
                g4Var.O(url, null, j0Var);
                return;
            default:
                m3Var.f49755c.O(getURL(), null, null);
                return;
        }
    }
}
