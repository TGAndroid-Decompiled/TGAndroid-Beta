package org.telegram.ui.Components;
public final class df implements h91, e5 {
    public final ChatActivityEnterView f27428a;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f27428a = chatActivityEnterView;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f27428a;
        boolean Q0 = chatActivityEnterView.Q0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.g(!Q0);
            chatActivityEnterView.L0 = null;
        }
    }
}
