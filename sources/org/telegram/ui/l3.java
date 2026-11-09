package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class l3 extends URLSpan {
    public final int f47455a;
    public final m3 f47456b;

    public l3(m3 m3Var, String str, int i7) {
        super(str);
        this.f47455a = i7;
        this.f47456b = m3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i7 = this.f47455a;
        m3 m3Var = this.f47456b;
        switch (i7) {
            case 0:
                g4 g4Var = m3Var.f47732c;
                String url = getURL();
                org.telegram.ui.Components.y70 y70Var = g4Var.f48918b;
                z2 z2Var = g4Var.d;
                HashSet hashSet = g4.f45859c1;
                if (y70Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(g4Var, z2Var, y70Var);
                }
                g4Var.O(url, null, j0Var);
                return;
            default:
                m3Var.f47732c.O(getURL(), null, null);
                return;
        }
    }
}
