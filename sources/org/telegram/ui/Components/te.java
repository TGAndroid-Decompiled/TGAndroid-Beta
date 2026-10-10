package org.telegram.ui.Components;
public final class te implements f5 {
    public final int f31113a;
    public final ChatActivityEnterView f31114b;

    public te(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31113a = i10;
        this.f31114b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f31113a) {
            case 0:
                this.f31114b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f31114b;
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
