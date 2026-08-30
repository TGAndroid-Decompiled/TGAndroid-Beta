package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f23225a;
    public final f0 f23226b;

    public a(f0 f0Var, int i10) {
        this.f23225a = i10;
        this.f23226b = f0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f23225a) {
            case 0:
                f0 f0Var = this.f23226b;
                f0Var.f24723o0 = str;
                f0Var.L0.N(true);
                return;
            default:
                f0 f0Var2 = this.f23226b;
                f0Var2.f24723o0 = str;
                f0Var2.L0.N(true);
                return;
        }
    }
}
