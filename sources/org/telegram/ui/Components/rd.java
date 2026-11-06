package org.telegram.ui.Components;
public final class rd implements Runnable {
    public final int f37643a;
    public final ChatActivityEnterView f37644b;

    public rd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f37643a = i7;
        this.f37644b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i7 = this.f37643a;
        ChatActivityEnterView chatActivityEnterView = this.f37644b;
        switch (i7) {
            case 0:
                if (chatActivityEnterView.f31077l0 != null && !org.telegram.messenger.b6.h(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f31077l0.setOpened(false);
                    return;
                }
                return;
            case 1:
                wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.e1();
                    return;
                }
                return;
            case 2:
                xe xeVar = chatActivityEnterView.E0;
                if (xeVar != null) {
                    xeVar.setText("");
                    return;
                }
                return;
            case 3:
                xe xeVar2 = chatActivityEnterView.E0;
                if (xeVar2 != null) {
                    xeVar2.setText("");
                }
                chatActivityEnterView.E(true);
                return;
            case 4:
                chatActivityEnterView.f31098p0.callOnClick();
                return;
            default:
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView.y();
                return;
        }
    }
}
