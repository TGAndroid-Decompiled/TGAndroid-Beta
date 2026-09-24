package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class t31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28393a;
    public final String f28394b;
    public final Utilities.Callback2 f28395c;

    public t31(String str, String str2, Utilities.Callback2 callback2) {
        this.f28393a = str;
        this.f28394b = str2;
        this.f28395c = callback2;
    }

    @Override
    public void run(String str) {
        i41.x(this.f28393a, str, this.f28394b, this.f28395c);
    }

    @Override
    public void run(Exception exc) {
        i41.x(this.f28393a, "en", this.f28394b, this.f28395c);
    }
}
