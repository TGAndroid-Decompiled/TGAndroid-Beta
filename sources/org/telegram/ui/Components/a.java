package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f23198a;
    public final f0 f23199b;

    public a(f0 f0Var, int i10) {
        this.f23198a = i10;
        this.f23199b = f0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f23198a) {
            case 0:
                f0 f0Var = this.f23199b;
                f0Var.f24742o0 = str;
                f0Var.L0.N(true);
                return;
            default:
                f0 f0Var2 = this.f23199b;
                f0Var2.f24742o0 = str;
                f0Var2.L0.N(true);
                return;
        }
    }
}
