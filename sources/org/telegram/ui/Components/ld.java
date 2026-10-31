package org.telegram.ui.Components;
public final class ld implements Runnable {
    public final int f28091a;
    public final ChatActivityEnterView f28092b;

    public ld(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28091a = i10;
        this.f28092b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f28091a;
        ChatActivityEnterView chatActivityEnterView = this.f28092b;
        switch (i10) {
            case 0:
                if (chatActivityEnterView.f23742l0 != null && !org.telegram.messenger.js.h(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f23742l0.setOpened(false);
                    return;
                }
                return;
            case 1:
                sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    sfVar.a1();
                    return;
                }
                return;
            case 2:
                se seVar = chatActivityEnterView.E0;
                if (seVar != null) {
                    seVar.setText("");
                    return;
                }
                return;
            case 3:
                se seVar2 = chatActivityEnterView.E0;
                if (seVar2 != null) {
                    seVar2.setText("");
                }
                chatActivityEnterView.F(true);
                return;
            case 4:
                chatActivityEnterView.f23764p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView.y();
                return;
        }
    }
}
