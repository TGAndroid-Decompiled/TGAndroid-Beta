package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class n41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f30833a;
    public final String f30834b;
    public final Utilities.Callback2 f30835c;

    public n41(String str, String str2, Utilities.Callback2 callback2) {
        this.f30833a = str;
        this.f30834b = str2;
        this.f30835c = callback2;
    }

    @Override
    public void run(String str) {
        f51.I(this.f30833a, str, this.f30834b, this.f30835c);
    }

    @Override
    public void run(Exception exc) {
        f51.I(this.f30833a, "en", this.f30834b, this.f30835c);
    }
}
