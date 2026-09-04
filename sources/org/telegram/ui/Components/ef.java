package org.telegram.ui.Components;
public final class ef implements u71, d5 {
    public final ChatActivityEnterView f25669a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.f25669a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f25669a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        nf nfVar = chatActivityEnterView.L0;
        if (nfVar != null) {
            nfVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }
}
