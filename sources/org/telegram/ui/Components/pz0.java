package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class pz0 implements qd0, sd0 {
    public final rz0 f28141a;

    @Override
    public String e(int i10) {
        return this.f28141a.h[i10];
    }

    @Override
    public void r(ud0 ud0Var, int i10) {
        rz0 rz0Var = this.f28141a;
        rz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        rz0Var.invalidate();
        try {
            ud0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
