package org.telegram.ui.Components;

import android.view.View;
public final class le implements g61, dj0 {
    public final ChatActivityEnterView f35664a;

    public le(ChatActivityEnterView chatActivityEnterView) {
        this.f35664a = chatActivityEnterView;
    }

    @Override
    public boolean c(int i7, View view) {
        if (view instanceof hi.w) {
            ChatActivityEnterView chatActivityEnterView = this.f35664a;
            chatActivityEnterView.setFieldText(((hi.w) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
