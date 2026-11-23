package org.telegram.ui.Components;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class bx0 {
    public final org.telegram.ui.ActionBar.i6 f33834a;
    public StaticLayout f33835b;
    public final ArrayList f33836c = new ArrayList(2);
    public int d;
    public int f33837e;
    public int f33838f;
    public int f33839g;
    public int h;

    public bx0(org.telegram.ui.ActionBar.i6 i6Var) {
        this.f33834a = i6Var;
    }

    public static void c(StringBuilder sb2, int i7, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.gd.N0(2131744100, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.gd.N0(i7, null));
    }

    public final int a() {
        return this.f33839g;
    }

    public final void b(org.telegram.messenger.fj r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bx0.b(org.telegram.messenger.fj):void");
    }
}
