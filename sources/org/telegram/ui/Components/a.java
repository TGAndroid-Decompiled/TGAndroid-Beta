package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f25090a;
    public final f0 f25091b;

    public a(f0 f0Var, int i10) {
        this.f25090a = i10;
        this.f25091b = f0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f25090a) {
            case 0:
                f0 f0Var = this.f25091b;
                f0Var.f26719o0 = str;
                f0Var.L0.N(true);
                return;
            default:
                f0 f0Var2 = this.f25091b;
                f0Var2.f26719o0 = str;
                f0Var2.L0.N(true);
                return;
        }
    }
}
