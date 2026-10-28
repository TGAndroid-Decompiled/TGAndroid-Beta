package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
public final class a implements LanguageDetector.StringCallback {
    public final int f26369a;
    public final e0 f26370b;

    public a(e0 e0Var, int i10) {
        this.f26369a = i10;
        this.f26370b = e0Var;
    }

    @Override
    public final void run(String str) {
        switch (this.f26369a) {
            case 0:
                e0 e0Var = this.f26370b;
                e0Var.f27626r0 = str;
                e0Var.O0.O(true);
                return;
            default:
                e0 e0Var2 = this.f26370b;
                e0Var2.f27626r0 = str;
                e0Var2.O0.O(true);
                return;
        }
    }
}
