package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class c41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25102a;
    public final String f25103b;
    public final Utilities.Callback2 f25104c;

    public c41(String str, String str2, Utilities.Callback2 callback2) {
        this.f25102a = str;
        this.f25103b = str2;
        this.f25104c = callback2;
    }

    @Override
    public void run(String str) {
        t41.z(this.f25102a, str, this.f25103b, this.f25104c);
    }

    @Override
    public void run(Exception exc) {
        t41.z(this.f25102a, "en", this.f25103b, this.f25104c);
    }
}
