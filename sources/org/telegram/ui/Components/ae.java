package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ae implements Runnable {
    public final int f22620a;
    public final ChatActivityEnterView f22621b;
    public final boolean f22622c;

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f22620a = i10;
        this.f22621b = chatActivityEnterView;
        this.f22622c = z10;
    }

    @Override
    public final void run() {
        nf nfVar;
        int i10 = this.f22620a;
        ChatActivityEnterView chatActivityEnterView = this.f22621b;
        boolean z10 = this.f22622c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f22064t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f21952n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f22069u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f21952n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f22621b;
                td tdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (nfVar = chatActivityEnterView2.L0) != null) {
                    nfVar.h(!T0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                AndroidUtilities.runOnUIThread(tdVar, 500L);
                return;
        }
    }
}
