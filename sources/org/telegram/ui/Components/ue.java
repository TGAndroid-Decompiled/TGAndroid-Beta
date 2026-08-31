package org.telegram.ui.Components;
public final class ue implements y71, y4 {
    public final ChatActivityEnterView f31661a;

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.f31661a = chatActivityEnterView;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        ChatActivityEnterView chatActivityEnterView = this.f31661a;
        boolean T0 = chatActivityEnterView.T0(i10, z4, i11, true, 0L);
        cf cfVar = chatActivityEnterView.I0;
        if (cfVar != null) {
            cfVar.h(!T0);
            chatActivityEnterView.I0 = null;
        }
    }
}
