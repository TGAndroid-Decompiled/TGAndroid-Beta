package org.telegram.ui.Components;
public final class ff implements w81, f5 {
    public final ChatActivityEnterView f25023a;

    public ff(ChatActivityEnterView chatActivityEnterView) {
        this.f25023a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f25023a;
        boolean R0 = chatActivityEnterView.R0(i10, z10, i11, true, 0L);
        of ofVar = chatActivityEnterView.L0;
        if (ofVar != null) {
            ofVar.h(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
