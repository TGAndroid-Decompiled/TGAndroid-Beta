package org.telegram.ui.Components;
public final class se implements d5 {
    public final int f28241a;
    public final ChatActivityEnterView f28242b;

    public se(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28241a = i10;
        this.f28242b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f28241a) {
            case 0:
                this.f28242b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f28242b;
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
