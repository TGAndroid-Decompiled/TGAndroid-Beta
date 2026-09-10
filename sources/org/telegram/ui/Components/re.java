package org.telegram.ui.Components;
public final class re implements c5 {
    public final int f26657a;
    public final ChatActivityEnterView f26658b;

    public re(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26657a = i10;
        this.f26658b = chatActivityEnterView;
    }

    @Override
    public final void I(int i10, int i11, boolean z10) {
        switch (this.f26657a) {
            case 0:
                this.f26658b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f26658b;
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
