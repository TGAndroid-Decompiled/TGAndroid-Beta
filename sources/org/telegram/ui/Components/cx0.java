package org.telegram.ui.Components;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class cx0 {
    public final org.telegram.ui.ActionBar.h6 f34281a;
    public StaticLayout f34282b;
    public final ArrayList f34283c = new ArrayList(2);
    public int d;
    public int f34284e;
    public int f34285f;
    public int f34286g;
    public int h;

    public cx0(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f34281a = h6Var;
    }

    public static void c(StringBuilder sb2, int i7, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.hd.N0(2131744104, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.hd.N0(i7, null));
    }

    public final int a() {
        return this.f34286g;
    }

    public final void b(org.telegram.messenger.gj r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cx0.b(org.telegram.messenger.gj):void");
    }
}
