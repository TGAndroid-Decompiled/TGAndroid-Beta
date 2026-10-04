package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class e41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25911a;
    public final String f25912b;
    public final Utilities.Callback2 f25913c;

    public e41(String str, String str2, Utilities.Callback2 callback2) {
        this.f25911a = str;
        this.f25912b = str2;
        this.f25913c = callback2;
    }

    @Override
    public void run(String str) {
        t41.x(this.f25911a, str, this.f25912b, this.f25913c);
    }

    @Override
    public void run(Exception exc) {
        t41.x(this.f25911a, "en", this.f25912b, this.f25913c);
    }
}
