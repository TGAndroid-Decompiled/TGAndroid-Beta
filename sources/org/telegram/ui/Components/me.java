package org.telegram.ui.Components;

import android.view.View;
public final class me implements h61, ej0 {
    public final ChatActivityEnterView f36080a;

    public me(ChatActivityEnterView chatActivityEnterView) {
        this.f36080a = chatActivityEnterView;
    }

    @Override
    public boolean c(int i7, View view) {
        if (view instanceof hi.w) {
            ChatActivityEnterView chatActivityEnterView = this.f36080a;
            chatActivityEnterView.setFieldText(((hi.w) view).getCommand() + " ");
            chatActivityEnterView.m0.c();
            return true;
        }
        return false;
    }
}
