package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class c41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25099a;
    public final String f25100b;
    public final Utilities.Callback2 f25101c;

    public c41(String str, String str2, Utilities.Callback2 callback2) {
        this.f25099a = str;
        this.f25100b = str2;
        this.f25101c = callback2;
    }

    @Override
    public void run(String str) {
        t41.z(this.f25099a, str, this.f25100b, this.f25101c);
    }

    @Override
    public void run(Exception exc) {
        t41.z(this.f25099a, "en", this.f25100b, this.f25101c);
    }
}
