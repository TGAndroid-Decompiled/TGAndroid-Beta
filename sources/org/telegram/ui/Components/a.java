package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f22254a;
    public final e0 f22255b;

    public a(e0 e0Var, int i10) {
        this.f22254a = i10;
        this.f22255b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f22254a) {
            case 0:
                e0 e0Var = this.f22255b;
                e0Var.f23431r0 = str;
                e0Var.O0.N(true);
                return;
            default:
                e0 e0Var2 = this.f22255b;
                e0Var2.f23431r0 = str;
                e0Var2.O0.N(true);
                return;
        }
    }
}
