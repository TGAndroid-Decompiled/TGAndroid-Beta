package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class b41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f24799a;
    public final String f24800b;
    public final Utilities.Callback2 f24801c;

    public b41(String str, String str2, Utilities.Callback2 callback2) {
        this.f24799a = str;
        this.f24800b = str2;
        this.f24801c = callback2;
    }

    @Override
    public void run(String str) {
        s41.z(this.f24799a, str, this.f24800b, this.f24801c);
    }

    @Override
    public void run(Exception exc) {
        s41.z(this.f24799a, "en", this.f24800b, this.f24801c);
    }
}
