package org.telegram.ui.Components;
public final class ff implements x81, f5 {
    public final ChatActivityEnterView f24721a;

    public ff(ChatActivityEnterView chatActivityEnterView) {
        this.f24721a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f24721a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        of ofVar = chatActivityEnterView.L0;
        if (ofVar != null) {
            ofVar.h(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
