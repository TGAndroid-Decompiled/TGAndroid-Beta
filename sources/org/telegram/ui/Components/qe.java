package org.telegram.ui.Components;
public final class qe implements d5 {
    public final int f29889a;
    public final ChatActivityEnterView f29890b;

    public qe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29889a = i10;
        this.f29890b = chatActivityEnterView;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f29889a) {
            case 0:
                this.f29890b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f29890b;
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
