package org.telegram.ui.Components;
public final class ie implements Runnable {
    public final int f27132a;
    public final ChatActivityEnterView f27133b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27132a = i10;
        this.f27133b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f27132a;
        ChatActivityEnterView chatActivityEnterView = this.f27133b;
        switch (i10) {
            case 0:
                og ogVar = chatActivityEnterView.Y2;
                if (ogVar != null) {
                    ogVar.k1();
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
                chatActivityEnterView.f23777p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f23777p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f23688m5;
                chatActivityEnterView.C();
                return;
        }
    }
}
