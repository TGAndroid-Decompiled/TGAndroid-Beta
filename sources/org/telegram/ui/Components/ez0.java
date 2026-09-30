package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class ez0 implements dd0, fd0 {
    public final gz0 f24084a;

    @Override
    public String j(int i10) {
        return this.f24084a.h[i10];
    }

    @Override
    public void q(hd0 hd0Var, int i10) {
        gz0 gz0Var = this.f24084a;
        gz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        gz0Var.invalidate();
        try {
            hd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
