package org.telegram.ui.Components;
public final class qe implements d5 {
    public final int f27323a;
    public final ChatActivityEnterView f27324b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27323a = i10;
        this.f27324b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f27323a) {
            case 0:
                this.f27324b.U0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f27324b;
                chatActivityEnterView.U0(i10, z10, i11, true, 0L);
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
