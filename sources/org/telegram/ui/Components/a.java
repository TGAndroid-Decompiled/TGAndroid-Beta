package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f26588a;
    public final e0 f26589b;

    public a(e0 e0Var, int i9) {
        this.f26588a = i9;
        this.f26589b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f26588a) {
            case 0:
                e0 e0Var = this.f26589b;
                e0Var.f27864n0 = str;
                e0Var.K0.N(true);
                return;
            default:
                e0 e0Var2 = this.f26589b;
                e0Var2.f27864n0 = str;
                e0Var2.K0.N(true);
                return;
        }
    }
}
