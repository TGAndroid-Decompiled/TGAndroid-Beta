package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class uy0 implements sc0, uc0 {
    public final wy0 f29304a;

    @Override
    public String e(int i10) {
        return this.f29304a.h[i10];
    }

    @Override
    public void q(wc0 wc0Var, int i10) {
        wy0 wy0Var = this.f29304a;
        wy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        wy0Var.invalidate();
        try {
            wc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
