package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class yz0 implements jd0, ld0 {
    public final a01 f35185a;

    @Override
    public String f(int i10) {
        return this.f35185a.f26381n[i10];
    }

    @Override
    public void q(nd0 nd0Var, int i10) {
        a01 a01Var = this.f35185a;
        a01Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        a01Var.invalidate();
        try {
            nd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
