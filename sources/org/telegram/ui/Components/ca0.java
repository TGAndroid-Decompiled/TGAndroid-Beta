package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class ca0 extends ed.h {
    public static final Pattern f25304e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final bf.p b() {
        String a2 = a(f25304e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new bf.p();
        pVar.f53195g = com.google.android.gms.internal.vision.e2.i(1, 1, a2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
