package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class g31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f24174a;
    public final String f24175b;
    public final Utilities.Callback2 f24176c;

    public g31(String str, String str2, Utilities.Callback2 callback2) {
        this.f24174a = str;
        this.f24175b = str2;
        this.f24176c = callback2;
    }

    @Override
    public void run(String str) {
        v31.x(this.f24174a, str, this.f24175b, this.f24176c);
    }

    @Override
    public void run(Exception exc) {
        v31.x(this.f24174a, "en", this.f24175b, this.f24176c);
    }
}
