package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class uz0 implements rd0, td0 {
    public final wz0 f31620a;

    @Override
    public String e(int i10) {
        return this.f31620a.h[i10];
    }

    @Override
    public void q(vd0 vd0Var, int i10) {
        wz0 wz0Var = this.f31620a;
        wz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        wz0Var.invalidate();
        try {
            vd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
