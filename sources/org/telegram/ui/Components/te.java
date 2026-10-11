package org.telegram.ui.Components;
public final class te implements f5 {
    public final int f31085a;
    public final ChatActivityEnterView f31086b;

    public te(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31085a = i10;
        this.f31086b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f31085a) {
            case 0:
                this.f31086b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f31086b;
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
