package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class f31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f24770a;
    public final String f24771b;
    public final Utilities.Callback2 f24772c;

    public f31(String str, String str2, Utilities.Callback2 callback2) {
        this.f24770a = str;
        this.f24771b = str2;
        this.f24772c = callback2;
    }

    @Override
    public void run(String str) {
        v31.x(this.f24770a, str, this.f24771b, this.f24772c);
    }

    @Override
    public void run(Exception exc) {
        v31.x(this.f24770a, "en", this.f24771b, this.f24772c);
    }
}
