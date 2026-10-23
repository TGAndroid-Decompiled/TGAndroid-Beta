package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class c41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25103a;
    public final String f25104b;
    public final Utilities.Callback2 f25105c;

    public c41(String str, String str2, Utilities.Callback2 callback2) {
        this.f25103a = str;
        this.f25104b = str2;
        this.f25105c = callback2;
    }

    @Override
    public void run(String str) {
        t41.z(this.f25103a, str, this.f25104b, this.f25105c);
    }

    @Override
    public void run(Exception exc) {
        t41.z(this.f25103a, "en", this.f25104b, this.f25105c);
    }
}
