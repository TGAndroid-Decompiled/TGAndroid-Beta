package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class k21 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f29917a;
    public final String f29918b;
    public final Utilities.Callback2 f29919c;

    public k21(String str, String str2, Utilities.Callback2 callback2) {
        this.f29917a = str;
        this.f29918b = str2;
        this.f29919c = callback2;
    }

    @Override
    public void run(String str) {
        z21.x(this.f29917a, str, this.f29918b, this.f29919c);
    }

    @Override
    public void run(Exception exc) {
        z21.x(this.f29917a, "en", this.f29918b, this.f29919c);
    }
}
