package org.telegram.ui.Components;
public final class ue implements y61, x4 {
    public final ChatActivityEnterView f32992a;

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.f32992a = chatActivityEnterView;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f32992a;
        boolean T0 = chatActivityEnterView.T0(i9, z10, i10, true, 0L);
        cf cfVar = chatActivityEnterView.H0;
        if (cfVar != null) {
            cfVar.h(!T0);
            chatActivityEnterView.H0 = null;
        }
    }
}
