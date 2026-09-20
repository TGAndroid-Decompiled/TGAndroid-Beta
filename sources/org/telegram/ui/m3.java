package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class m3 extends URLSpan {
    public final int f35585a;
    public final n3 f35586b;

    public m3(n3 n3Var, String str, int i10) {
        super(str);
        this.f35585a = i10;
        this.f35586b = n3Var;
    }

    @Override
    public final void onClick(View view) {
        i0 i0Var;
        int i10 = this.f35585a;
        n3 n3Var = this.f35586b;
        switch (i10) {
            case 0:
                h4 h4Var = n3Var.f35885c;
                String url = getURL();
                org.telegram.ui.Components.l90 l90Var = h4Var.f37980b;
                a3 a3Var = h4Var.d;
                HashSet hashSet = h4.f34070b1;
                if (l90Var == null) {
                    i0Var = null;
                } else {
                    i0Var = new i0(h4Var, a3Var, l90Var);
                }
                h4Var.Q(url, null, i0Var);
                return;
            default:
                n3Var.f35885c.Q(getURL(), null, null);
                return;
        }
    }
}
