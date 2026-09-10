package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class dz0 implements zc0, bd0 {
    public final fz0 f22510a;

    @Override
    public String k(int i10) {
        return this.f22510a.h[i10];
    }

    @Override
    public void q(dd0 dd0Var, int i10) {
        fz0 fz0Var = this.f22510a;
        fz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        fz0Var.invalidate();
        try {
            dd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
