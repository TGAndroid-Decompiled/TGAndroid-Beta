package org.telegram.ui.Components;
public final class yd implements Runnable {
    public final int f33494a;
    public final ChatActivityEnterView f33495b;

    public yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33494a = i10;
        this.f33495b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f33494a;
        ChatActivityEnterView chatActivityEnterView = this.f33495b;
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
                int i11 = ChatActivityEnterView.f24568j5;
                chatActivityEnterView.C();
                return;
        }
    }
}
