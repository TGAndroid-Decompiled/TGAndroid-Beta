package org.telegram.ui.Components;
public final class qe implements d5 {
    public final int f29725a;
    public final ChatActivityEnterView f29726b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29725a = i10;
        this.f29726b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29725a) {
            case 0:
                this.f29726b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f29726b;
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
