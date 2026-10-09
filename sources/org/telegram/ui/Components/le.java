package org.telegram.ui.Components;
public final class le implements Runnable {
    public final int f28444a;
    public final ChatActivityEnterView f28445b;

    public le(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28444a = i10;
        this.f28445b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f28444a;
        ChatActivityEnterView chatActivityEnterView = this.f28445b;
        switch (i10) {
            case 0:
                qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.w1();
                    return;
                }
                return;
            case 1:
                sf sfVar = chatActivityEnterView.E0;
                if (sfVar != null) {
                    sfVar.setText("");
                    return;
                }
                return;
            case 2:
                sf sfVar2 = chatActivityEnterView.E0;
                if (sfVar2 != null) {
                    sfVar2.setText("");
                }
                chatActivityEnterView.I(true);
                return;
            case 3:
                chatActivityEnterView.f23940p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f23940p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f23850n5;
                chatActivityEnterView.B();
                return;
        }
    }
}
