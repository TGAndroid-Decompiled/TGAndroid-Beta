package org.telegram.ui.Components;
public final class qe implements e5 {
    public final int f31879a;
    public final ChatActivityEnterView f31880b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31879a = i10;
        this.f31880b = chatActivityEnterView;
    }

    @Override
    public final void G(int i10, int i11, boolean z10) {
        switch (this.f31879a) {
            case 0:
                this.f31880b.Q0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f31880b;
                chatActivityEnterView.Q0(i10, z10, i11, true, 0L);
                mf mfVar = chatActivityEnterView.L0;
                if (mfVar != null) {
                    mfVar.h();
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
