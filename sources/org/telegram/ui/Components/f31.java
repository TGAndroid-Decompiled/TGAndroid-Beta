package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class f31 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f23833a;
    public final String f23834b;
    public final Utilities.Callback2 f23835c;

    public f31(String str, String str2, Utilities.Callback2 callback2) {
        this.f23833a = str;
        this.f23834b = str2;
        this.f23835c = callback2;
    }

    @Override
    public void run(String str) {
        u31.x(this.f23833a, str, this.f23834b, this.f23835c);
    }

    @Override
    public void run(Exception exc) {
        u31.x(this.f23833a, "en", this.f23834b, this.f23835c);
    }
}
