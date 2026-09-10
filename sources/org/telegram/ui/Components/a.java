package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f21329a;
    public final g0 f21330b;

    public a(g0 g0Var, int i10) {
        this.f21329a = i10;
        this.f21330b = g0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f21329a) {
            case 0:
                g0 g0Var = this.f21330b;
                g0Var.f23127r0 = str;
                g0Var.O0.N(true);
                return;
            default:
                g0 g0Var2 = this.f21330b;
                g0Var2.f23127r0 = str;
                g0Var2.O0.N(true);
                return;
        }
    }
}
