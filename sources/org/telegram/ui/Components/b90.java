package org.telegram.ui.Components;

import java.util.regex.Pattern;

public final class b90 extends nc.h {

    public static final Pattern f27052e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final je.p b() {
        String strA = a(f27052e);
        if (strA == null) {
            return null;
        }
        ic.d dVar = new ic.d();
        dVar.f11116g = com.google.android.recaptcha.internal.a.n(strA, 1, 1);
        return dVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
