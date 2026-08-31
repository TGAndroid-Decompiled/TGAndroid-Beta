package org.telegram.ui.Components;

import android.view.View;
public final class ie implements y4, ll0 {
    public final ChatActivityEnterView f27766a;

    public ie(ChatActivityEnterView chatActivityEnterView) {
        this.f27766a = chatActivityEnterView;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = this.f27766a;
        boolean T0 = chatActivityEnterView.T0(i10, z4, i11, true, 0L);
        cf cfVar = chatActivityEnterView.I0;
        if (cfVar != null) {
            cfVar.h(!T0);
            chatActivityEnterView.I0 = null;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        if (view instanceof sh.x) {
            ChatActivityEnterView chatActivityEnterView = this.f27766a;
            chatActivityEnterView.setFieldText(((sh.x) view).getCommand() + " ");
            chatActivityEnterView.f24626j0.c();
            return true;
        }
        return false;
    }
}
