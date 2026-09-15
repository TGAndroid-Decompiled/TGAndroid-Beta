package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class ry0 implements qc0, sc0 {
    public final ty0 f27711a;

    @Override
    public String e(int i10) {
        return this.f27711a.h[i10];
    }

    @Override
    public void q(uc0 uc0Var, int i10) {
        ty0 ty0Var = this.f27711a;
        ty0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        ty0Var.invalidate();
        try {
            uc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
