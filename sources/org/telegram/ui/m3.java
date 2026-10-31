package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class m3 extends URLSpan {
    public final int f39464a;
    public final n3 f39465b;

    public m3(n3 n3Var, String str, int i10) {
        super(str);
        this.f39464a = i10;
        this.f39465b = n3Var;
    }

    @Override
    public final void onClick(View view) {
        k0 k0Var;
        int i10 = this.f39464a;
        n3 n3Var = this.f39465b;
        switch (i10) {
            case 0:
                h4 h4Var = n3Var.f39820c;
                String url = getURL();
                org.telegram.ui.Components.q80 q80Var = h4Var.f39481b;
                z2 z2Var = h4Var.d;
                HashSet hashSet = h4.f37702c1;
                if (q80Var == null) {
                    k0Var = null;
                } else {
                    k0Var = new k0(h4Var, z2Var, q80Var);
                }
                h4Var.O(url, null, k0Var);
                return;
            default:
                n3Var.f39820c.O(getURL(), null, null);
                return;
        }
    }
}
