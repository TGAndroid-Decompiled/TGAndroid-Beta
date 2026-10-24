package org.telegram.ui.Components;
public final class bf implements x81, b5 {
    public final ChatActivityEnterView f24993a;

    public bf(ChatActivityEnterView chatActivityEnterView) {
        this.f24993a = chatActivityEnterView;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f24993a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        kf kfVar = chatActivityEnterView.L0;
        if (kfVar != null) {
            kfVar.g(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
