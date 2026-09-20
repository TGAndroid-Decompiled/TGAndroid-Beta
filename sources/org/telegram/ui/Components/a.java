package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f22465a;
    public final e0 f22466b;

    public a(e0 e0Var, int i10) {
        this.f22465a = i10;
        this.f22466b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f22465a) {
            case 0:
                e0 e0Var = this.f22466b;
                e0Var.f23693r0 = str;
                e0Var.O0.N(true);
                return;
            default:
                e0 e0Var2 = this.f22466b;
                e0Var2.f23693r0 = str;
                e0Var2.O0.N(true);
                return;
        }
    }
}
