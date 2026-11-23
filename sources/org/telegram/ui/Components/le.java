package org.telegram.ui.Components;
public final class le implements z4 {
    public final int f37117a;
    public final ChatActivityEnterView f37118b;

    public le(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f37117a = i7;
        this.f37118b = chatActivityEnterView;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        switch (this.f37117a) {
            case 0:
                boolean x12 = this.f37118b.x1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.f37118b;
                org.telegram.ui.dg0 dg0Var = chatActivityEnterView.M0;
                if (dg0Var != null) {
                    dg0Var.h(!x12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            default:
                this.f37118b.x1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView2 = this.f37118b;
                org.telegram.ui.dg0 dg0Var2 = chatActivityEnterView2.M0;
                if (dg0Var2 != null) {
                    dg0Var2.i();
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                return;
        }
    }
}
