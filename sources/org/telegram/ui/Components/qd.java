package org.telegram.ui.Components;
public final class qd implements Runnable {
    public final int f37266a;
    public final ChatActivityEnterView f37267b;

    public qd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f37266a = i7;
        this.f37267b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i7 = this.f37266a;
        ChatActivityEnterView chatActivityEnterView = this.f37267b;
        switch (i7) {
            case 0:
                if (chatActivityEnterView.f31098l0 != null && !org.telegram.messenger.b6.h(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f31098l0.setOpened(false);
                    return;
                }
                return;
            case 1:
                vf vfVar = chatActivityEnterView.Z2;
                if (vfVar != null) {
                    vfVar.e1();
                    return;
                }
                return;
            case 2:
                we weVar = chatActivityEnterView.E0;
                if (weVar != null) {
                    weVar.setText("");
                    return;
                }
                return;
            case 3:
                we weVar2 = chatActivityEnterView.E0;
                if (weVar2 != null) {
                    weVar2.setText("");
                }
                chatActivityEnterView.E(true);
                return;
            case 4:
                chatActivityEnterView.f31119p0.callOnClick();
                return;
            default:
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView.y();
                return;
        }
    }
}
