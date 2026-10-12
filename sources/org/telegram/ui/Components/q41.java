package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
public final class q41 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f29684a;
    public final String f29685b;
    public final Utilities.Callback2 f29686c;

    public q41(String str, String str2, Utilities.Callback2 callback2) {
        this.f29684a = str;
        this.f29685b = str2;
        this.f29686c = callback2;
    }

    @Override
    public void run(String str) {
        g51.z(this.f29684a, str, this.f29685b, this.f29686c);
    }

    @Override
    public void run(Exception exc) {
        g51.z(this.f29684a, "en", this.f29685b, this.f29686c);
    }
}
