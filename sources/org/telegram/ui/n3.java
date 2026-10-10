package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f40107a;
    public final o3 f40108b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f40107a = i10;
        this.f40108b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f40107a;
        o3 o3Var = this.f40108b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f40449c;
                String url = getURL();
                org.telegram.ui.Components.ga0 ga0Var = i4Var.f41929b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f38515b1;
                if (ga0Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(i4Var, b3Var, ga0Var);
                }
                i4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f40449c.Q(getURL(), null, null);
                return;
        }
    }
}
