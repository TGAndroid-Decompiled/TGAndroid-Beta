package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class s90 extends qc.h {
    public static final Pattern f31012e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final ne.p b() {
        String a2 = a(f31012e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new ne.p();
        pVar.f12278g = e2.c.j(a2, 1, 1);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
