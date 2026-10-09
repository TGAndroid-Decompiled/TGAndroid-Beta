package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f40063a;
    public final o3 f40064b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f40063a = i10;
        this.f40064b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f40063a;
        o3 o3Var = this.f40064b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f40405c;
                String url = getURL();
                org.telegram.ui.Components.fa0 fa0Var = i4Var.f41885b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f38471b1;
                if (fa0Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(i4Var, b3Var, fa0Var);
                }
                i4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f40405c.Q(getURL(), null, null);
                return;
        }
    }
}
