package org.telegram.ui.Components;
public final class ie implements Runnable {
    public final int f24969a;
    public final ChatActivityEnterView f24970b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24969a = i10;
        this.f24970b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f24969a;
        ChatActivityEnterView chatActivityEnterView = this.f24970b;
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
                chatActivityEnterView.L(true);
                return;
            case 3:
                chatActivityEnterView.f21790p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f21790p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f21701n5;
                chatActivityEnterView.E();
                return;
        }
    }
}
