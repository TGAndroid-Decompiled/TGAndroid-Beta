package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f23363a;
    public final e0 f23364b;

    public a(e0 e0Var, int i10) {
        this.f23363a = i10;
        this.f23364b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f23363a) {
            case 0:
                e0 e0Var = this.f23364b;
                e0Var.f24535r0 = str;
                e0Var.O0.N(true);
                return;
            default:
                e0 e0Var2 = this.f23364b;
                e0Var2.f24535r0 = str;
                e0Var2.O0.N(true);
                return;
        }
    }
}
