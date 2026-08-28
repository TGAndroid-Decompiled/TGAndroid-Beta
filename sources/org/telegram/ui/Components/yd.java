package org.telegram.ui.Components;
public final class yd implements Runnable {
    public final int f34951a;
    public final ChatActivityEnterView f34952b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.f34951a = i9;
        this.f34952b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i9 = this.f34951a;
        ChatActivityEnterView chatActivityEnterView = this.f34952b;
        switch (i9) {
            case 0:
                eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    egVar.h1();
                    return;
                }
                return;
            case 1:
                ff ffVar = chatActivityEnterView.A0;
                if (ffVar != null) {
                    ffVar.setText("");
                    return;
                }
                return;
            case 2:
                ff ffVar2 = chatActivityEnterView.A0;
                if (ffVar2 != null) {
                    ffVar2.setText("");
                }
                chatActivityEnterView.J(true);
                return;
            case 3:
                chatActivityEnterView.f26141l0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f26141l0.callOnClick();
                return;
            default:
                int i10 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.C();
                return;
        }
    }
}
