package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f24574a;
    public final e0 f24575b;

    public a(e0 e0Var, int i10) {
        this.f24574a = i10;
        this.f24575b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f24574a) {
            case 0:
                e0 e0Var = this.f24575b;
                e0Var.f25780r0 = str;
                e0Var.O0.N(true);
                return;
            default:
                e0 e0Var2 = this.f24575b;
                e0Var2.f25780r0 = str;
                e0Var2.O0.N(true);
                return;
        }
    }
}
