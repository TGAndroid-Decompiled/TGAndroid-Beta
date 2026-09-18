package org.telegram.ui.Components;
public final class ge implements Runnable {
    public final int f24197a;
    public final ChatActivityEnterView f24198b;

    public ge(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24197a = i10;
        this.f24198b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f24197a;
        ChatActivityEnterView chatActivityEnterView = this.f24198b;
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
                chatActivityEnterView.L(true);
                return;
            case 3:
                chatActivityEnterView.f21832p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f21832p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f21743n5;
                chatActivityEnterView.E();
                return;
        }
    }
}
