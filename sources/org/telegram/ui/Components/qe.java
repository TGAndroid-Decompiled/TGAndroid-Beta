package org.telegram.ui.Components;

public final class qe implements a71, x4 {

    public final ChatActivityEnterView f31897a;

    public qe(ChatActivityEnterView chatActivityEnterView) {
        this.f31897a = chatActivityEnterView;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f31897a;
        boolean zT0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        ye yeVar = chatActivityEnterView.H0;
        if (yeVar != null) {
            yeVar.h(!zT0);
            chatActivityEnterView.H0 = null;
        }
    }
}
