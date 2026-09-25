package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class t31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28400a;
    public final String f28401b;
    public final Utilities.Callback2 f28402c;

    public t31(String str, String str2, Utilities.Callback2 callback2) {
        this.f28400a = str;
        this.f28401b = str2;
        this.f28402c = callback2;
    }

    @Override
    public void run(String str) {
        i41.x(this.f28400a, str, this.f28401b, this.f28402c);
    }

    @Override
    public void run(Exception exc) {
        i41.x(this.f28400a, "en", this.f28401b, this.f28402c);
    }
}
