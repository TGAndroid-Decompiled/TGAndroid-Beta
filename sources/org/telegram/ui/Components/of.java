package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class of implements am0 {
    public final ChatActivityEnterView f29168a;

    public of(ChatActivityEnterView chatActivityEnterView) {
        this.f29168a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof gi.z) {
            String command = ((gi.z) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f29168a;
                if (chatActivityEnterView.c()) {
                    f5.M(chatActivityEnterView.O2, chatActivityEnterView.Q2, new p2(command, 6, this), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.sn snVar = chatActivityEnterView.P2;
                if (snVar == null || !snVar.h7(view)) {
                    f5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.ActionBar.m3(21, this, command));
                }
            }
        }
    }
}
