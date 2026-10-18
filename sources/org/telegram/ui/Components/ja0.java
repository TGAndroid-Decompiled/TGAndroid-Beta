package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class ja0 extends gd.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final df.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new df.p();
        pVar.f4260g = com.google.android.gms.internal.play_billing.k3.j(1, 1, a2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
