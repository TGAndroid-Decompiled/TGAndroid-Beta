package org.telegram.ui.Components;
public final class df implements q81, e5 {
    public final ChatActivityEnterView f25465a;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f25465a = chatActivityEnterView;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f25465a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.g(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
