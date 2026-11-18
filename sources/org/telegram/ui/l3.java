package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class l3 extends URLSpan {
    public final int f49409a;
    public final m3 f49410b;

    public l3(m3 m3Var, String str, int i7) {
        super(str);
        this.f49409a = i7;
        this.f49410b = m3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i7 = this.f49409a;
        m3 m3Var = this.f49410b;
        switch (i7) {
            case 0:
                g4 g4Var = m3Var.f49744c;
                String url = getURL();
                org.telegram.ui.Components.l80 l80Var = g4Var.f50751b;
                z2 z2Var = g4Var.d;
                HashSet hashSet = g4.f47891d1;
                if (l80Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(g4Var, z2Var, l80Var);
                }
                g4Var.O(url, null, j0Var);
                return;
            default:
                m3Var.f49744c.O(getURL(), null, null);
                return;
        }
    }
}
