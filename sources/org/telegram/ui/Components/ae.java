package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ae implements Runnable {
    public final int f24586a;
    public final ChatActivityEnterView f24587b;
    public final boolean f24588c;

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f24586a = i10;
        this.f24587b = chatActivityEnterView;
        this.f24588c = z10;
    }

    @Override
    public final void run() {
        of ofVar;
        int i10 = this.f24586a;
        ChatActivityEnterView chatActivityEnterView = this.f24587b;
        boolean z10 = this.f24588c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f23967t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f23854n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f23972u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f23854n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24587b;
                td tdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z10 && (ofVar = chatActivityEnterView2.L0) != null) {
                    ofVar.h(!T0);
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
