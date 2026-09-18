package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class dz0 implements zc0, bd0 {
    public final fz0 f23712a;

    @Override
    public String j(int i10) {
        return this.f23712a.h[i10];
    }

    @Override
    public void q(dd0 dd0Var, int i10) {
        fz0 fz0Var = this.f23712a;
        fz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        fz0Var.invalidate();
        try {
            dd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
