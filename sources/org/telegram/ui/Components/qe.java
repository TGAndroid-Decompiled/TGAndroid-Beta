package org.telegram.ui.Components;
public final class qe implements e5 {
    public final int f31905a;
    public final ChatActivityEnterView f31906b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31905a = i10;
        this.f31906b = chatActivityEnterView;
    }

    @Override
    public final void G(int i10, int i11, boolean z10) {
        switch (this.f31905a) {
            case 0:
                this.f31906b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f31906b;
                chatActivityEnterView.R0(i10, z10, i11, true, 0L);
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
