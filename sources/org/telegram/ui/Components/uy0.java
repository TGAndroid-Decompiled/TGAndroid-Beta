package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class uy0 implements uc0, wc0 {
    public final wy0 f31711a;

    @Override
    public String e(int i10) {
        return this.f31711a.h[i10];
    }

    @Override
    public void q(yc0 yc0Var, int i10) {
        wy0 wy0Var = this.f31711a;
        wy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        wy0Var.invalidate();
        try {
            yc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
