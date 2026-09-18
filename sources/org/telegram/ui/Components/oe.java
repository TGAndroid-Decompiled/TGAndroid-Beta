package org.telegram.ui.Components;
public final class oe implements b5 {
    public final int f26721a;
    public final ChatActivityEnterView f26722b;

    public oe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26721a = i10;
        this.f26722b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f26721a) {
            case 0:
                this.f26722b.U0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f26722b;
                chatActivityEnterView.U0(i10, z10, i11, true, 0L);
                kf kfVar = chatActivityEnterView.L0;
                if (kfVar != null) {
                    kfVar.i();
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
