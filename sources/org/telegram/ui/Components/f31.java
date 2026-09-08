package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class f31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25924a;
    public final String f25925b;
    public final Utilities.Callback2 f25926c;

    public f31(String str, String str2, Utilities.Callback2 callback2) {
        this.f25924a = str;
        this.f25925b = str2;
        this.f25926c = callback2;
    }

    @Override
    public void run(String str) {
        u31.x(this.f25924a, str, this.f25925b, this.f25926c);
    }

    @Override
    public void run(Exception exc) {
        u31.x(this.f25924a, "en", this.f25925b, this.f25926c);
    }
}
