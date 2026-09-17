package org.telegram.ui.Components;
public final class ge implements Runnable {
    public final int f24194a;
    public final ChatActivityEnterView f24195b;

    public ge(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24194a = i10;
        this.f24195b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f24194a;
        ChatActivityEnterView chatActivityEnterView = this.f24195b;
        switch (i10) {
            case 0:
                mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.q1();
                    return;
                }
                return;
            case 1:
                of ofVar = chatActivityEnterView.E0;
                if (ofVar != null) {
                    ofVar.setText("");
                    return;
                }
                return;
            case 2:
                of ofVar2 = chatActivityEnterView.E0;
                if (ofVar2 != null) {
                    ofVar2.setText("");
                }
                chatActivityEnterView.K(true);
                return;
            case 3:
                chatActivityEnterView.f21829p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f21829p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f21741m5;
                chatActivityEnterView.B();
                return;
        }
    }
}
