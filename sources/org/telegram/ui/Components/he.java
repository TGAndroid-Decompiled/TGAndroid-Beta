package org.telegram.ui.Components;
public final class he implements y4 {
    public final int f25390a;
    public final ChatActivityEnterView f25391b;

    public he(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25390a = i10;
        this.f25391b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z4) {
        switch (this.f25390a) {
            case 0:
                this.f25391b.T0(i10, z4, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f25391b;
                chatActivityEnterView.T0(i10, z4, i11, true, 0L);
                cf cfVar = chatActivityEnterView.I0;
                if (cfVar != null) {
                    cfVar.i();
                    chatActivityEnterView.I0 = null;
                    return;
                }
                return;
        }
    }
}
