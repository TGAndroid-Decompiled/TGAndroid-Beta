package org.telegram.ui.Components;
public final class ge implements Runnable {
    public final int f26646a;
    public final ChatActivityEnterView f26647b;

    public ge(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26646a = i10;
        this.f26647b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f26646a;
        ChatActivityEnterView chatActivityEnterView = this.f26647b;
        switch (i10) {
            case 0:
                mg mgVar = chatActivityEnterView.Z2;
                if (mgVar != null) {
                    mgVar.l1();
                    return;
                }
                return;
            case 1:
                nf nfVar = chatActivityEnterView.E0;
                if (nfVar != null) {
                    nfVar.setText("");
                    return;
                }
                return;
            case 2:
                nf nfVar2 = chatActivityEnterView.E0;
                if (nfVar2 != null) {
                    nfVar2.setText("");
                }
                chatActivityEnterView.F(true);
                return;
            case 3:
                chatActivityEnterView.f24143p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f24143p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.z();
                return;
        }
    }
}
