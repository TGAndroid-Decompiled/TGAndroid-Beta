package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f35728a;
    public final o3 f35729b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f35728a = i10;
        this.f35729b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f35728a;
        o3 o3Var = this.f35729b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f36019c;
                String url = getURL();
                org.telegram.ui.Components.o90 o90Var = i4Var.f36410b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f34350b1;
                if (o90Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(i4Var, b3Var, o90Var);
                }
                i4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f36019c.Q(getURL(), null, null);
                return;
        }
    }
}
