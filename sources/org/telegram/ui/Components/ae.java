package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ae implements Runnable {
    public final int f23213a;
    public final ChatActivityEnterView f23214b;
    public final boolean f23215c;

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.f23213a = i10;
        this.f23214b = chatActivityEnterView;
        this.f23215c = z10;
    }

    @Override
    public final void run() {
        of ofVar;
        int i10 = this.f23213a;
        ChatActivityEnterView chatActivityEnterView = this.f23214b;
        boolean z10 = this.f23215c;
        switch (i10) {
            case 0:
                if (!z10) {
                    chatActivityEnterView.f22662t1.setVisibility(8);
                    return;
                }
                int i11 = ChatActivityEnterView.f22549n5;
                chatActivityEnterView.getClass();
                return;
            case 1:
                if (!z10) {
                    chatActivityEnterView.f22667u1.setVisibility(8);
                    return;
                }
                int i12 = ChatActivityEnterView.f22549n5;
                chatActivityEnterView.getClass();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f23214b;
                td tdVar = chatActivityEnterView2.F4;
                chatActivityEnterView2.M0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView2.R0(0, false, 0, true, 0L);
                if (!z10 && (ofVar = chatActivityEnterView2.L0) != null) {
                    ofVar.h(!R0);
                    chatActivityEnterView2.L0 = null;
                    return;
                }
                chatActivityEnterView2.E4 = !R0;
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                AndroidUtilities.runOnUIThread(tdVar, 500L);
                return;
        }
    }
}
