package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class a41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f24502a;
    public final String f24503b;
    public final Utilities.Callback2 f24504c;

    public a41(String str, String str2, Utilities.Callback2 callback2) {
        this.f24502a = str;
        this.f24503b = str2;
        this.f24504c = callback2;
    }

    @Override
    public void run(String str) {
        r41.z(this.f24502a, str, this.f24503b, this.f24504c);
    }

    @Override
    public void run(Exception exc) {
        r41.z(this.f24502a, "en", this.f24503b, this.f24504c);
    }
}
