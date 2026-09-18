package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class h31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f24471a;
    public final String f24472b;
    public final Utilities.Callback2 f24473c;

    public h31(String str, String str2, Utilities.Callback2 callback2) {
        this.f24471a = str;
        this.f24472b = str2;
        this.f24473c = callback2;
    }

    @Override
    public void run(String str) {
        w31.x(this.f24471a, str, this.f24472b, this.f24473c);
    }

    @Override
    public void run(Exception exc) {
        w31.x(this.f24471a, "en", this.f24472b, this.f24473c);
    }
}
