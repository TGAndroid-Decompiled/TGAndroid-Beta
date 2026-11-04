package org.telegram.ui.Components;

import android.view.View;
public final class ke implements z51, hj0 {
    public final ChatActivityEnterView f35374a;

    public ke(ChatActivityEnterView chatActivityEnterView) {
        this.f35374a = chatActivityEnterView;
    }

    @Override
    public boolean f(int i3, View view) {
        if (view instanceof ii.y) {
            ChatActivityEnterView chatActivityEnterView = this.f35374a;
            chatActivityEnterView.setFieldText(((ii.y) view).getCommand() + " ");
            chatActivityEnterView.f31162n0.c();
            return true;
        }
        return false;
    }
}
