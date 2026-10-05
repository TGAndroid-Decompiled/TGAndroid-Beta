package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class nz0 implements cd0, ed0 {
    public final pz0 f29271a;

    @Override
    public String e(int i10) {
        return this.f29271a.h[i10];
    }

    @Override
    public void q(gd0 gd0Var, int i10) {
        pz0 pz0Var = this.f29271a;
        pz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        pz0Var.invalidate();
        try {
            gd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
