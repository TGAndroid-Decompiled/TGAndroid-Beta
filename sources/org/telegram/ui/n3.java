package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f35852a;
    public final o3 f35853b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f35852a = i10;
        this.f35853b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f35852a;
        o3 o3Var = this.f35853b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f36181c;
                String url = getURL();
                org.telegram.ui.Components.r90 r90Var = i4Var.f36525b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f34458b1;
                if (r90Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(i4Var, b3Var, r90Var);
                }
                i4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f36181c.Q(getURL(), null, null);
                return;
        }
    }
}
