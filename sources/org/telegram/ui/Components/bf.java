package org.telegram.ui.Components;
public final class bf implements u71, b5 {
    public final ChatActivityEnterView f22771a;

    public bf(ChatActivityEnterView chatActivityEnterView) {
        this.f22771a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f22771a;
        boolean U0 = chatActivityEnterView.U0(i10, z10, i11, true, 0L);
        kf kfVar = chatActivityEnterView.L0;
        if (kfVar != null) {
            kfVar.h(!U0);
            chatActivityEnterView.L0 = null;
        }
    }
}
