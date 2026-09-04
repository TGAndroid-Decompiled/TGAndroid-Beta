package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f24198a;
    public final f0 f24199b;

    public a(f0 f0Var, int i10) {
        this.f24198a = i10;
        this.f24199b = f0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f24198a) {
            case 0:
                f0 f0Var = this.f24199b;
                f0Var.f25835r0 = str;
                f0Var.O0.N(true);
                return;
            default:
                f0 f0Var2 = this.f24199b;
                f0Var2.f25835r0 = str;
                f0Var2.O0.N(true);
                return;
        }
    }
}
