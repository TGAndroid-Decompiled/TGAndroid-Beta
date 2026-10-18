package org.telegram.ui.Components;
public final class df implements o81, e5 {
    public final ChatActivityEnterView f25581a;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.f25581a = chatActivityEnterView;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f25581a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        mf mfVar = chatActivityEnterView.L0;
        if (mfVar != null) {
            mfVar.h(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
