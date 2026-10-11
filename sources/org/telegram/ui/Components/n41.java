package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class n41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28942a;
    public final String f28943b;
    public final Utilities.Callback2 f28944c;

    public n41(String str, String str2, Utilities.Callback2 callback2) {
        this.f28942a = str;
        this.f28943b = str2;
        this.f28944c = callback2;
    }

    @Override
    public void run(String str) {
        d51.z(this.f28942a, str, this.f28943b, this.f28944c);
    }

    @Override
    public void run(Exception exc) {
        d51.z(this.f28942a, "en", this.f28943b, this.f28944c);
    }
}
