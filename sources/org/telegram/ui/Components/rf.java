package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class rf implements fm0 {
    public final ChatActivityEnterView f30508a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.f30508a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f30508a;
                if (chatActivityEnterView.c()) {
                    g5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new y2(this, command, false, 3), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                if (znVar == null || !znVar.h7(view)) {
                    g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.oc(15, this, command));
                }
            }
        }
    }
}
