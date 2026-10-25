package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class n41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f30831a;
    public final String f30832b;
    public final Utilities.Callback2 f30833c;

    public n41(String str, String str2, Utilities.Callback2 callback2) {
        this.f30831a = str;
        this.f30832b = str2;
        this.f30833c = callback2;
    }

    @Override
    public void run(String str) {
        f51.I(this.f30831a, str, this.f30832b, this.f30833c);
    }

    @Override
    public void run(Exception exc) {
        f51.I(this.f30831a, "en", this.f30832b, this.f30833c);
    }
}
