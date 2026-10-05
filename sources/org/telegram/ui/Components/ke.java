package org.telegram.ui.Components;
public final class ke implements Runnable {
    public final int f28169a;
    public final ChatActivityEnterView f28170b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28169a = i10;
        this.f28170b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f28169a;
        ChatActivityEnterView chatActivityEnterView = this.f28170b;
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
                chatActivityEnterView.I(true);
                return;
            case 3:
                chatActivityEnterView.f23944p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f23944p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f23854n5;
                chatActivityEnterView.B();
                return;
        }
    }
}
