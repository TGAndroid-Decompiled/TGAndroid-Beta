package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class tz0 implements qd0, sd0 {
    public final vz0 f31399a;

    @Override
    public String e(int i10) {
        return this.f31399a.h[i10];
    }

    @Override
    public void q(ud0 ud0Var, int i10) {
        vz0 vz0Var = this.f31399a;
        vz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        vz0Var.invalidate();
        try {
            ud0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
