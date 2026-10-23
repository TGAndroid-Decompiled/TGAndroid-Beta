package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class pz0 implements md0, od0 {
    public final rz0 f29703a;

    @Override
    public String e(int i10) {
        return this.f29703a.f30294n[i10];
    }

    @Override
    public void n(qd0 qd0Var, int i10) {
        rz0 rz0Var = this.f29703a;
        rz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        rz0Var.invalidate();
        try {
            qd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
