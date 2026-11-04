package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class i80 extends bd.h {
    public static final Pattern f34634e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final gf.p b() {
        String a10 = a(f34634e);
        if (a10 == null) {
            return null;
        }
        ?? pVar = new gf.p();
        pVar.f57456g = com.google.android.recaptcha.internal.a.j(a10, 1, 1);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
