package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class b41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f24797a;
    public final String f24798b;
    public final Utilities.Callback2 f24799c;

    public b41(String str, String str2, Utilities.Callback2 callback2) {
        this.f24797a = str;
        this.f24798b = str2;
        this.f24799c = callback2;
    }

    @Override
    public void run(String str) {
        s41.z(this.f24797a, str, this.f24798b, this.f24799c);
    }

    @Override
    public void run(Exception exc) {
        s41.z(this.f24797a, "en", this.f24798b, this.f24799c);
    }
}
