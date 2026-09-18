package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class v31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28909a;
    public final String f28910b;
    public final Utilities.Callback2 f28911c;

    public v31(String str, String str2, Utilities.Callback2 callback2) {
        this.f28909a = str;
        this.f28910b = str2;
        this.f28911c = callback2;
    }

    @Override
    public void run(String str) {
        k41.x(this.f28909a, str, this.f28910b, this.f28911c);
    }

    @Override
    public void run(Exception exc) {
        k41.x(this.f28909a, "en", this.f28910b, this.f28911c);
    }
}
