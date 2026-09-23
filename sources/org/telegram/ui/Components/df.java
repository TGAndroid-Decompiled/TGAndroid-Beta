package org.telegram.ui.Components;
public final class df implements t71, d5 {
    public final ChatActivityEnterView f23400a;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f23400a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f23400a;
        boolean U0 = chatActivityEnterView.U0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.h(!U0);
            chatActivityEnterView.L0 = null;
        }
    }
}
