package org.telegram.ui.Components;
public final class qe implements c5 {
    public final int f27566a;
    public final ChatActivityEnterView f27567b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27566a = i10;
        this.f27567b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f27566a) {
            case 0:
                this.f27567b.T0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f27567b;
                chatActivityEnterView.T0(i10, z10, i11, true, 0L);
                mf mfVar = chatActivityEnterView.L0;
                if (mfVar != null) {
                    mfVar.i();
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
