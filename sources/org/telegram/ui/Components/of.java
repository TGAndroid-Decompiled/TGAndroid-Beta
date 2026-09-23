package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class of implements al0 {
    public final ChatActivityEnterView f26729a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.f26729a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof ei.a0) {
            String command = ((ei.a0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f26729a;
                if (chatActivityEnterView.c()) {
                    e5.M(chatActivityEnterView.N2, chatActivityEnterView.P2, new b3(1, this, command), chatActivityEnterView.V3);
                    return;
                }
                org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
                if (xnVar == null || !xnVar.e7(view)) {
                    e5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new org.telegram.ui.oc(15, this, command));
                }
            }
        }
    }
}
