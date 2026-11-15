package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class l3 extends URLSpan {
    public final int f48813a;
    public final m3 f48814b;

    public l3(m3 m3Var, String str, int i7) {
        super(str);
        this.f48813a = i7;
        this.f48814b = m3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i7 = this.f48813a;
        m3 m3Var = this.f48814b;
        switch (i7) {
            case 0:
                g4 g4Var = m3Var.f49094c;
                String url = getURL();
                org.telegram.ui.Components.a80 a80Var = g4Var.f49448b;
                z2 z2Var = g4Var.d;
                HashSet hashSet = g4.f47282d1;
                if (a80Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(g4Var, z2Var, a80Var);
                }
                g4Var.O(url, null, j0Var);
                return;
            default:
                m3Var.f49094c.O(getURL(), null, null);
                return;
        }
    }
}
