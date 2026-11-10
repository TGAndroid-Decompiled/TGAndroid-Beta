package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class ve implements bj0 {
    public final ChatActivityEnterView f38989a;

    public ve(ChatActivityEnterView chatActivityEnterView) {
        this.f38989a = chatActivityEnterView;
    }

    @Override
    public final void c(int i7, View view) {
        if (view instanceof hi.w) {
            String command = ((hi.w) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f38989a;
                if (chatActivityEnterView.c()) {
                    u4.J(chatActivityEnterView.O2, chatActivityEnterView.Q2, new e2(4, this, command), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
                if (cnVar == null || !cnVar.t7(view)) {
                    u4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.messenger.voip.k(22, this, command));
                }
            }
        }
    }
}
