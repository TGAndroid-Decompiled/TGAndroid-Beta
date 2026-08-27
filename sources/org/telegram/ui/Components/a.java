package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;

public final class a implements LanguageDetector.StringCallback {

    public final int f26584a;

    public final e0 f26585b;

    public a(e0 e0Var, int i10) {
        this.f26584a = i10;
        this.f26585b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f26584a) {
            case 0:
                e0 e0Var = this.f26585b;
                e0Var.f27890n0 = str;
                e0Var.K0.N(true);
                break;
            default:
                e0 e0Var2 = this.f26585b;
                e0Var2.f27890n0 = str;
                e0Var2.K0.N(true);
                break;
        }
    }
}
