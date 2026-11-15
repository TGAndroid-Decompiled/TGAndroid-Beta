package org.telegram.ui.Components;
public final class nd implements Runnable {
    public final int f37549a;
    public final ChatActivityEnterView f37550b;

    public nd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f37549a = i7;
        this.f37550b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i7 = this.f37549a;
        ChatActivityEnterView chatActivityEnterView = this.f37550b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.N6;
                chatActivityEnterView.Q1(true, true);
                chatActivityEnterView.W = null;
                return;
            case 1:
                int i11 = ChatActivityEnterView.N6;
                chatActivityEnterView.q2();
                return;
            case 2:
                xe xeVar = chatActivityEnterView.F0;
                if (xeVar != null) {
                    xeVar.setText("");
                    return;
                }
                return;
            case 3:
                xe xeVar2 = chatActivityEnterView.F0;
                if (xeVar2 != null) {
                    xeVar2.setText("");
                }
                chatActivityEnterView.N(true);
                return;
            case 4:
                int i12 = ChatActivityEnterView.N6;
                chatActivityEnterView.m1();
                return;
            case 5:
                chatActivityEnterView.T3 = false;
                chatActivityEnterView.X0();
                return;
            case 6:
                if (!chatActivityEnterView.G2) {
                    chatActivityEnterView.N(true);
                    return;
                }
                return;
            case 7:
                chatActivityEnterView.f32265q0.callOnClick();
                return;
            case 8:
                chatActivityEnterView.f32265q0.callOnClick();
                return;
            case 9:
                cg cgVar = chatActivityEnterView.H3;
                if (cgVar != null) {
                    cgVar.n1();
                    return;
                }
                return;
            default:
                int i13 = ChatActivityEnterView.N6;
                chatActivityEnterView.F();
                return;
        }
    }
}
