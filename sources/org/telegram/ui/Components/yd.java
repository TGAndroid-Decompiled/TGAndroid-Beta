package org.telegram.ui.Components;
public final class yd implements Runnable {
    public final int f33515a;
    public final ChatActivityEnterView f33516b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33515a = i10;
        this.f33516b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f33515a;
        ChatActivityEnterView chatActivityEnterView = this.f33516b;
        switch (i10) {
            case 0:
                eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.w1();
                    return;
                }
                return;
            case 1:
                ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null) {
                    ffVar.setText("");
                    return;
                }
                return;
            case 2:
                ff ffVar2 = chatActivityEnterView.B0;
                if (ffVar2 != null) {
                    ffVar2.setText("");
                }
                chatActivityEnterView.J(true);
                return;
            case 3:
                chatActivityEnterView.m0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.m0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f24570j5;
                chatActivityEnterView.C();
                return;
        }
    }
}
