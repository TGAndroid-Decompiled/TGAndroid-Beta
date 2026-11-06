package org.telegram.ui.Components;
public final class ae implements t4 {
    public final int f31773a;
    public final ChatActivityEnterView f31774b;

    public ae(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f31773a = i7;
        this.f31774b = chatActivityEnterView;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f31773a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f31774b;
                boolean T0 = chatActivityEnterView.T0(z9, i7, i10, 0L, true);
                ue ueVar = chatActivityEnterView.L0;
                if (ueVar != null) {
                    ueVar.g(!T0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f31774b;
                chatActivityEnterView2.T0(z9, i7, i10, 0L, true);
                ue ueVar2 = chatActivityEnterView2.L0;
                if (ueVar2 != null) {
                    ueVar2.h();
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
        }
    }
}
