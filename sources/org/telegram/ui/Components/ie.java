package org.telegram.ui.Components;
public final class ie implements Runnable {
    public final int f27306a;
    public final ChatActivityEnterView f27307b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27306a = i10;
        this.f27307b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f27306a;
        ChatActivityEnterView chatActivityEnterView = this.f27307b;
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
                chatActivityEnterView.F(true);
                return;
            case 3:
                chatActivityEnterView.f24142p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f24142p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f24050r5;
                chatActivityEnterView.z();
                return;
        }
    }
}
