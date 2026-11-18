package org.telegram.ui.Components;
public final class je implements z4, wi0 {
    public final int f36420a;
    public final ChatActivityEnterView f36421b;

    public je(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f36420a = i7;
        this.f36421b = chatActivityEnterView;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f36420a) {
            case 0:
                this.f36421b.s1(z10, i7, i10, 0L, true);
                return;
            case 1:
            default:
                boolean s12 = this.f36421b.s1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.f36421b;
                org.telegram.ui.fg0 fg0Var = chatActivityEnterView.M0;
                if (fg0Var != null) {
                    fg0Var.h(!s12);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            case 2:
                this.f36421b.s1(z10, i7, 0, 0L, true);
                return;
        }
    }

    public void a(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f36421b;
        td tdVar = chatActivityEnterView.V1;
        pg pgVar = chatActivityEnterView.C2;
        if (pgVar != null) {
            pgVar.invalidate();
        }
        if (!z10) {
            yh.a aVar = chatActivityEnterView.R1;
            if (aVar != null) {
                xi0 xi0Var = chatActivityEnterView.f32607i1;
                aVar.c(Math.round(Math.max(1.0f, (xi0Var.f42088w - xi0Var.f42083s) * xi0Var.f42081r)));
            }
            org.telegram.messenger.g0.r(tdVar);
            org.telegram.messenger.g0.h3(tdVar, 300L);
        }
    }
}
