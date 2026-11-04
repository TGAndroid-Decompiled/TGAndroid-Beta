package org.telegram.ui.Components;
public final class pd implements Runnable {
    public final int f37136a;
    public final ChatActivityEnterView f37137b;

    public pd(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.f37136a = i3;
        this.f37137b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i3 = this.f37136a;
        ChatActivityEnterView chatActivityEnterView = this.f37137b;
        switch (i3) {
            case 0:
                if (chatActivityEnterView.m0 != null && !org.telegram.messenger.b6.h(chatActivityEnterView.R, chatActivityEnterView.R2)) {
                    chatActivityEnterView.m0.setOpened(false);
                    return;
                }
                return;
            case 1:
                uf ufVar = chatActivityEnterView.f31087a3;
                if (ufVar != null) {
                    ufVar.b1();
                    return;
                }
                return;
            case 2:
                ve veVar = chatActivityEnterView.F0;
                if (veVar != null) {
                    veVar.setText("");
                    return;
                }
                return;
            case 3:
                ve veVar2 = chatActivityEnterView.F0;
                if (veVar2 != null) {
                    veVar2.setText("");
                }
                chatActivityEnterView.E(true);
                return;
            case 4:
                chatActivityEnterView.f31179q0.callOnClick();
                return;
            default:
                int i10 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView.y();
                return;
        }
    }
}
