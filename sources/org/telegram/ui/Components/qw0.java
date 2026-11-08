package org.telegram.ui.Components;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class qw0 {
    public final org.telegram.ui.ActionBar.f6 f37436a;
    public StaticLayout f37437b;
    public final ArrayList f37438c = new ArrayList(2);
    public int d;
    public int f37439e;
    public int f37440f;
    public int f37441g;
    public int h;

    public qw0(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f37436a = f6Var;
    }

    public static void c(StringBuilder sb2, int i7, boolean z9) {
        if (sb2.length() > 0) {
            if (z9) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.id.M0(2131744348, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.id.M0(i7, null));
    }

    public final int a() {
        return this.f37441g;
    }

    public final void b(org.telegram.messenger.ij r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qw0.b(org.telegram.messenger.ij):void");
    }
}
