package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class f31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f24788a;
    public final String f24789b;
    public final Utilities.Callback2 f24790c;

    public f31(String str, String str2, Utilities.Callback2 callback2) {
        this.f24788a = str;
        this.f24789b = str2;
        this.f24790c = callback2;
    }

    @Override
    public void run(String str) {
        v31.x(this.f24788a, str, this.f24789b, this.f24790c);
    }

    @Override
    public void run(Exception exc) {
        v31.x(this.f24788a, "en", this.f24789b, this.f24790c);
    }
}
