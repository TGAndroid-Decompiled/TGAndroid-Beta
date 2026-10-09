package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f40061a;
    public final o3 f40062b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f40061a = i10;
        this.f40062b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f40061a;
        o3 o3Var = this.f40062b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f40403c;
                String url = getURL();
                org.telegram.ui.Components.fa0 fa0Var = i4Var.f41883b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f38469b1;
                if (fa0Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(i4Var, b3Var, fa0Var);
                }
                i4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f40403c.Q(getURL(), null, null);
                return;
        }
    }
}
