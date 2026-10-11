package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class m3 extends URLSpan {
    public final int f39838a;
    public final n3 f39839b;

    public m3(n3 n3Var, String str, int i10) {
        super(str);
        this.f39838a = i10;
        this.f39839b = n3Var;
    }

    @Override
    public final void onClick(View view) {
        i0 i0Var;
        int i10 = this.f39838a;
        n3 n3Var = this.f39839b;
        switch (i10) {
            case 0:
                h4 h4Var = n3Var.f40150c;
                String url = getURL();
                org.telegram.ui.Components.fa0 fa0Var = h4Var.f42131b;
                a3 a3Var = h4Var.d;
                HashSet hashSet = h4.f38275b1;
                if (fa0Var == null) {
                    i0Var = null;
                } else {
                    i0Var = new i0(h4Var, a3Var, fa0Var);
                }
                h4Var.Q(url, null, i0Var);
                return;
            default:
                n3Var.f40150c.Q(getURL(), null, null);
                return;
        }
    }
}
