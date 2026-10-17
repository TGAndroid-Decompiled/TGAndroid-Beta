package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class kz0 implements kd0, md0 {
    public final mz0 f28033a;

    @Override
    public String e(int i10) {
        return this.f28033a.h[i10];
    }

    @Override
    public void q(od0 od0Var, int i10) {
        mz0 mz0Var = this.f28033a;
        mz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        mz0Var.invalidate();
        try {
            od0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
