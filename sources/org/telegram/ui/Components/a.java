package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f22466a;
    public final e0 f22467b;

    public a(e0 e0Var, int i10) {
        this.f22466a = i10;
        this.f22467b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f22466a) {
            case 0:
                e0 e0Var = this.f22467b;
                e0Var.f23795r0 = str;
                e0Var.O0.N(true);
                return;
            default:
                e0 e0Var2 = this.f22467b;
                e0Var2.f23795r0 = str;
                e0Var2.O0.N(true);
                return;
        }
    }
}
