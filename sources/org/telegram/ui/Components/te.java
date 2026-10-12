package org.telegram.ui.Components;
public final class te implements f5 {
    public final int f30869a;
    public final ChatActivityEnterView f30870b;

    public te(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30869a = i10;
        this.f30870b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f30869a) {
            case 0:
                this.f30870b.W0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f30870b;
                chatActivityEnterView.W0(i10, z10, i11, true, 0L);
                rf rfVar = chatActivityEnterView.L0;
                if (rfVar != null) {
                    rfVar.i();
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
