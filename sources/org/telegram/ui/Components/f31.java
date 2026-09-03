package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class f31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f26757a;
    public final String f26758b;
    public final Utilities.Callback2 f26759c;

    public f31(String str, String str2, Utilities.Callback2 callback2) {
        this.f26757a = str;
        this.f26758b = str2;
        this.f26759c = callback2;
    }

    @Override
    public void run(String str) {
        v31.x(this.f26757a, str, this.f26758b, this.f26759c);
    }

    @Override
    public void run(Exception exc) {
        v31.x(this.f26757a, "en", this.f26758b, this.f26759c);
    }
}
