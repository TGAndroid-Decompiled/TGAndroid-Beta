package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class m41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28704a;
    public final String f28705b;
    public final Utilities.Callback2 f28706c;

    public m41(String str, String str2, Utilities.Callback2 callback2) {
        this.f28704a = str;
        this.f28705b = str2;
        this.f28706c = callback2;
    }

    @Override
    public void run(String str) {
        c51.z(this.f28704a, str, this.f28705b, this.f28706c);
    }

    @Override
    public void run(Exception exc) {
        c51.z(this.f28704a, "en", this.f28705b, this.f28706c);
    }
}
