package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class e90 extends yc.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final df.c b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        ?? cVar = new df.c();
        cVar.f48596g = c3.i0.m(1, 1, a2);
        return cVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
