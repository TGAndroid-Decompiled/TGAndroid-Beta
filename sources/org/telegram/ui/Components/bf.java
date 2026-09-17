package org.telegram.ui.Components;
public final class bf implements v71, b5 {
    public final ChatActivityEnterView f22721a;

    public bf(ChatActivityEnterView chatActivityEnterView) {
        this.f22721a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f22721a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        kf kfVar = chatActivityEnterView.L0;
        if (kfVar != null) {
            kfVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }
}
