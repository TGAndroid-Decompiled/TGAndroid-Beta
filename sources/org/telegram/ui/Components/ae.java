package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ae implements Runnable {
    public final int f24520a;
    public final ChatActivityEnterView f24521b;
    public final boolean f24522c;

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f24520a = i10;
        this.f24521b = chatActivityEnterView;
        this.f24522c = z10;
    }

    @Override
    public final void run() {
        of ofVar;
        int i10 = this.f24520a;
        ChatActivityEnterView chatActivityEnterView = this.f24521b;
        boolean z10 = this.f24522c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f23964t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f23851n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f23969u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f23851n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24521b;
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
