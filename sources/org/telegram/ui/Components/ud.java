package org.telegram.ui.Components;
public final class ud implements q4 {
    public final int f30906a;
    public final ChatActivityEnterView f30907b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30906a = i10;
        this.f30907b = chatActivityEnterView;
    }

    @Override
    public final void K(int i10, int i11, boolean z10) {
        switch (this.f30906a) {
            case 0:
                this.f30907b.R0(z10, i10, i11, 0L, true);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f30907b;
                chatActivityEnterView.R0(z10, i10, i11, 0L, true);
                pe peVar = chatActivityEnterView.L0;
                if (peVar != null) {
                    peVar.h();
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
