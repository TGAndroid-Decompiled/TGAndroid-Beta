package org.telegram.ui.Components;
public final class yd implements s4 {
    public final int f40557a;
    public final ChatActivityEnterView f40558b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f40557a = i7;
        this.f40558b = chatActivityEnterView;
    }

    @Override
    public final void L(int i7, int i10, boolean z9) {
        switch (this.f40557a) {
            case 0:
                this.f40558b.T0(z9, i7, i10, 0L, true);
                return;
            case 1:
                this.f40558b.T0(z9, i7, 0, 0L, true);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f40558b;
                boolean T0 = chatActivityEnterView.T0(z9, i7, i10, 0L, true);
                te teVar = chatActivityEnterView.L0;
                if (teVar != null) {
                    teVar.g(!T0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
