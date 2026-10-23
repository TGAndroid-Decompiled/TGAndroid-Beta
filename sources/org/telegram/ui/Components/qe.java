package org.telegram.ui.Components;
public final class qe implements e5 {
    public final int f29567a;
    public final ChatActivityEnterView f29568b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29567a = i10;
        this.f29568b = chatActivityEnterView;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f29567a) {
            case 0:
                this.f29568b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f29568b;
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
