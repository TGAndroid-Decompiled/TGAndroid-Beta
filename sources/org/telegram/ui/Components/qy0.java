package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class qy0 implements pc0, rc0 {
    public final sy0 f27488a;

    @Override
    public String e(int i10) {
        return this.f27488a.h[i10];
    }

    @Override
    public void q(tc0 tc0Var, int i10) {
        sy0 sy0Var = this.f27488a;
        sy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        sy0Var.invalidate();
        try {
            tc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
