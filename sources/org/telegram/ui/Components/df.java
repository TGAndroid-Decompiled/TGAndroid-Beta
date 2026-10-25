package org.telegram.ui.Components;
public final class df implements g91, e5 {
    public final ChatActivityEnterView f27516a;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f27516a = chatActivityEnterView;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f27516a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.g(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
