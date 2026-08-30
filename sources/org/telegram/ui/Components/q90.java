package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class q90 extends qc.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final ne.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new ne.p();
        pVar.f11856g = e2.c.j(a2, 1, 1);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
