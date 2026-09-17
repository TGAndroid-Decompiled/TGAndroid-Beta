package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class f31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25925a;
    public final String f25926b;
    public final Utilities.Callback2 f25927c;

    public f31(String str, String str2, Utilities.Callback2 callback2) {
        this.f25925a = str;
        this.f25926b = str2;
        this.f25927c = callback2;
    }

    @Override
    public void run(String str) {
        u31.x(this.f25925a, str, this.f25926b, this.f25927c);
    }

    @Override
    public void run(Exception exc) {
        u31.x(this.f25925a, "en", this.f25926b, this.f25927c);
    }
}
