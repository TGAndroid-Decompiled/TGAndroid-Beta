package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f26365a;
    public final e0 f26366b;

    public a(e0 e0Var, int i10) {
        this.f26365a = i10;
        this.f26366b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f26365a) {
            case 0:
                e0 e0Var = this.f26366b;
                e0Var.f27656r0 = str;
                e0Var.O0.O(true);
                return;
            default:
                e0 e0Var2 = this.f26366b;
                e0Var2.f27656r0 = str;
                e0Var2.O0.O(true);
                return;
        }
    }
}
