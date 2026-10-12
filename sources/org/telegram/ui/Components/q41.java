package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class q41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f29662a;
    public final String f29663b;
    public final Utilities.Callback2 f29664c;

    public q41(String str, String str2, Utilities.Callback2 callback2) {
        this.f29662a = str;
        this.f29663b = str2;
        this.f29664c = callback2;
    }

    @Override
    public void run(String str) {
        g51.z(this.f29662a, str, this.f29663b, this.f29664c);
    }

    @Override
    public void run(Exception exc) {
        g51.z(this.f29662a, "en", this.f29663b, this.f29664c);
    }
}
