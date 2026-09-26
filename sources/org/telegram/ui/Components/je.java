package org.telegram.ui.Components;
public final class je implements Runnable {
    public final int f25404a;
    public final ChatActivityEnterView f25405b;

    public je(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25404a = i10;
        this.f25405b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f25404a;
        ChatActivityEnterView chatActivityEnterView = this.f25405b;
        switch (i10) {
            case 0:
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.q1();
                    return;
                }
                return;
            case 1:
                qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null) {
                    qfVar.setText("");
                    return;
                }
                return;
            case 2:
                qf qfVar2 = chatActivityEnterView.E0;
                if (qfVar2 != null) {
                    qfVar2.setText("");
                }
                chatActivityEnterView.K(true);
                return;
            case 3:
                chatActivityEnterView.f22041p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f22041p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f21952n5;
                chatActivityEnterView.B();
                return;
        }
    }
}
