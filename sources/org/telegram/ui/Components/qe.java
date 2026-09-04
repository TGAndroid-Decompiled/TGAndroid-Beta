package org.telegram.ui.Components;
public final class qe implements d5 {
    public final int f29698a;
    public final ChatActivityEnterView f29699b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29698a = i10;
        this.f29699b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29698a) {
            case 0:
                this.f29699b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f29699b;
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
