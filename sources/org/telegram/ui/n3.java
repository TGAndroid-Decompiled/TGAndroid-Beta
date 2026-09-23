package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f35425a;
    public final o3 f35426b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f35425a = i10;
        this.f35426b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f35425a;
        o3 o3Var = this.f35426b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f35672c;
                String url = getURL();
                org.telegram.ui.Components.e90 e90Var = i4Var.f36710b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f33977b1;
                if (e90Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(i4Var, b3Var, e90Var);
                }
                i4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f35672c.Q(getURL(), null, null);
                return;
        }
    }
}
