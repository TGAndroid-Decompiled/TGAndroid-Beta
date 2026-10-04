package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f24384a;
    public final e0 f24385b;

    public a(e0 e0Var, int i10) {
        this.f24384a = i10;
        this.f24385b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f24384a) {
            case 0:
                e0 e0Var = this.f24385b;
                e0Var.f25859r0 = str;
                e0Var.O0.N(true);
                return;
            default:
                e0 e0Var2 = this.f24385b;
                e0Var2.f25859r0 = str;
                e0Var2.O0.N(true);
                return;
        }
    }
}
