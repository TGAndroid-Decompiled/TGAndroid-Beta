package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class cz0 implements yc0, ad0 {
    public final ez0 f23439a;

    @Override
    public String e(int i10) {
        return this.f23439a.h[i10];
    }

    @Override
    public void q(cd0 cd0Var, int i10) {
        ez0 ez0Var = this.f23439a;
        ez0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        ez0Var.invalidate();
        try {
            cd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
