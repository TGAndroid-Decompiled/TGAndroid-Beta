package org.telegram.ui.Components;

public final class de implements x4 {

    public final int f27728a;

    public final ChatActivityEnterView f27729b;

    public de(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27728a = i10;
        this.f27729b = chatActivityEnterView;
    }

    @Override
    public final void I(int i10, int i11, boolean z10) {
        switch (this.f27728a) {
            case 0:
                this.f27729b.T0(i10, z10, i11, true, 0L);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.f27729b;
                chatActivityEnterView.T0(i10, z10, i11, true, 0L);
                ye yeVar = chatActivityEnterView.H0;
                if (yeVar != null) {
                    yeVar.i();
                    chatActivityEnterView.H0 = null;
                }
                break;
        }
    }
}
