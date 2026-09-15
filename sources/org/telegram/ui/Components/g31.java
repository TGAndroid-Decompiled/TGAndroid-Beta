package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class g31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f24177a;
    public final String f24178b;
    public final Utilities.Callback2 f24179c;

    public g31(String str, String str2, Utilities.Callback2 callback2) {
        this.f24177a = str;
        this.f24178b = str2;
        this.f24179c = callback2;
    }

    @Override
    public void run(String str) {
        v31.x(this.f24177a, str, this.f24178b, this.f24179c);
    }

    @Override
    public void run(Exception exc) {
        v31.x(this.f24177a, "en", this.f24178b, this.f24179c);
    }
}
