package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ae implements Runnable {
    public final int f22661a;
    public final ChatActivityEnterView f22662b;
    public final boolean f22663c;

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f22661a = i10;
        this.f22662b = chatActivityEnterView;
        this.f22663c = z10;
    }

    @Override
    public final void run() {
        nf nfVar;
        int i10 = this.f22661a;
        ChatActivityEnterView chatActivityEnterView = this.f22662b;
        boolean z10 = this.f22663c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f22065t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f21953n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f22070u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f21953n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f22662b;
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
