package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class sy0 implements qc0, sc0 {
    public final uy0 f27959a;

    @Override
    public String e(int i10) {
        return this.f27959a.h[i10];
    }

    @Override
    public void q(uc0 uc0Var, int i10) {
        uy0 uy0Var = this.f27959a;
        uy0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        uy0Var.invalidate();
        try {
            uc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
