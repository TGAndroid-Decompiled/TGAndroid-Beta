package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class ua0 extends fd.h {
    public static final Pattern f31129e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final cf.p b() {
        String a2 = a(f31129e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new cf.p();
        pVar.f423g = com.google.android.gms.internal.vision.e2.i(1, 1, a2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
