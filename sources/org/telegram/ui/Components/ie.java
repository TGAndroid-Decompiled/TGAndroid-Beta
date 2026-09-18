package org.telegram.ui.Components;
public final class ie implements Runnable {
    public final int f24945a;
    public final ChatActivityEnterView f24946b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24945a = i10;
        this.f24946b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f24945a;
        ChatActivityEnterView chatActivityEnterView = this.f24946b;
        switch (i10) {
            case 0:
                ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    ngVar.q1();
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
                chatActivityEnterView.f22005p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f22005p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f21917m5;
                chatActivityEnterView.B();
                return;
        }
    }
}
