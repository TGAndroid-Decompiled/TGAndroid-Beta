package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class p3 extends URLSpan {
    public final int f38805a;
    public final q3 f38806b;

    public p3(q3 q3Var, String str, int i10) {
        super(str);
        this.f38805a = i10;
        this.f38806b = q3Var;
    }

    @Override
    public final void onClick(View view) {
        k0 k0Var;
        int i10 = this.f38805a;
        q3 q3Var = this.f38806b;
        switch (i10) {
            case 0:
                k4 k4Var = q3Var.f39055c;
                String url = getURL();
                org.telegram.ui.Components.ea0 ea0Var = k4Var.f42175b;
                d3 d3Var = k4Var.d;
                HashSet hashSet = k4.f37234b1;
                if (ea0Var == null) {
                    k0Var = null;
                } else {
                    k0Var = new k0(k4Var, d3Var, ea0Var);
                }
                k4Var.Q(url, null, k0Var);
                return;
            default:
                q3Var.f39055c.Q(getURL(), null, null);
                return;
        }
    }
}
