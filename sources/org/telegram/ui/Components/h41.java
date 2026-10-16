package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class h41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f25171a;
    public final String f25172b;
    public final Utilities.Callback2 f25173c;

    public h41(String str, String str2, Utilities.Callback2 callback2) {
        this.f25171a = str;
        this.f25172b = str2;
        this.f25173c = callback2;
    }

    @Override
    public void run(String str) {
        x41.z(this.f25171a, str, this.f25172b, this.f25173c);
    }

    @Override
    public void run(Exception exc) {
        x41.z(this.f25171a, "en", this.f25172b, this.f25173c);
    }
}
