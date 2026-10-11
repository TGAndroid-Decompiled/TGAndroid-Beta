package org.telegram.ui.Components;
public final class te implements f5 {
    public final int f31217a;
    public final ChatActivityEnterView f31218b;

    public te(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31217a = i10;
        this.f31218b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f31217a) {
            case 0:
                this.f31218b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f31218b;
                chatActivityEnterView.R0(i10, z10, i11, true, 0L);
                pf pfVar = chatActivityEnterView.L0;
                if (pfVar != null) {
                    pfVar.i();
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
