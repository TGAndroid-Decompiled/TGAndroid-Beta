package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class m3 extends URLSpan {
    public final int f35621a;
    public final n3 f35622b;

    public m3(n3 n3Var, String str, int i10) {
        super(str);
        this.f35621a = i10;
        this.f35622b = n3Var;
    }

    @Override
    public final void onClick(View view) {
        i0 i0Var;
        int i10 = this.f35621a;
        n3 n3Var = this.f35622b;
        switch (i10) {
            case 0:
                h4 h4Var = n3Var.f35875c;
                String url = getURL();
                org.telegram.ui.Components.d90 d90Var = h4Var.f37874b;
                a3 a3Var = h4Var.d;
                HashSet hashSet = h4.f34107b1;
                if (d90Var == null) {
                    i0Var = null;
                } else {
                    i0Var = new i0(h4Var, a3Var, d90Var);
                }
                h4Var.Q(url, null, i0Var);
                return;
            default:
                n3Var.f35875c.Q(getURL(), null, null);
                return;
        }
    }
}
