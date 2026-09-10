package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class y90 extends ed.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final bf.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new bf.p();
        pVar.f47983g = com.google.android.gms.internal.vision.e2.h(1, 1, a2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
