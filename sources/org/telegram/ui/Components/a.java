package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f24425a;
    public final e0 f24426b;

    public a(e0 e0Var, int i10) {
        this.f24425a = i10;
        this.f24426b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f24425a) {
            case 0:
                e0 e0Var = this.f24426b;
                e0Var.f25756r0 = str;
                e0Var.O0.N(true);
                return;
            default:
                e0 e0Var2 = this.f24426b;
                e0Var2.f25756r0 = str;
                e0Var2.O0.N(true);
                return;
        }
    }
}
