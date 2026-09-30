package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class be implements Runnable {
    public final int f22923a;
    public final ChatActivityEnterView f22924b;
    public final boolean f22925c;

    public be(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f22923a = i10;
        this.f22924b = chatActivityEnterView;
        this.f22925c = z10;
    }

    @Override
    public final void run() {
        of ofVar;
        int i10 = this.f22923a;
        ChatActivityEnterView chatActivityEnterView = this.f22924b;
        boolean z10 = this.f22925c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f22086t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f21974n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f22091u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f21974n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f22924b;
                ud udVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (ofVar = chatActivityEnterView2.L0) != null) {
                    ofVar.h(!T0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(udVar);
                AndroidUtilities.runOnUIThread(udVar, 500L);
                return;
        }
    }
}
