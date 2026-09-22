package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class ez0 implements bd0, dd0 {
    public final gz0 f24061a;

    @Override
    public String e(int i10) {
        return this.f24061a.h[i10];
    }

    @Override
    public void q(fd0 fd0Var, int i10) {
        gz0 gz0Var = this.f24061a;
        gz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        gz0Var.invalidate();
        try {
            fd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
