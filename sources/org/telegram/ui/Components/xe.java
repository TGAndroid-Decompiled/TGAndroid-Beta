package org.telegram.ui.Components;
public final class xe implements k71, b5 {
    public final ChatActivityEnterView f34704a;

    public xe(ChatActivityEnterView chatActivityEnterView) {
        this.f34704a = chatActivityEnterView;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f34704a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        ff ffVar = chatActivityEnterView.H0;
        if (ffVar != null) {
            ffVar.h(!T0);
            chatActivityEnterView.H0 = null;
        }
    }
}
