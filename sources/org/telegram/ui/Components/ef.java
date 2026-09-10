package org.telegram.ui.Components;
public final class ef implements h81, c5 {
    public final ChatActivityEnterView f22691a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.f22691a = chatActivityEnterView;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f22691a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        of ofVar = chatActivityEnterView.L0;
        if (ofVar != null) {
            ofVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }
}
