package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class sz0 implements qd0, sd0 {
    public final uz0 f30954a;

    @Override
    public String i(int i10) {
        return this.f30954a.h[i10];
    }

    @Override
    public void r(ud0 ud0Var, int i10) {
        uz0 uz0Var = this.f30954a;
        uz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        uz0Var.invalidate();
        try {
            ud0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
