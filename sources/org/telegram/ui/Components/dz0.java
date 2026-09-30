package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class dz0 implements cd0, ed0 {
    public final fz0 f23749a;

    @Override
    public String j(int i10) {
        return this.f23749a.h[i10];
    }

    @Override
    public void q(gd0 gd0Var, int i10) {
        fz0 fz0Var = this.f23749a;
        fz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        fz0Var.invalidate();
        try {
            gd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
