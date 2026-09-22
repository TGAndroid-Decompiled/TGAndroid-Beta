package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class w31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f29908a;
    public final String f29909b;
    public final Utilities.Callback2 f29910c;

    public w31(String str, String str2, Utilities.Callback2 callback2) {
        this.f29908a = str;
        this.f29909b = str2;
        this.f29910c = callback2;
    }

    @Override
    public void run(String str) {
        l41.x(this.f29908a, str, this.f29909b, this.f29910c);
    }

    @Override
    public void run(Exception exc) {
        l41.x(this.f29908a, "en", this.f29909b, this.f29910c);
    }
}
