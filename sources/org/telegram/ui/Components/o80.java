package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class o80 extends ed.h {
    public static final Pattern f37863e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final kf.p b() {
        String a10 = a(f37863e);
        if (a10 == null) {
            return null;
        }
        ?? pVar = new kf.p();
        pVar.f61245g = com.google.android.gms.internal.vision.e2.k(a10, 1, 1);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
