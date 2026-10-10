package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class tz0 implements rd0, td0 {
    public final vz0 f31280a;

    @Override
    public String i(int i10) {
        return this.f31280a.h[i10];
    }

    @Override
    public void r(vd0 vd0Var, int i10) {
        vz0 vz0Var = this.f31280a;
        vz0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        vz0Var.invalidate();
        try {
            vd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
