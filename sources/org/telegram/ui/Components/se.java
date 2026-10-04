package org.telegram.ui.Components;
public final class se implements d5 {
    public final int f30697a;
    public final ChatActivityEnterView f30698b;

    public se(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30697a = i10;
        this.f30698b = chatActivityEnterView;
    }

    @Override
    public final void K(int i10, int i11, boolean z10) {
        switch (this.f30697a) {
            case 0:
                this.f30698b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f30698b;
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
