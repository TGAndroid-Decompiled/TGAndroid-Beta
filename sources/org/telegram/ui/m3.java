package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class m3 extends URLSpan {
    public final int f47489a;
    public final n3 f47490b;

    public m3(n3 n3Var, String str, int i3) {
        super(str);
        this.f47489a = i3;
        this.f47490b = n3Var;
    }

    @Override
    public final void onClick(View view) {
        k0 k0Var;
        int i3 = this.f47489a;
        n3 n3Var = this.f47490b;
        switch (i3) {
            case 0:
                i4 i4Var = n3Var.f47860c;
                String url = getURL();
                org.telegram.ui.Components.t70 t70Var = i4Var.f46111b;
                a3 a3Var = i4Var.d;
                HashSet hashSet = i4.f46056d1;
                if (t70Var == null) {
                    k0Var = null;
                } else {
                    k0Var = new k0(i4Var, a3Var, t70Var);
                }
                i4Var.O(url, null, k0Var);
                return;
            default:
                n3Var.f47860c.O(getURL(), null, null);
                return;
        }
    }
}
