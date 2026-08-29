package org.telegram.ui.Components;

import android.view.View;
public final class le implements b5, bl0 {
    public final ChatActivityEnterView f30294a;

    public le(ChatActivityEnterView chatActivityEnterView) {
        this.f30294a = chatActivityEnterView;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f30294a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        ff ffVar = chatActivityEnterView.H0;
        if (ffVar != null) {
            ffVar.h(!T0);
            chatActivityEnterView.H0 = null;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        if (view instanceof ph.x) {
            ChatActivityEnterView chatActivityEnterView = this.f30294a;
            chatActivityEnterView.setFieldText(((ph.x) view).getCommand() + " ");
            chatActivityEnterView.f26137i0.c();
            return true;
        }
        return false;
    }
}
