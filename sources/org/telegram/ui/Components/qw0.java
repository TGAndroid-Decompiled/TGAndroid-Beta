package org.telegram.ui.Components;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class qw0 {
    public final org.telegram.ui.ActionBar.e6 f37553a;
    public StaticLayout f37554b;
    public final ArrayList f37555c = new ArrayList(2);
    public int d;
    public int f37556e;
    public int f37557f;
    public int f37558g;
    public int h;

    public qw0(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f37553a = e6Var;
    }

    public static void c(StringBuilder sb2, int i3, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.bd.M0(2131744355, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.bd.M0(i3, null));
    }

    public final int a() {
        return this.f37558g;
    }

    public final void b(org.telegram.messenger.zi r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qw0.b(org.telegram.messenger.zi):void");
    }
}
