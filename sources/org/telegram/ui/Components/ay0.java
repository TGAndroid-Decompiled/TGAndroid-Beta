package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

public final class ay0 implements bc0, dc0 {

    public final cy0 f26845a;

    @Override
    public String g(int i10) {
        return this.f26845a.h[i10];
    }

    @Override
    public void m(fc0 fc0Var, int i10) {
        cy0 cy0Var = this.f26845a;
        cy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        cy0Var.invalidate();
        try {
            fc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
