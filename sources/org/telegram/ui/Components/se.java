package org.telegram.ui.Components;
public final class se implements d5 {
    public final int f30704a;
    public final ChatActivityEnterView f30705b;

    public se(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30704a = i10;
        this.f30705b = chatActivityEnterView;
    }

    @Override
    public final void K(int i10, int i11, boolean z10) {
        switch (this.f30704a) {
            case 0:
                this.f30705b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f30705b;
                chatActivityEnterView.T0(i10, z10, i11, true, 0L);
                of ofVar = chatActivityEnterView.L0;
                if (ofVar != null) {
                    ofVar.i();
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
