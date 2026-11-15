package org.telegram.ui.Components;
public final class be implements r4 {
    public final int f33266a;
    public final ChatActivityEnterView f33267b;

    public be(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f33266a = i7;
        this.f33267b = chatActivityEnterView;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f33266a) {
            case 0:
                boolean k12 = this.f33267b.k1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.f33267b;
                org.telegram.ui.bg0 bg0Var = chatActivityEnterView.M0;
                if (bg0Var != null) {
                    bg0Var.h(!k12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            case 1:
            default:
                boolean k13 = this.f33267b.k1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView2 = this.f33267b;
                org.telegram.ui.bg0 bg0Var2 = chatActivityEnterView2.M0;
                if (bg0Var2 != null) {
                    bg0Var2.h(!k13);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                return;
            case 2:
                this.f33267b.k1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView3 = this.f33267b;
                org.telegram.ui.bg0 bg0Var3 = chatActivityEnterView3.M0;
                if (bg0Var3 != null) {
                    bg0Var3.i();
                    chatActivityEnterView3.M0 = null;
                    return;
                }
                return;
        }
    }
}
