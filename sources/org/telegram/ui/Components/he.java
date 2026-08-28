package org.telegram.ui.Components;
public final class he implements x4 {
    public final int f29053a;
    public final ChatActivityEnterView f29054b;

    public he(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.f29053a = i9;
        this.f29054b = chatActivityEnterView;
    }

    @Override
    public final void B(int i9, int i10, boolean z10) {
        switch (this.f29053a) {
            case 0:
                this.f29054b.T0(i9, z10, i10, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f29054b;
                chatActivityEnterView.T0(i9, z10, i10, true, 0L);
                cf cfVar = chatActivityEnterView.H0;
                if (cfVar != null) {
                    cfVar.i();
                    chatActivityEnterView.H0 = null;
                    return;
                }
                return;
        }
    }
}
