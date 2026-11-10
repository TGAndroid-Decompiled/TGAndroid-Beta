package org.telegram.ui.Components;
public final class zd implements s4 {
    public final int f40917a;
    public final ChatActivityEnterView f40918b;

    public zd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f40917a = i7;
        this.f40918b = chatActivityEnterView;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f40917a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f40918b;
                boolean T0 = chatActivityEnterView.T0(z9, i7, i10, 0L, true);
                te teVar = chatActivityEnterView.L0;
                if (teVar != null) {
                    teVar.g(!T0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f40918b;
                chatActivityEnterView2.T0(z9, i7, i10, 0L, true);
                te teVar2 = chatActivityEnterView2.L0;
                if (teVar2 != null) {
                    teVar2.h();
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                return;
        }
    }
}
