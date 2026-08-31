package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class g31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f27097a;
    public final String f27098b;
    public final Utilities.Callback2 f27099c;

    public g31(String str, String str2, Utilities.Callback2 callback2) {
        this.f27097a = str;
        this.f27098b = str2;
        this.f27099c = callback2;
    }

    @Override
    public void run(String str) {
        w31.x(this.f27097a, str, this.f27098b, this.f27099c);
    }

    @Override
    public void run(Exception exc) {
        w31.x(this.f27097a, "en", this.f27098b, this.f27099c);
    }
}
