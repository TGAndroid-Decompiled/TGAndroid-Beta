package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class qf implements am0 {
    public final ChatActivityEnterView f28586a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.f28586a = chatActivityEnterView;
    }

    @Override
    public final void a(int i10, View view) {
        if (view instanceof fi.z) {
            String command = ((fi.z) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f28586a;
                if (chatActivityEnterView.c()) {
                    g5.L(chatActivityEnterView.O2, chatActivityEnterView.Q2, new t2(5, this, command), chatActivityEnterView.W3);
                    return;
                }
                org.telegram.ui.fo foVar = chatActivityEnterView.P2;
                if (foVar == null || !foVar.h7(view)) {
                    g5.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new org.telegram.ui.vc(15, this, command));
                }
            }
        }
    }
}
