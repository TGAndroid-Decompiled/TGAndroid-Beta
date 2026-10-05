package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class f41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f26321a;
    public final String f26322b;
    public final Utilities.Callback2 f26323c;

    public f41(String str, String str2, Utilities.Callback2 callback2) {
        this.f26321a = str;
        this.f26322b = str2;
        this.f26323c = callback2;
    }

    @Override
    public void run(String str) {
        u41.x(this.f26321a, str, this.f26322b, this.f26323c);
    }

    @Override
    public void run(Exception exc) {
        u41.x(this.f26321a, "en", this.f26322b, this.f26323c);
    }
}
