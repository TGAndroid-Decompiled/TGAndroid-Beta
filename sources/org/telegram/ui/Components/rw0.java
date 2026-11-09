package org.telegram.ui.Components;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class rw0 {
    public final org.telegram.ui.ActionBar.g6 f37827a;
    public StaticLayout f37828b;
    public final ArrayList f37829c = new ArrayList(2);
    public int d;
    public int f37830e;
    public int f37831f;
    public int f37832g;
    public int h;

    public rw0(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f37827a = g6Var;
    }

    public static void c(StringBuilder sb2, int i7, boolean z9) {
        if (sb2.length() > 0) {
            if (z9) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.id.M0(2131744345, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.id.M0(i7, null));
    }

    public final int a() {
        return this.f37832g;
    }

    public final void b(org.telegram.messenger.ij r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rw0.b(org.telegram.messenger.ij):void");
    }
}
