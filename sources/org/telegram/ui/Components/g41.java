package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class g41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f26537a;
    public final String f26538b;
    public final Utilities.Callback2 f26539c;

    public g41(String str, String str2, Utilities.Callback2 callback2) {
        this.f26537a = str;
        this.f26538b = str2;
        this.f26539c = callback2;
    }

    @Override
    public void run(String str) {
        y41.I(this.f26537a, str, this.f26538b, this.f26539c);
    }

    @Override
    public void run(Exception exc) {
        y41.I(this.f26537a, "en", this.f26538b, this.f26539c);
    }
}
