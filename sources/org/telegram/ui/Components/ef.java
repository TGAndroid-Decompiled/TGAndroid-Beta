package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class ef implements mk0 {
    public final ChatActivityEnterView f28011a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.f28011a = chatActivityEnterView;
    }

    @Override
    public final void a(int i9, View view) {
        if (view instanceof mh.a0) {
            String command = ((mh.a0) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f28011a;
                if (chatActivityEnterView.c()) {
                    y4.M(chatActivityEnterView.J2, chatActivityEnterView.L2, new g1(10, this, command), chatActivityEnterView.R3);
                    return;
                }
                org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
                if (qnVar == null || !qnVar.e7(view)) {
                    y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new org.telegram.ui.df(12, this, command));
                }
            }
        }
    }
}
