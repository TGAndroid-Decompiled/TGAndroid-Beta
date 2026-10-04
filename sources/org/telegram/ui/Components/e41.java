package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class e41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25916a;
    public final String f25917b;
    public final Utilities.Callback2 f25918c;

    public e41(String str, String str2, Utilities.Callback2 callback2) {
        this.f25916a = str;
        this.f25917b = str2;
        this.f25918c = callback2;
    }

    @Override
    public void run(String str) {
        t41.x(this.f25916a, str, this.f25917b, this.f25918c);
    }

    @Override
    public void run(Exception exc) {
        t41.x(this.f25916a, "en", this.f25917b, this.f25918c);
    }
}
