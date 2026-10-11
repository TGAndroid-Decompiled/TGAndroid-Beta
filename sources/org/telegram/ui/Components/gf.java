package org.telegram.ui.Components;
public final class gf implements a91, f5 {
    public final ChatActivityEnterView f26741a;

    public gf(ChatActivityEnterView chatActivityEnterView) {
        this.f26741a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26741a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        pf pfVar = chatActivityEnterView.L0;
        if (pfVar != null) {
            pfVar.h(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
