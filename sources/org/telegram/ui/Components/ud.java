package org.telegram.ui.Components;

public final class ud implements Runnable {

    public final int f33061a;

    public final ChatActivityEnterView f33062b;

    public ud(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33061a = i10;
        this.f33062b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f33061a;
        ChatActivityEnterView chatActivityEnterView = this.f33062b;
        switch (i10) {
            case 0:
                ag agVar = chatActivityEnterView.U2;
                if (agVar != null) {
                    agVar.i1();
                }
                break;
            case 1:
                bf bfVar = chatActivityEnterView.A0;
                if (bfVar != null) {
                    bfVar.setText("");
                }
                break;
            case 2:
                bf bfVar2 = chatActivityEnterView.A0;
                if (bfVar2 != null) {
                    bfVar2.setText("");
                }
                chatActivityEnterView.K(true);
                break;
            case 3:
                chatActivityEnterView.f26137l0.callOnClick();
                break;
            case 4:
                chatActivityEnterView.f26137l0.callOnClick();
                break;
            default:
                int i11 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.D();
                break;
        }
    }
}
