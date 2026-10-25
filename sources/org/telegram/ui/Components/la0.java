package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class la0 extends hd.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final ef.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new ef.p();
        pVar.f6199g = c3.h0.l(1, 1, a2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
