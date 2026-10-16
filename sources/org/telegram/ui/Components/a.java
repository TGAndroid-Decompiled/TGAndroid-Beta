package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f23063a;
    public final e0 f23064b;

    public a(e0 e0Var, int i10) {
        this.f23063a = i10;
        this.f23064b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f23063a) {
            case 0:
                e0 e0Var = this.f23064b;
                e0Var.f24232r0 = str;
                e0Var.O0.N(true);
                return;
            default:
                e0 e0Var2 = this.f23064b;
                e0Var2.f24232r0 = str;
                e0Var2.O0.N(true);
                return;
        }
    }
}
