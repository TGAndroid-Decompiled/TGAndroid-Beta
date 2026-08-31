package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class vy0 implements uc0, wc0 {
    public final xy0 f32573a;

    @Override
    public String e(int i10) {
        return this.f32573a.h[i10];
    }

    @Override
    public void q(yc0 yc0Var, int i10) {
        xy0 xy0Var = this.f32573a;
        xy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        xy0Var.invalidate();
        try {
            yc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
