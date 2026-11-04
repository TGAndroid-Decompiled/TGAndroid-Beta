package org.telegram.ui.Components;
public final class xd implements r4 {
    public final int f40310a;
    public final ChatActivityEnterView f40311b;

    public xd(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.f40310a = i3;
        this.f40311b = chatActivityEnterView;
    }

    @Override
    public final void L(int i3, int i10, boolean z10) {
        switch (this.f40310a) {
            case 0:
                this.f40311b.S0(z10, i3, i10, 0L, true);
                return;
            case 1:
                this.f40311b.S0(z10, i3, 0, 0L, true);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f40311b;
                boolean S0 = chatActivityEnterView.S0(z10, i3, i10, 0L, true);
                se seVar = chatActivityEnterView.M0;
                if (seVar != null) {
                    seVar.g(!S0);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
        }
    }
}
