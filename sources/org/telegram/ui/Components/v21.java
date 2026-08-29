package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class v21 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f33437a;
    public final String f33438b;
    public final Utilities.Callback2 f33439c;

    public v21(String str, String str2, Utilities.Callback2 callback2) {
        this.f33437a = str;
        this.f33438b = str2;
        this.f33439c = callback2;
    }

    @Override
    public void run(String str) {
        k31.x(this.f33437a, str, this.f33438b, this.f33439c);
    }

    @Override
    public void run(Exception exc) {
        k31.x(this.f33437a, "en", this.f33438b, this.f33439c);
    }
}
