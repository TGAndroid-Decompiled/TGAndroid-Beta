package org.telegram.ui.Components;
public final class le implements Runnable {
    public final int f28326a;
    public final ChatActivityEnterView f28327b;

    public le(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28326a = i10;
        this.f28327b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f28326a;
        ChatActivityEnterView chatActivityEnterView = this.f28327b;
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
                chatActivityEnterView.f23932p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f23932p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f23842n5;
                chatActivityEnterView.B();
                return;
        }
    }
}
