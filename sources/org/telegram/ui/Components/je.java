package org.telegram.ui.Components;
public final class je implements Runnable {
    public final int f26343a;
    public final ChatActivityEnterView f26344b;

    public je(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26343a = i10;
        this.f26344b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f26343a;
        ChatActivityEnterView chatActivityEnterView = this.f26344b;
        switch (i10) {
            case 0:
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.l1();
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
                chatActivityEnterView.f22939p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f22939p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.A();
                return;
        }
    }
}
