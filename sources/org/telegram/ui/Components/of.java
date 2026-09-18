package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class of implements kl0 {
    public final ChatActivityEnterView f26924a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.f26924a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f26924a;
                if (chatActivityEnterView.c()) {
                    e5.M(chatActivityEnterView.N2, chatActivityEnterView.P2, new b3(1, this, command), chatActivityEnterView.V3);
                    return;
                }
                org.telegram.ui.zn znVar = chatActivityEnterView.O2;
                if (znVar == null || !znVar.e7(view)) {
                    e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new org.telegram.ui.of(10, this, command));
                }
            }
        }
    }
}
