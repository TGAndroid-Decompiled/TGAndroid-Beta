package org.telegram.ui.Components;
public final class ff implements s81, d5 {
    public final ChatActivityEnterView f26461a;

    public ff(ChatActivityEnterView chatActivityEnterView) {
        this.f26461a = chatActivityEnterView;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26461a;
        boolean T0 = chatActivityEnterView.T0(i10, z10, i11, true, 0L);
        of ofVar = chatActivityEnterView.L0;
        if (ofVar != null) {
            ofVar.h(!T0);
            chatActivityEnterView.L0 = null;
        }
    }
}
