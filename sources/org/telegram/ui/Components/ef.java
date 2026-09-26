package org.telegram.ui.Components;
public final class ef implements h81, d5 {
    public final ChatActivityEnterView f23945a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.f23945a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f23945a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        nf nfVar = chatActivityEnterView.L0;
        if (nfVar != null) {
            nfVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }
}
