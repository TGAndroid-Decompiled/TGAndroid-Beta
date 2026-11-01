package org.telegram.ui.Components;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class vx0 {
    public final org.telegram.ui.ActionBar.p6 f31929a;
    public StaticLayout f31930b;
    public final ArrayList f31931c = new ArrayList(2);
    public int d;
    public int e;
    public int f31932f;
    public int f31933g;
    public int h;

    public vx0(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f31929a = p6Var;
    }

    public static void c(StringBuilder sb2, int i10, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.dd.L0(2131744371, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.dd.L0(i10, null));
    }

    public final int a() {
        return this.f31933g;
    }

    public final void b(org.telegram.messenger.kj r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vx0.b(org.telegram.messenger.kj):void");
    }
}
