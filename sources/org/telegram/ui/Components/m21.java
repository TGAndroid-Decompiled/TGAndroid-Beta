package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;

public final class m21 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {

    public final String f30539a;

    public final String f30540b;

    public final Utilities.Callback2 f30541c;

    public m21(String str, String str2, Utilities.Callback2 callback2) {
        this.f30539a = str;
        this.f30540b = str2;
        this.f30541c = callback2;
    }

    @Override
    public void run(String str) {
        b31.y(this.f30539a, str, this.f30540b, this.f30541c);
    }

    @Override
    public void run(Exception exc) {
        b31.y(this.f30539a, "en", this.f30540b, this.f30541c);
    }
}
