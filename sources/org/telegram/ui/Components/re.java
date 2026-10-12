package org.telegram.ui.Components;
public final class re implements f5 {
    public final int f28808a;
    public final ChatActivityEnterView f28809b;

    public re(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28808a = i10;
        this.f28809b = chatActivityEnterView;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f28808a) {
            case 0:
                this.f28809b.R0(i10, z10, i11, true, 0L);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f28809b;
                chatActivityEnterView.R0(i10, z10, i11, true, 0L);
                of ofVar = chatActivityEnterView.L0;
                if (ofVar != null) {
                    ofVar.i();
                    chatActivityEnterView.L0 = null;
                    return;
                }
                return;
        }
    }
}
