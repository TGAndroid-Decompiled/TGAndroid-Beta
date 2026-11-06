package org.telegram.ui.Components;
public final class ae implements t4 {
    public final int f31781a;
    public final ChatActivityEnterView f31782b;

    public ae(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f31781a = i7;
        this.f31782b = chatActivityEnterView;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f31781a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f31782b;
                boolean T0 = chatActivityEnterView.T0(z9, i7, i10, 0L, true);
                ue ueVar = chatActivityEnterView.L0;
                if (ueVar != null) {
                    ueVar.g(!T0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f31782b;
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
