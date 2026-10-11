package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f24379a;
    public final e0 f24380b;

    public a(e0 e0Var, int i10) {
        this.f24379a = i10;
        this.f24380b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f24379a) {
            case 0:
                e0 e0Var = this.f24380b;
                e0Var.f25777r0 = str;
                e0Var.O0.N(true);
                return;
            default:
                e0 e0Var2 = this.f24380b;
                e0Var2.f25777r0 = str;
                e0Var2.O0.N(true);
                return;
        }
    }
}
