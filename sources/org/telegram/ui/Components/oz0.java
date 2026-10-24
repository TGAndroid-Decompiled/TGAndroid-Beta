package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class oz0 implements kd0, md0 {
    public final qz0 f29434a;

    @Override
    public String e(int i10) {
        return this.f29434a.f30017n[i10];
    }

    @Override
    public void n(od0 od0Var, int i10) {
        qz0 qz0Var = this.f29434a;
        qz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        qz0Var.invalidate();
        try {
            od0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
