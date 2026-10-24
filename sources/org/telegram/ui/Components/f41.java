package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class f41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f26192a;
    public final String f26193b;
    public final Utilities.Callback2 f26194c;

    public f41(String str, String str2, Utilities.Callback2 callback2) {
        this.f26192a = str;
        this.f26193b = str2;
        this.f26194c = callback2;
    }

    @Override
    public void run(String str) {
        x41.I(this.f26192a, str, this.f26193b, this.f26194c);
    }

    @Override
    public void run(Exception exc) {
        x41.I(this.f26192a, "en", this.f26193b, this.f26194c);
    }
}
