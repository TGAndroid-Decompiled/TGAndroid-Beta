package org.telegram.ui.Components;
public final class ef implements i81, d5 {
    public final ChatActivityEnterView f23939a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.f23939a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f23939a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        nf nfVar = chatActivityEnterView.L0;
        if (nfVar != null) {
            nfVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }
}
