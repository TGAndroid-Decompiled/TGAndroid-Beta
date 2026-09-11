package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class n3 extends URLSpan {
    public final int f38816a;
    public final o3 f38817b;

    public n3(o3 o3Var, String str, int i10) {
        super(str);
        this.f38816a = i10;
        this.f38817b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        i0 i0Var;
        int i10 = this.f38816a;
        o3 o3Var = this.f38817b;
        switch (i10) {
            case 0:
                i4 i4Var = o3Var.f39095c;
                String url = getURL();
                org.telegram.ui.Components.e90 e90Var = i4Var.f41434b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.f37188b1;
                if (e90Var == null) {
                    i0Var = null;
                } else {
                    i0Var = new i0(i4Var, b3Var, e90Var);
                }
                i4Var.Q(url, null, i0Var);
                return;
            default:
                o3Var.f39095c.Q(getURL(), null, null);
                return;
        }
    }
}
