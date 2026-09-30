package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f35745a;
    public final o3 f35746b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f35745a = i10;
        this.f35746b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        j0 j0Var;
        int i10 = this.f35745a;
        o3 o3Var = this.f35746b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f36037c;
                String url = getURL();
                org.telegram.ui.Components.q90 q90Var = i4Var.f36422b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f34366b1;
                if (q90Var == null) {
                    j0Var = null;
                } else {
                    j0Var = new j0(i4Var, b3Var, q90Var);
                }
                i4Var.Q(url, null, j0Var);
                return;
            default:
                o3Var.f36037c.Q(getURL(), null, null);
                return;
        }
    }
}
