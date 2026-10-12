package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class yz0 implements ud0, wd0 {
    public final a01 f33231a;

    @Override
    public String e(int i10) {
        return this.f33231a.h[i10];
    }

    @Override
    public void q(yd0 yd0Var, int i10) {
        a01 a01Var = this.f33231a;
        a01Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        a01Var.invalidate();
        try {
            yd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
