package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class lz0 implements kd0, md0 {
    public final nz0 f28340a;

    @Override
    public String e(int i10) {
        return this.f28340a.h[i10];
    }

    @Override
    public void q(od0 od0Var, int i10) {
        nz0 nz0Var = this.f28340a;
        nz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        nz0Var.invalidate();
        try {
            od0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
