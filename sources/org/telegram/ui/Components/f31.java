package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class f31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25898a;
    public final String f25899b;
    public final Utilities.Callback2 f25900c;

    public f31(String str, String str2, Utilities.Callback2 callback2) {
        this.f25898a = str;
        this.f25899b = str2;
        this.f25900c = callback2;
    }

    @Override
    public void run(String str) {
        u31.x(this.f25898a, str, this.f25899b, this.f25900c);
    }

    @Override
    public void run(Exception exc) {
        u31.x(this.f25898a, "en", this.f25899b, this.f25900c);
    }
}
