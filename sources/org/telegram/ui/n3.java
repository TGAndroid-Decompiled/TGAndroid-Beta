package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f41746a;
    public final o3 f41747b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f41746a = i10;
        this.f41747b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f41746a;
        o3 o3Var = this.f41747b;
        switch (i10) {
            case 0:
                j4 j4Var = o3Var.f42080c;
                String url = getURL();
                org.telegram.ui.Components.aa0 aa0Var = j4Var.f39917b;
                a3 a3Var = j4Var.d;
                HashSet hashSet = j4.f40402c1;
                if (aa0Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(j4Var, a3Var, aa0Var);
                }
                j4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f42080c.Q(getURL(), null, null);
                return;
        }
    }
}
