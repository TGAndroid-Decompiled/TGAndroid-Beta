package org.telegram.ui.Components;
public final class ke implements Runnable {
    public final int f28078a;
    public final ChatActivityEnterView f28079b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28078a = i10;
        this.f28079b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f28078a;
        ChatActivityEnterView chatActivityEnterView = this.f28079b;
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
                chatActivityEnterView.f23937p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f23937p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f23847n5;
                chatActivityEnterView.B();
                return;
        }
    }
}
