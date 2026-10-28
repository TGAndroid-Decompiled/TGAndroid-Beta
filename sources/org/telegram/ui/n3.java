package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f41624a;
    public final o3 f41625b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f41624a = i10;
        this.f41625b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f41624a;
        o3 o3Var = this.f41625b;
        switch (i10) {
            case 0:
                j4 j4Var = o3Var.f41965c;
                String url = getURL();
                org.telegram.ui.Components.ba0 ba0Var = j4Var.f40449b;
                a3 a3Var = j4Var.d;
                HashSet hashSet = j4.f40370c1;
                if (ba0Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(j4Var, a3Var, ba0Var);
                }
                j4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f41965c.Q(getURL(), null, null);
                return;
        }
    }
}
