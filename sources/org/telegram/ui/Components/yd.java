package org.telegram.ui.Components;
public final class yd implements Runnable {
    public final int f30994a;
    public final ChatActivityEnterView f30995b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30994a = i10;
        this.f30995b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f30994a;
        ChatActivityEnterView chatActivityEnterView = this.f30995b;
        switch (i10) {
            case 0:
                eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.s1();
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
                int i11 = ChatActivityEnterView.f22729j5;
                chatActivityEnterView.C();
                return;
        }
    }
}
