package org.telegram.ui.Components;
public final class gf implements f91, f5 {
    public final ChatActivityEnterView f26424a;

    public gf(ChatActivityEnterView chatActivityEnterView) {
        this.f26424a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26424a;
        boolean W0 = chatActivityEnterView.W0(i10, z10, i11, true, 0L);
        rf rfVar = chatActivityEnterView.L0;
        if (rfVar != null) {
            rfVar.h(!W0);
            chatActivityEnterView.L0 = null;
        }
    }
}
