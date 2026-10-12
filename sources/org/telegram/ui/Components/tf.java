package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class tf implements km0 {
    public final ChatActivityEnterView f30873a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.f30873a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f30873a;
                if (chatActivityEnterView.c()) {
                    g5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new y2(2, this, command), chatActivityEnterView.f23774z4);
                    return;
                }
                org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
                if (eoVar == null || !eoVar.h7(view)) {
                    g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.tc(15, this, command));
                }
            }
        }
    }
}
