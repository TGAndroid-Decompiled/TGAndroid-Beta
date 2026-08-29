package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class jy0 implements mc0, oc0 {
    public final ly0 f29854a;

    @Override
    public String e(int i10) {
        return this.f29854a.h[i10];
    }

    @Override
    public void q(qc0 qc0Var, int i10) {
        ly0 ly0Var = this.f29854a;
        ly0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        ly0Var.invalidate();
        try {
            qc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
