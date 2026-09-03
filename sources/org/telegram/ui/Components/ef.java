package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class ef implements il0 {
    public final ChatActivityEnterView f26571a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.f26571a = chatActivityEnterView;
    }

    @Override
    public final void f(int i10, View view) {
        if (view instanceof sh.x) {
            String command = ((sh.x) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f26571a;
                if (chatActivityEnterView.c()) {
                    z4.M(chatActivityEnterView.K2, chatActivityEnterView.M2, new o1(9, this, command), chatActivityEnterView.S3);
                    return;
                }
                org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
                if (xnVar == null || !xnVar.e7(view)) {
                    z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new lh.a1(27, this, command));
                }
            }
        }
    }
}
