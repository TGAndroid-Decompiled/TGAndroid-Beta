package org.telegram.ui.Components;
public final class re implements d5 {
    public final int f27897a;
    public final ChatActivityEnterView f27898b;

    public re(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27897a = i10;
        this.f27898b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f27897a) {
            case 0:
                this.f27898b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f27898b;
                chatActivityEnterView.T0(i10, z10, i11, true, 0L);
                nf nfVar = chatActivityEnterView.L0;
                if (nfVar != null) {
                    nfVar.i();
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
