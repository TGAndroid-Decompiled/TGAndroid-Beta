package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f24225a;
    public final f0 f24226b;

    public a(f0 f0Var, int i10) {
        this.f24225a = i10;
        this.f24226b = f0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f24225a) {
            case 0:
                f0 f0Var = this.f24226b;
                f0Var.f25862r0 = str;
                f0Var.O0.N(true);
                return;
            default:
                f0 f0Var2 = this.f24226b;
                f0Var2.f25862r0 = str;
                f0Var2.O0.N(true);
                return;
        }
    }
}
