package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class p90 extends ed.h {
    public static final Pattern f29350e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final bf.p b() {
        String a2 = a(f29350e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new bf.p();
        pVar.f51548g = com.google.android.gms.internal.vision.e2.i(1, 1, a2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
