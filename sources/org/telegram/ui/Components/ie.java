package org.telegram.ui.Components;
public final class ie implements Runnable {
    public final int f24008a;
    public final ChatActivityEnterView f24009b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24008a = i10;
        this.f24009b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f24008a;
        ChatActivityEnterView chatActivityEnterView = this.f24009b;
        switch (i10) {
            case 0:
                qg qgVar = chatActivityEnterView.Y2;
                if (qgVar != null) {
                    qgVar.p1();
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
                chatActivityEnterView.K(true);
                return;
            case 3:
                chatActivityEnterView.f20904p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f20904p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.C();
                return;
        }
    }
}
