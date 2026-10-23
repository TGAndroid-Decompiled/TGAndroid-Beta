package org.telegram.ui.Components;
public final class ie implements Runnable {
    public final int f27271a;
    public final ChatActivityEnterView f27272b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27271a = i10;
        this.f27272b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f27271a;
        ChatActivityEnterView chatActivityEnterView = this.f27272b;
        switch (i10) {
            case 0:
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.l1();
                    return;
                }
                return;
            case 1:
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                    return;
                }
                return;
            case 2:
                pf pfVar2 = chatActivityEnterView.E0;
                if (pfVar2 != null) {
                    pfVar2.setText("");
                }
                chatActivityEnterView.I(true);
                return;
            case 3:
                chatActivityEnterView.f24002p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f24002p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f23912n5;
                chatActivityEnterView.A();
                return;
        }
    }
}
