package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class of implements ml0 {
    public final ChatActivityEnterView f27062a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.f27062a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f27062a;
                if (chatActivityEnterView.c()) {
                    d5.M(chatActivityEnterView.O2, chatActivityEnterView.Q2, new a3(1, this, command), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                if (znVar == null || !znVar.e7(view)) {
                    d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.of(10, this, command));
                }
            }
        }
    }
}
