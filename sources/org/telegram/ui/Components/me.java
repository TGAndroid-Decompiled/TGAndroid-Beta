package org.telegram.ui.Components;

import android.view.View;
public final class me implements b61, dj0 {
    public final ChatActivityEnterView f35993a;

    public me(ChatActivityEnterView chatActivityEnterView) {
        this.f35993a = chatActivityEnterView;
    }

    @Override
    public boolean c(int i7, View view) {
        if (view instanceof hi.w) {
            ChatActivityEnterView chatActivityEnterView = this.f35993a;
            chatActivityEnterView.setFieldText(((hi.w) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
