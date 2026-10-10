package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class m41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28628a;
    public final String f28629b;
    public final Utilities.Callback2 f28630c;

    public m41(String str, String str2, Utilities.Callback2 callback2) {
        this.f28628a = str;
        this.f28629b = str2;
        this.f28630c = callback2;
    }

    @Override
    public void run(String str) {
        c51.z(this.f28628a, str, this.f28629b, this.f28630c);
    }

    @Override
    public void run(Exception exc) {
        c51.z(this.f28628a, "en", this.f28629b, this.f28630c);
    }
}
