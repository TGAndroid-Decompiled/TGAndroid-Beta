package org.telegram.ui.Components;
public final class ie implements Runnable {
    public final int f29281a;
    public final ChatActivityEnterView f29282b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29281a = i10;
        this.f29282b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i10 = this.f29281a;
        ChatActivityEnterView chatActivityEnterView = this.f29282b;
        switch (i10) {
            case 0:
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.a1();
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
                chatActivityEnterView.G(true);
                return;
            case 3:
                chatActivityEnterView.f25933p0.callOnClick();
                return;
            case 4:
                chatActivityEnterView.f25933p0.callOnClick();
                return;
            default:
                int i11 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView.y();
                return;
        }
    }
}
