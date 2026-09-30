package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class v31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28959a;
    public final String f28960b;
    public final Utilities.Callback2 f28961c;

    public v31(String str, String str2, Utilities.Callback2 callback2) {
        this.f28959a = str;
        this.f28960b = str2;
        this.f28961c = callback2;
    }

    @Override
    public void run(String str) {
        k41.x(this.f28959a, str, this.f28960b, this.f28961c);
    }

    @Override
    public void run(Exception exc) {
        k41.x(this.f28959a, "en", this.f28960b, this.f28961c);
    }
}
