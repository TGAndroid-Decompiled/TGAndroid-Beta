package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class a41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f24495a;
    public final String f24496b;
    public final Utilities.Callback2 f24497c;

    public a41(String str, String str2, Utilities.Callback2 callback2) {
        this.f24495a = str;
        this.f24496b = str2;
        this.f24497c = callback2;
    }

    @Override
    public void run(String str) {
        r41.z(this.f24495a, str, this.f24496b, this.f24497c);
    }

    @Override
    public void run(Exception exc) {
        r41.z(this.f24495a, "en", this.f24496b, this.f24497c);
    }
}
