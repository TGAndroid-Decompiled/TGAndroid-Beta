package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class xz0 implements id0, kd0 {
    public final zz0 f34856a;

    @Override
    public String f(int i10) {
        return this.f34856a.f35449n[i10];
    }

    @Override
    public void q(md0 md0Var, int i10) {
        zz0 zz0Var = this.f34856a;
        zz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        zz0Var.invalidate();
        try {
            md0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
