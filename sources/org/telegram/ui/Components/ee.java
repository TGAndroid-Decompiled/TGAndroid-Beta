package org.telegram.ui.Components;

import android.view.View;

public final class ee implements x4, rk0 {

    public final ChatActivityEnterView f28037a;

    public ee(ChatActivityEnterView chatActivityEnterView) {
        this.f28037a = chatActivityEnterView;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f28037a;
        boolean zT0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        ye yeVar = chatActivityEnterView.H0;
        if (yeVar != null) {
            yeVar.h(!zT0);
            chatActivityEnterView.H0 = null;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        if (!(view instanceof nh.y)) {
            return false;
        }
        String str = ((nh.y) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.f28037a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.f26122i0.c();
        return true;
    }
}
