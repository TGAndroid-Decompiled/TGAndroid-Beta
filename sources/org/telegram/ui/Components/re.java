package org.telegram.ui.Components;
public final class re implements d5 {
    public final int f27946a;
    public final ChatActivityEnterView f27947b;

    public re(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27946a = i10;
        this.f27947b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f27946a) {
            case 0:
                this.f27947b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f27947b;
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
