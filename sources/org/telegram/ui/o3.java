package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class o3 extends URLSpan {
    public final int f35391a;
    public final p3 f35392b;

    public o3(p3 p3Var, String str, int i10) {
        super(str);
        this.f35391a = i10;
        this.f35392b = p3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f35391a;
        p3 p3Var = this.f35392b;
        switch (i10) {
            case 0:
                j4 j4Var = p3Var.f35677c;
                String url = getURL();
                org.telegram.ui.Components.n90 n90Var = j4Var.f36855b;
                c3 c3Var = j4Var.d;
                HashSet hashSet = j4.f33876b1;
                if (n90Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(j4Var, c3Var, n90Var);
                }
                j4Var.Q(url, null, j0Var);
                return;
            default:
                p3Var.f35677c.Q(getURL(), null, null);
                return;
        }
    }
}
