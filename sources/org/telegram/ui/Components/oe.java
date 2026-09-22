package org.telegram.ui.Components;
public final class oe implements b5 {
    public final int f26767a;
    public final ChatActivityEnterView f26768b;

    public oe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26767a = i10;
        this.f26768b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f26767a) {
            case 0:
                this.f26768b.U0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f26768b;
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
