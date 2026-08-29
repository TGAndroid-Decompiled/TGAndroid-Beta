package org.telegram.ui.Components;
public final class ke implements b5 {
    public final int f30021a;
    public final ChatActivityEnterView f30022b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30021a = i10;
        this.f30022b = chatActivityEnterView;
    }

    @Override
    public final void I(int i10, int i11, boolean z10) {
        switch (this.f30021a) {
            case 0:
                this.f30022b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f30022b;
                chatActivityEnterView.T0(i10, z10, i11, true, 0L);
                ff ffVar = chatActivityEnterView.H0;
                if (ffVar != null) {
                    ffVar.i();
                    chatActivityEnterView.H0 = null;
                    return;
                }
                return;
        }
    }
}
