package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f24165a;
    public final e0 f24166b;

    public a(e0 e0Var, int i10) {
        this.f24165a = i10;
        this.f24166b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f24165a) {
            case 0:
                e0 e0Var = this.f24166b;
                e0Var.f25529r0 = str;
                e0Var.O0.N(true);
                return;
            default:
                e0 e0Var2 = this.f24166b;
                e0Var2.f25529r0 = str;
                e0Var2.O0.N(true);
                return;
        }
    }
}
