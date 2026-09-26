package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class t31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28399a;
    public final String f28400b;
    public final Utilities.Callback2 f28401c;

    public t31(String str, String str2, Utilities.Callback2 callback2) {
        this.f28399a = str;
        this.f28400b = str2;
        this.f28401c = callback2;
    }

    @Override
    public void run(String str) {
        i41.x(this.f28399a, str, this.f28400b, this.f28401c);
    }

    @Override
    public void run(Exception exc) {
        i41.x(this.f28399a, "en", this.f28400b, this.f28401c);
    }
}
