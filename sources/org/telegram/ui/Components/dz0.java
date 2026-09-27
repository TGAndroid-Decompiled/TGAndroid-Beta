package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class dz0 implements ad0, cd0 {
    public final fz0 f23777a;

    @Override
    public String j(int i10) {
        return this.f23777a.h[i10];
    }

    @Override
    public void q(ed0 ed0Var, int i10) {
        fz0 fz0Var = this.f23777a;
        fz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        fz0Var.invalidate();
        try {
            ed0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
