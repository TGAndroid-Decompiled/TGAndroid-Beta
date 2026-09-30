package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class w31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f29810a;
    public final String f29811b;
    public final Utilities.Callback2 f29812c;

    public w31(String str, String str2, Utilities.Callback2 callback2) {
        this.f29810a = str;
        this.f29811b = str2;
        this.f29812c = callback2;
    }

    @Override
    public void run(String str) {
        l41.x(this.f29810a, str, this.f29811b, this.f29812c);
    }

    @Override
    public void run(Exception exc) {
        l41.x(this.f29810a, "en", this.f29811b, this.f29812c);
    }
}
