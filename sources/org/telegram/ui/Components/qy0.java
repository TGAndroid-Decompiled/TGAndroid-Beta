package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class qy0 implements rc0, tc0 {
    public final sy0 f29837a;

    @Override
    public String f(int i10) {
        return this.f29837a.h[i10];
    }

    @Override
    public void s(vc0 vc0Var, int i10) {
        sy0 sy0Var = this.f29837a;
        sy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        sy0Var.invalidate();
        try {
            vc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
