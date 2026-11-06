package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class we implements bj0 {
    public final ChatActivityEnterView f39955a;

    public we(ChatActivityEnterView chatActivityEnterView) {
        this.f39955a = chatActivityEnterView;
    }

    @Override
    public final void c(int i7, View view) {
        if (view instanceof hi.w) {
            String command = ((hi.w) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f39955a;
                if (chatActivityEnterView.c()) {
                    v4.J(chatActivityEnterView.O2, chatActivityEnterView.Q2, new f2(4, this, command), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.an anVar = chatActivityEnterView.P2;
                if (anVar == null || !anVar.s7(view)) {
                    v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.voip.k(22, this, command));
                }
            }
        }
    }
}
