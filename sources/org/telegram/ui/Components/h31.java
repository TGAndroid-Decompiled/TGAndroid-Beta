package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class h31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f24468a;
    public final String f24469b;
    public final Utilities.Callback2 f24470c;

    public h31(String str, String str2, Utilities.Callback2 callback2) {
        this.f24468a = str;
        this.f24469b = str2;
        this.f24470c = callback2;
    }

    @Override
    public void run(String str) {
        w31.x(this.f24468a, str, this.f24469b, this.f24470c);
    }

    @Override
    public void run(Exception exc) {
        w31.x(this.f24468a, "en", this.f24469b, this.f24470c);
    }
}
