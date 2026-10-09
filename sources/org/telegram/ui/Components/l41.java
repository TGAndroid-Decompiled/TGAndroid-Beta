package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class l41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28250a;
    public final String f28251b;
    public final Utilities.Callback2 f28252c;

    public l41(String str, String str2, Utilities.Callback2 callback2) {
        this.f28250a = str;
        this.f28251b = str2;
        this.f28252c = callback2;
    }

    @Override
    public void run(String str) {
        b51.z(this.f28250a, str, this.f28251b, this.f28252c);
    }

    @Override
    public void run(Exception exc) {
        b51.z(this.f28250a, "en", this.f28251b, this.f28252c);
    }
}
