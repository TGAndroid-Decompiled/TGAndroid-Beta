package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class f31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25897a;
    public final String f25898b;
    public final Utilities.Callback2 f25899c;

    public f31(String str, String str2, Utilities.Callback2 callback2) {
        this.f25897a = str;
        this.f25898b = str2;
        this.f25899c = callback2;
    }

    @Override
    public void run(String str) {
        u31.x(this.f25897a, str, this.f25898b, this.f25899c);
    }

    @Override
    public void run(Exception exc) {
        u31.x(this.f25897a, "en", this.f25898b, this.f25899c);
    }
}
