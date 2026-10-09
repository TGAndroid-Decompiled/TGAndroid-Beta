package org.telegram.ui.Components;
public final class gf implements z81, f5 {
    public final ChatActivityEnterView f26687a;

    public gf(ChatActivityEnterView chatActivityEnterView) {
        this.f26687a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26687a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        pf pfVar = chatActivityEnterView.L0;
        if (pfVar != null) {
            pfVar.h(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
