package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class yx0 implements xb0, zb0 {
    public final ay0 f35098a;

    @Override
    public String g(int i9) {
        return this.f35098a.h[i9];
    }

    @Override
    public void m(bc0 bc0Var, int i9) {
        ay0 ay0Var = this.f35098a;
        ay0Var.b();
        SharedConfig.updateChatListSwipeSetting(i9);
        ay0Var.invalidate();
        try {
            bc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
