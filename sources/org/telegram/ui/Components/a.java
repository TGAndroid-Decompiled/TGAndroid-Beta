package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f26599a;
    public final g0 f26600b;

    public a(g0 g0Var, int i10) {
        this.f26599a = i10;
        this.f26600b = g0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f26599a) {
            case 0:
                g0 g0Var = this.f26600b;
                g0Var.f28678n0 = str;
                g0Var.K0.N(true);
                return;
            default:
                g0 g0Var2 = this.f26600b;
                g0Var2.f28678n0 = str;
                g0Var2.K0.N(true);
                return;
        }
    }
}
