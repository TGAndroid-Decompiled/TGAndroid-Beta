package org.telegram.ui.Components;
public final class yd implements r4 {
    public final int f40684a;
    public final ChatActivityEnterView f40685b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.f40684a = i3;
        this.f40685b = chatActivityEnterView;
    }

    @Override
    public final void L(int i3, int i10, boolean z10) {
        switch (this.f40684a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f40685b;
                boolean S0 = chatActivityEnterView.S0(z10, i3, i10, 0L, true);
                se seVar = chatActivityEnterView.M0;
                if (seVar != null) {
                    seVar.g(!S0);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f40685b;
                chatActivityEnterView2.S0(z10, i3, i10, 0L, true);
                se seVar2 = chatActivityEnterView2.M0;
                if (seVar2 != null) {
                    seVar2.h();
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                return;
        }
    }
}
