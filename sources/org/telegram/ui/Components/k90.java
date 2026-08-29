package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class k90 extends oc.h {
    public static final Pattern f29975e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final le.p b() {
        String a2 = a(f29975e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new le.p();
        pVar.f11442g = com.google.android.recaptcha.internal.a.m(a2, 1, 1);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
