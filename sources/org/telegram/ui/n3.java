package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f35740a;
    public final o3 f35741b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f35740a = i10;
        this.f35741b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f35740a;
        o3 o3Var = this.f35741b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f36042c;
                String url = getURL();
                org.telegram.ui.Components.p90 p90Var = i4Var.f36419b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f34362b1;
                if (p90Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(i4Var, b3Var, p90Var);
                }
                i4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f36042c.Q(getURL(), null, null);
                return;
        }
    }
}
