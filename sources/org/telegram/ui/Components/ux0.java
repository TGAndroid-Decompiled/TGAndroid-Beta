package org.telegram.ui.Components;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class ux0 {
    public final org.telegram.ui.ActionBar.p6 f31078a;
    public StaticLayout f31079b;
    public final ArrayList f31080c = new ArrayList(2);
    public int d;
    public int e;
    public int f31081f;
    public int f31082g;
    public int h;

    public ux0(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f31078a = p6Var;
    }

    public static void c(StringBuilder sb2, int i10, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.cd.L0(2131744371, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.cd.L0(i10, null));
    }

    public final int a() {
        return this.f31082g;
    }

    public final void b(org.telegram.messenger.jj r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux0.b(org.telegram.messenger.jj):void");
    }
}
