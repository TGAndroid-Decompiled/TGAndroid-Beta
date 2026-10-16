package org.telegram.ui.Components;
public final class je implements Runnable {
    public final int f25984a;
    public final ChatActivityEnterView f25985b;

    public je(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25984a = i10;
        this.f25985b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f25984a;
        ChatActivityEnterView chatActivityEnterView = this.f25985b;
        switch (i10) {
            case 0:
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.m1();
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
                chatActivityEnterView.f22639p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f22639p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f22549n5;
                chatActivityEnterView.B();
                return;
        }
    }
}
