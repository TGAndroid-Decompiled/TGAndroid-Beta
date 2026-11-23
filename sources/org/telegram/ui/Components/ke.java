package org.telegram.ui.Components;
public final class ke implements z4, yi0 {
    public final int f36718a;
    public final ChatActivityEnterView f36719b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f36718a = i7;
        this.f36719b = chatActivityEnterView;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        switch (this.f36718a) {
            case 0:
                this.f36719b.x1(z10, i7, i10, 0L, true);
                return;
            case 1:
            default:
                boolean x12 = this.f36719b.x1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.f36719b;
                org.telegram.ui.dg0 dg0Var = chatActivityEnterView.M0;
                if (dg0Var != null) {
                    dg0Var.h(!x12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            case 2:
                this.f36719b.x1(z10, i7, 0, 0L, true);
                return;
        }
    }

    public void a(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f36719b;
        td tdVar = chatActivityEnterView.X1;
        qg qgVar = chatActivityEnterView.E2;
        if (qgVar != null) {
            qgVar.invalidate();
        }
        if (!z10) {
            yh.a aVar = chatActivityEnterView.T1;
            if (aVar != null) {
                zi0 zi0Var = chatActivityEnterView.f32702i1;
                aVar.c(Math.round(Math.max(1.0f, (zi0Var.f42902w - zi0Var.f42897s) * zi0Var.f42895r)));
            }
            org.telegram.messenger.g0.r(tdVar);
            org.telegram.messenger.g0.h3(tdVar, 300L);
        }
    }
}
