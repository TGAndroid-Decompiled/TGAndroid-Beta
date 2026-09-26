package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class u31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28689a;
    public final String f28690b;
    public final Utilities.Callback2 f28691c;

    public u31(String str, String str2, Utilities.Callback2 callback2) {
        this.f28689a = str;
        this.f28690b = str2;
        this.f28691c = callback2;
    }

    @Override
    public void run(String str) {
        j41.x(this.f28689a, str, this.f28690b, this.f28691c);
    }

    @Override
    public void run(Exception exc) {
        j41.x(this.f28689a, "en", this.f28690b, this.f28691c);
    }
}
