package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;
public final class cz0 implements bd0, dd0 {
    public final ez0 f23439a;

    @Override
    public String j(int i10) {
        return this.f23439a.h[i10];
    }

    @Override
    public void q(fd0 fd0Var, int i10) {
        ez0 ez0Var = this.f23439a;
        ez0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        ez0Var.invalidate();
        try {
            fd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
