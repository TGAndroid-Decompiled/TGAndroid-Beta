package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class mz0 implements cd0, ed0 {
    public final oz0 f28758a;

    @Override
    public String e(int i10) {
        return this.f28758a.h[i10];
    }

    @Override
    public void q(gd0 gd0Var, int i10) {
        oz0 oz0Var = this.f28758a;
        oz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        oz0Var.invalidate();
        try {
            gd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
