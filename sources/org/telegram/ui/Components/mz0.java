package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class mz0 implements kd0, md0 {
    public final oz0 f28640a;

    @Override
    public String e(int i10) {
        return this.f28640a.h[i10];
    }

    @Override
    public void q(od0 od0Var, int i10) {
        oz0 oz0Var = this.f28640a;
        oz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        oz0Var.invalidate();
        try {
            od0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
