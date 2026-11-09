package org.telegram.ui.Components;

import java.util.regex.Pattern;
public final class m80 extends ed.h {
    public static final Pattern f36018e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final kf.p b() {
        String a10 = a(f36018e);
        if (a10 == null) {
            return null;
        }
        ?? pVar = new kf.p();
        pVar.f60046g = com.google.android.recaptcha.internal.a.k(a10, 1, 1);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
