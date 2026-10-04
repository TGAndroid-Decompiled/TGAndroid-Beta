package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f38804a;
    public final o3 f38805b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f38804a = i10;
        this.f38805b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f38804a;
        o3 o3Var = this.f38805b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f39097c;
                String url = getURL();
                org.telegram.ui.Components.r90 r90Var = i4Var.f40702b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f37230b1;
                if (r90Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(i4Var, b3Var, r90Var);
                }
                i4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f39097c.Q(getURL(), null, null);
                return;
        }
    }
}
