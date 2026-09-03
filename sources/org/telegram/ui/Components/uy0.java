package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class uy0 implements tc0, vc0 {
    public final wy0 f29319a;

    @Override
    public String e(int i10) {
        return this.f29319a.h[i10];
    }

    @Override
    public void q(xc0 xc0Var, int i10) {
        wy0 wy0Var = this.f29319a;
        wy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        wy0Var.invalidate();
        try {
            xc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
