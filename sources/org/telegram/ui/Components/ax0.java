package org.telegram.ui.Components;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class ax0 {
    public final org.telegram.ui.ActionBar.i6 f33481a;
    public StaticLayout f33482b;
    public final ArrayList f33483c = new ArrayList(2);
    public int d;
    public int f33484e;
    public int f33485f;
    public int f33486g;
    public int h;

    public ax0(org.telegram.ui.ActionBar.i6 i6Var) {
        this.f33481a = i6Var;
    }

    public static void c(StringBuilder sb2, int i7, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.gd.M0(2131744110, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.gd.M0(i7, null));
    }

    public final int a() {
        return this.f33486g;
    }

    public final void b(org.telegram.messenger.fj r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ax0.b(org.telegram.messenger.fj):void");
    }
}
