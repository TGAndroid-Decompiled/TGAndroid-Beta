package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class p3 extends URLSpan {
    public final int f39111a;
    public final q3 f39112b;

    public p3(q3 q3Var, String str, int i10) {
        super(str);
        this.f39111a = i10;
        this.f39112b = q3Var;
    }

    @Override
    public final void onClick(View view) {
        k0 k0Var;
        int i10 = this.f39111a;
        q3 q3Var = this.f39112b;
        switch (i10) {
            case 0:
                k4 k4Var = q3Var.f39334c;
                String url = getURL();
                org.telegram.ui.Components.ea0 ea0Var = k4Var.f42501b;
                d3 d3Var = k4Var.d;
                HashSet hashSet = k4.f37513b1;
                if (ea0Var == null) {
                    k0Var = null;
                } else {
                    k0Var = new k0(k4Var, d3Var, ea0Var);
                }
                k4Var.Q(url, null, k0Var);
                return;
            default:
                q3Var.f39334c.Q(getURL(), null, null);
                return;
        }
    }
}
