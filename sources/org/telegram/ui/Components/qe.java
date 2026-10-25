package org.telegram.ui.Components;
public final class qe implements e5 {
    public final int f31903a;
    public final ChatActivityEnterView f31904b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31903a = i10;
        this.f31904b = chatActivityEnterView;
    }

    @Override
    public final void G(int i10, int i11, boolean z10) {
        switch (this.f31903a) {
            case 0:
                this.f31904b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f31904b;
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
