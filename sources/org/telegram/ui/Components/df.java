package org.telegram.ui.Components;
public final class df implements i81, d5 {
    public final ChatActivityEnterView f23569a;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f23569a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f23569a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }
}
