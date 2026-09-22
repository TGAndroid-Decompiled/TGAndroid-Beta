package org.telegram.ui.Components;
public final class ie implements Runnable {
    public final int f25120a;
    public final ChatActivityEnterView f25121b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25120a = i10;
        this.f25121b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f25120a;
        ChatActivityEnterView chatActivityEnterView = this.f25121b;
        switch (i10) {
            case 0:
                ng ngVar = chatActivityEnterView.Z2;
                if (ngVar != null) {
                    ngVar.r1();
                    return;
                }
                return;
            case 1:
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                    return;
                }
                return;
            case 2:
                pf pfVar2 = chatActivityEnterView.E0;
                if (pfVar2 != null) {
                    pfVar2.setText("");
                }
                chatActivityEnterView.K(true);
                return;
            case 3:
                chatActivityEnterView.f22056p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f22056p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.B();
                return;
        }
    }
}
