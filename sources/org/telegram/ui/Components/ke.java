package org.telegram.ui.Components;
public final class ke implements a5 {
    public final int f36892a;
    public final ChatActivityEnterView f36893b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f36892a = i7;
        this.f36893b = chatActivityEnterView;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f36892a) {
            case 0:
                boolean w12 = this.f36893b.w1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.f36893b;
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var != null) {
                    eg0Var.h(!w12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            default:
                this.f36893b.w1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView2 = this.f36893b;
                org.telegram.ui.eg0 eg0Var2 = chatActivityEnterView2.M0;
                if (eg0Var2 != null) {
                    eg0Var2.i();
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                return;
        }
    }
}
