package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class q3 extends URLSpan {
    public final int f41656a;
    public final r3 f41657b;

    public q3(r3 r3Var, String str, int i9) {
        super(str);
        this.f41656a = i9;
        this.f41657b = r3Var;
    }

    @Override
    public final void onClick(View view) {
        l0 l0Var;
        int i9 = this.f41656a;
        r3 r3Var = this.f41657b;
        switch (i9) {
            case 0:
                l4 l4Var = r3Var.f42261c;
                String url = getURL();
                org.telegram.ui.Components.m80 m80Var = l4Var.f36374b;
                e3 e3Var = l4Var.d;
                HashSet hashSet = l4.X0;
                if (m80Var == null) {
                    l0Var = null;
                } else {
                    l0Var = new l0(l4Var, e3Var, m80Var);
                }
                l4Var.Q(url, null, l0Var);
                return;
            default:
                r3Var.f42261c.Q(getURL(), null, null);
                return;
        }
    }
}
