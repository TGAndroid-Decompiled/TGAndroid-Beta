package org.telegram.ui.Components;
public final class oe implements b5 {
    public final int f29260a;
    public final ChatActivityEnterView f29261b;

    public oe(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29260a = i10;
        this.f29261b = chatActivityEnterView;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        switch (this.f29260a) {
            case 0:
                this.f29261b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f29261b;
                chatActivityEnterView.R0(i10, z10, i11, true, 0L);
                kf kfVar = chatActivityEnterView.L0;
                if (kfVar != null) {
                    kfVar.h();
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
