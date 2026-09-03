package org.telegram.ui.Components;
public final class he implements y4 {
    public final int f27489a;
    public final ChatActivityEnterView f27490b;

    public he(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27489a = i10;
        this.f27490b = chatActivityEnterView;
    }

    @Override
    public final void I(int i10, int i11, boolean z4) {
        switch (this.f27489a) {
            case 0:
                this.f27490b.T0(i10, z4, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f27490b;
                chatActivityEnterView.T0(i10, z4, i11, true, 0L);
                cf cfVar = chatActivityEnterView.I0;
                if (cfVar != null) {
                    cfVar.i();
                    chatActivityEnterView.I0 = null;
                    return;
                }
                return;
        }
    }
}
