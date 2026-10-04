package org.telegram.ui.Components;
public final class ke implements Runnable {
    public final int f28077a;
    public final ChatActivityEnterView f28078b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28077a = i10;
        this.f28078b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f28077a;
        ChatActivityEnterView chatActivityEnterView = this.f28078b;
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
                chatActivityEnterView.f23936p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f23936p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f23846n5;
                chatActivityEnterView.B();
                return;
        }
    }
}
