package org.telegram.ui.Components;
public final class zd implements t4 {
    public final int f40935a;
    public final ChatActivityEnterView f40936b;

    public zd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f40935a = i7;
        this.f40936b = chatActivityEnterView;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f40935a) {
            case 0:
                this.f40936b.T0(z9, i7, i10, 0L, true);
                return;
            case 1:
                this.f40936b.T0(z9, i7, 0, 0L, true);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f40936b;
                boolean T0 = chatActivityEnterView.T0(z9, i7, i10, 0L, true);
                ue ueVar = chatActivityEnterView.L0;
                if (ueVar != null) {
                    ueVar.g(!T0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
