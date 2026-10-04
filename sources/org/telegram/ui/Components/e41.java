package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class e41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25910a;
    public final String f25911b;
    public final Utilities.Callback2 f25912c;

    public e41(String str, String str2, Utilities.Callback2 callback2) {
        this.f25910a = str;
        this.f25911b = str2;
        this.f25912c = callback2;
    }

    @Override
    public void run(String str) {
        t41.x(this.f25910a, str, this.f25911b, this.f25912c);
    }

    @Override
    public void run(Exception exc) {
        t41.x(this.f25910a, "en", this.f25911b, this.f25912c);
    }
}
