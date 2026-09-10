package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class t31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f27304a;
    public final String f27305b;
    public final Utilities.Callback2 f27306c;

    public t31(String str, String str2, Utilities.Callback2 callback2) {
        this.f27304a = str;
        this.f27305b = str2;
        this.f27306c = callback2;
    }

    @Override
    public void run(String str) {
        i41.x(this.f27304a, str, this.f27305b, this.f27306c);
    }

    @Override
    public void run(Exception exc) {
        i41.x(this.f27304a, "en", this.f27305b, this.f27306c);
    }
}
