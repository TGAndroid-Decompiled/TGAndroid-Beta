package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class pd implements Runnable {
    public final int f27822a;
    public final ChatActivityEnterView f27823b;
    public final boolean f27824c;

    public pd(ChatActivityEnterView chatActivityEnterView, boolean z4, int i10) {
        this.f27822a = i10;
        this.f27823b = chatActivityEnterView;
        this.f27824c = z4;
    }

    @Override
    public final void run() {
        cf cfVar;
        int i10 = this.f27822a;
        ChatActivityEnterView chatActivityEnterView = this.f27823b;
        boolean z4 = this.f27824c;
        switch (i10) {
            case 0:
                if (!z4) {
                    chatActivityEnterView.f22816p1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f22729j5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z4) {
                    chatActivityEnterView.f22821q1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f22729j5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f27823b;
                id idVar = chatActivityEnterView2.B4;
                chatActivityEnterView2.J0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView2.T0(0, false, 0, true, 0L);
                if (!z4 && (cfVar = chatActivityEnterView2.I0) != null) {
                    cfVar.h(!T0);
                    chatActivityEnterView2.I0 = null;
                    return;
                }
                chatActivityEnterView2.A4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(idVar);
                AndroidUtilities.runOnUIThread(idVar, 500L);
                return;
        }
    }
}
