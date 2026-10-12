package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class oz0 implements qd0, sd0 {
    public final qz0 f28116a;

    @Override
    public String e(int i10) {
        return this.f28116a.h[i10];
    }

    @Override
    public void r(ud0 ud0Var, int i10) {
        qz0 qz0Var = this.f28116a;
        qz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        qz0Var.invalidate();
        try {
            ud0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
