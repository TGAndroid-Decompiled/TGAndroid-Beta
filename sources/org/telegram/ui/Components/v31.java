package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class v31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f28966a;
    public final String f28967b;
    public final Utilities.Callback2 f28968c;

    public v31(String str, String str2, Utilities.Callback2 callback2) {
        this.f28966a = str;
        this.f28967b = str2;
        this.f28968c = callback2;
    }

    @Override
    public void run(String str) {
        k41.x(this.f28966a, str, this.f28967b, this.f28968c);
    }

    @Override
    public void run(Exception exc) {
        k41.x(this.f28966a, "en", this.f28967b, this.f28968c);
    }
}
