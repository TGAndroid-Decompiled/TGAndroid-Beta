package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class re implements gk0 {
    public final ChatActivityEnterView f29901a;

    public re(ChatActivityEnterView chatActivityEnterView) {
        this.f29901a = chatActivityEnterView;
    }

    @Override
    public final void f(int i10, View view) {
        if (view instanceof xh.u) {
            String command = ((xh.u) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f29901a;
                if (chatActivityEnterView.c()) {
                    s4.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new f2(4, this, command), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                if (unVar == null || !unVar.m7(view)) {
                    s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new ag.e0(29, this, command));
                }
            }
        }
    }
}
