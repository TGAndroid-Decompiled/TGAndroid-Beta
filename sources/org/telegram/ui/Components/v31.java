package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class v31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f29024a;
    public final String f29025b;
    public final Utilities.Callback2 f29026c;

    public v31(String str, String str2, Utilities.Callback2 callback2) {
        this.f29024a = str;
        this.f29025b = str2;
        this.f29026c = callback2;
    }

    @Override
    public void run(String str) {
        k41.x(this.f29024a, str, this.f29025b, this.f29026c);
    }

    @Override
    public void run(Exception exc) {
        k41.x(this.f29024a, "en", this.f29025b, this.f29026c);
    }
}
