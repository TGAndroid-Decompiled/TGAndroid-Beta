package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class ef implements hl0 {
    public final ChatActivityEnterView f24607a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.f24607a = chatActivityEnterView;
    }

    @Override
    public final void d(int i10, View view) {
        if (view instanceof rh.x) {
            String command = ((rh.x) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f24607a;
                if (chatActivityEnterView.c()) {
                    z4.M(chatActivityEnterView.K2, chatActivityEnterView.M2, new o1(9, this, command), chatActivityEnterView.S3);
                    return;
                }
                org.telegram.ui.zn znVar = chatActivityEnterView.L2;
                if (znVar == null || !znVar.e7(view)) {
                    z4.a0(chatActivityEnterView.N, 1, chatActivityEnterView.M2, new kh.a1(27, this, command));
                }
            }
        }
    }
}
