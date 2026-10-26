package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class of implements zl0 {
    public final ChatActivityEnterView f31283a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.f31283a = chatActivityEnterView;
    }

    @Override
    public final void c(int i10, View view) {
        if (view instanceof hi.g0) {
            String command = ((hi.g0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f31283a;
                if (chatActivityEnterView.c()) {
                    g5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new p1(9, this, command), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                if (unVar == null || !unVar.l7(view)) {
                    g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new li.s2(23, this, command));
                }
            }
        }
    }
}
