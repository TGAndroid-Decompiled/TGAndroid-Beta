package org.telegram.ui.Components;
public final class qe implements e5 {
    public final int f29671a;
    public final ChatActivityEnterView f29672b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29671a = i10;
        this.f29672b = chatActivityEnterView;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f29671a) {
            case 0:
                this.f29672b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f29672b;
                chatActivityEnterView.R0(i10, z10, i11, true, 0L);
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
