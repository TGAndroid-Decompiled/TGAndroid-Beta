package org.telegram.ui.Components;
public final class re implements f5 {
    public final int f28498a;
    public final ChatActivityEnterView f28499b;

    public re(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28498a = i10;
        this.f28499b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f28498a) {
            case 0:
                this.f28499b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f28499b;
                chatActivityEnterView.R0(i10, z10, i11, true, 0L);
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
