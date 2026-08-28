package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class x80 extends mc.h {
    public static final Pattern f34601e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final ie.p b() {
        String a2 = a(f34601e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new ie.p();
        pVar.f10407g = e2.c.m(a2, 1, 1);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
