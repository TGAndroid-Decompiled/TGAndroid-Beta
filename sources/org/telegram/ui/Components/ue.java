package org.telegram.ui.Components;
public final class ue implements w71, y4 {
    public final ChatActivityEnterView f29209a;

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.f29209a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = this.f29209a;
        boolean T0 = chatActivityEnterView.T0(i10, z4, i11, true, 0L);
        cf cfVar = chatActivityEnterView.I0;
        if (cfVar != null) {
            cfVar.h(!T0);
            chatActivityEnterView.I0 = null;
        }
    }
}
