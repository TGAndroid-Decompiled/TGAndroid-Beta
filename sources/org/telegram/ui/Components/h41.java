package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class h41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25502a;
    public final String f25503b;
    public final Utilities.Callback2 f25504c;

    public h41(String str, String str2, Utilities.Callback2 callback2) {
        this.f25502a = str;
        this.f25503b = str2;
        this.f25504c = callback2;
    }

    @Override
    public void run(String str) {
        x41.z(this.f25502a, str, this.f25503b, this.f25504c);
    }

    @Override
    public void run(Exception exc) {
        x41.z(this.f25502a, "en", this.f25503b, this.f25504c);
    }
}
