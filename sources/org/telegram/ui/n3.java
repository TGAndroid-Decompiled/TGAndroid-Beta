package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f40190a;
    public final o3 f40191b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f40190a = i10;
        this.f40191b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f40190a;
        o3 o3Var = this.f40191b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f40549c;
                String url = getURL();
                org.telegram.ui.Components.ja0 ja0Var = i4Var.f43067b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f38617b1;
                if (ja0Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(i4Var, b3Var, ja0Var);
                }
                i4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f40549c.Q(getURL(), null, null);
                return;
        }
    }
}
