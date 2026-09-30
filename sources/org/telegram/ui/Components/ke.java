package org.telegram.ui.Components;
public final class ke implements Runnable {
    public final int f25761a;
    public final ChatActivityEnterView f25762b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25761a = i10;
        this.f25762b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f25761a;
        ChatActivityEnterView chatActivityEnterView = this.f25762b;
        switch (i10) {
            case 0:
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.q1();
                    return;
                }
                return;
            case 1:
                rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null) {
                    rfVar.setText("");
                    return;
                }
                return;
            case 2:
                rf rfVar2 = chatActivityEnterView.E0;
                if (rfVar2 != null) {
                    rfVar2.setText("");
                }
                chatActivityEnterView.K(true);
                return;
            case 3:
                chatActivityEnterView.f22063p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f22063p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f21974n5;
                chatActivityEnterView.B();
                return;
        }
    }
}
