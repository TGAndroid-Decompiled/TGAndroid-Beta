package org.telegram.ui.Components;

import android.text.StaticLayout;
import java.util.ArrayList;
public final class tw0 {
    public final org.telegram.ui.ActionBar.e6 f39824a;
    public StaticLayout f39825b;
    public final ArrayList f39826c = new ArrayList(2);
    public int d;
    public int f39827e;
    public int f39828f;
    public int f39829g;
    public int h;

    public tw0(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f39824a = e6Var;
    }

    public static void c(StringBuilder sb2, int i7, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.hd.M0(2131744345, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.hd.M0(i7, null));
    }

    public final int a() {
        return this.f39829g;
    }

    public final void b(org.telegram.messenger.gj r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tw0.b(org.telegram.messenger.gj):void");
    }
}
