package org.telegram.ui.Components;
public final class ke implements z4 {
    public final int f36741a;
    public final ChatActivityEnterView f36742b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f36741a = i7;
        this.f36742b = chatActivityEnterView;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f36741a) {
            case 0:
                boolean s12 = this.f36742b.s1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.f36742b;
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var != null) {
                    eg0Var.h(!s12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            default:
                this.f36742b.s1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView2 = this.f36742b;
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
