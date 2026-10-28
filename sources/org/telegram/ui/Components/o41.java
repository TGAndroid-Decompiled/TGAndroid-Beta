package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class o41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f31158a;
    public final String f31159b;
    public final Utilities.Callback2 f31160c;

    public o41(String str, String str2, Utilities.Callback2 callback2) {
        this.f31158a = str;
        this.f31159b = str2;
        this.f31160c = callback2;
    }

    @Override
    public void run(String str) {
        g51.I(this.f31158a, str, this.f31159b, this.f31160c);
    }

    @Override
    public void run(Exception exc) {
        g51.I(this.f31158a, "en", this.f31159b, this.f31160c);
    }
}
