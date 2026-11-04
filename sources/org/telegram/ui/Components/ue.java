package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class ue implements fj0 {
    public final ChatActivityEnterView f38730a;

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.f38730a = chatActivityEnterView;
    }

    @Override
    public final void f(int i3, View view) {
        if (view instanceof ii.y) {
            String command = ((ii.y) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f38730a;
                if (chatActivityEnterView.c()) {
                    t4.L(chatActivityEnterView.P2, chatActivityEnterView.R2, new org.telegram.ui.jo(14, this, command), chatActivityEnterView.X3);
                    return;
                }
                org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
                if (wmVar == null || !wmVar.s7(view)) {
                    t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new mi.f(26, this, command));
                }
            }
        }
    }
}
