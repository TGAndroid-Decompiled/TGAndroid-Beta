package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class bz0 implements ad0, cd0 {
    public final dz0 f23099a;

    @Override
    public String j(int i10) {
        return this.f23099a.h[i10];
    }

    @Override
    public void q(ed0 ed0Var, int i10) {
        dz0 dz0Var = this.f23099a;
        dz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        dz0Var.invalidate();
        try {
            ed0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
