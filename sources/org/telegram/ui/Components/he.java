package org.telegram.ui.Components;
public final class he implements j71, q4 {
    public final ChatActivityEnterView f26767a;

    public he(ChatActivityEnterView chatActivityEnterView) {
        this.f26767a = chatActivityEnterView;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f26767a;
        boolean R0 = chatActivityEnterView.R0(z10, i10, i11, 0L, true);
        pe peVar = chatActivityEnterView.L0;
        if (peVar != null) {
            peVar.g(!R0);
            chatActivityEnterView.L0 = null;
        }
    }
}
