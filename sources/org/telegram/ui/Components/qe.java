package org.telegram.ui.Components;
public final class qe implements d5 {
    public final int f29699a;
    public final ChatActivityEnterView f29700b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29699a = i10;
        this.f29700b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29699a) {
            case 0:
                this.f29700b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f29700b;
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
