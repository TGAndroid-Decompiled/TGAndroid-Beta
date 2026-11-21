package org.telegram.ui.Components;
public final class je implements a5, yi0 {
    public final int f36485a;
    public final ChatActivityEnterView f36486b;

    public je(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f36485a = i7;
        this.f36486b = chatActivityEnterView;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f36485a) {
            case 0:
                this.f36486b.w1(z10, i7, i10, 0L, true);
                return;
            case 1:
            default:
                boolean w12 = this.f36486b.w1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.f36486b;
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var != null) {
                    eg0Var.h(!w12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            case 2:
                this.f36486b.w1(z10, i7, 0, 0L, true);
                return;
        }
    }

    public void a(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f36486b;
        td tdVar = chatActivityEnterView.X1;
        rg rgVar = chatActivityEnterView.E2;
        if (rgVar != null) {
            rgVar.invalidate();
        }
        if (!z10) {
            yh.a aVar = chatActivityEnterView.T1;
            if (aVar != null) {
                zi0 zi0Var = chatActivityEnterView.f32635i1;
                aVar.c(Math.round(Math.max(1.0f, (zi0Var.f42881w - zi0Var.f42876s) * zi0Var.f42874r)));
            }
            org.telegram.messenger.g0.r(tdVar);
            org.telegram.messenger.g0.h3(tdVar, 300L);
        }
    }
}
