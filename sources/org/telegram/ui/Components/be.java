package org.telegram.ui.Components;
public final class be implements Runnable {
    public final int f27058a;
    public final ChatActivityEnterView f27059b;

    public be(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27058a = i10;
        this.f27059b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f27058a;
        ChatActivityEnterView chatActivityEnterView = this.f27059b;
        switch (i10) {
            case 0:
                hg hgVar = chatActivityEnterView.U2;
                if (hgVar != null) {
                    hgVar.q1();
                    return;
                }
                return;
            case 1:
                jf jfVar = chatActivityEnterView.A0;
                if (jfVar != null) {
                    jfVar.setText("");
                    return;
                }
                return;
            case 2:
                jf jfVar2 = chatActivityEnterView.A0;
                if (jfVar2 != null) {
                    jfVar2.setText("");
                }
                chatActivityEnterView.J(true);
                return;
            case 3:
                chatActivityEnterView.f26152l0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f26152l0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.C();
                return;
        }
    }
}
