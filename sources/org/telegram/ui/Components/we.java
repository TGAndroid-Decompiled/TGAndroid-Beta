package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
public final class we implements gj0 {
    public final ChatActivityEnterView f41330a;

    public we(ChatActivityEnterView chatActivityEnterView) {
        this.f41330a = chatActivityEnterView;
    }

    @Override
    public final void b(int i7, View view) {
        if (view instanceof ki.y) {
            String command = ((ki.y) view).getCommand();
            if (!TextUtils.isEmpty(command)) {
                ChatActivityEnterView chatActivityEnterView = this.f41330a;
                if (chatActivityEnterView.c()) {
                    t4.J(chatActivityEnterView.f32311w3, chatActivityEnterView.f32327y3, new f1(8, this, command), chatActivityEnterView.E4);
                    return;
                }
                org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
                if (anVar == null || !anVar.t7(view)) {
                    t4.X(chatActivityEnterView.R, 1, chatActivityEnterView.f32327y3, new li.v(27, this, command));
                }
            }
        }
    }
}
